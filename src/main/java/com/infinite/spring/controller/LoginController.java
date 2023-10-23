package com.infinite.spring.controller;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infinite.spring.model.Corporation;
import com.infinite.spring.server.CorporationServiceImpl;

@Controller
public class LoginController {
	private static final Logger logger = Logger.getLogger(LoginController.class);//loggers
	@Autowired
	CorporationServiceImpl csi;

	@RequestMapping(value = "/getAllComplaints", method = RequestMethod.GET)
	public String getAllComplaints(Model model) {
		model.addAttribute("corporation", new Corporation());
		model.addAttribute("listOfComplaints", csi.getAllComplaints());
		return "ComplaintPage";
	}
	@RequestMapping(value = "/", method = RequestMethod.GET, headers = "Accept=application/json")
	public String goToHomePage() {
		return "redirect:/getAllComplaints";
	}
	@RequestMapping(value = "/toinsert", method = RequestMethod.POST, headers = "Accept=application/json")
	public String addData(@Valid @ModelAttribute("corporation") Corporation corporation,BindingResult result) {
		if (result.hasErrors()) {
			logger.info(result);
			return "ComplaintPage";
		} else if (corporation.getId() == 0) {
			csi.toinsert(corporation);
		}
		return "Home";
	}
}


