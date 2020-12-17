package com.cod;

/**
 * @author Alejandro
 */
public class Main {
    public static void main(String[] args) {

        if (email01("pepe@danielcastelao.org")) {
            System.out.println("Listo");
        } else {
            System.out.println("Fallo");
        }

        if (email02()) {
            System.out.println("Listo");
        } else {
            System.out.println("Fallo");
        }

    }

    //Email 1
    public static boolean email01(String email) {
        Comparar inicio1 = Comparar.getInstance();
        System.out.println("Conectando a " + inicio1.ip + ", con el usuario " + email);
        return inicio1.con();
    }
    //Email 2
    public static boolean email02() {
        Comparar inicio2 = Comparar.getInstance();
        System.out.println("Conectando a " + inicio2.ip + ", con el usuario " + inicio2.email);
        return inicio2.con();
    }
}
