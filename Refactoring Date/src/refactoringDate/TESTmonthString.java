package refactoringDate;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TESTmonthString {
  
  int validOne = 1;
  int validTwo = 12;
  int invalid = 0;
  int year = 2000;
  int day = 1;
  
  Date date = new Date(validOne, day, year);
  
  @Test
  void testMonthStringOne() {
    Assert.assertTrue(date.monthString(validOne) == "January");  
  }
  
  @Test
  void testMonthStringTwo() {
    Assert.assertTrue(date.monthString(validTwo) == "December");  
  }
 /* 
  @Test
  void testMonthStringBad() {
    Assert.assertTrue(date.monthString(invalid) == "Error");  
  }
*/
}
