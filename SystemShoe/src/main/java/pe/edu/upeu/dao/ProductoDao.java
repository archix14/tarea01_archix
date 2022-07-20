package pe.edu.upeu.dao;

import pe.edu.upeu.crud.AppCrud;
import pe.edu.upeu.modelo.ProductoTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class ProductoDao extends AppCrud {

    LeerTeclado leerT = new LeerTeclado();
    LeerArchivo leerA;
    UtilsX util = new UtilsX();
    ProductoTO pTo;
    final static String TABLA_PRODUCTO = "Producto.txt";

    public void crearProducto() {
        leerA = new LeerArchivo(TABLA_PRODUCTO);
        pTo = new ProductoTO();
        System.out.println("*************Crear Nuevo Producto****************");
        leerA = new LeerArchivo(TABLA_PRODUCTO);
        String idPro = generarId(leerA, 0, "P", 1);
        pTo.setIdProducto(idPro);
        pTo.setNombreProducto(leerT.leer("", "Ingrese nombre del Producto"));
        agregarContenido(leerA, pTo);
    }
}
