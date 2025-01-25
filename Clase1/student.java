package Clase1;

public class student implements method {
      String name;
       int age;
      Double average;
      int id;
    public student (String name, int age, double average, int id ) {
     this.name = name;
     this.age = age;
     this.average = average;
     this.id = id;
    }
    public void almacenamientoStudiantes() {
   
    }
    public void mostrardetalles() {
    System.out.println( "id of student "+  id + " name of student: " + name+ " age of student: " + age + " average of student: " + average);
    }
    public double calcularpromedio( double  average) {
      if (average < 2.9) {
      System.out.println(" the student is not approved ");
      }
      else { 
        System.out.println(" the student is approved ");
    }    
      return average;
  }
}
    

