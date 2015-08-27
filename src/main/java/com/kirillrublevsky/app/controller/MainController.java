package com.kirillrublevsky.app.controller;


import com.kirillrublevsky.app.model.Candidate;
import com.kirillrublevsky.app.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class MainController {

	@Autowired
	private CandidateService candidateService;

	@ResponseBody
	@RequestMapping(value="/getAllCandidates", method = RequestMethod.GET)
	public List<Candidate> getAllCandidates(){

		Candidate one = new Candidate();
		one.setFirstName("Kyle");
		one.setLastName("Adams");
		one.setAdditionDate("23.06.2015");
		one.setInterviewDate("11.12.2012");
		one.setSkills("Java(9), C(8), SQL(6)");

		candidateService.addCandidate(one);

		return candidateService.getAllCandidates();

	}
}
