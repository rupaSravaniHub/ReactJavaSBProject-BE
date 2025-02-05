package com.management.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.management.Repositories.StaffMemberRepository;
import com.management.dto.ModuleDTO;
import com.management.dto.StaffMember;
import com.management.service.StaffServInterface;

@Service
public class StaffMemberService implements StaffServInterface{
	
	@Autowired StaffMemberRepository staffMemberRepository;

	@Override
	  public StaffMember saveStaffMember(StaffMember staffMember)
	  {
		
		StaffMember memDetails= staffMemberRepository.save(staffMember);
		System.out.println("new staff member details"+memDetails);
		return memDetails;
		  
	  }

	

	@Override
	public Optional<StaffMember> getStaffDetailsbyID(int id) {
		
		return staffMemberRepository.findById(id);
	}

	@Override
	public  void delStaffDetailsById(int id) {
		 staffMemberRepository.deleteById(id);;
	}

	@Override
	public StaffMember updateStaffDetailsbyID(StaffMember newDetails, int id) {
	    Optional<StaffMember> oldDetails = staffMemberRepository.findById(id);
	    StaffMember newData = null;
	    
	    if (oldDetails.isPresent()) {
	        newData = oldDetails.get();
	        newData.setFirstName(newDetails.getFirstName());
	        newData.setLastName(newDetails.getLastName());
	        newData.setEmail(newDetails.getEmail());
	        newData.setPhone(newDetails.getPhone());
	        newData.setDob(newDetails.getDob());
	        newData.setGender(newDetails.getGender());
	        newData.setAddress(newDetails.getAddress());
	        newData.setPosition(newDetails.getPosition());
	        newData.setDepartment(newDetails.getDepartment());
	        newData.setJoinDate(newDetails.getJoinDate());
	        newData.setSalary(newDetails.getSalary());
	    }
	    return staffMemberRepository.save(newData); 
	}



	@Override
	public List<StaffMember> getStaffDetails(int page, int limit) {
		Pageable pageable = PageRequest.of(page - 1, limit);
	    Page<StaffMember> StaffDetails = staffMemberRepository.findAll(pageable);
	    System.out.println(StaffDetails.getContent());
	    return StaffDetails.getContent();
	}


}
