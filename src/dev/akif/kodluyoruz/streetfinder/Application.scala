package dev.akif.kodluyoruz.streetfinder

import java.io.File
import scala.collection.mutable.ListBuffer

/**
 * See CSV file at: https://github.com/makiftutuncu/kodluyoruz-scala/blob/main/data/streets.csv
 *
 * Original data: https://github.com/life/il-ilce-mahalle-sokak-cadde-sql
 */


object Application {
  def main(args: Array[String]): Unit = {
    val file = new File("C:/Users/ASUS/Desktop/Scala/kodluyoruz-scala//data/streets.csv")

    println("Kaç tane sokak/cadde arayacaksınız?:")
    var countOfInput = scala.io.StdIn.readInt()
    println("Aramak istediğiniz sokak/cadde isimlerini girin:")
    var nameList: Set[String] = Set();

    while (countOfInput > 0 ){
      val names = scala.io.StdIn.readLine();
      nameList += names.map(_.toLower)
      countOfInput = countOfInput - 1;
    }

    val streetFinder = new StreetFinder {}
    val csvLoader = new CsvLoader {}

    val streetList = csvLoader.loadCsv(file)

    print(streetFinder.findStreets(streetList,nameList))





  }
}
