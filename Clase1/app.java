package Clase1;

import java.util.ArrayList;

public class app extends student  {
    public app (String name, int age, double average, int id ) {
        super(name, age, average, id);
       }


    @Override
    public void mostrardetalles() {
       
    }

    @Override
    public void almacenamientoStudiantes() {

    

    }

    @Override
    public String toString() {
        return "app []";
    }

    public static void main(String[] args) {
        System.out.println(" los estudiantes son ");

        ArrayList<student> students = new ArrayList<student>();
        students.add ( new student ("juan", 20, 3.5, 1));
        students.add (new student ("pedro", 21, 2.5, 2));
        for (student student : students) {
            student.mostrardetalles();
            student.calcularpromedio(student.average);
        }
       

    }

}
