class student{
  private String name;
  private int grade;
  private int finalExamGrade;
  private String parentInfo;

  public student(){
    name = "";
    grade = 0;
    finalExamGrade = 0;
    parentInfo = "";
  }
  public student(String name, int grade, int finalExamGrade, String parentInfo){
    this.name = name;
    this.grade = grade;
    this.finalExamGrade = finalExamGrade;
    this.parentInfo = parentInfo;
    
  }

  public String Display(){
    String info= "The student: "+name+" has the following grade: "+grade+" and this final grade on the exam: "+finalExamGrade+" and has the following parent's information: "+parentInfo;

    return info;
  }

  public String getName(){
    return name;
  }
  public int getGrade(){
    return grade;
  }
  public int getfinalExamGrade(){
    return finalExamGrade;
  }
  public String getParentInfo(){
    return parentInfo;
  }
  
}