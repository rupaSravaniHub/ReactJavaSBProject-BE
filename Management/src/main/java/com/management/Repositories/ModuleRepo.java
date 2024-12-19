package com.management.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.dto.ModuleDTO;

@Repository
public interface ModuleRepo extends JpaRepository<ModuleDTO, Integer>{

}
