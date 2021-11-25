package com.reg.app

import org.junit.Test
import org.junit.Assert._

import scala.collection.mutable.ArrayBuffer

object PersonTest {

}

class PersonTest {
  val person = Person("Jay", "Patel", 22, "Male")

  @Test def testGetFirstName(): Unit = {
    val expResult = "Jay"
    val result = person.getFirstName
    assertEquals(expResult, result)
  }

  @Test def testGetLastName(): Unit = {
    val expResult = "Patel"
    val result = person.getLastName
    assertEquals(expResult, result)
  }

  @Test def testGetAge(): Unit = {
    val expResult = 22
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
    val result = person.canEqual(new Person)
    assertEquals(expResult, result)
  }

  @Test def testEquals(): Unit = {
    val expResult = true
    val result = person.equals(person)
    assertEquals(expResult, result)
  }

  @Test def testToString(): Unit = {
    val expResult = "Person(Jay, Patel, 22, Male)"
    val result = person.toString
    assertEquals(expResult, result)
  }

}