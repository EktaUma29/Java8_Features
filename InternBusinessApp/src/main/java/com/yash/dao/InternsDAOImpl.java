package com.yash.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.yash.entity.Interns;
import com.yash.helper.Levels;

@Repository
public class InternsDAOImpl implements InternsDAO {
	@PersistenceContext
	private EntityManager manager;

	public List<Interns> getAllInterns() {
		Query query = manager.createNamedQuery("findAllInterns");
		List<Interns> interns = query.getResultList();
		return interns;
	}

	public Interns getInternById(int internId) {
		Query query = manager.createNamedQuery("findInternById");
		query.setParameter("Id", internId);
		return (Interns) query.getSingleResult();
	}

	@Override
	@Transactional
	public boolean storeInternData(Interns intern) { // TODO Auto-generated method stub
		manager.persist(intern);
		Interns intern_found = getInternById(intern.getInternId());
		if (intern_found != null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	@Transactional
	public boolean updateIntern(Interns intern) {
		// TODO Auto-generated method stub
		manager.merge(intern);
		Interns intern_db = getInternById(intern.getInternId());
		if (intern.equals(intern_db))
			return false;
		return true;
	}

	@Override
	@Transactional

	public boolean updateInternLevel(Interns intern) {
		Interns intern_db = getInternById(intern.getInternId());

		Levels intern_Level_updated_before = intern_db.getInternLevel();
		Levels intern_Level_updated = intern.getInternLevel();
		Interns interns = manager.find(Interns.class, intern.getInternId());
		interns.setInternLevel(intern_Level_updated);
		if (intern_Level_updated_before == intern_Level_updated)
			return false;
		return true;
	}

	@Override
	@Transactional
	public boolean removeIntern(int internId) {
		Interns intern = getInternById(internId);
		manager.remove(intern);
		return true;
	}
}