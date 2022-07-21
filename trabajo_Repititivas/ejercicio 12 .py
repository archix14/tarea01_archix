#definir variables
descuento:float=0.20
igv:float
pbase:float
pcd:float
pf:float
#datos de entrada
pbase=float(input("ingrese el precio base del articulo:"))
#proceso
pcd=pbase-(pbase*descuento)
igv=pcd*0.18
pf=pcd+igv
#datos de salida
print(f"El precio con descuento es: {pcd}")
print(f"El precio final es: {pf}")