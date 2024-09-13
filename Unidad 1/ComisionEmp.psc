Proceso ComisionEmp
	definir i, contador Como Entero
	definir ventas, comision, sdoDia Como Real
	
	Para i=1 hasta 12 Hacer
		ventas = Aleatorio(12500,62500)
		sdoDia = Aleatorio(300, 500)
		Si ventas < 25000 Entonces
			comision = ventas * 0.03
		SiNo
			si ventas >= 50000 Entonces
				comision = (ventas * 0.12) * (3 * sdoDia)
			SiNo
				comision = ventas * 0.10 + sdoDia
			FinSi
		FinSi
		si comision >= 3500 Entonces
			contador = contador + 1
		FinSi
		Escribir "ventas mensuales del empleado: ", i, " son: $", ventas
		Escribir "el empleado: ", i, " obtuvo una comision de: $", comision
	FinPara
	Escribir "El numero de trabajadores que superaron 3500 en comision es: ", contador
	
FinProceso
