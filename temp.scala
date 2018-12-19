print("Temperature in Celsius: ")
var temp=scala.io.StdIn.readInt()
println(temp+"C is "+(temp+273)+" Kelvin")

def faren(x:Int):Float={
	var result = (x*9/5)+32
	return(result)
}

println(temp+"C is "+faren(temp)+" Farenheit")