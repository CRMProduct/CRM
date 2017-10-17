/*
 //得到XMLHttpRequest对象 
function getXmlHttpRequest(){
	var xmlhttp;
	if (window.XMLHttpRequest)
	{
		//  IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码
		xmlhttp=new XMLHttpRequest();
	}
	else
	{
		// IE6, IE5 浏览器执行代码
		xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
	}
}

//发送ajax请求和设置回调函数
function ajaxRequest(url,functionName){
	var val = getXmlHttpRequest();
	xmlhttp.onreadystatechange=function()
	{
		if (xmlhttp.readyState==4 && xmlhttp.status==200)
		{
			//回调函数
			functionName(xmlhttp.responseText);
		}
	}
	xmlhttp.open("POST",url,"true");
	xmlhttp.send();
}

//自动加载
window.onload = function{
	ajaxRequest("DeptServlet?method=post",deptRequest)
}
//动态加载dept信息
function deptRequest(responseContents){
	var jsonObj = new Function("return" + responseContents)();
			for(var i = 0; i < jsonObj.depList.length;i++){
				document.getElementById('depId').innerHTML += 
					"<option value='"+jsonObj.deptList[i].deptId+"'>"
						+jsonObj.deptList[i].deptName+
					"</option>"
			}
}
//选中dept后
		function deptChange(){
			//先将post的之前的信息清除
			document.getElementById('postId').innerHTML="<option value='-1'>--请选择--</option>";
			
			var val = document.getElementById('depId').value;
			if(val == -1){
				document.getElementById('postId')[0].selected = true;
				return;
			}
			//开始执行获取post
			ajaxrequest("DeptSerlvet?method=post&depId="+val,postResponse);
		}
		
//获取post的动态数据
		function postResponse(responseContents){
			var jsonObj = new Function("return" + responseContents)();
			for(var i = 0; i < jsonObj.postList.length;i++){
				document.getElementById('postId').innerHTML += 
					"<option value='"+jsonObj.postList[i].postId+"'>"
						+jsonObj.postList[i].postName+
					"</option>"
			}
		}
		
//选中post以后
		function postChange(){
			var val = document.getElementById('postId').value;
		}*/
		
function getajaxHttp() {
			var xmlHttp;
			try {
				// Firefox, Opera 8.0+, Safari  
				xmlHttp = new XMLHttpRequest();
			} catch (e) {
				// Internet Explorer  
				try {
					xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
				} catch (e) {
					try {
						xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
					} catch (e) {
						alert("您的浏览器不支持AJAX！");
						return false;
					}
				}
			}
			return xmlHttp;
		}
		/** 
		 * 发送ajax请求 
		 * url--请求到服务器的URL 
		 * methodtype(post/get) 
		 * con (true(异步)|false(同步)) 
		 * functionName(回调方法名，不需要引号,这里只有成功的时候才调用) 
		 * (注意：这方法有二个参数，一个就是xmlhttp,一个就是要处理的对象) 
		 */
		function ajaxrequest(url, methodtype, con, functionName) {
			//获取XMLHTTPRequest对象
			var xmlhttp = getajaxHttp();
			//设置回调函数（响应的时候调用的函数）
			xmlhttp.onreadystatechange = function() {
				//这个函数中的代码在什么时候被XMLHTTPRequest对象调用？
				//当服务器响应时，XMLHTTPRequest对象会自动调用该回调方法
				if (xmlhttp.readyState == 4) {
					if (xmlhttp.status == 200) {
						functionName(xmlhttp.responseText);
					}
				}
			};
			//创建请求
			xmlhttp.open(methodtype, url, con);
			//发送请求
			xmlhttp.send();
		}
		
		window.onload=function(){
			ajaxrequest("addressSerlvet?method=provincial","POST",true,addrResponse);
		}
		//动态获取省的信息
		function addrResponse(responseContents){
			var jsonObj = new Function("return" + responseContents)();
			for(var i = 0; i < jsonObj.addrList.length;i++){
				document.getElementById('select').innerHTML += 
					"<option value='"+jsonObj.addrList[i].depId+"'>"
						+jsonObj.addrList[i].depName+
					"</option>"
			}
		}
		//选中省后
		function pChange(){
			//先将市的之前的信息清除
			document.getElementById('selectCity').innerHTML="<option value='-1'>请选择市</option>";
			var val = document.getElementById('select').value;
			if(val == -1){
				document.getElementById('selectCity')[0].selected = true;
				return;
			}
			//开始执行获取市
			ajaxrequest("addressSerlvet?method=city&provincial="+val,"POST",true,cityResponse);
		}
		//获取市的动态数据
		function cityResponse(responseContents){
			var jsonObj = new Function("return" + responseContents)();
			for(var i = 0; i < jsonObj.cityList.length;i++){
				document.getElementById('selectCity').innerHTML += 
					"<option value='"+jsonObj.cityList[i].postId+"'>"
						+jsonObj.cityList[i].postName+
					"</option>"
			}
		}
		//选中市以后
		function cChange(){
			var val = document.getElementById('selectCity').value;
			//开始执行获取区
			ajaxrequest("addressSerlvet?method=area&cityId="+val,"POST",true,areaResponse);
		}
		//获取区的动态数据
		function areaResponse(responseContents){
			var jsonObj = new Function("return" + responseContents)();
			for(var i = 0; i < jsonObj.areaList.length;i++){
				document.getElementById('selectArea').innerHTML += 
					"<option value='"+jsonObj.areaList[i].id+"'>"
						+jsonObj.areaList[i].address+
					"</option>"
			}
		}
		