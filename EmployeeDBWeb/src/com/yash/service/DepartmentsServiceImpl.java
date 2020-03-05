package com.yash.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yash.dao.DepartmentsDAO;
import com.yash.entities.Departments;
import com.yash.model.DepartmentsModel;

@Service
public class DepartmentsServiceImpl implements DepartmentsService {
	@Autowired
	private DepartmentsDAO departmentsDAO;
	static Logger log = Logger.getLogger(DepartmentsServiceImpl.class.getName());

	public DepartmentsServiceImpl() {
		BasicConfigurator.configure();
	}

	@Override
	public List<DepartmentsModel> retrieveDepartments() {
		List<DepartmentsModel> departmentsModelList = new ArrayList<>();
		try {
			List<Departments> departmentsList = departmentsDAO.getAllDepartments();
			for (Departments department : departmentsList) {
				DepartmentsModel departmentsModel = new DepartmentsModel();
				departmentsModel.setDepartmentId(department.getDepartmentId());
				departmentsModel.setDepartmentName(department.getDepartmentName());
				departmentsModelList.add(departmentsModel);
			}
		} catch (ClassNotFoundException | SQLException e) {
			log.error("!ERROR[Retrieval of Departments failed!!!]");
		}
		return departmentsModelList;
	}
}
