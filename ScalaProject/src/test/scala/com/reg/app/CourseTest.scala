package com.reg.app

import org.junit.Test
import org.junit.Assert._

import scala.collection.mutable.ArrayBuffer

class CourseTest {
  val prof = new Professor("Jake", "Simmons", 2, "Male", 1,
    "jsimmons@uncc.edu")
  val course: Course = new Course(1, "Machine Learning", "Introduction to the machine learning pipeline",
    3, ArrayBuffer("Monday", "Wednesday"), "2:45PM", "Woodward", prof)

  @Test def testGetId(): Unit = {
    val expResult = 1
    val result = course.getId
    assertEquals(expResult, result)
  }

  @Test def testGetName(): Unit = {
    val expResult = "Machine Learning"
    val result = course.getName
    assertEquals(expResult, result)
  }

  @Test def testGetDescription(): Unit = {
    val expResult = "Introduction to the machine learning pipeline"
    val result = course.getDescription
    assertEquals(expResult, result)
  }

  @Test def testGetProfessor(): Unit = {
    val expResult = "Jake Simmons"
    val result = course.getProfessor
    assertEquals(expResult, result)
  }


  @Test def testGetCredit(): Unit = {
    val expResult = 3
    val result = course.getCredit
    assertEquals(expResult, result)
  }

  @Test def testGetDays(): Unit = {
    val expResult = ArrayBuffer[String]("Monday", "Wednesday")
    val result = course.getDays
    assertEquals(expResult, result)
  }

  @Test def testGetTime(): Unit = {
    val expResult = "2:45PM"
    val result = course.getTime
    assertEquals(expResult, result)
  }

  @Test def testGetLocation(): Unit = {
    val expResult = "Woodward"
    val result = course.getLocation
    assertEquals(expResult, result)
  }

  @Test def testGetInstructor(): Unit = {
    val expResult = prof
    val result = course.getInstructor
    assertEquals(expResult, result)
  }

  @Test def testIsCourseInstance(): Unit = {
    val expResult = true
    val result = course.canEqual(course)
    assertEquals(expResult, result)
  }

  @Test def testGetCoursePayment(): Unit = {
    val expResult = new Payment(3, true).getTotal
    val result = course.getCoursePayment
    assertEquals(expResult, result, 0.0)
  }

  @Test def testEquals(): Unit = {
    val expResult = true
    val result = course.equals(course)
    assertEquals(expResult, result)
  }

  @Test def testEqualsFail(): Unit = {
    val course2: Course = new Course(2, "Software Engineering", "Software Engineering Principles",
      3, ArrayBuffer("Monday", "Wednesday"), "1:15 PM", "Woodward", prof)
    val expResult = false
    val result = course.equals(course2)
    assertEquals(expResult, result)
  }

  @Test def testToString(): Unit = {
    val expResult = "Course(1, Machine Learning, Introduction to the machine learning pipeline, 3, " +
      "ArrayBuffer(Monday, Wednesday), 2:45PM, Woodward, " +
      "Professor(Jake, Simmons, 2, Male, 1, jsimmons@uncc.edu))"
    val result = course.toString
    assertEquals(expResult, result)
  }
}