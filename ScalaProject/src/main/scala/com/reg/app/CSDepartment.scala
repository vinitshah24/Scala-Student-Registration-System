package com.reg.app

import scala.collection.mutable.ListBuffer

class CSDepartment extends Department {
  override val departmentName: String = "College of Computing and Informatics"
  override val programs: ListBuffer[String] = ListBuffer(
    "B.S. in Computer Science (CS)",
    "B.A. in Computer Science (CS)",
    "Masters in Computer Science (CS)"
  )

  def isEqual(obj: Any): Boolean = obj.isInstanceOf[CSDepartment] &&
    obj.asInstanceOf[CSDepartment].departmentName == departmentName
}

object CSDepartment {
  def main(args: Array[String]): Unit = {
    val csDep = new CSDepartment()
    println(csDep.programs)
    println(csDep.toString)
  }
}
