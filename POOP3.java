package poop3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author Orozco Mora Gerardo
 */
public class POOP3 {

    
    
/**
 *
 *  Programa que ejemplifica el uso de colecciones y utilerias.
 */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("########## Arreglo ###########");
        
        int arreglo1[]; //Forma heredada de c
        int[] arreglo2;// Forma recomendad
        int []arreglo3; //Variaciòn de forma
        
        int[] arreglo4 = {1,2,3,4,5,};
        
        
        System.out.println("########## for ###########");
        
        for (int i = 0; i < arreglo4.length; i++) {
            int j = arreglo4[i]=i*10;
            
        }
        for (int i : arreglo4) {
            System.out.println(i);
        }
        
        System.out.println("########## Strings ###########");
        
        char[] cadena ={'h','o','l','a'};
        for (int i = 0; i < cadena.length; i++) {
            System.out.println(cadena[i]);
        }
        
        
        System.out.println(" ");
         
         
        String cadena2 =new String("Hola mundo");//forma normalizada
        String cadena3="Hola mundo";// Forma recomendada
         
        System.out.println(cadena3);
         
         
         
        String nombre="Gerardo";
        String apellido= "Orozco";
         
         
        System.out.println(nombre.length());
        System.out.println(nombre+" "+apellido);
        
        
        System.out.println("########## Wrappers ###########"); 
        
        
        int a=25;
        System.out.println(a);
        Integer b= new Integer (10);//Forma normalizada que està deprecada
        System.out.println("$"+b.floatValue());
        Integer c=8;//Forma reomendada 
        System.out.println(c);
        
        System.out.println("########## Colecciones ###########");
         /*
        *Son un conjunto de objetos del mismo tipo
        *Son redimencionables
        */
        System.out.println("########## ArrayList ###########");
        
        /*
        *Mantiene un orden de inserciòn
        *Se pueden repetir los elementos
        */
        ArrayList<Integer> miArrayList = new ArrayList<Integer>();
        miArrayList.add(c);
        miArrayList.add(b);
        miArrayList.add(45);
        
        for (Integer integer : miArrayList) {
            System.out.println(integer);
        }
        
        System.out.println("***");
        miArrayList.add(0,-45);
        
        for (Integer integer : miArrayList) {
            System.out.println(integer);
        }
        System.out.println("***");
        System.out.println(miArrayList.indexOf(-45));
        System.out.println("***");
        miArrayList.add(1,8);
        
        for (Integer integer : miArrayList) {
            System.out.println(integer);
        }
        
        System.out.println("########## HashTable ###########");
        
        
        /*
        *No permite duplicados
        *No mantiene orden de incerciòn
        */
        
        /*
        Map:
        *Conjunto de (Llaves y values)
        *Combinaciòn de un set + lista
        *Diccionarios
        */
        
        Hashtable<String,Integer> agenda = new Hashtable<String,Integer>();
        agenda.put("Pepe",556677);
        agenda.put("Ramiro",446688);
        agenda.put("Maricela",553311);
        System.out.println("Tamaño de la agenda: "+agenda.size());
        for (Integer value : agenda.values()) {
            System.out.println(value);
        }
        for (String llave : agenda.keySet()) {
            System.out.println(llave);
        }
        
        System.out.println("########## Enumeraciòn ###########");
        
        String llave;
        Integer valor;
        
        Enumeration<String>llaves= agenda.keys();
        while(llaves.hasMoreElements()){
            llave = llaves.nextElement();
            valor = agenda.get(llave);
            System.out.println("Llave = "+llave+" Valor = "+valor);
        }
        
        System.out.println("########## Math ###########");
        
        System.out.println(Math.PI);
        System.out.println(Math.abs(-5));
        System.out.println(Math.pow(3,2));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.max(80, 7));
        
        System.out.println("###### Date ######");
        Date hoy = new Date();
        System.out.println(hoy);
        
        
        System.out.println("###### Calendario ######");
        
        Calendar calendarioHoy = Calendar.getInstance();
        System.out.println(calendarioHoy);
        
        System.out.println("###### Formato de Date ######");
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(formatoFecha.format(hoy));
        
        System.out.println("###### Formato de Calendario ######");
        String fechaActual = calendarioHoy.get(Calendar.DAY_OF_MONTH)+"de";
        fechaActual += calendarioHoy.get(Calendar.MONTH)+1+"de";
        fechaActual += calendarioHoy.get(Calendar.YEAR);
        System.out.println(fechaActual);
        
        
        
        
        
        
        
        
       /*
        Actividad extra
        Realizar un ndiccionario con 5 oalabras usando hastable e imprimiendo todos los elementos
        Realizar una agenda con 5 registros guardadndo nombre de la persona y su cumpleaños utilizando hastable y calendae e imprimiendo todos sus elementos.
       */
       
       
       
        System.out.println("########## Ejercicios ###########");
        
        
        System.out.println("########## Agenda ###########");
                
        Hashtable<String,Integer> agenda1 = new Hashtable<String,Integer>();
        agenda1.put("Pepe",556677);
        agenda1.put("Ramiro",446688);
        agenda1.put("Maricela",553311);
        agenda1.put("Federico",7768888);
        agenda1.put("Carlo",22334455);
        System.out.println("Tamano de la agenda: "+agenda1.size());
        
        String llaveAgenda1;
        Integer valorAgenda1;
        
        Enumeration<String>llavesAgenda1= agenda1.keys();
        while(llavesAgenda1.hasMoreElements()){
            llaveAgenda1 = llavesAgenda1.nextElement();
            valorAgenda1 = agenda1.get(llaveAgenda1);
            System.out.println("Nombre = "+llaveAgenda1+", Numero = "+valorAgenda1);
        }
               
        System.out.println("########## AgendaCumpleaños ###########");
        
        
        Hashtable<String,Calendar> agendaCumple = new Hashtable<String,Calendar>();
        
        Calendar cumpleaños1 = Calendar.getInstance();
        cumpleaños1.set(1990,Calendar.JANUARY,15);
        Calendar cumpleaños2 = Calendar.getInstance();
        cumpleaños2.set(1985,Calendar.MAY,22);
        Calendar cumpleaños3 = Calendar.getInstance();
        cumpleaños3.set(1992,Calendar.SEPTEMBER,10);
        Calendar cumpleaños4 = Calendar.getInstance();
        cumpleaños4.set(1988,Calendar.NOVEMBER,5);
        Calendar cumpleaños5 = Calendar.getInstance();
        cumpleaños5.set(1995,Calendar.JULY,29);
        
        agendaCumple.put("Juan",cumpleaños1);
        agendaCumple.put("Maria",cumpleaños2);
        agendaCumple.put("Maricela",cumpleaños3);
        agendaCumple.put("Federico",cumpleaños4);
        agendaCumple.put("Carlo",cumpleaños5);
        System.out.println("Tamano de la agenda: "+agendaCumple.size());
        
        String llaveCumple;
        Integer valorCumple;
        
        for (Map.Entry<String,Calendar> entry: agendaCumple.entrySet()) {
            String name = entry.getKey();
            Calendar cumpleaños = entry.getValue();
            int año = cumpleaños.get(Calendar.YEAR);
            int mes = cumpleaños.get(Calendar.MONTH);
            int dia = cumpleaños.get(Calendar.DAY_OF_MONTH);
            
            System.out.println("Nombre: "+name+ ", Cumpleanos: "+dia+"/"+mes+"/"+año);
        }
    }
    
}
