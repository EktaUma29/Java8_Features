package com.yash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.dao.InternsDAO;
import com.yash.entity.Interns;
import com.yash.exception.InternsException;
import com.yash.helper.Levels;

@Service
public class InternsServiceImpl implements InternsService {
	@Autowired
	private InternsDAO internsDAO;

	public List<Interns> retrieveInternsService() {
		// TODO Auto-generated method stub
		List<Interns> interns = internsDAO.getAllInterns();
		if (interns.isEmpty()) {
			throw new InternsException("No interns records found");
		} else {
			return interns;
		}
	}

	public Interns retrieveInternsByIdService(int internId) {
		// TODO Auto-generated method stub
		Interns intern = internsDAO.getInternById(internId);
		if (intern.getInternId() == 0) {
			throw new InternsException("Intern not found");
		}
		return intern;
	}

	public Levels determineLevelBySemesterMarks(Interns interns) {
		int sem1Marks = interns.getSemester1Marks();
		int sem2Marks = interns.getSemester2Marks();
		int sem3Marks = interns.getSemester3Marks();
		int semAverage = (sem1Marks + sem2Marks + sem3Marks) / 3;
		if (semAverage <= 50) {
			throw new InternsException("Intern did not match eligibility");
		}
		if (semAverage > 50 && semAverage <= 60) {
			return Levels.BEGINNER;
		} else if (semAverage > 60 && semAverage < 70) {
			return Levels.INTERMEDIATE;
		} else {
			return Levels.ADVANCED;
		}
	}

	public boolean registerInternService(Interns interns) {
		// TODO Auto-generated method stub
		Levels level = determineLevelBySemesterMarks(interns);
		interns.setInternLevel(level);
		return internsDAO.storeInternData(interns);
	}

	@Override
	public boolean updateInternService(Interns interns) {
		// TODO Auto-generated method stub
		Levels level = determineLevelBySemesterMarks(interns);
		interns.setInternLevel(level);
		boolean checkUpdation = internsDAO.updateIntern(interns);
		if (checkUpdation == false)
			throw new InternsException("Updation failed.....");
		return checkUpdation;
	}



	@Override
	public boolean updateInternLevelService(Interns interns) {
		// TODO Auto-generated method stub
		Levels level = determineLevelBySemesterMarks(interns);
		interns.setInternLevel(level);
		boolean checkUpdation = internsDAO.updateInternLevel(interns);
		if (checkUpdation == false)
			throw new InternsException("Updation failed.....");
		return checkUpdation;
	}

	

	@Override  public boolean removeInternService(int internId) {  
		// TODO Auto-generated method stub  
		boolean checkRemoval=internsDAO.removeIntern(internId); 
		if(checkRemoval==false)   
			throw new InternsException("Deletion failed....");  
		return checkRemoval;  }
}
