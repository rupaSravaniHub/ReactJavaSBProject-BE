package com.management.service;

import java.util.List;
import java.util.Optional;

import com.management.dto.ModuleDTO;

public interface ModuleServInterface {
	public ModuleDTO createModule(ModuleDTO module);
	public List<ModuleDTO> getAllModules(int page, int limit);
	public Optional<ModuleDTO> getModulebyId(int module_id);
	public String delById(int module_id);
	public ModuleDTO updateModulebyId(int module_id, ModuleDTO module);
}
