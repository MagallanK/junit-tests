import org.junit.Before;
import org.junit.Test;

import java.nio.charset.CoderMalfunctionError;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {
    private Student student;

    @Before
    public void setup(){
        student = new Student(1L, "Kapena Magallan");
    }

    @Test
    public void canGetStudentInfo(){
        assertEquals("Kapena Magallan", student.getName());
        assertEquals(1L, student.getId());
    }

    @Test
    public void canGetGrades(){
        List<Integer> grades = student.getGrades();
        assertNotNull(grades);
    }

    @Test
    public void canAddAGrade(){
        student.addGrade(100);

        List<Integer> grades = student.getGrades();
        assertEquals(1, grades.size());
        assertEquals(Integer.valueOf(100), grades.get(0));
    }

    @Test
    public void canGetGradeAverage(){
        student.addGrade(100);
        student.addGrade(85);
        student.addGrade(70);
        double gradeAverage = student.getGradeAverage();

        assertEquals(85, gradeAverage, 0);
    }

    @Test
    public void canGetGradeAverageWithZeroGrades(){
        double gradeAverage = student.getGradeAverage();
        assertEquals(0, gradeAverage, 0);
    }


    @Test
    public void testStudentId(){
//        Student.id = 123456789;
//        assertEquals(123456789, Student.id, 0);
    assertNotNull(student);

    }
//    @Test
//    public void testStudentName(){
//        String testStudentName = "Kapena Magallan";
//        String actualStudentName = Student.getName();
//        assertEquals(testStudentName, actualStudentName);
//    }
//
//    @Test
//    public void testStudentGrades(){
//        int[] actualGrades = {84, 75, 92};
//        int[] expectedGrades = Student.addGrade();
//
//        assertArrayEquals(actualGrades, expectedGrades);
//    }

}
