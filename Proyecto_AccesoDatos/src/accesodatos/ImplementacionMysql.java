
package accesodatos;


public class ImplementacionMysql implements  ISccesoDatos {
      //Me encuentro en la capa de debajo de la interfaz

    @Override
    public void insertar() {
        System.out.println("Insertando desde MYSQL");
    }

    @Override
    public void listar() {
        System.out.println("Listando desde MYSQL");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando desde MYSQL");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando desde MYSQL");
    }

   

    
}
