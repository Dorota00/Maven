package agh.wggios.analizadanych.transformations
import java.time.Year

import agh.wggios.analizadanych.caseclass.{FlightCaseClass, MoviesCaseClass}

class transformations {

  def originIsDestination(flight_row: FlightCaseClass): Boolean = {
  flight_row.ORIGIN_COUNTRY_NAME == flight_row.DEST_COUNTRY_NAME
  }

  def isOldMovie(movies_row: MoviesCaseClass):Boolean = {
   movies_row.year < (Year.now.getValue - 40)
  }

}
