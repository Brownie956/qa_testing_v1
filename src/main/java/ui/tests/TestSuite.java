package ui.tests;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.jupiter.api.*;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({WikiHomeTest.class})
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestSuite {
}
