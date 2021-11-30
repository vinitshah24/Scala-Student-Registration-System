package com.reg.app

/* Case classes are good for modeling immutable data. */
case class AcademicTerm(studyYear: String)

object AcademicTerm {
  def main(args: Array[String]): Unit = {

    val freshman = AcademicTerm("freshman")
    val junior = AcademicTerm("junior")
    print(s"Comparison: ${junior == freshman}")
  }
}