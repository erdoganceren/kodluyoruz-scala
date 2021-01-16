package dev.akif.kodluyoruz.streetfinder

trait StreetFinder {
  def findStreets(streets: List[String], names: Set[String]): List[String] ={
    var liste: List[String] = List()
    /*for (street <- streetList){
      for (name <- nameList){
        println(street + " " + name)
        if (street contains name){
          liste = liste:+street
          println(street)
        }
      }
    }*/
    //İç içe for'un kısa hali:
    liste = streets.filter( x=> names.exists(y => x.contains(y)))
    liste
  }
}


