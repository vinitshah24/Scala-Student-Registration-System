package com.reg.app

import org.junit.Assert.assertEquals
import org.junit.Test

import scala.collection.mutable.{ArrayBuffer, ListBuffer}

class RegistrationTest {

  val department: Department = new CSDepartment()
  val academicTerm = new AcademicTerm("Freshman")
  val student: Student = new Student("Mike", "Jones", 22, "Male",
    2, "mjones@uncc.edu", "Computer Science", academicTerm)
  val prof = new Professor("Jake", "Simmons", 2, "Male", 1,
    "jsimmons@uncc.edu")
  val courses = new ListBuffer[Course]()
  val course = new Course(2, "Machine Learning", "Introduction to ML",
    4, ArrayBuffer("Monday", "Wednesday"), "2:45PM", "Woodward", prof)
  courses.append(course)
  val studReg = new Registration(department, student, courses)


  @Test def getCoursesTest(): Unit = {
    val expResult = 1
    val result = studReg.courses.length
    assertEquals(expResult, result)
  }

  @Test def testAddCourse(): Unit = {
    val newCourse = new Course(2, "NLP", "Introduction to the NLP",
      3, ArrayBuffer("Monday", "Wednesday"), "2:45PM", "Woodward", prof)
    assertEquals(1, studReg.courses.length)
    studReg.addCourse(newCourse)
    val expResult = 2;
    assertEquals(2, studReg.courses.length)
  }

  @Test def testRemoveCourse(): Unit = {
    val newCourse = new Course(2, "NLP", "Introduction to the NLP",
      3, ArrayBuffer("Monday", "Wednesday"), "2:45PM", "Woodward", prof)
    studReg.addCourse(newCourse)
    assertEquals(2, studReg.courses.length)
    studReg.removeCourse(newCourse)
    assertEquals(1, studReg.courses.length)
  }

  @Test def testGetCourseCosts(): Unit = {
    val expResult = ListBuffer(970.0)
    val result = studReg.getCourseCosts
    assertEquals(expResult, result)
  }

  @Test def testGetCourseTotal(): Unit = {
    val expResult = 970.0
    val result = studReg.getCourseTotal
    assertEquals(expResult, result, 0.0)
  }

  @Test def testCanEqual(): Unit = {
    val expResult = true
    val result = studReg.canEqual(studReg)
    assertEquals(expResult, result)
  }

  @Test def testCanEqualFail(): Unit = {
    val expResult = false
    val result = studReg.canEqual(Professor)
    assertEquals(expResult, result)
  }

  @Test def testToString(): Unit = {
    val expResult = "Registration(College of Computing and Informatics, 2)"
    val result = studReg.toString
    assertEquals(expResult, result)
  }
}
