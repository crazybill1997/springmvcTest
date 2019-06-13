package cn.Higgin.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ItemsController implements Controller {
	 public ModelAndView handleRequest(HttpServletRequest request,
	            HttpServletResponse response) throws Exception {
	        
	        //调用Service查找数据库，查询商品列表，这里使用静态数据模拟
	        List<Items> itemsList=new ArrayList<Items>();
	        //向list中填充数据
	        Items item1=new Items();
	        item1.setName("华硕笔记本");
	        item1.setPrice(600f);
	        item1.setDetail("华硕啦啦啦啦啦啦啦啦啦");
	        
	        Items item2=new Items();
	        item2.setName("联想笔记本");
	        item2.setPrice(300f);
	        item2.setDetail("联想啦啦啦啦啦啦啦啦啦");
	        
	        itemsList.add(item1);
	        itemsList.add(item2);
	        
	        //返回ModelAndView
	        ModelAndView modelAndView=new ModelAndView();
	        //相当于request的setAttribute，在jsp页面中通过itemList来获取
	        modelAndView.addObject("itemsList",itemsList);
	        //指定视图
	        modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
	        
	        System.out.println("提示：ItemsComtroller.............");
	        
	        return modelAndView;
	    }
}
