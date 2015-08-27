package com.kirillrublevsky.app.service.impl;

import com.kirillrublevsky.app.dao.CandidateDAO;
import com.kirillrublevsky.app.model.Candidate;
import com.kirillrublevsky.app.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CandidateServiceImpl implements CandidateService {

    @Autowired
    private CandidateDAO candidateDAO;

    @Transactional
    public void addCandidate(Candidate candidate) {
        candidateDAO.addCandidate(candidate);
    }

    @Transactional(readOnly = true)
    public List<Candidate> getAllCandidates() {
        return candidateDAO.getAllCandidates();
    }

}
