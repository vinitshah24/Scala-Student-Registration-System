package com.reg.app

import scala.collection.mutable.ArrayBuffer

class Course {
  private var id: Int = 0
  private var name: String = ""
  private var description: String = ""
  private var credit: Int = 0
  private var days: ArrayBuffer[String] = ArrayBuffer[String]("Monday", "Wednesday")
  private var time: String = ""
  private var location: String = ""
  private var instructorId: Int = 0

  def getId: Int = id

  def getName: String = name

  def getDescription: String = description

  def getCredit: Int = credit

  def getDays: ArrayBuffer[String] = ArrayBuffer[String]("Monday", "Wednesday")

  def getTime: String = time

  def getLocation: String = location

  def getInstructorId: Int = instructorId

  def canEqual(a: Any): Boolean = a.isInstanceOf[Course]

  def getCoursePayment: Double = new Payment(this.credit, true).getTotal

  override def equals(other: Any): Boolean = other match {
    case other: Course => other.canEqual(this) && this.id == other.id
    case _ => false
  }

  override def toString: String =
    s"Course($id, $name, $description, $credit, ${days.toString()}, $time, $location, $instructorId)"
}

object Course {
  def apply(id: Int, name: String, desc: String, credit: Int, days: ArrayBuffer[String],
            time: String, location: String, instructorId: Int): Course = {
    var c = new Course
    c.id = id
    c.name = name
    c.description = desc
    c.credit = credit
    c.days = days
    c.time = time
    c.location = location
    c.instructorId = instructorId
    c
  }

  def main(args: Array[String]): Unit = {
    val course1: Course = new Course()
    course1.id = 1
    course1.name = "Visual Analytics"
    course1.description = "Introduces interactive analytical methods."
    course1.credit = 3
    course1.days = ArrayBuffer("Tuesday", "Thursday")
    course1.time = "1:30PM"
    course1.location = "Kennedy"
    course1.instructorId = 1
    println(course1.toString)
    course1.id = 200
    println(course1.toString)
    println(s"Course 1 Payment: ${course1.getCoursePayment}")

    val course2 =
      Course(2, "Machine Learning", "Introduction to the machine learning pipeline",
        4, ArrayBuffer("Monday", "Wednesday"), "2:45PM", "Woodward", 6)
    println(s"Course 2 Payment: ${course2.getCoursePayment}")

  }
}