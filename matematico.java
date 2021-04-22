import java.util.Scanner;

/**
 * Write a description of class matematico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class matematico
{public String indicarMayorMenorMedio(int a, int b, int c){
    String respuesta;
    if(a>b) {
    respuesta= "a es mayor que b";
    }
    if(c>b)
    respuesta = "a es mayor que b y c es el numero medio";
    else{
    if(b>a){
     respuesta="b es mayor que a";  
    }
    if(c>a){
    respuesta = "b es mayor que a y c es el numero medio";
    }
    else{
    if(a<c){respuesta="c es mayor que a";
    }
    if(a<b){respuesta="c es mayor que a y b es el numero medio";
    }
    else{
    if(b<c){
    respuesta="c es mayor que b";
    }
    if (b<a){respuesta = "c es mayor que b y a es el numero medio";
    }
    else{respuesta="";}
    }
    }  
    }
    return respuesta;
    }
    
   // calcular el area de un cuadrado teniendo la base y la altura 
    public int calcularArea(int altura, int base){
    int calcularArea;
    int lado1 = altura;
    int lado2 = base;
    calcularArea = lado1 * lado2;
    return calcularArea;
    
    } 
    
    //calcular distacia entre coordenadas de dos puntos
    
    public double calcularDistancia(int x1, int x2, int y1, int y2){    
    // metodo contructor
    double calcularDistancia;
    calcularDistancia = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
    return calcularDistancia;
    }
    
    
    // hallar cuadrante en el qe se encuentra 
      public double calcularCuadrante(){
    
    Scanner cuadrante= new Scanner(System.in);
    int x, y; 
    System.out.println("Ingrese un valor para el punto X (Distinto de 0)");
    x= cuadrante.nextInt(); 
    System.out.println("Ingrese un valor para el punto Y (Distinto de 0)"); 
    y = cuadrante.nextInt();
    if(x > 0 && y > 0){ System.out.println("El punto (" + x + "," + y + ") se encuentra en el primer cuadante");
    } else if(x < 0 && y > 0){ System.out.println("El punto (" + x + "," + y + ") se encuentra en el segundo cuadrante"); 
     } else if(x < 0 && y < 0){ System.out.println("El punto (" + x + "," + y + ") se encuentra en el tercer cuadrante");
    } else if(x > 0 && y < 0){ System.out.println("El punto (" + x + "," + y + ") se encuentra en el cuarto cuadrante");
    } 
    return calcularCuadrante();
}
}
