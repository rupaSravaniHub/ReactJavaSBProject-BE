package com.management.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.Repositories.RoleRepo;
import com.management.dto.ModuleDTO;
import com.management.dto.PermissionDTO;
import com.management.dto.RoleDTO;
import com.management.service.RoleServInterface;

@Service
public class RoleServiceimpl implements RoleServInterface{

	@Autowired RoleRepo rRepo;
	@Override
	public RoleDTO addRole(RoleDTO role) {
		
		return rRepo.save(role);
	}
	@Override
	public List<RoleDTO> getAllRoles(int page, int limit) {
		List<RoleDTO> LimitWise= new ArrayList<RoleDTO>();
		List<RoleDTO> allRoles= rRepo.findAll();
		for (int i = 0; i < limit; i++) {
			RoleDTO role = allRoles.get(i);
			 LimitWise.add(role);
		}
		System.out.println(LimitWise);
		return LimitWise;
	}
	@Override
	public String assignPermissionsToRole(int roleId, Set<PermissionDTO> permissions) {
		Optional<RoleDTO> roleOpt = rRepo.findById(roleId);
        if (!roleOpt.isPresent()) {
            return "Role not found";
        }

        RoleDTO role = roleOpt.get();
        
        for (PermissionDTO permission : permissions) {
            permission.setRole(role);  // Set the role for each permission
        }
        
        role.setPermissions(permissions);  // Add permissions to the role
        rRepo.save(role);  // Save the role and its permissions

        return "Permissions assigned to role successfully";
	}

}
