Algoritmo tres_casos
	//1.-Calcular el IMC 2.-edad a meses dias 3.- construccion 500,000 40% mano de obra 60% materiales
	Definir  bandera como entero
	Definir peso, estatura, est, imc como real
	definir edad, meses, dias, biciesto, diastrunc como real
	Escribir "1.- masa corporal 2.- edad meses dias 3.- Construccion y mano de obra"
	Escribir "Elige una opcion"
	leer bandera
	si bandera >= 1 Y bandera <= 3 Entonces
		si bandera == 1 Entonces
			Escribir "Ingresa el peso de la persona"
			Leer peso
			Escribir "Ingresa la estatura de la persona"
			Leer estatura
			est = estatura / 100
			imc = peso / (est*est)
			Escribir "imc: ", imc
			si imc < 18.5 Entonces
				Escribir  "Bajo Peso"
			FinSi
			si imc >= 18.5 Y imc < 25 Entonces
				Escribir "Normal"
			FinSi
			si imc >= 25 Y imc < 30 Entonces
				Escribir "sobrepeso"
			FinSi
			si imc >= 30 Entonces
				Escribir "Obesidad"
			FinSi
		FinSi
		si bandera == 2 Entonces
			Escribir "Ingresa tu edad: "
			leer edad
			meses = edad * 12
			dias = meses * 365
			biciesto = edad / 4
			dias = dias + biciesto
			diastrunc = Trunc(dias;-1)
			Escribir "Meses de vida: ", meses
			Escribir "dias de vida: ", dias
			Escribir "años biciestos: ", biciesto
		FinSi
		si bandera == 3 Entonces
			
		FinSi
	SiNo
		Escribir "Operación invalida"
		
		
	FinSi
	
	
FinAlgoritmo
