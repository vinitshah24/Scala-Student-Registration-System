package com.reg.app

import org.junit.Test
import org.junit.Assert._

import scala.collection.mutable.ArrayBuffer

object StudentTest {

}

class StudentTest {

  val course = Course(1, "Machine Learning", "Introduction to the machine learning pipeline",
    3, ArrayBuffer("Monday", "Wednesday"), "2:45PM", "Woodward", 6)

  val student = Student(801015040, "jpate118@uncc.edu", "UNCC", "Computer Science", ArrayBuffer(course))

  @Test def testGetId(): Unit = {
    val expResult = 801015040
    val result = student.getId
    assertEquals(expResult, result)
  }

  @Test def testGetEmail(): Unit = {
    val expResult = "jpate118@uncc.edu"
    val result = student.getEmail
    assertEquals(expResult, result)
  }

  @Test def testGetCampus(): Unit = {
    val expResult = "UNCC"
    val result = student.getCampus
    assertEquals(expResult, result)
  }

  @Test def testGetMajor(): Unit = {
    val expResult = "Computer Science"
    val result = student.getMajor
    assertEquals(expResult, result)
  }

  @Test def testGetCourses(): Unit = {
    val expResult = ArrayBuffer[Course](course)
    val result = student.getCourses
    assertEquals(expResult, result)
  }

  @Test def testAddCourse(): Unit = {
    val newCourse = Course(2, "Machine Learning", "Introduction to the machine learning pipeline",
      3, ArrayBuffer("Monday", "Wednesday"), "2:45PM", "Woodward", 6)
    assertEquals(1, student.courses.size)
    student.addCourse(newCourse)
    val expResult = 2;
    val result = student.courses.size
    assertEquals(expResult, result)
  }

  @Test def testRemoveCourse(): Unit = {
    assertEquals(1, student.courses.size)
    student.removeCourse(course)
    val expResult = 0;
    val result = student.courses.size
    assertEquals(expResult, result)
  }

  @Test def testIsStudentInstance(): Unit = {
    val expResult = true
    val result = student.canEqual(new Student)
    assertEquals(expResult, result)
  }

  @Test def testEquals(): Unit = {
    val expResult = true
    val result = student.equals(student)
    assertEquals(expResult, result)
  }

  @Test def testToString(): Unit = {
    val expResult = "Student(Jay, Patel, 22, Male, 801015040, jpate118@uncc.edu, UNCC, Computer Science, ArrayBuffer(Course(1, Machine Learning, Introduction to the machine learning pipeline, 3, ArrayBuffer(Monday, Wednesday), 2:45PM, Woodward, 6)))"
    val result = student.toString
    assertEquals(expResult, result)
  }

}