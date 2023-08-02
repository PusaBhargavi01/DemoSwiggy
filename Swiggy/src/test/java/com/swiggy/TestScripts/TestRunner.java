package com.swiggy.TestScripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;


import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

	features = "Features",
	
		glue = "com.swiggy.TestScripts"
		//dryRun = true
		//tags = "@product_purchase or @login_functionality"
)
public class TestRunner extends AbstractTestNGCucumberTests{

}
