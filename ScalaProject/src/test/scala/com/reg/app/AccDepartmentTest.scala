package com.reg.app

import org.junit.Test
import org.junit.Assert._
import scala.collection.mutable.ListBuffer

class AccDepartmentTest {

  val accDep = new AccDepartment()

  @Test def departmentNameTest(): Unit = {
    val expResult = "Turner School of Accountancy"
    val result = accDep.departmentName
    assertEquals(expResult, result)
  }

  @Test def programsTest(): Unit = {
    val expResult = ListBuffer("B.S. in Accounting", "Masters in Accounting")
    val result = accDep.programs
    assertEquals(expResult, result)
  }

  @Test def isEqualTest(): Unit = {
    val expResult = true
    val result = accDep.isEqual(new AccDepartment())
    assertEquals(expResult, result)
  }

  @Test def isEqualFailTest(): Unit = {
    val expResult = false
    val result = accDep.isEqual(new BioDepartment())
    assertEquals(expResult, result)
  }
}