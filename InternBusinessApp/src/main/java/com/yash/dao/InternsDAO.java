package com.yash.dao;

import java.util.List;

import com.yash.entity.Interns;

public interface InternsDAO {
		List<Interns> getAllInterns();

		Interns getInternById(int internId);

		boolean storeInternData(Interns intern);

		boolean updateIntern(Interns intern);

		boolean updateInternLevel(Interns intern);

		boolean removeIntern(int internId);
	}

