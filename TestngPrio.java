package Advance;

import org.testng.annotations.Test;

public class TestngPrio {
	  @Test(priority = 2)
	  public void login() throws InterruptedException {
		  System.out.println("login");

}
	  @Test(priority = 1)
	  public void logout() throws InterruptedException {
		  System.out.println("logout");

}
	  @Test(priority = -1)                                //enabled=false(to skip the value)
	  public void create() throws InterruptedException {
		  System.out.println("create");

}

}
