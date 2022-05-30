#ejercicio_4.1Psalario_inicial =  1500
incremento =0.1
cantidad_anios = 6
cantidad_anios_incremento = salario_inicial* incremento
anios_array = []
for i in range(cantidad_anios):
  total_por_anio = salario_inicial + cantidad_anio_incremento
  anios_array.append(total_por_anio)
  print('salario por año',i+1, 'es: ',total_por_anio )

print('Los 6 años recibio un total de: ',sum(anios_array))

