package com.pms.in.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import com.pms.in.entities.Pensioner;
import com.pms.in.entities.PensionerDetails;

public interface IPensionerRepository extends JpaRepository<PensionerDetails, Integer> {

	public boolean validatePensioner();

	public PensionerDetails addPensionerDetails(PensionerDetails pensionerdetails);

	public void deletePensioner(int pensionerId);

	public Pensioner updatePensioner(Pensioner pensioner);

	public Pensioner viewPensioner(int pensionerId);

	public boolean existsById(int aadhar);

	public PensionerDetails save(PensionerDetails pensionerdetails);
}
