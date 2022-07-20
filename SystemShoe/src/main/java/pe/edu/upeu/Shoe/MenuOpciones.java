package pe.edu.upeu.Shoe;

import java.io.Console;
import pe.edu.upeu.dao.CategoriaDao;
import pe.edu.upeu.dao.ClienteDao;
import pe.edu.upeu.dao.ProductoDao;
import pe.edu.upeu.dao.DetalleProductoDao;
import pe.edu.upeu.dao.UsuarioDao;
import pe.edu.upeu.dao.VentaDao;
import pe.edu.upeu.modelo.UsuarioTO;
import pe.edu.upeu.util.LeerTeclado;

public class MenuOpciones {
    LeerTeclado leerT=new LeerTeclado();
    UsuarioTO user;

    public void login() {
        System.out.println("***********Validar sus Credenciales***********");
        user=new UsuarioTO();
        user.setUsuario(leerT.leer("", "Ingrese su Usuario"));
        Console cons=System.console();
        System.out.println("Ingrese su clave:");
        char[] clavex=cons.readPassword();
        user.setClave(String.valueOf(clavex));
        if (new UsuarioDao().loginValidar(user.getUsuario(), user.getClave())) {
            menuPrincipal();
        }else{
            System.out.println("Intente Otra vez!");
            login();
        }
    }

    public void menuPrincipal() {
        System.out.println("********************Bienvenidos al Sistema de Ventas******************");
        String valorX="1=Registrar Usuario\n"+"2=Registrar Cliente\n"+
                "3=Registrar Categoria\n4=Registrar Producto\n"+
                "5=Crear DetalleProducto\n6=Ventas\n7=Reporte Ventas\n";
        int opciones=0;
        do {
            switch (opciones) {
                case 1: new UsuarioDao().crearUsuario(); break;
                case 2: new ClienteDao().crearCliente(); break;
                case 3: new CategoriaDao().crearCategoria();break;
                case 4: new ProductoDao().crearProducto();break;
                case 5: new DetalleProductoDao().crearDetalleProducto();break;
                case 6: new VentaDao().registroVentaGeneral();break;
                case 7: new VentaDao().reporteVentasRangoFecha();break;
                default: System.out.println("Opcion erronea!"); break;
            }
            char continuar=leerT.leer("", "Desea continuar? S=si/N=no")
                            .toLowerCase()
                            .charAt(0)=='s'?'s':'n';
            if (continuar=='s') {
                opciones=leerT.leer(0, "Eliga la siguiente operacion:\n"+valorX);
            }else{opciones=0;}

        } while (opciones!=0);
        
    }
}
