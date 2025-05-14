package pl.cegladanych.spark

import org.apache.spark.sql.{DataFrame}

class DataWriter {
  def write(df: DataFrame, path: String): Unit = {
    println(s">>> Writing data to: $path")
    df.write.mode("overwrite").parquet(path)
  }
}
