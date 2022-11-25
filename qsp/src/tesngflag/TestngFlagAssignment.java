package tesngflag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestngFlagAssignment {
  @Test()
  public void z () 
  {
	  Reporter.log("z method",true);
  }
  @Test()
  public void x () 
  {
	  Reporter.log("x method",true);
  }
  
  @Test(priority=0)
  public void y () 
  {
	  Reporter.log("y method",true);
  }
  
  @Test(priority=0)
  public void w () 
  {
	  Reporter.log("w method",true);
  }
  @Test(priority=0)
  public void a () 
  {
	  Reporter.log("a method",true);
  }
  @Test(priority=2)
  public void b () 
  {
	  Reporter.log("b method",true);
  }
  @Test(priority=3)
  public void c () 
  {
	  Reporter.log("c method",true);
	  
  }
  
  
  
  
}
