package com.management.service;

import java.util.List;
import java.util.Set;

import com.management.dto.PermissionDTO;
import com.management.dto.RoleDTO;

public interface RoleServInterface {

	public RoleDTO addRole(RoleDTO role);

	public List<RoleDTO> getAllRoles(int page, int limit);

	public String assignPermissionsToRole(int roleId, Set<PermissionDTO> permissions);
}
