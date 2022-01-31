# COSC211-Assignment-1
Assignment Purpose:
  Reformat date.java to use Google Styles
  Update data types to var for readInput method under date.java
  Update switch statements for 3 methods: getMonth, monthString, and monthOK.
  Test all updates using JUnit.
  
Three sets of tests exist, one for the readInput method. This tests three sets of values when creating instances of the date class.
Two sets of values use integers, 1 and 12 for the month.  One set uses a string to refer to the month.  All values are verified correct using the getMonth method.

The second set of tests checks monthOK.  This verifies "January" and "December" are recognized as months, while the string "Not a month" is recognized as invalid.

The final set of tests checks monthString.  This verifies month integers 1 and 12 can be correctly identified as "January" and "December" respectively.
  
