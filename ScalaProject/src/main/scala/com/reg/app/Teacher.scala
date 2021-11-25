package com.reg.app

import scala.collection.mutable.ArrayBuffer

class Teacher extends Person {
  private var id: Int
  private var email: String
  private var campus: String
  private var coursesTaught: ArrayBuffer[Course] = ArrayBuffer[Course])


  def getId: Int = id

  def getEmail: String = email

  def getCampus: String = campus

  def getCoursesTaught: ArrayBuffer[Course] = coursesTaught

  def canEqual(a: Any): Boolean = a.isInstanceOf[Teacher]

  def addCourseTaught(Course course){
    coursesTaught.addOne(course)
  }

  def removeCourseTaught(Course course){
    coursesTaught.remove(coursesTaught.indexOf(course))
  }

  override def equals(other: Any): Boolean = other match {
    case other: Teacher => other.canEqual(this) && this.id == other.id
    case _ => false
  }

  override def toString: String =
    s"Teacher($firstName, $lastName, $age, $gender, $id, $email, $campus, $coursesTaught )"
}

object Teacher{
  def apply(id: Int, email: String, campus: String, major: String, coursesTaught: ArrayBuffer[Course] ): Teacher = {
    var teacher = new Teacher
    teacher.id = id
    teacher.email = email
    teacher.campus = campus
    teacher.coursesTaught = coursesTaught
    teacher
  }

  def main(args: Array[String]): Unit = {
    val teacher: Teacher = new Teacher()
    teacher.id = 123456789
    teacher.email = "teacher@uncc.edu"
    teacher.campus = "UNCC"

    var coursesTaught: ArrayBuffer[Course] = ArrayBuffer[Course])
    val course =
      Course(2, "Machine Learning", "Introduction to the machine learning pipeline",
        4, ArrayBuffer("Monday", "Wednesday"), "2:45PM", "Woodward", 6)
    coursesTaught.addOne(course)

    teacher.courses = coursesTaught

    print(teacher.toString)
  }
}