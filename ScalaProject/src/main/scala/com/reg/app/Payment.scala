package com.reg.app

class Payment(var credit: Int, var inStateResident: Boolean) {
  def getTotal: Double = {
    var creditCost = {
      if (credit > 0 && credit <= 3) 250
      else if (credit > 3 && credit <= 6) 220
      else if (credit > 6) 200
      else 100
    }
    var inStateCost = 20
    var outStateCost = inStateCost * 4
    if (inStateResident) inStateCost * creditCost
    else outStateCost * creditCost
  }

  def getCredit: Int = credit

  def isInstateResident: Boolean = inStateResident

  def changeResidency(isInstate: Boolean): Unit = inStateResident = isInstate

  override def toString: String = s"Payment($credit, $inStateResident, $getTotal)"
}

object Payment {

  def main(args: Array[String]): Unit = {
    val coursePayment = new Payment(3, false)
    println(coursePayment)
    coursePayment.inStateResident = true
    println(coursePayment)
  }
}
