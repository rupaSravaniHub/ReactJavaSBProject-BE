package com.management.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.dto.StaffMember;

@Repository
public interface StaffMemberRepository extends JpaRepository<StaffMember, Integer> {
}

