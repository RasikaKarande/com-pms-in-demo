package com.pms.in.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.in.entities.Pensioner;
import com.pms.in.entities.PensionerDetails;
import com.pms.in.exception.PensionerAlreadyExistsException;
import com.pms.in.exception.PensionerDetailsNotFoundException;
import com.pms.in.repository.IPensionerRepository;

@Service

public class IPensionerService {
	public static final Logger LOG = LoggerFactory.getLogger(IPensionerService.class);

	@Autowired
	private static IPensionerRepository pensionRepository;

	public static PensionerDetails addPensionerDetails(PensionerDetails pensionerdetails) {
		LOG.info("Pensioner Details");
		if (!pensionRepository.existsById(pensionerdetails.getPensioner_id()))
			return pensionRepository.save(pensionerdetails);
		else {
			LOG.info(pensionerdetails.getPensioner_id() + " already exists.");
			throw new PensionerAlreadyExistsException(
					pensionerdetails.getPensioner_id() + " This Pensioner  ALready Exits.");
		}
	}

	// Update
	public static PensionerDetails updatePensionerDetails(PensionerDetails pensionerdetails) {
		LOG.info("UpadtePensionerDetails");
		if (pensionRepository.existsById(pensionerdetails.getPensioner_id()))
			return pensionRepository.save(pensionerdetails);

		else {
			LOG.info("Employee is NOT available.");
			throw new PensionerDetailsNotFoundException(" This Pensioner Details is not found.");
		}
	}

//Delete

	public static PensionerDetails deletePensionerDetails(PensionerDetails pensionerdetails) {
		LOG.info("PensionerDetails");
		if (pensionRepository.existsById(pensionerdetails.getPensioner_id())) {
			pensionRepository.delete(pensionerdetails);
			return null;
		} else {
			LOG.info("Pensioner is NOT available.");
			throw new PensionerDetailsNotFoundException(" Pensioner Details is not found.");
		}
	}

	// view all pensio ner
	public List<PensionerDetails> getAllPensionersDetails() {
		System.out.println("Service getAllEmployees");
		return pensionRepository.findAll();
	}
}
