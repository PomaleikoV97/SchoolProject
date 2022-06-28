package by.itstep.pomaleiko.javalessons.lesson22.model.logic.test;

import static org.junit.Assert.*;

import by.itstep.pomaleiko.javalessons.lesson22.model.logic.SchoolManager;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SchoolManagerTest {

    private static int[][] groups;

    @BeforeClass
    public static void init(){
        groups = new int[][] {
                {7, 7, 8, 2},
                {9, 8, 9, 10},
                {7, 7, 1},
                {8, 8, 10, 10}};
    }

    @AfterClass

//    @Before
//    public void init(){
//        System.out.println("@Before");
//        groups = new int[][] {
//                {7, 7, 8, 2},
//                {9, 8, 9, 10},
//                {7, 7, 1},
//                {8, 8, 10, 10}};
//    }
    @Test
    public void testCalculateAvgMarkPositive() {
        System.out.println("testCalculateAvgMarkPositive");
//        int[][] groups = getGroups();

        double expected = 7.4;

        double actual = SchoolManager.calculateAvgMark(groups);

        assertEquals(expected, actual, 0.5);
    }

    @Test
    public void testFindBadStudentGroupsPositive() {
        System.out.println("testFindBadStudentGroupsPositive");
//        int[][] groups = getGroups();

        String expected = "1 3";

        String actual = SchoolManager.findBadStudentGroups(groups);

        assertEquals(expected, actual);
    }

    @Test
    public void testFindGroupsWithoutBadStudentsPositive() {
        System.out.println("testFindGroupsWithoutBadStudentsPositive");
//        int[][] groups = getGroups();

        String expected = "2 4";

        String actual = SchoolManager.findGroupsWithoutBadStudents(groups);

        assertEquals(expected, actual);
    }
}
