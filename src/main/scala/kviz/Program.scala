package kviz

object Program {

  def main(args: Array[String]) = {

    val pitanja: Seq[String] = Seq(
      "U kojem programskom jeziku pisemo?",
      "Koji je glavni grad Norveske?",
      "Prezime prvog covjeka na Mjesecu?",
      "Koliko milijardi ljudi ima na Zemlji?",
      "Najpoznatije auto u BiH je?")

    val odgovori: Seq[String] = Seq("scala", "oslo", "armstrong", "8", "golf")

    var tacniOdgovori:  List[Int] = List()

    while (tacniOdgovori.size != 5) {

      print("Unesite broj pitanja (1-5): ")
      val opcija = scala.io.StdIn.readInt()

      if (opcija == 1) {
          print(pitanja(opcija - 1), "Odgovor: ")
          val odgovor = scala.io.StdIn.readLine()
            if (tacniOdgovori.contains(opcija)) print("To pitanje je vec odgovoreno.")
            else if (odgovor == odgovori(opcija - 1)) opcija :: tacniOdgovori
            else { System.exit(1) }
      }


    }


  }



}
