package com.kirillrublevsky.app.service;

import com.kirillrublevsky.app.model.Candidate;

import java.util.List;

public interface CandidateService {

    void addCandidate(Candidate candidate);

    List<Candidate> getAllCandidates();
}
