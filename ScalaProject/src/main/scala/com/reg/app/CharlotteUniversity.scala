package com.reg.app

class CharlotteUniversity extends University {
  private var phone: String = ""

  def getPhoneNum: String = this.phone

  override def toString: String = s"CharlotteUniversity(${this.name}, ${this.name}, ${this.phone}"
}

object CharlotteUniversity {
  def apply(name: String, address: String, phone: String): CharlotteUniversity = {
    val cltUni = new CharlotteUniversity
    cltUni.name = name
    cltUni.address = address
    cltUni.phone = phone
    cltUni
  }

  def main(args: Array[String]): Unit = {
    val cltUni = CharlotteUniversity("University of North Carolina at Charlotte",
      "9201 University City Blvd, Charlotte, NC 28223", "704-687-8622")
    print(cltUni.toString)
  }
}