package com.kaya.issuetracker.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kaya.issuetracker.service.IssueTrackerService;

@Controller
public class IssueTrackerController {
	
	@Autowired
	private IssueTrackerService issueTrackerService;
	
	@RequestMapping("/issues")
	public ModelAndView getIssues() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("toDoIssues",issueTrackerService.findIssuesByActionType(1L, 1L));
		mav.addObject("workingIssues",issueTrackerService.findIssuesByActionType(1L, 2L));
		mav.addObject("finishedIssues",issueTrackerService.findIssuesByActionType(1L, 3L));
		mav.setViewName("issues");
		return mav;
	}
	

}
