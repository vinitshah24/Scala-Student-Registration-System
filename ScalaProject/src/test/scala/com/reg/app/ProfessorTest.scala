package com.reg.app

import org.junit.Assert.assertEquals
import org.junit.Test

class ProfessorTest {

  val prof = new Professor("Jake", "Simmons", 2, "Male", 1234,
    "jsimmons@uncc.edu")

  @Test def testGetId(): Unit = {
    val expResult = 1234
    val result = prof.getId
    assertEquals(expResult, result)
  }

  @Test def testGetEmail(): Unit = {
    val expResult = "jsimmons@uncc.edu"
    val result = prof.getEmail
    assertEquals(expResult, result)
  }

  //  @Test def testGetCourseTaught(): Unit = {
  //    val expResult = coursesTaught
  //    val result = prof.getCoursesTaught
  //    assertEquals(expResult, result)
  //  }
  //
  //  @Test def testAddCourse(): Unit = {
  //    val newCourse = Course(2, "Machine Learning", "Introduction to the machine learning pipeline",
  //      3, ArrayBuffer("Monday", "Wednesday"), "2:45PM", "Woodward", 6)
  //    assertEquals(1, prof.getCoursesTaught.size())
  //    prof.addCourseTaught(newCourse)
  //    val expResult = 2;
  //    val result = prof.getCoursesTaught.size()
  //    assertEquals(expResult, result)
  //  }
  //
  //  @Test def testRemoveCourse(): Unit = {
  //    assertEquals(1, prof.getCoursesTaught.size())
  //    prof.removeCourseTaught(course)
  //    val expResult = 0;
  //    val result = prof.getCoursesTaught.size()
  //    assertEquals(expResult, result)
  //  }

  @Test def testCanEqual(): Unit = {
    val prof2 = new Professor("John", "Paul", 24, "Male", 4366,
      "jpaul@uncc.edu")
    val expResult = true
    val result = prof.canEqual(prof2)
    assertEquals(expResult, result)
  }

  @Test def testEquals(): Unit = {
    val expResult = true
    val result = prof.equals(prof)
    assertEquals(expResult, result)
  }

  @Test def testToString(): Unit = {
    val expResult = "Professor(Jake, Simmons, 2, Male, 1234, jsimmons@uncc.edu)"
    val result = prof.toString
    assertEquals(expResult, result)
  }

}