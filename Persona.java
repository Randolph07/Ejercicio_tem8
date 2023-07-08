package Ejercicio_Tem8;

 class Persona {

     private int edad ;
     private String nombre;
     private  String telefono;

     //Sets y gets por orden edad,nombre y telefono
     public void  SetEdad(int edad){
         this.edad = edad;
     }
     public int GetEdad() {
         return this.edad;
     }
     public void  SetNombre(String nombre){
         this.nombre = nombre;
     }
     public String GetNombre() {
         return this.nombre;

     }
     public void  SetTelefono(String telefono){
         this.telefono = telefono;
     }

     public String GetTelefono() {
         return this.telefono;

     }


}
