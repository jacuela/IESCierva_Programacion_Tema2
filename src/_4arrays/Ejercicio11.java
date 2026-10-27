package _4arrays;

public class Ejercicio11 {
    public static void main(String[] args) {
        System.out.println("Ejercicio11 - split2");
        System.out.println("======================");

        String linea="alicia;peralta;manduca;alicia.peralta@gmail.com;600554433";

        String nombre_apellidos;
        String usuario;
        String telefono;

        String[] campos=linea.split(";");
        nombre_apellidos=campos[0]+" "+campos[1]+" "+campos[2];
        //nombre_apellidos=String.format("%s %s %s",campos[0],campos[1],campos[2]);
        telefono=campos[4];

        //Hago el segundo split sobre el email para obtener el nombre de usuario
        String[] campos_email=campos[3].split("@");
        usuario=campos_email[0];

        System.out.println("Nombre:"+nombre_apellidos);
        System.out.println("Usuario:"+usuario);
        System.out.println("Telefono:"+telefono);




    }
}
