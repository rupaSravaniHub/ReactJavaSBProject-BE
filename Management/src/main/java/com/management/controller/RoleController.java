package com.management.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.management.dto.ModuleDTO;
import com.management.dto.PermissionDTO;
import com.management.dto.RoleDTO;
import com.management.service.RoleServInterface;

@RestController
public class RoleController {

	@Autowired RoleServInterface roleServInterface;
	
	@CrossOrigin
	@PostMapping("/addrole")
	public RoleDTO addRole(@RequestBody RoleDTO role)
	{
		return roleServInterface.addRole(role);
		
	}
	
	@PostMapping("/{roleId}/permissions")
    public ResponseEntity<String> assignPermissionsToRole(
            @PathVariable int roleId, @RequestBody Set<PermissionDTO> permissions) {
        String response = roleServInterface.assignPermissionsToRole(roleId, permissions);
        return ResponseEntity.ok(response);
    }
	@CrossOrigin
	@GetMapping("/getRoles")
	public List<RoleDTO> getAllRoles(@RequestParam int page, @RequestParam int limit)
	{
		return roleServInterface.getAllRoles(page, limit);
	}
}
