public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setNombre("Ariel");
        String Nombre = persona.getNombre();
        System.out.println("El nombre de la persona es " + Nombre);

        persona.setEdad(17);
        int edad = persona.getEdad();
        System.out.println("Su edad es " + edad);

        persona.setTelefono(481332);
        int telefono = persona.getTelefono();
        System.out.println("Su telefono es " + telefono);
    }
}

    class Persona{
        private int edad;
        private String nombre;
        private int telefono;

        public void setEdad(int edad){
            this.edad = edad;
        }
        public int getEdad(){
            return this.edad;
        }

        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        public String getNombre(){
            return this.nombre;
        }
        public void setTelefono(int telefono){
            this.telefono = telefono;
        }
        public int getTelefono(){
            return this.telefono;
        }

    }
