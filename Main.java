import java.util.Scanner; 
class Main {
  public static void main(String[] args) {

    Scanner myObj = new Scanner(System.in);  
    System.out.println("Enter the number of periods you teach: ");
    int numPeriods = myObj.nextInt(); 

    Period [] periods = new Period[numPeriods];


    for (int periodCounter=0; periodCounter < numPeriods; periodCounter++){
      Scanner myObj1 = new Scanner(System.in);  
      System.out.println("Enter the number of students you teach in "+(periodCounter+1)+": ");
      int numStudents = myObj1.nextInt(); 
      //student[] students = new student(numStudents);
      Period p = new Period(numStudents);

    for (int studentCounter=0; studentCounter<numStudents; studentCounter++){
        
        Scanner myObj2 = new Scanner(System.in);  
        System.out.println("Enter the name of your "+(studentCounter+1)+" student: ");
        String name = myObj2.nextLine(); 

        Scanner myObj3 = new Scanner(System.in);  
        System.out.println("Enter the grade of "+name);
        int grade = myObj3.nextInt();

        Scanner myObj4 = new Scanner(System.in);  
        System.out.println("Enter the final exam grade of "+name);
        int finalExamGrade = myObj4.nextInt(); 

        Scanner myObj5 = new Scanner(System.in);  
        System.out.println("Enter the parent info of "+name);
        String parentInfo = myObj5.nextLine(); 

        student s = new student(name,grade,finalExamGrade,parentInfo);

        p.setStudent(studentCounter, s);
      System.out.println("\n");
      
    }
      System.out.println("\n");
      
    periods[periodCounter] = p;
}
    Scanner myObj6 = new Scanner(System.in);  
        System.out.println("Enter the period for which you would like to see your student's grades and average grade: ");
    int whichPeriod = myObj6.nextInt();
    System.out.println((periods[whichPeriod-1]).gradesInfo());
    
  }
}

