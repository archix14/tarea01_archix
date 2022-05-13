#Resolucion_01
nota = int(input("Introduce nota del postulante "))
a= 0
if(nota >= 17 ):
  a=4
  print('Nivel 4')
elif(nota >= 14):
  a=3
  print('Nivel 3')
elif(nota >= 11):
  a=2
  print('Nivel 2')
else:
  a=1
  print('Nivel 1, y ya no puede obtener la vacante')