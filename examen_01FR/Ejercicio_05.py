#Resolucion_05
num=float()
#Datos de entrada
num=float(input("Ingrese el numero del ejercicio(1-4): "))
#Proceso
if num>=5:
        print("Ese ejercicio no existe ingrese otro")
elif num==4:
        edad = int (input ('Ingresa el valor de edad: '))
        print ('Selecciona el valor de sexo.')
        print ('\t1.- mujer')
        print ('\t2.- hombre')
        sexo = 0
        while sexo<1 or sexo>2:
            sexo = int (input (': '))
        if sexo<1 or sexo>2:
            sys.stdout.write ('Valor incorrecto. Ingr\u00E9salo nuevamente.')
        if (sexo==2 and edad>=16 and edad<70) or edad<16:
            print ('A')
        if sexo==1 and edad>=16 and edad<70:
            print ('B')
        if edad>70:
            print ('C')
            print ()
            os.system ('pause')()
elif num==3:
        signo = str(input("ingrese el signo"))
        if(signo == 'p' or signo == 'P' or signo =='%' ):
             raizModulo = int(input("ingrese el numero: "))
        else:
            num1 = int(input("ingrese el numero 1: "))
            num2 = int(input("ingrese el numero 2: "))
        if(signo == '*' ):
            resultado= num1*num2
            print("La multiplicacion es:",resultado )
        elif(signo == '+'):
            resultado= num1+num2
            print("La suma es:",resultado )
        elif(signo == '-'):
            resultado= num1-num2
            print("La resta es:",resultado )
        elif(signo == '/'):
            resultado= num1/num2
            print('La division es: ',resultado )
        elif(signo == '^'):
            resultado= num1**num2
            print('La division es : ',resultado )
        elif(signo == '%'):
            resultado= num1**num2
            print('La division es: ',resultado )
        elif(signo == 'p' or signo == 'P'):
            resultado= math.sqrt(raizModulo)
            print('La raiz cuadrada es: ',resultado )
        elif(signo == '%'):
            resultado= raizModulo%2
            print('El Modulo es: ',resultado )
   
        else:
            print('INVALIDO')
elif num==2:
    precio = int(input("ingrese el monto de venta:"))
    igv= 0
    if(precio >= 2000 ):
        igv=precio*0.1
        totalpagar =igv +precio
        print('IGV', igv)
        print('total a pagar: ', totalpagar)
    elif(precio >= 1000):
        igv=precio*0.05
        totalpagar =igv +precio
        print('IGV ', igv)
        print('total a pagar: ', totalpagar)
    else:
        igv=precio*0.02
        totalpagar =igv +precio
        print('IGV ', igv)
        print('total a pagar: ', totalpagar)()
else:
    nota = int(input("ingrese la nota del postutante:"))
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
        print('Nivel 1, y ya no puede obtener la vacante:')()