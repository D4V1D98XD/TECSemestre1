Proceso dias_semana
	//Elabora un algoritmo donde ingreses valores del 1 al 7 y te muestre el día de la semana. 
	//Considera que para el día 1 le corresponde el lunes, 2. El martes, 3. El miércoles
	//Leonardo David Garcia Leyva
	definir dia Como Entero
	definir bandera Como Caracter
	bandera = "si"
	
	Mientras bandera = "si" O bandera = "Si" Hacer
		Escribir "Di un numero del 1 al 7: "
		Leer dia
		Segun dia Hacer
			1:
				Escribir "Lunes"
			2:
				Escribir "Martes"
			3:
				Escribir "Miercoles"
			4:
				Escribir "Jueves"
			5:
				Escribir "Viernes"
			6:
				Escribir "Sabado"
			7:
				Escribir "Domingo"
			De Otro Modo:
				Escribir "no pertenece"
		Fin Segun
		Escribir "Deseas continuar? si o no"
		Leer bandera
	Fin Mientras
	
FinProceso
