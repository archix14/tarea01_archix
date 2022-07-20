package pe.edu.upeu.modelo;

import lombok.Data;

@Data
public class DetalleProductoTO {
    public String idDProducto, nombreDProd;
    public String unidMed, idCat, idPro;
    public double precioUnid, utilidad, stock, cantMayor;
}
