package com.reg.app

import scala.collection.mutable.ListBuffer

trait Department {
  val universityName: String = "University of North Carolina at Charlotte"
  val departmentName: String
  val programs: ListBuffer[String]

  def getPrograms: ListBuffer[String] = this.programs

  override def toString: String = s"Department($departmentName)"

  def isEqual(x: Any): Boolean

}