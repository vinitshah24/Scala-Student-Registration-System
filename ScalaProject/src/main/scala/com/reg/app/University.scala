package com.reg.app

class University {
  var name: String = ""
  var address: String = ""

  def getName: String = this.name

  def getAddress: String = this.address

  def settName(name: String): Unit = {
    this.name = name
  }

  def setAddress(address: String): Unit = {
    this.address = address
  }
}
