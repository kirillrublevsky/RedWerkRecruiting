package com.kirillrublevsky.app.controller;


import com.kirillrublevsky.app.model.Candidate;
import com.kirillrublevsky.app.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class MainController {

    @Autowired
    private CandidateService candidateService;

    @ResponseBody
    @RequestMapping(value = "/getAllCandidates", method = RequestMethod.GET)
    public List<Candidate> getAllCandidates() {
        return candidateService.getAllCandidates();
    }

    @RequestMapping(value = "/addCandidate", method = RequestMethod.POST)
    public void addMessage(@RequestBody Candidate candidate) {
        candidateService.addCandidate(candidate);
    }


}
