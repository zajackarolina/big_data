package agh.wggios.analizadanych.datatransformer

import org.apache.spark.sql.{DataFrame}
import agh.wggios.analizadanych.LoggingUtils

class DataTransformer {
  def transform(df: DataFrame): DataFrame = {
    // przykład: grupowanie po kolumnie "count_views"
    df.groupBy("count_views").sum()
  }
}
