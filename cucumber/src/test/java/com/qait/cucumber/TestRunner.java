package com.qait.cucumber;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber; 

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature/my1.feature",
glue="com.qait.cucumber"
		)
public class TestRunner {


}

  


