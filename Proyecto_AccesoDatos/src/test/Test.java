
package test;

import accesodatos.*;


public class Test {
    
    public static void main(String[] args) {
        //CREO DOS OBJETOS DE IMPLENETACION DE MYSQL Y OTRO DE OTACLE
        ISccesoDatos datos = new ImplementacionMysql();
    }
}
