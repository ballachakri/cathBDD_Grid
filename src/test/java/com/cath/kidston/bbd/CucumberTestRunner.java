package com.cath.kidston.bbd;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith (Cucumber.class)
@CucumberOptions(features = "src/test",tags={"@search , @sort ,@login ,@register , @addtobag"},dryRun = false,strict = true,plugin = "json: cath.json")
public class CucumberTestRunner {

}



















// below code works for multiple tests
//@CucumberOptions(features = "src/test",tags={"@search , @sort"},dryRun = false,strict = true,plugin = "json: cath.json")
//public class CucumberTestRunner {
//
//}
