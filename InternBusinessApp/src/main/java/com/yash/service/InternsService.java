package com.yash.service;

import java.util.List;
import com.yash.entity.Interns;

public interface InternsService {
	List<Interns> retrieveInternsService();

	Interns retrieveInternsByIdService(int internId);

	boolean registerInternService(Interns interns);

	boolean updateInternService(Interns interns);

	boolean updateInternLevelService(Interns interns);

	boolean removeInternService(int internId);
}
