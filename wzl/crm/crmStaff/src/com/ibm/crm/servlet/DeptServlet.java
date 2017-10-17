package com.ibm.crm.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.crm.dao.DeptDao;
import com.ibm.crm.dao.IDeptDao;
import com.ibm.crm.dao.IPostDao;
import com.ibm.crm.dao.PostDao;
import com.ibm.crm.vo.Crmdepartment;
import com.ibm.crm.vo.Crmpost;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * Servlet implementation class DeptServlet
 */
@WebServlet("/DeptServlet")
public class DeptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IPostDao postDao = new PostDao();
	private IDeptDao deptDao = new DeptDao();
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeptServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String method = request.getParameter("method");
		if("provincial".equals(method)){
			getProvincial(request, response);
		}
		if("city".equals(method)){
			getCity(request, response);
		}
	}

	protected void getProvincial(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		ArrayList<Crmdepartment> addrList = (ArrayList<Crmdepartment>) deptDao.findAllDept();
	
		JSONObject jsonObj = new JSONObject();
		JSONArray jsonArray = JSONArray.fromObject(addrList);
		jsonObj.put("addrList", jsonArray);
		String jsonDataStr = jsonObj.toString();
		response.getWriter().print(jsonDataStr);
	}

	protected void getCity(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String provincial = request.getParameter("provincial");
		Map map = new HashMap();
		map.put("provincial", provincial);
		
		List<Crmpost> addrList = postDao.findByDepId(map);

		
		JSONObject jsonObj = new JSONObject();
		JSONArray jsonArray = JSONArray.fromObject(addrList);
		jsonObj.put("cityList", jsonArray);
		String jsonDataStr = jsonObj.toString();

		response.getWriter().print(jsonDataStr);
	}



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
