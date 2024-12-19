package com.management.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.dto.RoleDTO;

@Repository
public interface RoleRepo extends JpaRepository<RoleDTO, Integer>{

}
