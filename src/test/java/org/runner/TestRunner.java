package org.runner;


import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources",glue="org.stepdefinition",dryRun=false)
public class TestRunner extends AbstractTestNGCucumberTests{
	//for parallel execution 
	//override the scenario method from AbstractTestNGCucumberTests
	//@DataProvider(parallel=true)
	//@Override
	//public Object[][] scenarios() {
	//	return super.scenarios();
	//}
	

}
