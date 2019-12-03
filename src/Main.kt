fun main(){
    val list = listOf<Figura>(
        Kwadrat(4.0,"zielony"),
        Prostokat(4.0,6.0, "biały"),
        Kolo(3.0, "czarny"),
        Trojkat(4.0,5.0,6.0,5.0,"niebieski")
    )

    for(ob in list){
        println("Obwód = " + ob.obwod().toString())
        println("Pole = " + ob.pole().toString())
        (ob as? Kolor)?.kolorowanie() //zamiast exception wyrzuca null oraz wywoła kolorowanie gdy nie będzie nullem
    }
}