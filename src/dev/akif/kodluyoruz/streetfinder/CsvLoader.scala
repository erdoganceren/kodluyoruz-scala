package dev.akif.kodluyoruz.streetfinder

import java.io.File
import scala.collection.mutable.ListBuffer

trait CsvLoader {

  def loadCsv(file: File): List[String] = {
    val bufferedSource = io.Source.fromFile(file)


    var streets = new ListBuffer[String]()

    for (line <- bufferedSource.getLines.drop(1)) {
      val cols = line.replaceAll("'","").split(",").map(_.trim)
      streets += cols(1).map(_.toLower)
    }
    bufferedSource.close

    val streetList = streets.toList
    streetList
  }
}


