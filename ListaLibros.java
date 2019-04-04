package Ejercicio_Biblioteca;

public class ListaLibros{
   
    Libro primero;

    /**
     * Constructor for objects of class ListaNodos
     */
    public ListaLibros(){
        primero = null;
    }

   
    // Completar los metodos
    
    // Incluye un nuevo libro en la lista
    public void pon(Libro valor){
       valor.siguiente=primero;
       primero=valor;
    }
    
    public boolean estaVacia(){
       return (primero == null);
    }
    
    // Devuelve un libro que es eliminado de la lista o null si no exite
    public Libro quitar (int id) {
    	Libro aux = null;
    	if (estaVacia() == true) {
    		return null;
    	}
    	if (primero.id == id) {
    		aux=primero;
    		primero=primero.siguiente;
    		return aux;
    	}else {
    		Libro aux1 = primero;
    		Libro aux2 = primero.siguiente;
    		
    		while (aux2!=null) {
    			if (aux2.id == id) {
    				aux1.siguiente = aux2.siguiente;
    				aux = aux2;
    				break;
    			}
    			aux1=aux2;
    			aux2=aux2.siguiente;
    		}
    		return aux;

    	}
    }
   
    // Devuelve el id del libro o -1 si no esta
    public int buscarId ( String titulo ){
    	int aux = -1;
    	if (estaVacia()) {
    		return aux;
    	}
    	Libro aux1 = primero;
    	
    	
    	while (aux1 != null) {
    		if (aux1.titulo.equals(titulo)) {
            	aux = aux1.id;
            	break;
    		}else {
    			aux1 = aux1.siguiente;
    		}
    	}
    	return aux;
   }
    
    // Muestra los libros almacenados
    public void verCatalogo (){
    	Libro aux = primero;
    	System.out.println(" --- CATALOGO --- ");
    	while (aux != null) {
    		System.out.println(aux.toString());
    		aux=aux.siguiente;
    	}
    	System.out.println(" ---- ---- ");
    }
         
}
