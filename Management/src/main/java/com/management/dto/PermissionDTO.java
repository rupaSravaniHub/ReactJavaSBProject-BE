package com.management.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="permissions")
public class PermissionDTO {
	@Id
	 private String  permission_id;
	
	public String getPermission_id() {
		return permission_id;
	}
	public void setPermission_id(String permission_id) {
		this.permission_id = permission_id;
	}
	public String getPermission_name() {
		return permission_name;
	}
	public void setPermission_name(String permission_name) {
		this.permission_name = permission_name;
	}
	private String permission_name;
	private String description;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
//	 // Many-to-one relationship: Each permission belongs to one role
//    @ManyToOne
//    @JoinColumn(name = "role_id")  // Foreign key to RoleDTO
//    @JsonBackReference
//    private RoleDTO role;
//    
//    public RoleDTO getRole() {
//        return role;
//    }
//
//    public void setRole(RoleDTO role) {
//        this.role = role;
//    }
}
