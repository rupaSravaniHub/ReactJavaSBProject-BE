package com.management.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.management.dto.ModuleDTO;
import com.management.service.ModuleServInterface;

@RestController
public class ModuleController {
	@Autowired ModuleServInterface moduleInterface;

	@CrossOrigin
	@PostMapping("/addModule")
	public ModuleDTO createModule(@RequestBody ModuleDTO module)
	{
		return moduleInterface.createModule(module);
	}
	
	@CrossOrigin
	@GetMapping("/getAllModules")
	public List<ModuleDTO> getAllModules(@RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int limit)
	{
		return moduleInterface.getAllModules(page, limit);
	}
	
	@CrossOrigin
	@GetMapping("/getModulebyId")
	public  Optional<ModuleDTO> getModulebyId(@RequestParam int module_id)
	{
		return moduleInterface.getModulebyId(module_id);
	}
	
	@CrossOrigin
	@PutMapping("/updateModulebyId")
	public  ModuleDTO updateModulebyId(@RequestParam int module_id,@RequestBody ModuleDTO module)
	{
		System.out.println("updating");
		return moduleInterface.updateModulebyId(module_id,module);
	} 
	
	@CrossOrigin
	@DeleteMapping("/delById")
	public  String delById(@RequestParam int module_id)
	{
		return moduleInterface.delById(module_id);
	}

}
