

package boletin2_12;

import java.util.Scanner;

public class Boletin2_12 {

    
    public static void main(String[] args) {
        float sueldo, ventas, comision, km, dietas, retencion, irpf, liquido, sFinal;
        Scanner obx= new Scanner(System.in);
        System.out.println("introduce el sueldo fijo en euros : ");
        sueldo=obx.nextFloat();
        System.out.println("introduce el importe total de ventas : ");
        ventas=obx.nextFloat();
        comision=ventas*5/100;
        System.out.println("introduce la cantidad de km recorridos : ");
        km=obx.nextFloat();
        System.out.println("introduce el numero de dias de desplazamiento : ");
        dietas=obx.nextFloat();
        liquido=sueldo+comision+(km*2)+(dietas*30);
        sFinal=(float) (liquido-36-(liquido*0.18));
        System.out.println("el sueldo total es de "+liquido+" euros");
        System.out.println("el suelo final despues de retenciones es de "+sFinal+" euros");
    }
    
}
