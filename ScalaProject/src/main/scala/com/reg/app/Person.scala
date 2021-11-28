package com.reg.app

class Person(var firstName: String, var lastName: String, var age: Int, var gender: String) {

  def getFirstName: String = this.firstName

  def getLastName: String = this.lastName

  def getAge: Int = this.age

  def getGender: String = this.gender

  def canEqual(a: Any): Boolean = a.isInstanceOf[Person]

  override def equals(other: Any): Boolean = other match {
    case other: Person => other.canEqual(this) && this.firstName == other.firstName
    case _ => false
  }

  override def toString: String =
    s"Person(${this.firstName}, ${this.lastName}, ${this.age}, ${this.gender})"
}

object Person {

  def main(args: Array[String]): Unit = {
    val person: Person = new Person("Sam", "Smith", 20, "Male")
    print(person.toString)
  }
}