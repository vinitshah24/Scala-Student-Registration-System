package com.reg.app

import org.junit.Test
import org.junit.Assert._


import java.util
import scala.collection.mutable.ArrayBuffer

class StudentTest {

  val student: Student = new Student("Mike", "Jones", 22, "Male",
    24562, "mjones@uncc.edu", "Computer Science", AcademicTerm("Freshman"))
  val student2: Student = new Student("Steve", "Smith", 21, "Male",
    25533, "ssmith@uncc.edu", "Computer Science", AcademicTerm("Freshman"))

  @Test def testGetId(): Unit = {
    val expResult = 24562
    val result = student.getId
    assertEquals(expResult, result)
  }

  @Test def testGetEmail(): Unit = {
    val expResult = "mjones@uncc.edu"
    val result = student.getEmail
    assertEquals(expResult, result)
  }

  @Test def testGetMajor(): Unit = {
    val expResult = "Computer Science"
    val result = student.getMajor
    assertEquals(expResult, result)
  }

  @Test def testGetAcademicTerm(): Unit = {
    val expResult = "Freshman"
    val result = student.getAcademicTerm
    assertEquals(expResult, result)
  }

  //
  //  @Test def testAddCourse(): Unit = {
  //    val newCourse = Course(2, "Machine Learning", "Introduction to the machine learning pipeline",
  //      3, ArrayBuffer("Monday", "Wednesday"), "2:45PM", "Woodward", 6)
  //    assertEquals(1, student.getCourses.size())
  //    student.addCourse(newCourse)
  //    val expResult = 2;
  //    val result = student.getCourses.size
  //    assertEquals(expResult, result)
  //  }
  //
  //  @Test def testRemoveCourse(): Unit = {
  //    assertEquals(1, student.getCourses.size())
  //    student.removeCourse(course)
  //    val expResult = 0;
  //    val result = student.getCourses.size
  //    assertEquals(expResult, result)
  //  }

  @Test def testIsStudentInstance(): Unit = {
    val expResult = true
    val result = student.canEqual(student2)
    assertEquals(expResult, result)
  }

  @Test def testEquals(): Unit = {
    val expResult = true
    val result = student.equals(student)
    assertEquals(expResult, result)
  }

  @Test def testEqualsFail(): Unit = {
    val expResult = false
    val result = student.equals(student2)
    assertEquals(expResult, result)
  }

  @Test def testToString(): Unit = {
    val expResult = "Student(Mike, Jones, 22, Male, 24562, mjones@uncc.edu, Computer Science)"
    val result = student.toString
    assertEquals(expResult, result)
  }

}