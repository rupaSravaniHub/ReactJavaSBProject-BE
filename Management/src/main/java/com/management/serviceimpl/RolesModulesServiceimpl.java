package com.management.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.Repositories.RolesModulesRepo;
import com.management.dto.RolesModules;
import com.management.service.RolesModulesSerInterface;

@Service
public class RolesModulesServiceimpl implements RolesModulesSerInterface{

	@Autowired RolesModulesRepo rolesModulesRepo;
	
	@Override
	public RolesModules rolesToModules(RolesModules rolesModules) {
		return rolesModulesRepo.save(rolesModules);
	}

	@Override
	public void rolesToModules(int roleId, int moduleId) {
		RolesModules entryToBeDel=rolesModulesRepo.findByRoleIdAndModuleId(roleId,moduleId);
		rolesModulesRepo.delete(entryToBeDel);
	}

}
