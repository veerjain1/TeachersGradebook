class Period{
  private student[] students;

    public Period(int numStudents){
      students = new student[numStudents];
    }
        
    public void setStudent(int position, student student){
        students[position] = student;
    }

    public double findAverage(){
        int total=0;
        for (int i=0; i<students.length; i++){
            total +=students[i].getGrade();
        }
        double average = total/students.length;
        return average;
    }

  public String gradesInfo(){

    String rVal = "The class grade average is "+findAverage()+" ";

    for(int i=0; i<students.length; i++){
      rVal = (rVal+"\n"+students[i].getName()+" has the following grade: "+students[i].getGrade()+"\n");
    }
    return rVal;

    
  }
}


