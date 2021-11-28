package com.reg.app

import scala.collection.mutable.ListBuffer

class AccDepartment extends Department {
  override val departmentName: String = "Turner School of Accountancy"
  override val programs: ListBuffer[String] = ListBuffer(
    "B.S. in Accounting",
    "Masters in Accounting"
  )

  def isEqual(obj: Any): Boolean = obj.isInstanceOf[AccDepartment] &&
    obj.asInstanceOf[AccDepartment].departmentName == departmentName
}