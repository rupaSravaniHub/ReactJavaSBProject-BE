package com.management.service;

import com.management.dto.RolesModules;

public interface RolesModulesSerInterface {

	public RolesModules rolesToModules(RolesModules rolesModules);

	public void rolesToModules(int roleId, int moduleId);

}
