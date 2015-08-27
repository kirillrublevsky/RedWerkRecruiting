package com.kirillrublevsky.app.dao;

import com.kirillrublevsky.app.model.Candidate;

import java.util.List;

public interface CandidateDAO {

    void addCandidate(Candidate candidate);

    List<Candidate> getAllCandidates();
}
