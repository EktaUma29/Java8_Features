package com.yash.controller;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;
import com.yash.converter.DateConverter;
import com.yash.model.AllEmployeesModel;
import com.yash.model.DepartmentsModel;
import com.yash.model.EmployeesModel;
import com.yash.model.JobsModel;
import com.yash.model.ManagersModel;
import com.yash.model.UpdatableEmployeesModel;
import com.yash.service.DepartmentsService;
import com.yash.service.EmployeesService;
import com.yash.service.JobsService;
import com.yash.validation.EmployeesModelValidator;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	private static final long serialVersionUID = 1L;
	@Autowired
	private EmployeesService employeeService;
	@Autowired
	private DepartmentsService departmentService;
	@Autowired
	private JobsService jobsService;
	@Autowired
	private EmployeesModelValidator employeesModelValidator;
	private static final String SUCCESS = "success";
	private static final String EMPLOYEES_MODEL = "employeesModel";
	private static final String OPERATION = "operation";
	private static final String EMPLOYEE_SUCCESS_PAGE = "employeesuccess";
	private static final String EMPLOYEE_FAIL_PAGE = "employeefail";
	private static final String EMPLOYEE_ERROR_PAGE = "error";
	static Logger log = Logger.getLogger(EmployeeController.class.getName());

	/** * @see HttpServlet#HttpServlet() */
	public EmployeeController() {
		super();
		BasicConfigurator.configure();
	}

	@Autowired
	ServletContext context;

	@RequestMapping(value = "index.html", method = RequestMethod.GET)
	public ModelAndView handleRequest(ServletRequest request, ServletResponse response) {
		ApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(context);
		if (ac == null) {
			System.out.println("root application context is null");
		}
		ac.getBean("yashService");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}

//employeeView.htm/{pageId}
	@RequestMapping(value = "employeeView.htm/{pageId}]", method = RequestMethod.GET)
	public ModelAndView retrieveEmployees(@PathVariable int pageId) {
		log.info("HTTP GET REQUEST");
		int total = 10;
		if (pageId == 1) {
			// do nothing!
		} else {
			pageId = (pageId - 1) * total + 1;
		}
		List<EmployeesModel> employeesModelList = employeeService.retrieveEmployees(pageId, total);
		int noOfEmployees = employeeService.countNoOfEmployees();
		int noOfpageLinks = 0;
		if (noOfEmployees % total == 0) {
			noOfpageLinks = noOfEmployees / total;
		} else {
			noOfpageLinks = (noOfEmployees / total) + 1;
		}
		ModelAndView mv = new ModelAndView();
		mv.addObject("noOfpageLinks", noOfpageLinks);
		mv.addObject("employeesModelList", employeesModelList);
		if (employeesModelList.isEmpty()) {
			mv.setViewName("noemployeedetails");
		} else {
			mv.setViewName("employeedetails");
		}
		return mv;
	}

	@RequestMapping(value = "employeeForm.htm", method = RequestMethod.GET)
	public ModelAndView loadForm() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("employeeform");
		return mv;
	}

	@ModelAttribute("employeesModel")
	public UpdatableEmployeesModel injectEmployeesModelInForm() {

		UpdatableEmployeesModel registerEmployeesModel = new UpdatableEmployeesModel();
		List<JobsModel> jobsList = jobsService.retrieveJobs();
		List<DepartmentsModel> departmentsList = departmentService.retrieveDepartments();
		List<ManagersModel> managersList = employeeService.getManagers();
		registerEmployeesModel.setJobsList(jobsList);
		registerEmployeesModel.setDepartmentsList(departmentsList);
		registerEmployeesModel.setManagersList(managersList);

		return registerEmployeesModel;
	}

	@RequestMapping(value = "employeeUpdate.htm/{pageId}", method = RequestMethod.GET)
	public ModelAndView viewEmployee(@PathVariable int pageId) {
		int total = 10;
		if (pageId == 1) { // do nothing!

		} else {
			pageId = (pageId - 1) * total + 1;
		}
		ModelAndView mv = new ModelAndView();
		List<AllEmployeesModel> allemployeesList = employeeService.getEmployeesByPage(pageId, total);
		int noOfEmployees = employeeService.countNoOfEmployees();
		int noOfpageLinks = 0;
		if (noOfEmployees % total == 0) {
			noOfpageLinks = noOfEmployees / total;
		} else {
			noOfpageLinks = (noOfEmployees / total) + 1;
		}
		mv.addObject("allemployeesList", allemployeesList);
		mv.addObject("noOfpageLinks", noOfpageLinks);
		mv.setViewName("allemployees");
		return mv;
	}

	@RequestMapping(value = "newEmployee.htm", method = RequestMethod.POST)
	public ModelAndView newEmployee(@ModelAttribute("employeesModel") UpdatableEmployeesModel registerEmployeesModel,
			BindingResult errors) {
		ModelAndView mv = new ModelAndView();
		registerEmployeesModel.setOperation("insert");
		ValidationUtils.invokeValidator(employeesModelValidator, registerEmployeesModel, errors);
		if (!errors.hasErrors()) {
			AllEmployeesModel employeesModel = new AllEmployeesModel();
			employeesModel.setEmployeeId(registerEmployeesModel.getEmployeeId());
			employeesModel.setFirstName(registerEmployeesModel.getFirstName());
			employeesModel.setLastName(registerEmployeesModel.getLastName());
			employeesModel.setEmail(registerEmployeesModel.getEmail());
			employeesModel.setPhoneNumber(registerEmployeesModel.getPhoneNumber());
			employeesModel.setJobId(registerEmployeesModel.getJobId());
			employeesModel.setHireDate(DateConverter.convertLocaleDate(registerEmployeesModel.getHireDate(), "-"));
			employeesModel.setSalary(registerEmployeesModel.getSalary());
			employeesModel.setCommissionPCT(registerEmployeesModel.getCommissionPCT());
			employeesModel.setDepartmentId(registerEmployeesModel.getDepartmentId());
			employeesModel.setManagerId(registerEmployeesModel.getManagerId());
			String outcome = employeeService.registerEmployee(employeesModel);
			if (outcome.contentEquals(SUCCESS)) {
				mv.setViewName(EMPLOYEE_SUCCESS_PAGE);
				mv.addObject(EMPLOYEES_MODEL, employeesModel);
				mv.addObject(OPERATION, "Employee registered successfully");
			} else {
				mv.setViewName(EMPLOYEE_FAIL_PAGE);
				mv.addObject(OPERATION, "Employee registration Failed");
			}
		} else {
			mv.setViewName("employeeform");
		}
		return mv;
	}

	@RequestMapping(value = "updateEmployeeForm.htm", method = RequestMethod.GET)
	public ModelAndView updateEmployeeForm(
			@ModelAttribute("employeesModel") UpdatableEmployeesModel updateEmployeesModel,
			@RequestParam("employeeId") int employeeId) {
		ModelAndView mv = new ModelAndView();
		List<AllEmployeesModel> allEmployees = employeeService.retrieveAllEmployees();
		AllEmployeesModel allemployeesModel = new AllEmployeesModel();
		for (AllEmployeesModel employeesModel : allEmployees) {
			if (employeesModel.getEmployeeId() == employeeId) {
				allemployeesModel = employeesModel;
			}
		}
		List<DepartmentsModel> departmentsList = departmentService.retrieveDepartments();
		List<JobsModel> jobsList = jobsService.retrieveJobs();
		List<ManagersModel> managersList = employeeService.getManagers();
		updateEmployeesModel.setEmployeeId(employeeId);
		updateEmployeesModel.setFirstName(allemployeesModel.getFirstName());
		updateEmployeesModel.setLastName(allemployeesModel.getLastName());
		updateEmployeesModel.setEmail(allemployeesModel.getEmail());
		updateEmployeesModel.setPhoneNumber(allemployeesModel.getPhoneNumber());
		updateEmployeesModel.setHireDate(allemployeesModel.getHireDate().toString());
		updateEmployeesModel.setSalary(allemployeesModel.getSalary());
		updateEmployeesModel.setCommissionPCT(allemployeesModel.getCommissionPCT());
		updateEmployeesModel.setJobsList(jobsList);
		updateEmployeesModel.setDepartmentsList(departmentsList);
		updateEmployeesModel.setManagersList(managersList);
		mv.setViewName("employeeupdateform");
		return mv;
	}

	@RequestMapping(value = "updateEmployee.htm", method = RequestMethod.POST)
	public ModelAndView updateEmployee(
			@ModelAttribute("employeesModel") UpdatableEmployeesModel updatableEmployeesModel, BindingResult errors) {
		ModelAndView mv = new ModelAndView();
		updatableEmployeesModel.setOperation("update");
		ValidationUtils.invokeValidator(employeesModelValidator, updatableEmployeesModel, errors);
		if (!errors.hasErrors()) {
			String outcome = employeeService.updateEmployee(updatableEmployeesModel);
			if (outcome.contentEquals(SUCCESS)) {
				mv.addObject(EMPLOYEES_MODEL, updatableEmployeesModel);
				mv.addObject(OPERATION, "Employee record Updated Successfully");
				mv.setViewName(EMPLOYEE_SUCCESS_PAGE);
			} else {
				mv.addObject(OPERATION, "Employee record update failed");
				mv.setViewName(EMPLOYEE_FAIL_PAGE);
			}
		} else {
			mv.setViewName("employeeupdateform");
		}
		return mv;
	}

	@RequestMapping(value = "deleteEmployee.htm", method = RequestMethod.GET)
	protected ModelAndView deleteEmployee(@RequestParam("employeeId") int employeeId) {
		ModelAndView mv = new ModelAndView();
		AllEmployeesModel employeesModel = new AllEmployeesModel();
		employeesModel.setEmployeeId(employeeId);
		String outcome = employeeService.deleteEmployee(employeesModel);
		List<AllEmployeesModel> allEmployeesList = employeeService.retrieveAllEmployees();
		for (AllEmployeesModel employees : allEmployeesList) {
			if (employeesModel.getEmployeeId() == employeeId) {
				employeesModel = employees;
			}
		}
		if (outcome.contentEquals(SUCCESS)) {
			mv.addObject(EMPLOYEES_MODEL, employeesModel);
			mv.addObject(OPERATION, "Employee record deleted successfully");
			mv.setViewName(EMPLOYEE_SUCCESS_PAGE);
		} else {
			mv.addObject(OPERATION, "Employee record deletion failed");
			mv.setViewName(EMPLOYEE_FAIL_PAGE);
		}
		return mv;
	}

	@ExceptionHandler(Exception.class)
	public ModelAndView handleException(Exception exception) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName(EMPLOYEE_ERROR_PAGE);
		return mv;
	}
}
