package jUnitTestingPackage;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ testAddNumbers.class, testAddStrings.class })
public class AllTests {

}
