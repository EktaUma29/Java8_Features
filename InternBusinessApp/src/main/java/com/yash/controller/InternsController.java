package com.yash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.entity.Interns;
import com.yash.service.InternsService;

@RestController
@CrossOrigin(origins = "file:///C:/Users/ekta.sharma/Desktop/AngularJS/EmployeeDB.html")
//@RequestMapping("/interns-management")
public class InternsController {
	@Autowired
	private InternsService internService;

	@GetMapping(value= "/yash-interns", produces= { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<Interns>> retrieveAllInterns() {
		List<Interns> internsList = internService.retrieveInternsService();
		ResponseEntity<List<Interns>> response = new ResponseEntity<List<Interns>>(internsList, HttpStatus.OK);
		return response;
	}

	@GetMapping("/yash-interns/{internId}")
	public ResponseEntity<Interns> retrieveInternById(@PathVariable("internId") int internId) {
		Interns interns = internService.retrieveInternsByIdService(internId);
		ResponseEntity<Interns> response = null;
		if (interns.getInternId() != 0) {
			response = new ResponseEntity<Interns>(interns, HttpStatus.FOUND);
		} else {
			response = new ResponseEntity<Interns>(interns, HttpStatus.NOT_FOUND);
		}
		return response;
	}

	@PostMapping("yash-interns")
	public ResponseEntity<Void> registerIntern(@RequestBody Interns interns) {
		boolean registrationResult = internService.registerInternService(interns);
		ResponseEntity<Void> response = null;
		if (registrationResult) {
			response = new ResponseEntity<Void>(HttpStatus.CREATED);
		} else {
			response = new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		return response;
	}

	@PutMapping("yash-interns-manage")
	public ResponseEntity<Void> updateLevel(@RequestBody Interns interns) {
		boolean updateIntern = internService.updateInternService(interns);
		ResponseEntity<Void> response = null;
		if (updateIntern == true)
			response = new ResponseEntity<Void>(HttpStatus.ACCEPTED);
		else
			response = new ResponseEntity<Void>(HttpStatus.NOT_MODIFIED);
		return response;
	}

	@PatchMapping("yash-interns-level")
	public ResponseEntity<Void> updateInternLevel(@RequestBody Interns interns) {

		boolean updateLevel = internService.updateInternLevelService(interns);
		ResponseEntity<Void> response = null;
		if (updateLevel == true)
			response = new ResponseEntity<Void>(HttpStatus.ACCEPTED);
		else

			response = new ResponseEntity<Void>(HttpStatus.NOT_MODIFIED);
		return response;
	}

	@DeleteMapping("yash-interns-manage/{internId}")
	public ResponseEntity<Void> deleteStudent(@PathVariable("internId") int internId) {
		ResponseEntity<Void> response = null;
		boolean internRemoved = internService.removeInternService(internId);
		if (internRemoved) {
			response = new ResponseEntity<Void>(HttpStatus.OK);
		} else {
			response = new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		return response;
	}
}
