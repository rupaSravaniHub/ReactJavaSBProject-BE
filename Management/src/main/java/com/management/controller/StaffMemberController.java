package com.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.management.dto.StaffMember;
import com.management.service.StaffServInterface;

@RestController
public class StaffMemberController 
{
	@Autowired StaffServInterface StaffServInterface;
	@PostMapping("/addStaffMem")
	@CrossOrigin
	public StaffMember saveStaffMemDetails(@RequestBody StaffMember staffMember)
	{
		return StaffServInterface.saveStaffMember(staffMember);		
	}
}
