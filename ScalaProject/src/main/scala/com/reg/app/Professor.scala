package com.reg.app

class Professor(firstName: String, lastName: String, age: Int, gender: String,
                var id: Int, var email: String)
  extends Person(firstName, lastName, age, gender) {

  def getId: Int = id

  def getEmail: String = email

  override def canEqual(a: Any): Boolean = a.isInstanceOf[Professor]

  override def equals(other: Any): Boolean = other match {
    case other: Professor => other.canEqual(this) && this.id == other.id
    case _ => false
  }

  override def toString: String =
    s"Professor(${this.firstName}, ${this.lastName}, ${this.age}, ${this.gender}, " +
      s"${this.id}, ${this.email})"
}

object Professor {
  def main(args: Array[String]): Unit = {
    val prof = new Professor("Jake", "Simmons", 2, "Male", 1,
      "jsimmons@uncc.edu")
    print(prof.toString)
  }
}