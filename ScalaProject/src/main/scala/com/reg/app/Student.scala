package com.reg.app

class Student(firstName: String, lastName: String, age: Int, gender: String,
              var id: Int, var email: String, var major: String,
              academicYear: AcademicTerm)
  extends Person(firstName, lastName, age, gender) {

  def getId: Int = id

  def getEmail: String = email

  def getMajor: String = major

  def getAcademicTerm: String = academicYear.studyYear

  override def canEqual(a: Any): Boolean = a.isInstanceOf[Student]

  override def equals(other: Any): Boolean = other match {
    case other: Student => other.canEqual(this) && this.id == other.id
    case _ => false
  }

  override def toString: String = s"Student($firstName, $lastName, $age, $gender, $id, $email, $major)"
}

object Student {

  def main(args: Array[String]): Unit = {
    val academicTerm = new AcademicTerm("Freshman")
    val student: Student = new Student("Mike", "Jones", 22, "Male",
      2, "mjones@uncc.edu", "Computer Science", academicTerm)
    println(student.toString)
  }
}