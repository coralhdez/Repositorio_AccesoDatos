package accesodatos;

public interface ISccesoDatos {

    int MAX_REGISTRO = 10; // es una variable estatic y final
    
    //TODOS ESTPOS METODOS SON ABSTRACTOS Y PUBLICOS AUNQUE NO SE PONGA
    
    void insertar();
  
    void listar();
    
    void actualizar();
    
    void eliminar();
    

}
