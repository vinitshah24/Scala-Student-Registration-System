package com.reg.app

import org.junit.Assert._
import org.junit.Test

import scala.collection.mutable.ListBuffer

class CSDepartmentTest {

  val csDep = new CSDepartment()

  @Test def departmentNameTest(): Unit = {
    val expResult = "College of Computing and Informatics"
    val result = csDep.departmentName
    assertEquals(expResult, result)
  }

  @Test def programsTest(): Unit = {
    val expResult = ListBuffer(
      "B.S. in Computer Science (CS)",
      "B.A. in Computer Science (CS)",
      "Masters in Computer Science (CS)"
    )
    val result = csDep.programs
    assertEquals(expResult, result)
  }

  @Test def isEqualTest(): Unit = {
    val expResult = true
    val result = csDep.isEqual(new CSDepartment())
    assertEquals(expResult, result)
  }

  @Test def isEqualFailTest(): Unit = {
    val expResult = false
    val result = csDep.isEqual(new BioDepartment())
    assertEquals(expResult, result)
  }
}