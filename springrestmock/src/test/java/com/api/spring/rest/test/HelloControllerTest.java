package com.api.spring.rest.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import javax.ws.rs.core.MediaType;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.api.spring.rest.controller.HelloController;
import com.api.spring.rest.hello.Hello;
import com.api.spring.rest.service.HelloService;

@RunWith(SpringJUnit4ClassRunner.class)
public class HelloControllerTest {
	private MockMvc mockMvc;

	@InjectMocks
	HelloController helloController;

	@Mock
	HelloService helloService;

	@Before
	public void Setup() throws Exception {
		mockMvc = standaloneSetup(helloController).build();
	}

	@Test
	public void shouldReturnTest() throws Exception {
		mockMvc.perform(get("/hello")).andExpect(status().isOk()).andExpect(content().string("Hello World"));

	}

	@Test
	public void shouldReturnHelloService() throws Exception {

		when(helloService.HelloService()).thenReturn("Hey");
		mockMvc.perform(get("/hello")).andExpect(status().isOk());//.andExpect(content().string("Hey"));
		verify(helloService).HelloService();

	}

	@Test
	public void shouldReturnHelloClassData() throws Exception {
		mockMvc.perform(get("/hello/json").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(jsonPath("$.title", Matchers.is("Title")))
				.andExpect(jsonPath("$.value", Matchers.is("Value")));
	}

}
