Assertion determines the state of the application whether it is the same what we are expecting or not. If the assertion fails, then the test case is failed and stops the execution.

To use the Assertion in Web Driver, you need to download the Testng jar file and add it to the eclipse. Download the Testng jar file from the link given below:

https://mvnrepository.com/artifact/org.testng/testng/6.7
There are two types of Assertion:

1.  Hard Assertion
2.  Soft Assertion


  Hard Assertion:
                   Hard Assertion is an Assertion that throws the AssertException when the test case is failed. In the case of Hard Assertion, you can handle the error by using a catch block like a java exception. Suppose we have two test cases in a suite. The first test case in a suite has an assertion that fails, and if we want to run the second case in a suit, then we need to handle the assertion error. A Hard Assertion contains the following methods:

1. AssertEquals
2. AssertNotEquals
3. AssertTrue
4. AssertFalse
5. AssertNull
6. AssertNotNull

  SoftAssertion:
                  Till now, we have learnt about the Hard Assertion in Web Driver using Testng framework. In hard assertion, if an assertion fails then it aborts the test case otherwise it continues the execution. Sometimes we want to execute the whole script even if the assertion fails. This is not possible in Hard Assertion. To overcome this problem, we need to use a soft assertion in testng.
