package com.reg.app

class Person {
  var firstName: String = ""
  var lastName: String = ""
  var age: Int = 0
  var gender: String = ""

  def getFirstName: String = firstName

  def getLastName: String = lastName

  def getAge: Int = age

  def getGender: String = gender

  def canEqual(a: Any): Boolean = a.isInstanceOf[Person]

  override def equals(other: Any): Boolean = other match {
    case other: Person => other.canEqual(this) && this.firstName == other.firstName
    case _ => false
  }

  override def toString: String =
    s"Person($firstName, $lastName, $age, $gender)"
}

object Person{
  def apply(firstName: String, lastName: String, age: Int, gender: String): Person = {
    var person = new Person

    person.firstName = firstName
    person.lastName = lastName
    person.age = age
    person.gender = gender
    person
  }

  def main(args: Array[String]): Unit = {
    val person: Person = new Person()
    person.firstName = "Jay"
    person.lastName = "Patel"
    person.age = 22
    person.gender = "Male"

    print(person.toString)
  }
}