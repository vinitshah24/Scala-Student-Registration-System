package com.reg.app

import org.junit.Assert.assertEquals
import org.junit.Test

class CharlotteUniversityTest {
  val cltUni = CharlotteUniversity("University of North Carolina at Charlotte",
    "9201 University City Blvd, Charlotte, NC 28223", "704-687-8622")

  @Test def testGetName(): Unit = {
    val expResult = "University of North Carolina at Charlotte"
    val result = cltUni.getName
    assertEquals(expResult, result)
  }

  @Test def testGetAddress(): Unit = {
    val expResult = "9201 University City Blvd, Charlotte, NC 28223"
    val result = cltUni.getAddress
    assertEquals(expResult, result)
  }

  @Test def testGetPhoneNum(): Unit = {
    val expResult = "704-687-8622"
    val result = cltUni.getPhoneNum
    assertEquals(expResult, result)
  }

  @Test def testToString(): Unit = {
    val expResult = "CharlotteUniversity(University of North Carolina at Charlotte, University of North Carolina at Charlotte, 704-687-8622"
    val result = cltUni.toString
    assertEquals(expResult, result)
  }

}
