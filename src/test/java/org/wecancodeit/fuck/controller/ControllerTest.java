package org.wecancodeit.fuck.controller;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.wecancodeit.fuck.repository.CityRepository;
import org.wecancodeit.fuck.repository.StateRepository;

@RunWith(SpringRunner.class)
@WebMvcTest(StateController.class)
public class ControllerTest {
	
	@Autowired
	MockMvc mockMvc;
	
	@MockBean
	StateRepository stateRepo;
	
	@MockBean
	CityRepository cityRepo;

}
