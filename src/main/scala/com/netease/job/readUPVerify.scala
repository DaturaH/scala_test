package com.netease.job

import org.apache.spark.sql.SparkSession

object readUPVerify {
 
//  var spark = SparkSession.builder().appName("ReadUPVerify").config("spark.some.config.option", "some-value").getOrCreate();
//  val df = spark.read.json("/Users/hutianqi/Downloads/test/test/UPVerify");
//  df.show()
  
  def main(args: Array[String]) : Unit={
    val warehouseLocation = "file:${system:user.dir}/spark-warehouse"
    val spark = SparkSession
       .builder()
       .appName("SparkSessionZipsExample")
       .master("local")
       .config("spark.sql.warehouse.dir", warehouseLocation)
       .getOrCreate()  
//    val df = spark.read.text("/Users/hutianqi/Downloads/test/test/sampleDir/people.txt")
//    val df = spark.read.json("/Users/hutianqi/Downloads/test/test/UPVerify_test");
    val df = spark.read.csv("/Users/hutianqi/Downloads/test/test/UPVerify_test.csv");

    df.show()
    df.printSchema()
  }
 
}