Algoritmo Multiplicar
	//Imprimir la tabla de multiplicar del número 5 hasta el 10.
	//Leonardo David Garcia Leyva
	Definir multi, i, f, alto Como Entero
	i = 5
	f = 0
	Escribir "tabla de multiplicar del 5 al 10"
	Repetir
		Escribir "Tabla del: ", i
		Repetir
			multi = i * f
			Escribir i, "x", f "=", multi
			f = f + 1
		Hasta Que f=11
		f = 0
		i = i + 1
	Hasta Que i = 11 
	
FinAlgoritmo
