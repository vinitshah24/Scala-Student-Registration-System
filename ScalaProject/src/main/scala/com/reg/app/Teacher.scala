package com.reg.app

import java.util
import scala.collection.mutable.ArrayBuffer

class Teacher extends Person {
  private var id: Int = 0
  private var email: String = ""
  private var campus: String = ""
  private var coursesTaught = new util.ArrayList[Course]

  def getId: Int = id

  def getEmail: String = email

  def getCampus: String = campus

  def getCoursesTaught: util.ArrayList[Course] = coursesTaught

  override def canEqual(a: Any): Boolean = a.isInstanceOf[Teacher]

  def addCourseTaught(course: Course) = coursesTaught.add(course)

  def removeCourseTaught(course: Course) = coursesTaught.remove(coursesTaught.indexOf(course))

  override def equals(other: Any): Boolean = other match {
    case other: Teacher => other.canEqual(this) && this.id == other.id
    case _ => false
  }

  override def toString: String =
    s"Teacher($firstName, $lastName, $age, $gender, $id, $email, $campus, $coursesTaught)"
}

object Teacher{
  def apply(id: Int, email: String, campus: String, major: String, coursesTaught: util.ArrayList[Course] ): Teacher = {
    var teacher = new Teacher
    teacher.id = id
    teacher.email = email
    teacher.campus = campus
    teacher.coursesTaught = coursesTaught
    teacher
  }

  def main(args: Array[String]): Unit = {
    val teacher: Teacher = new Teacher()
    teacher.firstName = "Ali"
    teacher.lastName = "Sever"
    teacher.age = 25
    teacher.gender = "Male"
    teacher.id = 123456789
    teacher.email = "teacher@uncc.edu"
    teacher.campus = "UNCC"

    var coursesTaught: util.ArrayList[Course] = util.ArrayList[Course]
    val course =
      Course(2, "Survey of Programming Languagues", "Programming langugues",
        4, ArrayBuffer("Monday"), "7:00PM", "Woodward", 6)
    coursesTaught.add(course)

    teacher.coursesTaught = coursesTaught

    print(teacher.toString)
  }
}