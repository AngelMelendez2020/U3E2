package u3e2;

import java.util.Scanner;


public class U3E2 {

   
    public static void main(String[] args) {
        
          Scanner leer=new Scanner(System.in);
        String datos[]=new String [5];
        int c=0;
        boolean s=true;
        do {
            System.out.println("¿Qué deseas hacer?");
            System.out.println(" 1. Insertar\n 2. Mostrar\n 3. Eliminar\n 4.Salir");
            int op = leer.nextInt();
            switch(op){
                case 1:
                    if (c<5) {
                        System.out.println("Agregue elemento");
                        String elem=leer.next();
                        datos[c]=elem;
                        c++;
                    }else{
                        System.out.println("No puedes agregar más");
                    }
                    break;
                case 2:
                    if(c==0){
                        System.out.println("No hay nadie en la fila");
                    }else{
                        for (int i =c-1; i >=0; i--) {
                            System.out.println((i+1)+".- "+datos[i]);
                        }
                    }
                    break;
                case 3:
                    if(c==0){
                        System.out.println("No hay datos");
                    }else {
                        for (int i = 0; i <c-1; i++) {
                            datos[i]=datos[i+1];
                        }
                        c--;
                    }
                    break;
            }
            
        } while (s);
        
    }
    
}
