class Kwadrat (var a:Double, kolor:String):Figura(kolor),Kolor
{
    override fun pole(): Double {
        return a*a
    }

    override fun obwod(): Double {
        println("=====Kwadrat=====")
        return 4*a
    }
    override fun kolorowanie(){
        println("Kolor = " + kolor)
    }
}