package com.reg.app

import scala.collection.mutable.{ArrayBuffer, ListBuffer}

class Registration(var department: Department, var student: Student, var courses: ListBuffer[Course]) {

  def getCourses: ListBuffer[Course] = courses

  def addCourse(course: Course): Unit = courses.append(course)

  def removeCourse(course: Course): Course = courses.remove(courses.indexOf(course))

  def _getCost(course: Course): Double = course.getCoursePayment

  def getCourseCosts: ListBuffer[Double] = {
    val courseCostList = ListBuffer[Double]()
    for (course <- this.courses) {
      courseCostList.append(_getCost(course))
    }
    courseCostList
  }

  def getCourseTotal: Double = this.getCourseCosts.sum

  def getCourseNames: ArrayBuffer[String] = {
    val courseNames: ArrayBuffer[String] = ArrayBuffer[String]()
    for (course <- courses) {
      courseNames.append(course.getName)
    }
    courseNames
  }

  def canEqual(a: Any): Boolean = a.isInstanceOf[Registration]

  override def toString: String = s"Registration(${department.departmentName}, ${student.id})"
}

object Registration {
  def main(args: Array[String]): Unit = {
    val department: Department = new CSDepartment()
    val academicTerm = new AcademicTerm("Freshman")
    val student: Student = new Student("Mike", "Jones", 22, "Male",
      2, "mjones@uncc.edu", "Computer Science", academicTerm)
    val prof = new Professor("Jake", "Simmons", 2, "Male", 1,
      "jsimmons@uncc.edu")
    val courses = new ListBuffer[Course]()
    courses += new Course(2, "Machine Learning", "Introduction to the machine learning pipeline",
      4, ArrayBuffer("Monday", "Wednesday"), "2:45PM", "Woodward", prof)
    courses += new Course(2, "NLP", "Introduction to the NLP",
      3, ArrayBuffer("Monday", "Wednesday"), "2:45PM", "Woodward", prof)
    val studReg = new Registration(department, student, courses)
    println(studReg.toString)
  }
}
