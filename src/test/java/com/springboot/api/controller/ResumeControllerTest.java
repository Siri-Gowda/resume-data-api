package com.springboot.api.controller;

/*import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.api.model.Resume;
import com.springboot.api.service.ResumeServiceInterface;

@WebMvcTest(ResumeController.class)*/
public class ResumeControllerTest {

/*	@MockBean
	private ResumeServiceInterface resumeServiceInterfaceMock;

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@Test
	public void testCreateResumeDetails() throws Exception {
		// end point Url
		String endpointUrl = "/resume/api/resume-details";

		// request body
		Resume resume = new Resume();
		resume.setName("Shireesha");
		resume.setStudy("Bsc");
		resume.setSkills("Java 1.8,Spring boot");
		resume.setGrade(7.8);
		resume.setCourse("Computer Science");
		resume.setBatch(2021);

		// method

		mockMvc.perform(post(endpointUrl).contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(resume))).andExpect(status().isOk()).andDo(print())
				.andReturn();
	}

	@Test
	public void testGetResumeDEtails() throws Exception {
		String name = "Gagan Vihar";
		Resume resume = new Resume();
		resume.setBatch(2);
		resume.setName("Gagan Vihar");
		resume.setStudy("MBA");
		resume.setSkills("Java");
		resume.setGrade(9.5);
		resume.setCourse("Computers");

		when(resumeServiceInterfaceMock.getResumeDetails(name)).thenReturn(resume);
		String getEndPointUrl = "/resume/api/get-resume-details";
		MockHttpServletResponse getResponse = mockMvc.perform(get(getEndPointUrl).param("name",name)).andExpect(status().isOk())
				.andDo(print()).andReturn().getResponse();
		String result = getResponse.getContentAsString();
		Resume resumeResponse =objectMapper.readValue(result, Resume.class);
	assertEquals("Gagan Vihar",resumeResponse.getName());
	}*/

}
