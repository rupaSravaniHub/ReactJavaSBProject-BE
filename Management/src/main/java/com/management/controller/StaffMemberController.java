package com.management.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
		System.out.println("address"+staffMember.getAddress());
		return StaffServInterface.saveStaffMember(staffMember);		
	}
	@GetMapping("/getStaffMems")
	@CrossOrigin
	 public List<StaffMember> getStaffDetails(@RequestParam(defaultValue = "1") int page,
	            @RequestParam(defaultValue = "10") int limit)
	 {
		return StaffServInterface.getStaffDetails(page, limit);
		
	 }
	@GetMapping("/getStaffDetailsById")
	@CrossOrigin
	public Optional<StaffMember> getStaffDetailsbyID(@RequestParam int id) {
		return StaffServInterface.getStaffDetailsbyID(id);	
	}
	@DeleteMapping("/delMemberById")
	@CrossOrigin
	public void delStaffDetailsById(@RequestParam int id) {
		 StaffServInterface.delStaffDetailsById(id);	
	}
	@PutMapping("/updateStaffDetailsbyID")
	@CrossOrigin
	public StaffMember updateStaffDetailsbyID(@RequestBody StaffMember staffMember,@RequestParam int id)
	{
		return StaffServInterface.updateStaffDetailsbyID(staffMember, id); 
	}
}
