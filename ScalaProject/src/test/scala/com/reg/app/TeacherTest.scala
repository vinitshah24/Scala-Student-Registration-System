package com.reg.app

import org.junit.Test
import org.junit.Assert._

import scala.collection.mutable.ArrayBuffer

object TeacherTest {

}

class TeacherTest {

  val course = Course(1, "Machine Learning", "Introduction to the machine learning pipeline",
    3, ArrayBuffer("Monday", "Wednesday"), "2:45PM", "Woodward", 6)

  val teacher = Teacher(123456789, "test@uncc.edu", "UNCC", ArrayBuffer(course))

  @Test def testGetId(): Unit = {
    val expResult = 123456789
    val result = teacher.getId
    assertEquals(expResult, result)
  }

  @Test def testGetEmail(): Unit = {
    val expResult = "test@uncc.edu"
    val result = teacher.getEmail
    assertEquals(expResult, result)
  }

  @Test def testGetCampus(): Unit = {
    val expResult = "UNCC"
    val result = teacher.getCampus
    assertEquals(expResult, result)
  }

  @Test def testGetCourseTaught(): Unit = {
    val expResult = ArrayBuffer[Course](course)
    val result = teacher.getCoursesTaught
    assertEquals(expResult, result)
  }

  @Test def testAddCourse(): Unit = {
    val newCourse = Course(2, "Machine Learning", "Introduction to the machine learning pipeline",
      3, ArrayBuffer("Monday", "Wednesday"), "2:45PM", "Woodward", 6)
    assertEquals(1, teacher.coursesTaught.size)
    teacher.addCourse(newCourse)
    val expResult = 2;
    val result = teacher.coursesTaught.size
    assertEquals(expResult, result)
  }

  @Test def testRemoveCourse(): Unit = {
    assertEquals(1, teacher.coursesTaught.size)
    teacher.removeCourse(course)
    val expResult = 0;
    val result = teacher.coursesTaught.size
    assertEquals(expResult, result)
  }

  @Test def testIsTeacherInstance(): Unit = {
    val expResult = true
    val result = teacher.canEqual(new Teacher)
    assertEquals(expResult, result)
  }

  @Test def testEquals(): Unit = {
    val expResult = true
    val result = teacher.equals(teacher)
    assertEquals(expResult, result)
  }

  @Test def testToString(): Unit = {
    val expResult = "Student(Jay, Patel, 22, Male, 801015040, jpate118@uncc.edu, UNCC, Computer Science, ArrayBuffer(Course(1, Machine Learning, Introduction to the machine learning pipeline, 3, ArrayBuffer(Monday, Wednesday), 2:45PM, Woodward, 6)))"
    val result = teacher.toString
    assertEquals(expResult, result)
  }

}