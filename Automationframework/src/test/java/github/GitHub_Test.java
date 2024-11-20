package github;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GitHub_Test {
	@Test
	public void addMessage() {
		Reporter.log("Welcome to GitHub",true);
	}

}
