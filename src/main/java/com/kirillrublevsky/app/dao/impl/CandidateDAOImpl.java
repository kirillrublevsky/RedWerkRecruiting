package com.kirillrublevsky.app.dao.impl;

import com.kirillrublevsky.app.dao.CandidateDAO;
import com.kirillrublevsky.app.model.Candidate;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CandidateDAOImpl implements CandidateDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public void addCandidate(Candidate candidate) {
        entityManager.persist(candidate);
    }

    @SuppressWarnings("unchecked")
    public List<Candidate> getAllCandidates() {
        return (List<Candidate>) entityManager.createQuery("SELECT c FROM Candidate c").getResultList();
    }
}
