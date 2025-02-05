package com.management.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.management.Repositories.PermissionsRepo;
import com.management.dto.PermissionDTO;
import com.management.service.PermissionServInterface;

@RestController
public class PermissionController {
	@Autowired PermissionsRepo prepo;
	@Autowired PermissionServInterface permissionServimpl;
	@PostMapping("/addPermission")
	public PermissionDTO addPermission(@RequestBody PermissionDTO permissions)
	{
		return permissionServimpl.addPermission(permissions);
		
	}
	
	@CrossOrigin
	@GetMapping("/permissions")
	public List<PermissionDTO> getAllPermissions()
	{
		return permissionServimpl.getPermissions();
		
	}
	@GetMapping("/contact")
	public String getContactDetails()
	{
		return "8688766083";
	}
	@CrossOrigin
	@GetMapping("/permissionNames")
	public List<String> getAllpermissionNames()
	{
		List<PermissionDTO> details= prepo.findAll();
		List<String> PermissionNames=new ArrayList<>();
		for(PermissionDTO name:details)
		{
			PermissionNames.add(name.getPermission_name());
		}
		return PermissionNames;
		
	}
}
