package com.management.dto;

import jakarta.persistence.*;

@Entity
@Table(name = "modules")
public class ModuleDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int module_id;
	private String module_name;
	private String description;
	private String created_at;

	private String config1; 
	@Override
	public String toString() {
		return "ModuleDTO [module_id=" + module_id + ", module_name=" + module_name + ", description=" + description
				+ ", created_at=" + created_at + ", config1=" + config1 + "]";
	}

	public String getConfig1() {
		return config1;
	}

	public void setConfig1(String config1) {
		this.config1 = config1;
	}

	public int getModule_id() {
		return module_id;
	}

	public void setModule_id(int module_id) {
		this.module_id = module_id;
	}

	public String getModule_name() {
		return module_name;
	}

	public void setModule_name(String module_name) {
		this.module_name = module_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

}
