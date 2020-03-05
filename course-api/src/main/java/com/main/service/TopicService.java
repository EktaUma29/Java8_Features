package com.main.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.main.exception.IDNotFoundException;
import com.main.topic.Topic;

@Service
public class TopicService {

	List<Topic> topics = new ArrayList<Topic>(Arrays.asList(new Topic(1, "ekta"), new Topic(2, "anurag")));

	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopic(int id) {

		return topics.stream().filter(m -> m.getId() == id).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(int id, Topic topic) {
		for (int i = 0; i < topics.size(); i++) {
			if (topics.get(i).getId() == id) {
				topics.set(i, topic);
				break;
			} else {
				throw new IDNotFoundException("ID is not availabe");
			}
		}
	}

	public void deleteTopic(int id) {
		for (int i = 0; i < topics.size(); i++) {
			if (topics.get(i).getId() == id) {
				topics.remove(i);
				break;
			}
		}
	}

}
