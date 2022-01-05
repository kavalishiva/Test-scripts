package Advance;

import org.testng.annotations.Test;

public class Testng7 {
	
		  @Test
		  public void login() throws InterruptedException {
			  System.out.println("login");

}
		  @Test(dependsOnMethods= {"create"})
		  public void logout() throws InterruptedException {
			  System.out.println("logout");

}
		  @Test(dependsOnMethods= {"login"})
		  public void create() throws InterruptedException {
			  System.out.println("create");

}
}