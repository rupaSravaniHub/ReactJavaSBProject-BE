package com.management.service;

import java.util.List;

import com.management.dto.PermissionDTO;
public interface PermissionServInterface {
	public PermissionDTO addPermission(PermissionDTO permission);

	public List<PermissionDTO> getPermissions();
}
