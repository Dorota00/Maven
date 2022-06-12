package agh.wggios.analizadanych.datareader

import agh.SparkSessionProvider
import org.apache.spark.sql.DataFrame

import java.nio.file.Files
import java.nio.file.Paths

class DataReader(path:String) extends SparkSessionProvider {

  def ifExists() : Boolean = {
    return Files.exists(Paths.get(this.path))
  }

  def getExtension : String = {
    val fileName = Paths.get(path).getFileName
    val extension = fileName.toString.split("\\.").last
    extension
  }

  def read(): DataFrame ={
      if (ifExists()){
          spark.read.format(getExtension).
            option("inferSchema",true).
            option("header",true).
            load(this.path)
      } else {
        println("File not found: " + this.path)
        System.exit(0)
        spark.emptyDataFrame
      }
  }
}