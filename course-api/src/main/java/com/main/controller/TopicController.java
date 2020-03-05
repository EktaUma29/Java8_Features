package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.main.service.TopicService;
import com.main.topic.Topic;

@RestController
public class TopicController {
	
	@Autowired
	TopicService topicService;

	@GetMapping("/topic")
	public List<Topic> getAllTopic(){
		return topicService.getAllTopics();
	}
	
	@GetMapping("/topic/{id}")
	public Topic getTopic(@PathVariable int id) {
		return topicService.getTopic(id);
	}
	
	@GetMapping("/topics")
	public Topic getTopi(@RequestParam("id") int id) {
		return topicService.getTopic(id);
	}
	
	@PostMapping("/topic")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	@PutMapping("/topic/{id}")
	public void updateTopic(@PathVariable int id, @RequestBody Topic topic) {
		topicService.updateTopic(id, topic);
	}

	@DeleteMapping("/topic/{id}")
	public void deleteTopic(@PathVariable int id) {
		topicService.deleteTopic(id);
	}
	
	
	@RequestMapping(value="/welcome/user", method=RequestMethod.GET) 
    public String showWelcomePage(@RequestParam(value="fName", required=true) String firstname, @RequestParam(value="lName") String lastname) {
 
        String fullname = firstname + " " + lastname;
        System.out.println("Username is= " + fullname);
 
        return fullname;
	
	}
}
