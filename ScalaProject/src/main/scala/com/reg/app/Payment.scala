package com.reg.app

class Payment(var credit: Int, var inStateResident: Boolean) {

  def getCredit: Int = credit

  def isInstateResident: Boolean = inStateResident

  def changeResidency(isInstate: Boolean): Unit = inStateResident = isInstate

  def getTotal: Double = {
    val creditCost = {
      if (credit > 0 && credit <= 3) 450
      else if (credit > 3 && credit <= 6) 950
      else if (credit > 6) 1450
      else 100
    }
    val inStateCost = 20
    val outStateCost = inStateCost * 4
    if (inStateResident) inStateCost + creditCost
    else outStateCost + creditCost
  }

  override def toString: String = s"Payment($credit, $inStateResident, $getTotal)"
}

object Payment {

  def main(args: Array[String]): Unit = {
    val coursePayment = new Payment(3, false)
    println(coursePayment)
    coursePayment.inStateResident = true
    val paymentCost = coursePayment.getTotal
    println(paymentCost)
    paymentCost match {
      case x if x < 500 => println(f"You have less than $$500 balance due: $$$x%2.2f")
      case x if x < 1000 => println(f"You have less than $$1,000 balance due: $$$x%2.2f")
      case x if x > 2000 => println(f"You have more than $$2,000 balance due: $$$x%2.2f")
      case _ => println("You do not have any balance due at this time")
    }
  }
}