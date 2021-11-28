package com.reg.app

import scala.collection.mutable.ListBuffer

class BioDepartment extends Department {
  override val departmentName: String = "College of Biology"
  override val programs: ListBuffer[String] = ListBuffer(
    "B.S. in Biology",
    "B.A. in Biology",
    "B.S. in Cell Biology/Physiology Concentration"
  )

  def isEqual(obj: Any): Boolean = obj.isInstanceOf[BioDepartment] &&
    obj.asInstanceOf[BioDepartment].departmentName == departmentName
}


