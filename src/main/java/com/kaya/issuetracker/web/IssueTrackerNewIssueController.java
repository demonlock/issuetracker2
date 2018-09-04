package com.kaya.issuetracker.web;

import java.sql.Date;
import java.time.LocalDate;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kaya.issuetracker.model.ActionType;
import com.kaya.issuetracker.model.IssueAction;
import com.kaya.issuetracker.model.User;
import com.kaya.issuetracker.service.IssueTrackerActionTypeService;
import com.kaya.issuetracker.service.IssueTrackerIssueActionService;
import com.kaya.issuetracker.service.IssueTrackerService;
import com.kaya.issuetracker.service.IssueTrackerUserService;

@Controller
public class IssueTrackerNewIssueController {
	
	@Autowired
	private IssueTrackerService issueTrackerService;
	
	@Autowired
	private IssueTrackerIssueActionService issueTrackerIssueActionService;
	
	@Autowired
	private IssueTrackerActionTypeService issueTrackerActionTypeService;
	
	@Autowired
	private IssueTrackerUserService issueTrackerUserService;
	
	@RequestMapping(value="/issues/new/{acId}",method=RequestMethod.GET)
	public String newIssue() {
		return "newissue";
	}
	
	@ModelAttribute
	public IssueAction initModel() {
		return new IssueAction();
	}
	
	@RequestMapping(value="/issues/new/{acId}",method=RequestMethod.POST)
	public String handleForSubmit(@PathVariable Long acId, 
								  @ModelAttribute("issueAction") @Valid IssueAction issueAction, 
								  BindingResult bindingResult, RedirectAttributes redirectAttributes) {

		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String userName = authentication.getName();		
		
		ActionType actionType=issueTrackerActionTypeService.findById(acId);
		
		User user = issueTrackerUserService.findByUserName(userName);
		
		issueAction.setActionDate(Date.valueOf(LocalDate.now()));
		issueAction.setUser(user);
		issueAction.setRead(0);
		issueAction.getIssue().setClosed(0);
		issueAction.getIssue().setCreateDate(Date.valueOf(LocalDate.now()));
		
		if (bindingResult.hasErrors()) {
			return "newissue";
		}
		
		issueAction.setActionType(actionType);
		
		issueTrackerService.createIssue(issueAction.getIssue());
		issueTrackerIssueActionService.createIssueAction(issueAction);
		redirectAttributes.addFlashAttribute("message","Issue created with id : "+ issueAction.getIssue().getId());
		return "redirect:/issues";
	}
	
	

}
