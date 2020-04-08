package com.roverspace.rover.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
      
        TestMove.class,
        TestLeft.class,
        TestRight.class,
        EastDirectionTest.class,
        NorthDirectionTest.class,
        SouthDirectionTest.class,
        WestDirectionTest.class,
        RoverTest.class,
        TestInputTxt.class,
        TestGrid.class
})
public class SuiteTest extends AppTest {

}

