package agh.wggios.analizadanych.datawriter

import agh.SparkSessionProvider
import org.apache.spark.sql.DataFrame

class DataWriter(path:String, df:DataFrame) extends SparkSessionProvider {

  def isEmpty: Boolean = {
    if(this.df.rdd.take(1).length == 0 ){
      return true
    }
    false
  }

  def write(): Unit ={
    if(!isEmpty){
      this.df.write.save(this.path)
    } else
      {
        println("Data frame is empty: " + this.df)
        System.exit(0)
      }
  }

}
