package llibreria;

/**
 *
 * @author Empar Ibáñez
 */
public class Llibre {
    String isbn, titul; 
    int any, preu;
    private Editorial editorial;
    
    public Llibre() {
        
    }

    /**
     * Obtiene y devuelve el ISBN
     * @return Isbn
     */
    public String getIsbn() {
        return isbn;
    }
    
    /**
     * Define el ISBN
     * @param isbn 
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    /**
     * Obtiene y devuelve el Titulo
     * @return Titul
     */
    public String getTitul() {
        return titul;
    }
    
    /**
     * Define el Titulo
     * @param titul 
     */
    public void setTitul(String titul) {
        this.titul = titul;
    }
    
    /**
     * Obtiene y devuelve el Año
     * @return Any
     */
    public int getAny() {
        return any;
    }
    
    /**
     * Define el Año
     * @param any 
     */
    public void setAny(int any) {
        this.any = any;
    }

    /**
     * Obtiene y devuelve el precio
     * @return preu
     */
    public int getPreu() {
        return preu;
    }

    /**
     * Define el precio
     * @param preu 
     */
    public void setPreu(int preu) {
        this.preu = preu;
    }
    
    /**
     * Obtiene y devuelve la editorial
     * @return editorial
     */
    public Editorial getEditorial() {
        return editorial;
    }
    
    /**
     * Define la editorial
     * @param editorial
     */
    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    /**
     * Define los siguientes parametros:
     * @param isbn
     * @param titul
     * @param any
     * @param preu 
     * @param editorial
     */
    public Llibre(String isbn, String titul, int any, int preu, Editorial editorial) {
        this.isbn = isbn;
        this.titul = titul;
        this.any = any;
        this.preu = preu;
        this.editorial = editorial;
    }
    
    /**
     * Convierte en cadena de texto los datos obtenidos
     * @return Llibre
     */
    @Override
    public String toString() {
        return "isbn:\t\t" + isbn + "\ntitul:\t\t" + titul + "\nany:\t\t" 
                + any + "\npreu:\t\t" + preu + "\neditorial:\t" + editorial;
    }
}
