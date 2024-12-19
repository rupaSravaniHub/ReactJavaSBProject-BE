package com.management.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.dto.ModuleDTO;
import com.management.dto.PermissionDTO;
@Repository
public interface PermissionsRepo extends JpaRepository<PermissionDTO, String>{

}
