package agh.wggios.analizadanych.caseclass

case class MoviesCaseClass(imdb_title_id: String,
                           title: String,
                           original_title: String,
                           year: Integer,
                           date_published: String,
                           genre: String,
                           duration: Integer,
                           country: String,
                           language: String ,
                           director: String,
                           writer: String,
                           production_company: String,
                           actors: String,
                           description: String,
                           avg_vote: String,
                           votes: Integer,
                           budget: String,
                           usa_gross_income: String,
                           worlwide_gross_income: String,
                           metascore: Double,
                           reviews_from_users: Double,
                           reviews_from_critics: Double)

case class FlightCaseClass(ORIGIN_COUNTRY_NAME:String,
                           DEST_COUNTRY_NAME :String,
                           count: Int)
