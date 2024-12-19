package com.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.management.dto.RolesModules;
import com.management.service.RolesModulesSerInterface;

@RestController
public class RolesModulesController {
	@Autowired RolesModulesSerInterface rolesModulesSerInterface;

	@PostMapping("/assignRolesToModules")
	public RolesModules assignRolesToModules(@RequestBody RolesModules rolesModules) 
	{
		return rolesModulesSerInterface.rolesToModules(rolesModules);
	}
	
	@DeleteMapping("/delRoleNmodule")
	public void delRoleNmodule(@RequestParam int roleId, @RequestParam int moduleId) 
	{
		 rolesModulesSerInterface.rolesToModules(roleId,moduleId);
	}
}
