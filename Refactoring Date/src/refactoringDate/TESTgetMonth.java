package refactoringDate;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TESTgetMonth {
  int testDay = 1;
  int testYear = 2000;
  String monthOne = "January";
  int monthTwo = 12;
  //String monthBad = "Not a month";
  
  Date dateOne = new Date(monthOne, testDay, testYear);
  Date dateTwo = new Date(monthTwo, testDay, testYear);
  //Date dateBad = new Date(monthBad, testDay, testYear);
  
  @Test
  public void testGetMonthOne() {
    Assert.assertTrue(dateOne.getMonth() == 1);
  }
  
  @Test
  void testGetMonthTwo() {
    Assert.assertTrue(dateTwo.getMonth() == 12);
  }
  
  /*
   * Cannot test bad value or program will terminate itself without completing the test
   *@Test
   *void testGetMonthBad() {
   *Assert.assertTrue(dateBad.getMonth() == 0);
   *}
  */
  
  
  
}
