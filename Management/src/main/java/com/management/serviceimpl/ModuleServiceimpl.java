package com.management.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.Repositories.ModuleRepo;
import com.management.dto.ModuleDTO;
import com.management.service.ModuleServInterface;
@Service
public class ModuleServiceimpl implements ModuleServInterface{
	
	@Autowired ModuleRepo moduleRepo;

	@Override
	public ModuleDTO createModule(ModuleDTO module) {
		System.out.println(module);
		return moduleRepo.save(module);
		
	}

	@Override
	public List<ModuleDTO> getAllModules(int page, int limit) {
		List<ModuleDTO> LimitWise= new ArrayList<ModuleDTO>();
		List<ModuleDTO> allModules= moduleRepo.findAll();
		for (int i = 0; i < limit; i++) {
			 ModuleDTO module = allModules.get(i);
			 LimitWise.add(module);
		}
		System.out.println(LimitWise);
		return LimitWise;
	}

	@Override
	public Optional<ModuleDTO> getModulebyId(int module_id) {
		return moduleRepo.findById(module_id);
	}

	@Override
	public String delById(int module_id) {
		 Optional<ModuleDTO> module = moduleRepo.findById(module_id);
		    
		    if (module.isPresent()) {
		        moduleRepo.deleteById(module_id);
		        return "Module deleted successfully";
		    } else {
		        return "Module not found";
		    }
	}

	@Override
	public ModuleDTO updateModulebyId(int module_id, ModuleDTO module) {
		Optional<ModuleDTO> moduleData = moduleRepo.findById(module_id);
//		System.out.println(module.getConfig1() +" hfkjshfkjsa "+module.getConfig1().getClass());
		ModuleDTO newData=null;
	    if (moduleData.isPresent()) {
	    	 newData=moduleData.get();
	    	newData.setModule_name(module.getModule_name());
	    	newData.setDescription(module.getDescription());
	    	newData.setCreated_at(module.getCreated_at());
			newData.setConfig1(module.getConfig1().toString());
	    }
		return  moduleRepo.save(newData);
		}}




