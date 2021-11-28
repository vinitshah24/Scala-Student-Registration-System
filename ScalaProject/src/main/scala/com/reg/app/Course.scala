package com.reg.app

import scala.collection.mutable.ArrayBuffer

class Course(var id: Int, name: String, description: String, credit: Int, days: ArrayBuffer[String],
             time: String, location: String, professor: Professor) {

  def getId: Int = this.id

  def getName: String = this.name

  def getDescription: String = this.description

  def getCredit: Int = this.credit

  def getDays: ArrayBuffer[String] = ArrayBuffer[String]("Monday", "Wednesday")

  def getTime: String = this.time

  def getLocation: String = this.location

  def getInstructor: Professor = this.professor

  def canEqual(a: Any): Boolean = a.isInstanceOf[Course]

  def getCoursePayment: Double = new Payment(this.credit, true).getTotal

  override def equals(other: Any): Boolean = other match {
    case other: Course => other.canEqual(this) && this.id == other.id
    case _ => false
  }

  override def toString: String =
    s"Course(${this.id}, ${this.name}, ${this.description}, ${this.credit}, " +
      s"${this.days.toString()}, ${this.time}, ${this.location}, " +
      s"${this.professor.toString})"

}

object Course {

  def main(args: Array[String]): Unit = {

    val prof = new Professor("Jake", "Simmons", 2, "Male", 1,
      "jsimmons@uncc.edu")
    val course2 = new Course(2, "Machine Learning", "Introduction to the machine learning pipeline",
      4, ArrayBuffer("Monday", "Wednesday"), "2:45PM", "Woodward", prof)
    println(s"Course Payment: ${course2.getCoursePayment}")
  }
}