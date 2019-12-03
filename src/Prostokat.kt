class Prostokat(var a:Double, var b:Double, kolor:String):Figura(kolor),Kolor {
    override fun pole(): Double {
        return a*b
    }

    override fun obwod(): Double {
        println("=====Prostokąt=====")
        return 2*a + 2*b
    }

    override fun kolorowanie(){
        println("Kolor = " + kolor)
    }
}