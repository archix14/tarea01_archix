 #Resolucion_04

sexo = str(input("Introduce sexo Masculino:M, Femenino:F"))
edad = int(input("Introduce Edad: "))
if(edad >= 70 ):
  print('Le corresponde el tipo de vacuna C ')
  
elif(edad >= 16):
  if(sexo=='F'):
    print('Le corresponde el tipo de vacuna B ')
  else:
    print('Le corresponde el tipo de vacuna A ')
else:
  print('Le corresponde el tipo de vacuna A ')