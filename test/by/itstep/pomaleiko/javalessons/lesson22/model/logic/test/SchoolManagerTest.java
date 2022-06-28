package by.itstep.pomaleiko.javalessons.lesson22.model.logic.test;

import static org.junit.Assert.*;

import by.itstep.pomaleiko.javalessons.lesson22.model.logic.SchoolManager;
import org.junit.Test;

public class SchoolManagerTest {
    @Test
    public void calculateAvgMarkPositive() {
        int[][] groups = {
                {7, 8, 9},
                {9, 8, 9, 10},
                {7, 7}};
        double expected = 8.0;

        double actual = SchoolManager.calculateAvgMark(groups);

        assertEquals(expected, actual, 0.01);
    }

}
