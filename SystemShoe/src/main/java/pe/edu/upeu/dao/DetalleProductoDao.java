package pe.edu.upeu.dao;

import pe.edu.upeu.crud.AppCrud;
import pe.edu.upeu.modelo.DetalleProductoTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class DetalleProductoDao extends AppCrud {

    LeerTeclado leerT = new LeerTeclado();
    LeerArchivo leerA;
    UtilsX util = new UtilsX();

    DetalleProductoTO dpTo;
    final static String TABLA_DETALLEPRODUCTO = "DetalleProducto.txt";
    final static String TABLA_CATEGORIA = "Categoria.txt";
    final static String TABLA_PRODUCTO = "Producto.txt";

    public void crearDetalleProducto() {
        leerA = new LeerArchivo(TABLA_DETALLEPRODUCTO);
        dpTo = new DetalleProductoTO();
        String idDPro = generarId(leerA, 0, "DP", 2);
        dpTo.setIdDProducto(idDPro);
        dpTo.setNombreDProd(leerT.leer("", "Nombre Producto"));
        mostrarCategoria();
        dpTo.setIdCat(leerT.leer("", "Seleccione una Categoria"));
        mostrarProducto();
        dpTo.setIdPro(leerT.leer("", "Seleccione un modelo"));
        dpTo.setPrecioUnid(leerT.leer(0.0, "ingrese el Precio Unitario"));
        dpTo.setUtilidad(leerT.leer(0.0, "Ingrese la utilidad"));
        dpTo.setUnidMed(leerT.leer("", "Unidad Medida"));
        dpTo.setStock(leerT.leer(0, "Ingrese Cantidad"));
        dpTo.setCantMayor(leerT.leer(0, "Ingrese cantidad para descuento"));
        leerA = new LeerArchivo(TABLA_DETALLEPRODUCTO);
        agregarContenido(leerA, dpTo);
    }

    public void mostrarCategoria() {
        leerA = new LeerArchivo(TABLA_CATEGORIA);
        Object[][] dataC = listarContenido(leerA);
        for (int i = 0; i < dataC.length; i++) {
            System.out.print(dataC[i][0] + "=" + dataC[i][1] + ", ");
        }
        System.out.println("");
    }

    public void mostrarProducto() {
        leerA = new LeerArchivo(TABLA_PRODUCTO);
        Object[][] dataC = listarContenido(leerA);
        for (int i = 0; i < dataC.length; i++) {
            System.out.print(dataC[i][0] + "=" + dataC[i][1] + ", ");
        }
        System.out.println("");
    }
}
