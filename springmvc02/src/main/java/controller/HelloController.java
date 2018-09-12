package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class HelloController  implements Controller{
	
        public ModelAndView handleRequest(HttpServletRequest arg0,HttpServletResponse arg1) 
        		throws Exception{
        	System.out.println("handleRequest()");
        	/*
        	 * ModelAndView������������
        	 * 1.ModelAndView(String viewName)
        	 * viewName����ͼ��
        	 * 2.ModelAndView(String viewName,Map data),
        	 * Map���ڷ�װ����������
        	 */
        	return new ModelAndView("hello");
        }
}
