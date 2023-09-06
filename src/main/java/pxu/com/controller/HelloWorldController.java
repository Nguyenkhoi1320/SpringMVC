package pxu.com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import pxu.com.model.Mobile;

@Controller
public class HelloWorldController {
	@RequestMapping("/home")
	public String home() {
		return "home";
	}

//	@RequestMapping("/index")
//	public String index() {
//		return "index";
//	}

//	@RequestMapping("/service")
//	public String service() {
//		return "service";
//	}
//
	@RequestMapping("/Details")
	public String details() {
		return "Details";
	}

//	@RequestMapping("/details/{id}")
//	public String details(@PathVariable Long id) {
//		return "details";
//	}

//	@RequestMapping("/details/{id}")
//	public String details(@PathVariable Long id, Model model) {
//		Mobile mobile = new Mobile();
//		mobile.setId(id);
//		mobile.setBrandName("IP");
//		mobile.setName("day la ip");
//		model.addAttribute("mobile", mobile);
//		return "details";
//	}

	public List<Mobile> getList() {
		ArrayList<Mobile> mobile = new ArrayList<Mobile>();
		mobile.add(new Mobile(1L, "IPHONE 14", "IPHONE","https://i.pinimg.com/1200x/03/8d/bc/038dbcb4e6ef999a33a2bbbd56ae1c64.jpg"));
		mobile.add(new Mobile(2L, "IPHONE 14 PRO", "IPHONE","https://taimienphi.vn/tmp/cf/aut/anh-gai-xinh-1.jpg"));
		mobile.add(new Mobile(3L, "IPHONE 14 PROMAX", "IPHONE","https://i.pinimg.com/1200x/03/8d/bc/038dbcb4e6ef999a33a2bbbd56ae1c64.jpg"));
		return mobile;
	}
	@RequestMapping("/Product")
	public String listMobile (Model model) {
		List<Mobile> mobileList = getList();
		model.addAttribute("mobileList", mobileList);
		return "Product";
	}
	@RequestMapping("Details/{id}")
	public String Details(@PathVariable Long id, Model model) {
		List<Mobile> mobileList = getList();
		Mobile selectedMobile = null;
		for (Mobile mobile : mobileList) {
			if(mobile.getId().equals(id)) {
				selectedMobile = mobile;
				break;
			}
		}
		model.addAttribute("selectedMobile",selectedMobile);
		return "Details";
	}
}
