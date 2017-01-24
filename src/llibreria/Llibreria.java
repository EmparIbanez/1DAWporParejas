package llibreria;

import java.util.ArrayList;

/**
 *
 * @author Empar Ibáñez
 */
public class Llibreria {

    public static void main(String[] args) {

        /* Añade la información */

       

        Editorial e1 = new Editorial("RA-MA EDITORIAL",1, 2000);
        Editorial e2 = new Editorial("ANAYA EDITORIAL",1, 2000);
        Editorial e3 = new Editorial("ANAYA EDITORIAL",1, 2003);


        Llibre l1 = new Llibre("978-84-9964-169-0", "Informática y comunicaciones grado superior", 2012, 30, e1);
        Llibre l2 = new Llibre("978-84-9964-169-1", "Informática y comunicaciones grado superior", 2016, 30, e2);
        Llibre l3 = new Llibre("978-84-3984-167-1", "Informática y comunicaciones grado superior", 2017, 30, e3);

        System.out.println(l1.toString());

        System.out.println("**************************************************************");


        System.out.println(l2.toString());

     


            System.out.println(l2.toString()); 
            
            System.out.println("**************************************************************"); 

            System.out.println(l3.toString()); 
        
        

    }

}
