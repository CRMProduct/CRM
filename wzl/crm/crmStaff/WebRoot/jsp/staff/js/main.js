
 function addfile(){
    //添加一个<div/>
    var divn = document.createElement("div");
    divn.setAttribute("id","div1");
    
    //添加<input type=file name=doc/> 
    var fileinput = document.createElement("input");
    fileinput.setAttribute("id","head");
    fileinput.setAttribute("type","file");
    fileinput.setAttribute("name","doc");
    divn.appendChild(fileinput);  
    var fileinput2 = document.createElement("input");
    fileinput2.setAttribute("type","submit");
    fileinput2.setAttribute("value","上传");
    divn.appendChild(fileinput2);  
    //添加链接 <a href="javascript:delfile()">删除</a>
    var hrefa = document.createElement("a");
    hrefa.setAttribute("href","javascript:delfile()");
    var hreftext = document.createTextNode("收起");
    hrefa.appendChild(hreftext);
    divn.appendChild(hrefa);
    //form中加入div
    var form1 =  document.getElementById("f1");
    form1.appendChild(divn);
    document.getElementById("updateHead").setAttribute("disabled",true);
 }
 function  delfile(){
   //得到form1
   var form1 =  document.getElementById("f1");
   //得到div  从form中删除
   var div1 =  document.getElementById("div1");
   form1.removeChild(div1);
   document.getElementById("updateHead").disabled=false;
 }
 
 function checkImg() {
	 var img = document.getElementById("head").value;
	 if(img == ""){
		 return false;
	 }else {
		 return true;
	 }
	 
 }