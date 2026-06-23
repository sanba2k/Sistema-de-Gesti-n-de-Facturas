# 🧠 ENUNCIADO 1 — Sistema de Gestión de Facturas

Una empresa necesita desarrollar una aplicación para administrar las facturas emitidas durante el mes.

Los datos se encuentran en un archivo facturas.txt, donde cada línea representa una factura.

Se deberá utilizar:

HashMap<Integer, Factura>

Donde la clave es el número de factura.

## 🔹 Tipos de facturas
### 🧾 Factura A
numero
cliente
importeBase
cuit
### 🧾 Factura B
numero
cliente
importeBase
dni
## 🔹 Formato del archivo
A;1001;Juan Perez;15000;20333444556
B;1002;Ana Gomez;8000;33444555
## 🔹 Reglas de cálculo
Factura A
👉 total = importeBase + 21% (IVA)
Factura B
👉 total = importeBase + 10.5%
## 🔥 REQUISITOS (ACÁ ESTÁ LA TRAMPA)
Leer archivo y cargar en HashMap

Clase abstracta Factura

Polimorfismo para calcular total

Mostrar todas las facturas con total

Buscar factura por número

Eliminar factura por número

Calcular recaudación total (Streams)

Mostrar factura con mayor total (Streams)

Mostrar factura con menor total (Streams)

Cantidad de Facturas A (Streams)

Cantidad de Facturas B (Streams)

Mostrar facturas con total > 20000 (Streams)

Promedio de Facturas A (Streams)

Promedio general (Streams)

Obtener lista de clientes sin repetir (Streams)

Ordenar facturas por total DESC (Streams)

Agrupar facturas por tipo (Collectors.groupingBy) ⚠️

Obtener mapa con cantidad por tipo ⚠️

Mostrar los 3 clientes con mayor facturación ⚠️

## 📂 ARCHIVO COMPLETO (para que practiques en serio)

A;1001;Juan Perez;15000;20333444556

B;1002;Ana Gomez;8000;33444555

A;1003;Carlos Ruiz;22000;20999888777

B;1004;Lucia Fernandez;12000;30111222

A;1005;Martin Lopez;18000;20444555666

B;1006;Sofia Diaz;9500;28999111

A;1007;Pedro Gomez;30000;20222333444

B;1008;Carla Ruiz;7000;31111222

A;1009;Laura Castro;27000;20333999888

B;1010;Diego Perez;11000;35555666

A;1011;Marina Diaz;35000;20444111222

B;1012;Jorge Silva;6000;27888999

A;1013;Luis Torres;40000;20999111222

B;1014;Paula Gomez;13000;32222333

A;1015;Andrea Ruiz;29000;20444333444
