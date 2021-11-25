package com.reg.app

import org.junit.Test
import org.junit.Assert.*

import java.util
import scala.collection.mutable.ArrayBuffer

object TeacherTest {

}

class TeacherTest {

  val course = Course(1, "Survey of Programming Languagues", "Programming langugues",
      4, ArrayBuffer("Monday"), "7:00PM", "Woodward", 6)
  var coursesTaught = new util.ArrayList[Course]()
  coursesTaught.add(course)

  val teacher = Teacher(123456789, "test@uncc.edu", "UNCC", "Computer Science", coursesTaught)

  teacher.firstName = "Ali"
  teacher.lastName = "Sever"
  teacher.age = 25
  teacher.gender = "Male"

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
    val expResult = coursesTaught
    val result = teacher.getCoursesTaught
    assertEquals(expResult, result)
  }

  @Test def testAddCourse(): Unit = {
    val newCourse = Course(2, "Machine Learning", "Introduction to the machine learning pipeline",
      3, ArrayBuffer("Monday", "Wednesday"), "2:45PM", "Woodward", 6)
    assertEquals(1, teacher.getCoursesTaught.size())
    teacher.addCourseTaught(newCourse)
    val expResult = 2;
    val result = teacher.getCoursesTaught.size()
    assertEquals(expResult, result)
  }

  @Test def testRemoveCourse(): Unit = {
    assertEquals(1, teacher.getCoursesTaught.size())
    teacher.removeCourseTaught(course)
    val expResult = 0;
    val result = teacher.getCoursesTaught.size()
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
    val expResult = "Teacher(Ali, Sever, 25, Male, 123456789, test@uncc.edu, UNCC, [Course(1, Survey of Programming Languagues, Programming langugues, 4, ArrayBuffer(Monday), 7:00PM, Woodward, 6)])"
    val result = teacher.toString
    assertEquals(expResult, result)
  }

}