#ejercicio_4.2python
costo_sencilla= 10
costo_doble = 12
costo_triple= 14
is_efectivo = 0.05

numero_total_xd = []

total_sencillas_array = []
total_dobles_array = []
total_triples_array = []

total_sencillas = int(input("Introduce cantidad de hamburguesas sencillas (S): "))
total_dobles = int(input("Introduce cantidad de hamburguesas dobles (D): "))
total_triples = int(input("Introduce cantidad de hamburguesas triples (T): "))
tipo_pago = str(input("Introduce tipo de pago Contado (C), efectivo(E): "))

if(total_sencillas>0):
  for i in range(total_sencillas):
    total_precio_xd = costo_sencilla
    total_sencillas_array.append(total_precio_xd)

if(total_dobles>0):
  for i in range(total_dobles):
    total_dobles_array.append(costo_doble)

if(total_triples>0):
  for i in range(total_triples):
    total_triples_array.append(costo_triple)

print('Total de sencillas: ',len(total_sencillas_array))
print('Total de dobles: ',len(total_dobles_array))
print('Total de triples: ',len(total_triples_array))

sumaxd = (sum(total_sencillas_array)) + (sum(total_dobles_array)) + (sum(total_triples_array))
if(tipo_pago== 'E'):
  print('total a pagar: ', sumaxd)
else:
  total_en_efectuivo = is_efectivo * sumaxd
  print('total a pagar SOLES XD: ', sumaxd + total_en_efectuivo)
