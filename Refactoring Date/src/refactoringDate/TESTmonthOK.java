package refactoringDate;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


class TESTmonthOK {
  String validOne = "January";
  String validTwo = "December";
  String invalid = "Not a month";
  int year = 2000;
  int day = 1;
  
  Date date = new Date(validOne, day, year);
  
  @Test
  void testMonthOKOne() {
    Assert.assertTrue(date.monthOK(validOne) == true);  
  }
  
  @Test
  void testMonthOKTwo() {
    Assert.assertTrue(date.monthOK(validTwo) == true);  
  }
  
  @Test
  void testMonthOKBad() {
    Assert.assertTrue(date.monthOK(invalid) == false);  
  }

}
