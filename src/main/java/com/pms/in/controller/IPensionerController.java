package com.pms.in.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pms.in.entities.PensionerDetails;
import com.pms.in.service.IPensionerService;



@RestController

public class IPensionerController {

	private static final Logger LOG = LoggerFactory.getLogger(IPensionerController.class);
	
	@Autowired
	private IPensionerService pensionService;
	//<PensionerDetails> getAllPensionersDetails
//		@GetMapping
//		public ResponseEntity<List<PensionerDetails>> getAllPensionersDetails(){
//			  List<PensionerDetails> list = pensionService.getAllPensionersDetails();
//			  
//		        return new ResponseEntity<List<PensionerDetails>>(list, new HttpHeaders(), HttpStatus.OK);
//		}
	@GetMapping("/getAllPensionersDetails")
	public List<PensionerDetails> getAllPensionersDetails() {
		LOG.info("getAllPensionersDetails");
		return pensionService.getAllPensionersDetails();
		
	}
	@PostMapping("/addpensioner")
	public ResponseEntity<PensionerDetails> addpensioner(@RequestBody PensionerDetails pensionerdetails) {
		LOG.info("Controller addPensioner");
		PensionerDetails  p1 = pensionService. addPensionerDetails(pensionerdetails);
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "This pensioner  is added to database.");
		LOG.info(headers.toString());
		ResponseEntity<PensionerDetails> response = new ResponseEntity<PensionerDetails>(p1, headers, HttpStatus.OK);
		return response;
	}
	
//Update
	@PostMapping("/updatepensioner")
	public ResponseEntity<PensionerDetails> updatepensioner(@RequestBody PensionerDetails pensionerdetails) {
		LOG.info("Controller updatePensioner");
		PensionerDetails  p1 = pensionService. updatePensionerDetails(pensionerdetails);
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "This pensioner Details are updated to database.");
		LOG.info(headers.toString());
		ResponseEntity<PensionerDetails> response = new ResponseEntity<PensionerDetails>(p1, headers, HttpStatus.OK);
		return response;
	}
	//Delete:
	
	@PostMapping("/deletepensioner")
	public ResponseEntity<PensionerDetails> deletepensioner(@RequestBody PensionerDetails pensionerdetails) {
		LOG.info("Controller updatePensioner");
		PensionerDetails  p1 = pensionService. deletePensionerDetails(pensionerdetails);
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "This pensioner Details are Deleted.");
		LOG.info(headers.toString());
		ResponseEntity<PensionerDetails> response = new ResponseEntity<PensionerDetails>(p1, headers, HttpStatus.OK);
		return response;

	}
	
	
}
