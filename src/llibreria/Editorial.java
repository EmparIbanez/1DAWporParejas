package llibreria;

/**
 *
 * @author Empar Ibáñez
 */
public class Editorial {
    String nom;
    int codic, any;
    
    public Editorial() {
        
    }

    /**
     * Obtiene y devuelve el nombre
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Define el nombre
     * @param nom 
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Obtiene y devuelve el código
     * @return codic
     */
    public int getCodic() {
        return codic;
    }

    /**
     * Define el código
     * @param codic 
     */
    public void setCodic(int codic) {
        this.codic = codic;
    }

    /**
     * Obtiene y devuelve el año
     * @return any
     */
    public int getAny() {
        return any;
    }

    /**
     * Define el año
     * @param any 
     */
    public void setAny(int any) {
        this.any = any;
    }

    /**
     * Define los siguientes parametros:
     * @param nom
     * @param codic
     * @param any 
     */
    public Editorial(String nom, int codic, int any) {
        this.nom = nom;
        this.codic = codic;
        this.any = any;
    }

    /**
     * Convierte en cadena de texto los datos obtenidos
     * @return Editorial
     */
    @Override
    public String toString() {
        return nom;
    }
    
}
