package agh.wggios.analizadanych

import agh.SparkSessionProvider
import agh.wggios.analizadanych.caseclass.FlightCaseClass
import agh.wggios.analizadanych.datareader.DataReader
import agh.wggios.analizadanych.datawriter.DataWriter
import agh.wggios.analizadanych.transformations.transformations
import org.apache.spark.sql.Row


object Main extends SparkSessionProvider {

  def main(args: Array[String]): Unit = {

    import spark.implicits._
    val flightsDf = new DataReader("movies.csv").read().as[FlightCaseClass]

    val newDf= flightsDf.filter(flight_row => new transformations().originIsDestination(flight_row)).show()

  }
}
