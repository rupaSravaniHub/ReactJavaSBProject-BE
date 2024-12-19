package com.management.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.Repositories.PermissionsRepo;
import com.management.dto.PermissionDTO;
import com.management.service.PermissionServInterface;

@Service
public class PermissionServiceimpl implements PermissionServInterface{

	@Autowired
	PermissionsRepo pRepo;
	@Override
	public PermissionDTO addPermission(PermissionDTO permission) {
		
		return pRepo.save(permission);
	}
	@Override
	public List<PermissionDTO> getPermissions() {
		// TODO Auto-generated method stub
		return pRepo.findAll();
	}

}
