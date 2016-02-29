package io.github.rodrik.footballprediction;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import io.github.rodrik.footballprediction.FootbalPredictionApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = FootbalPredictionApplication.class)
@WebAppConfiguration
public class FootbalPredictionApplicationTests {

	@Test
	public void contextLoads() {
	}

}
