package com.management.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.Repositories.StaffMemberRepository;
import com.management.dto.StaffMember;
import com.management.service.StaffServInterface;

@Service
public class StaffMemberService implements StaffServInterface{
	
	@Autowired StaffMemberRepository staffMemberRepository;

	@Override
	  public StaffMember saveStaffMember(StaffMember staffMember)
	  {
		return staffMemberRepository.save(staffMember);
		  
	  }

}
