package com.management.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.dto.RolesModules;

@Repository
public interface RolesModulesRepo extends JpaRepository<RolesModules, Integer>{

	RolesModules findByRoleIdAndModuleId(int roleId, int moduleId);

}
