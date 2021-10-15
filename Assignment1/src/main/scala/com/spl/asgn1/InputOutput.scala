package com.spl.asgn1

import scala.io.StdIn.readLine

object InputOutput {

  def main(args: Array[String]): Unit = {
    print("Enter car name: ")
    val carName: String = readLine()
    print("Enter car model: ")
    val carModel = readLine()
    print("Enter car manufacturing year: ")
    val carYear: Int = readLine().toInt
    print("Enter car price: ")
    val carPrice: Double = readLine().toDouble
    println("Car Details:")
    println(s"Name: $carName")
    println(s"Model: $carName")
    printf("Make: %d", carYear)
    printf("\nPrice: %f", carPrice)
  }
}
