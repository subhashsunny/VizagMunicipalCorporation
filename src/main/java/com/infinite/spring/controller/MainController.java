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

import com.infinite.spring.model.Complaints;
import com.infinite.spring.server.CorporationServiceImpl;

@Controller
public class MainController {
		private static final Logger logger = Logger.getLogger(MainController.class);//loggers
		@Autowired
		CorporationServiceImpl csi;

		@RequestMapping(value = "/getAllComplaints", method = RequestMethod.GET)
		public String getAllComplaints(Model model) {
			model.addAttribute("complaints", new Complaints());
			model.addAttribute("listOfComplaints", csi.getAllComplaints());
			return "ComplaintPage";
		}
		@RequestMapping(value = "/toinsert", method = RequestMethod.POST, headers = "Accept=application/json")
		public String addData(@Valid @ModelAttribute("complaints") Complaints complaints,BindingResult result) {
			if (result.hasErrors()) {
				logger.info(result);
				return "ComplaintPage";
			} else if (complaints.getId() == 0) {
				csi.toinsert(complaints);
			}
			return "Home";
		}
	}

