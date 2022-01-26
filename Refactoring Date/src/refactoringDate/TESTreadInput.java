package refactoringDate;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TESTreadInput {
  int testDayOne = 1;
  int testMonthOne = 2;
  int testYearOne = 2000;
  int testDayTwo = 28;
  String testMonthTwo = "February";
  int testMonthTwoNum = 2;
  int testYearTwo = 2000;
  Date date1 = new Date(testMonthOne, testDayOne, testYearOne);
  Date date2 = new Date(testMonthTwo, testDayTwo, testYearTwo);

  
  @Test 
  public void testReadInputDay1() {
    Assert.assertTrue(date1.getDay() == testDayOne);  
  }
  
  @Test 
  public void testReadInputMonth1() {
    Assert.assertTrue(date1.getMonth() == testMonthOne);
  }
  
  @Test 
  public void testReadInputYear1() {
    Assert.assertTrue(date1.getYear() == testYearOne);  
  }
  
  @Test 
  public void testReadInputDay2() {
    Assert.assertTrue(date2.getDay() == testDayTwo);  
  }
  
  @Test 
  public void testReadInputMonth2() {
    Assert.assertTrue(date2.getMonth() == testMonthTwoNum);
  }
  
  @Test 
  public void testReadInputYear2() {
    Assert.assertTrue(date2.getYear() == testYearTwo);  
  }


}
