package com.reg.app

import org.junit.Test
import org.junit.Assert._

import scala.collection.mutable.ArrayBuffer

object CourseTest {

}

class CourseTest {
  val course = Course(1, "Machine Learning", "Introduction to the machine learning pipeline",
    3, ArrayBuffer("Monday", "Wednesday"), "2:45PM", "Woodward", 6)

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
    val expResult = 6
    val result = course.getInstructorId
    assertEquals(expResult, result)
  }

  @Test def testIsCourseInstance(): Unit = {
    val expResult = true
    val result = course.canEqual(new Course)
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

  @Test def testToString(): Unit = {
    val expResult = "Course(1, Machine Learning, Introduction to the machine learning pipeline, 3, ArrayBuffer(Monday, Wednesday), 2:45PM, Woodward, 6)"
    val result = course.toString
    assertEquals(expResult, result)
  }

}