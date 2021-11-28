package com.reg.app

import org.junit.Assert._
import org.junit.Test

import scala.collection.mutable.ListBuffer

class BioDepartmentTest {

  val bioDep = new BioDepartment()

  @Test def departmentNameTest(): Unit = {
    val expResult = "College of Biology"
    val result = bioDep.departmentName
    assertEquals(expResult, result)
  }

  @Test def programsTest(): Unit = {
    val expResult = ListBuffer(
      "B.S. in Biology",
      "B.A. in Biology",
      "B.S. in Cell Biology/Physiology Concentration"
    )
    val result = bioDep.programs
    assertEquals(expResult, result)
  }

  @Test def isEqualTest(): Unit = {
    val expResult = true
    val result = bioDep.isEqual(new BioDepartment())
    assertEquals(expResult, result)
  }

  @Test def isEqualFailTest(): Unit = {
    val expResult = false
    val result = bioDep.isEqual(new AccDepartment())
    assertEquals(expResult, result)
  }
}