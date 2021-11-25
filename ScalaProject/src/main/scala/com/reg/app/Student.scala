package com.reg.app

import scala.collection.mutable.ArrayBuffer

class Student extends Person {
  private var id: Int
  private var email: String
  private var campus: String
  private var major: String
  private var courses: ArrayBuffer[Course] = ArrayBuffer[Course])


  def getId: Int = id

  def getEmail: String = email

  def getCampus: String = campus

  def getMajor: String = major

  def getCourses: ArrayBuffer[Course] = courses

  def canEqual(a: Any): Boolean = a.isInstanceOf[Student]

  def addCourse(Course course){
    courses.addOne(course)
  }

  def removeCourse(Course course){
    courses.remove(courses.indexOf(course))
  }

  override def equals(other: Any): Boolean = other match {
    case other: Student => other.canEqual(this) && this.id == other.id
    case _ => false
  }

  override def toString: String =
    s"Student($firstName, $lastName, $age, $gender, $id, $email, $campus, $major, $courses )"
}

object Student{
  def apply(id: Int, email: String, campus: String, major: String, courses: ArrayBuffer[Course] ): Student = {
    var student = new Student
    student.id = id
    student.email = email
    student.major = major
    student.courses = courses
    student
  }

  def main(args: Array[String]): Unit = {
    val student: Student = new Student()
    student.id = 801015040
    student.email = "jpate118@uncc.edu"
    student.major = "Computer Science"
    student.campus = "UNCC"

    var courses: ArrayBuffer[Course] = ArrayBuffer[Course])
    val course =
      Course(2, "Machine Learning", "Introduction to the machine learning pipeline",
        4, ArrayBuffer("Monday", "Wednesday"), "2:45PM", "Woodward", 6)
    courses.addOne(course)

    student.courses = courses

    print(student.toString)
  }
}