package com.reg.app

import org.junit.Assert.assertEquals
import org.junit.Test

class PaymentTest {
  val coursePayment = new Payment(3, true)

  @Test def testGetCredit(): Unit = {
    val expResult = 3
    val result = coursePayment.getCredit
    assertEquals(expResult, result)
  }

  @Test def testIsInstateResident(): Unit = {
    val expResult = true
    val result = coursePayment.inStateResident
    assertEquals(expResult, result)
  }

  @Test def testChangeResidency(): Unit = {
    val testPayment = new Payment(3, true)
    testPayment.inStateResident = false
    val expResult = false
    val result = testPayment.inStateResident
    assertEquals(expResult, result)
  }

  @Test def testToString(): Unit = {
    val expResult = "Payment(3, true, 470.0)"
    val result = coursePayment.toString
    assertEquals(expResult, result)
  }

  @Test def testGetTotalInState3Credits(): Unit = {
    val testPayment = new Payment(3, true)
    val expResult = 470.0
    val result = testPayment.getTotal
    assertEquals(expResult, result, 0.0)
  }

  @Test def testGetTotalInState4Credits(): Unit = {
    val testPayment = new Payment(4, true)
    val expResult = 970.0
    val result = testPayment.getTotal
    assertEquals(expResult, result, 0.0)
  }

  @Test def testGetTotalInState6Credits(): Unit = {
    val testPayment = new Payment(6, true)
    val expResult = 970.0
    val result = testPayment.getTotal
    assertEquals(expResult, result, 0.0)
  }

  @Test def testGetTotalInState8Credits(): Unit = {
    val testPayment = new Payment(8, true)
    val expResult = 1470.0
    val result = testPayment.getTotal
    assertEquals(expResult, result, 0.0)
  }

  @Test def testGetTotalOutState3Credits(): Unit = {
    val testPayment = new Payment(3, false)
    val expResult = 530.0
    val result = testPayment.getTotal
    assertEquals(expResult, result, 0.0)
  }

  @Test def testGetTotalOutState4Credits(): Unit = {
    val testPayment = new Payment(4, false)
    val expResult = 1030.0
    val result = testPayment.getTotal
    assertEquals(expResult, result, 0.0)
  }

  @Test def testGetTotalOutState6Credits(): Unit = {
    val testPayment = new Payment(6, false)
    val expResult = 1030.0
    val result = testPayment.getTotal
    assertEquals(expResult, result, 0.0)
  }

  @Test def testGetTotalOutState8Credits(): Unit = {
    val testPayment = new Payment(8, false)
    val expResult = 1530.0
    val result = testPayment.getTotal
    assertEquals(expResult, result, 0.0)
  }
}
