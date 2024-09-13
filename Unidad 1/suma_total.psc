Proceso suma_total
	//Escribe un programa que sume números ingresados por el usuario hasta que el usuario ingrese 0. Luego imprime la suma total
	//Leonardo David García Leyva.
	definir total, num Como Entero
	num = 0
	total = 0
	Repetir
		Escribir "Ingresa un nummero: "
		Leer num
		total = total + num
	Hasta Que num == 0
	Escribir "El total de la suma de todos los numeros es: ", total
FinProceso
