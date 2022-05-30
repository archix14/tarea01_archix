#ejercicio_4.3python
total_cero = []
total_mayor_uno =[]
total_menor_cero =[]
for i in numero_total_xd:
  if(i<0):
    total_menor_cero.append(i)
  elif(i==0):
    total_cero.append(i)
  else:
    total_mayor_uno.append(i)
print( 'En total mayores a cero: ', len(total_mayor_uno))
print( 'En total igual a cero: ', len(total_cero))
print( 'En total menores a cero: ', len(total_menor_cero))
