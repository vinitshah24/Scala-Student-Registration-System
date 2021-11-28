package com.reg.app

import org.junit.Assert.assertEquals
import org.junit.Test

class PersonTest {
  val person: Person = new Person("Sam", "Smith", 20, "Male")

  @Test def testGetFirstName(): Unit = {
    val expResult = "Sam"
    val result = person.getFirstName
    assertEquals(expResult, result)
  }

  @Test def testGetLastName(): Unit = {
    val expResult = "Smith"
    val result = person.getLastName
    assertEquals(expResult, result)
  }

  @Test def testGetAge(): Unit = {
    val expResult = 20
    val result = person.getAge
    assertEquals(expResult, result)
  }

  @Test def testGetGender(): Unit = {
    val expResult = "Male"
    val result = person.getGender
    assertEquals(expResult, result)
  }

  @Test def testIsPersonInstance(): Unit = {
    val expResult = true
    val result = person.canEqual(person)
    assertEquals(expResult, result)
  }

  @Test def testEquals(): Unit = {
    val expResult = true
    val result = person.equals(person)
    assertEquals(expResult, result)
  }

  @Test def testToString(): Unit = {
    val expResult = "Person(Sam, Smith, 20, Male)"
    val result = person.toString
    assertEquals(expResult, result)
  }

}