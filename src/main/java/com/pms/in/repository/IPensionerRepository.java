package com.pms.in.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pms.in.entities.PensionerDetails;

@Repository
public interface IPensionerRepository extends JpaRepository<PensionerDetails, Integer> {

//	public boolean validatePensioner();
//
////	public PensionerDetails addPensionerDetails(PensionerDetails pensionerdetails);
//
//	public boolean existsById(int aadhar);

	}
