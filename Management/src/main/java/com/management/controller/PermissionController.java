package com.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.management.dto.PermissionDTO;
import com.management.service.PermissionServInterface;

@RestController
public class PermissionController {

	@Autowired PermissionServInterface permissionServimpl;
	@PostMapping("/addPermission")
	public PermissionDTO addPermission(@RequestBody PermissionDTO permissions)
	{
		return permissionServimpl.addPermission(permissions);
		
	}
	
	@GetMapping("/permissions")
	public List<PermissionDTO> getAllPermissions()
	{
		return permissionServimpl.getPermissions();
		
	}
}
