package com.reg.app

import scala.collection.mutable.{ArrayBuffer, ListBuffer}
import scala.language.postfixOps
import scala.util.control._

object Driver {
  def main(args: Array[String]): Unit = {

    def keyForValue(majors: Map[Int, String], value: Int) = {
      val foundMajor = majors.find({ case (id, _) => id == value })
      foundMajor.get._2
    }

    def printCourses(courseList: ListBuffer[Course]): Unit = {
      var i = 0
      while (i < courseList.length) {
        println(s"ID: ${courseList(i).id}")
        println(s"Name: ${courseList(i).getName}")
        println(s"Professor: ${courseList(i).getProfessor}")
        println(s"Location: ${courseList(i).getLocation}")
        println(s"Days: ${courseList(i).getDays}")
        println(s"TIme: ${courseList(i).getTime}")
        println(s"Cost: ${courseList(i).getCoursePayment}")
        println("")
        i += 1
      }
    }

    def showSummary(studReg: Registration): Unit = {
      println("\n----- SUMMARY OF REGISTERED CLASSES -----\n")
      for (course <- studReg.courses) {
        println(s"ID: ${course.id}")
        println(s"Name: ${course.getName}")
        println(s"Credit: ${course.getCredit}")
        println(s"Professor: ${course.getProfessor}")
        println(s"Cost: ${course.getCoursePayment}")
        println("")
      }
      println("----------------------------------------")
      println(s"TOTAL PAYMENT DUE: ${studReg.getCourseTotal}")
      println("----------------------------------------")
    }


    println("----- STUDENT DETAILS -----\n")
    print("Enter First Name: ")
    val firstName = scala.io.StdIn.readLine().toString
    print("Enter Last Name: ")
    val lastName = scala.io.StdIn.readLine().toString
    print("Enter Age: ")
    var age = 20
    try {
      age = scala.io.StdIn.readLine().toInt
    } catch {
      case e: NumberFormatException => println("Couldn't convert age to Integer value")
      case e: _ => println(s"Caught Exception: $e")
    }
    print("Enter Gender: ")
    val gender = scala.io.StdIn.readLine().toUpperCase() match {
      case "M" => "Male"
      case "F" => "Female"
      case _ => "Other"
    }
    val studentId = scala.util.Random.between(1000, 10000)
    val lastSize = {
      if (lastName.length > 2) lastName.length - 2
      else lastName.length
    }
    val email = s"${firstName.substring(0, 1)}${lastName.substring(0, lastSize)}@uncc.edu"
    var majors: Map[Int, String] = Map()
    majors += (1 -> "Computer Science")
    majors += (2 -> "Biology")
    majors += (3 -> "Accountancy")
    println("Available Majors:")
    for (item <- majors) {
      println(s"${item._1}: ${item._2}")
    }
    print("Select number from available Major: ")
    val majorCat = scala.io.StdIn.readLine().toInt
    val major = keyForValue(majors, majorCat)
    val academicTerm = new AcademicTerm("Freshman")
    val student: Student = new Student(firstName, lastName, age, gender, studentId, email, major, academicTerm)
    println(student.toString)

    val professorsList = ListBuffer[Professor]()
    professorsList += new Professor("Jake", "Simmons", 40,
      "Male", 10010, "jsimmons@uncc.edu")
    professorsList += new Professor("Roldan", "Bortol", 35,
      "Male", 10210, "rbortol0@uncc.edu")
    professorsList += new Professor("Luca", "Spedroni", 29,
      "Male", 10310, "lspedroni1@uncc.edu")
    professorsList += new Professor("Jackie", "Brassill", 53,
      "Female", 10410, "jbrassill3@uncc.edu")
    professorsList += new Professor("Angele", "Vizard", 28,
      "Female", 10510, "avizard26@uncc.edu")
    professorsList += new Professor("Chery", "Mattecot", 36,
      "Female", 10610, "cmattecot15@uncc.edu")

    val csCourseList = ListBuffer[Course]()
    csCourseList += new Course(9552, "Machine Learning",
      "Introduction to the ML algorithms",
      4, ArrayBuffer("Monday", "Wednesday"), "2:45 PM", "Woodward", professorsList(1))
    csCourseList += new Course(9562, "Intro to NLP",
      "Introduction to the Natural Language Processing",
      3, ArrayBuffer("Tuesday", "Thursday"), "2:00 PM", "Woodward", professorsList(2))
    csCourseList += new Course(9462, "Logic and Algorithms",
      "Introduction to propositional calculus, predicate calculus, algorithms, and logic design",
      3, ArrayBuffer("Tuesday", "Thursday"), "2:00 PM", "Woodward", professorsList(2))

    val bioCourseList = ListBuffer[Course]()
    bioCourseList += new Course(6672, "Principles of Biology I",
      "Fundamental principles of life with a human emphasis",
      3, ArrayBuffer("Tuesday"), "2:30 PM", "Fretwell", professorsList(2))
    bioCourseList += new Course(6642, "Fundamentals of Microbiology Laboratory",
      "Basic physiology with emphasis on host-parasite interaction and epidemiology of infectious diseases.",
      3, ArrayBuffer("Wednesday", "Friday"), "4:00 PM", "Fretwell", professorsList(2))
    bioCourseList += new Course(6632, "Neurobiology",
      "Study of molecular and cellular processes of neuronal function in human central and peripheral nervous systems.",
      3, ArrayBuffer("Saturday"), "5:00 PM", "Fretwell", professorsList(2))

    val accCourseList = ListBuffer[Course]()
    accCourseList += new Course(3200, "Business Computing",
      "Fundamental programming methods for Excel VBA to automate tasks to improve productivity",
      3, ArrayBuffer("Saturday"), "5:00 PM", "Kennedy", professorsList(2))
    accCourseList += new Course(3240, "Intermediate Microeconomic and Macroeconomic Theory",
      " Microeconomic analysis with emphasis on consumer theory and the theory of production.",
      3, ArrayBuffer("Saturday"), "5:00 PM", "Kennedy", professorsList(2))
    accCourseList += new Course(3269, "Data and Information Management",
      "A study of the design and implementation of databases and enterprise data warehouses for business applications",
      3, ArrayBuffer("Saturday"), "5:00 PM", "Kennedy", professorsList(2))

    var selectionCourses: ListBuffer[Course] = ListBuffer[Course]()
    var department: Department = new CSDepartment()

    def showAvailableCourses(): Unit = {
      println(s"\n----- AVAILABLE COURSES FOR ${student.getMajor.toUpperCase} REGISTRATION -----\n")
      if (student.getMajor.equals("Computer Science")) {
        printCourses(csCourseList)
        selectionCourses = csCourseList
        department = new AccDepartment()
      } else if (student.getMajor.equals("Biology")) {
        printCourses(bioCourseList)
        selectionCourses = bioCourseList
        department = new BioDepartment()
      } else {
        printCourses(accCourseList)
        selectionCourses = accCourseList
        department = new AccDepartment()
      }
    }

    showAvailableCourses()
    val regCourseList: ListBuffer[Course] = ListBuffer[Course]()
    var studReg = new Registration(department, student, regCourseList)
    var loop = new Breaks
    loop.breakable {
      while (true) {
        print("Enter the Course ID: ")
        var courseId = scala.io.StdIn.readLine().toInt
        for (course <- selectionCourses) if (course.id == courseId) studReg.addCourse(course)
        print("Enter C to complete Registration: ")
        var contStr = scala.io.StdIn.readLine().toString
        if (contStr.substring(0).toUpperCase.equals("C")) {
          loop.break
        }
      }
    }
    //    studReg = new Registration(department, student, regCourseList)
    showSummary(studReg)

    println("\n----- DROP/REMOVE CLASSES -----\n")
    print("Enter Y to modify Registration: ")
    var modifyReg = scala.io.StdIn.readLine().toString
    if (modifyReg.toUpperCase.equals("Y")) {
      loop.breakable {
        while (true) {
          print("Enter the Course ID to remove: ")
          var courseId = scala.io.StdIn.readLine().toInt
          val removeCourse: ArrayBuffer[Course] = ArrayBuffer()
          for (course <- studReg.courses)
            if (course.id == courseId)
              removeCourse.append(course)
          studReg.removeCourse(removeCourse.head)
          print("Enter N to complete Registration: ")
          var contStr = scala.io.StdIn.readLine().toString
          if (contStr.substring(0).toUpperCase.equals("N")) {
            showSummary(studReg)
            loop.break
          }
        }
      }
      showSummary(studReg)
    }
    else showSummary(studReg)

    println("\n----- ADD/UPDATE CLASSES -----\n")
    showAvailableCourses()
    var moreCourses: ListBuffer[Course] = ListBuffer[Course]()
    loop = new Breaks
    loop.breakable {
      while (true) {
        print("Enter the Course ID: ")
        var courseId = scala.io.StdIn.readLine().toInt
        for (course <- selectionCourses) if (course.id == courseId) moreCourses += course
        print("Enter C to complete Registration: ")
        var contStr = scala.io.StdIn.readLine().toString
        if (contStr.substring(0).toUpperCase.equals("C")) {
          loop.break
        }
      }
    }
    for (course <- moreCourses) {
      studReg.addCourse(course)
    }
    showSummary(studReg)
  }
}