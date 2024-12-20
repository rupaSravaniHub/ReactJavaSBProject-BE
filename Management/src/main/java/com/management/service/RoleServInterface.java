package com.management.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import com.management.dto.ModuleDTO;
import com.management.dto.PermissionDTO;
import com.management.dto.RoleDTO;

public interface RoleServInterface {

	public RoleDTO addRole(RoleDTO role);

	public List<RoleDTO> getAllRoles(int page, int limit);

//	public String assignPermissionsToRole(int roleId, Set<PermissionDTO> permissions);

	public Optional<RoleDTO> getRolelebyId(int role_id);

	public RoleDTO updateRolebyId(int role_id, RoleDTO role);


	public String delRoleById(int role_id);
}
