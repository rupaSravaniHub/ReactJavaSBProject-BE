package com.management.service;

import java.util.List;
import java.util.Optional;

import com.management.dto.StaffMember;

public interface StaffServInterface{

	 public StaffMember saveStaffMember(StaffMember staffMember);
	 public Optional<StaffMember> getStaffDetailsbyID(int id);
	 public void delStaffDetailsById(int id);
	 public StaffMember updateStaffDetailsbyID(StaffMember staffMember,int id);
	public List<StaffMember> getStaffDetails(int page, int limit);
}
