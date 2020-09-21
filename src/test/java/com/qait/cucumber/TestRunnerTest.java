package com.qait.cucumber;




import org.junit.runner.RunWith;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

import cucumber.api.CucumberOptions;

@RunWith(ExtendedCucumber.class)

@ExtendedCucumberOptions(jsonReport = "target/cucumber.json",
retryCount = 1,
detailedReport = true,
detailedAggregatedReport = true,
overviewReport = true,
coverageReport = true,
usageReport = true,
toPDF = true,
jsonUsageReports = "target/cucumberEx.json",
outputFolder = "target")

@CucumberOptions(features="Feature/my1.feature",
glue="com.qait.cucumber",
plugin= {"html:target/cucumber-html-report","json:target/cucumber.json","usage:target/cucumberEx.json"}
		)

public class TestRunnerTest   {


}

  


