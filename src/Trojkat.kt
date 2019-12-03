class Trojkat(var a:Double, var b:Double, var c:Double, var h:Double, kolor:String):Figura(kolor),Kolor {
    override fun pole(): Double {
        return a*h*0.5
    }

    override fun obwod(): Double {
        println("=====Trójkąt=====")
        return a+b+c
    }
    override fun kolorowanie(){
        println("Kolor = " + kolor)
    }
}