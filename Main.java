package Ejercicio_Tem8;

public class Main {


    public static void main(String[] args){

      Persona persona = new Persona();

     persona.SetEdad(28);
     persona.SetNombre("Alejandro Gonzalez");
     persona.SetTelefono("1-890-8998-98983");

        System.out.println("Mi nombre es " +persona.GetNombre()+ "," + " Mucho gusto. " + "Tengo "
                + persona.GetEdad()+ "," + " Y se pueden comunicar conmingo al " + persona.GetTelefono());
    }

}
