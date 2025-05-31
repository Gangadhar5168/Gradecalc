package Arrays_Learning.Gradecalc;

public class Student {
    private String name;
    public int subCount;
    public int[] marks;

Student(String name,int... marks){
    this.name = name;
    this.marks =marks;
    this.subCount = marks.length;
    }
   public int calcTotal(){
    int sum = 0;
    for(int i:marks){
        sum +=i;
    }
    return sum;
   }

   public double average(){
    double sum = this.calcTotal();
    double avg = sum/subCount;
    return avg;
   }
   public String gradecalc(){
    double avg = this.average();
    String Grade = "no grade";
    if (avg <=100 && avg >=90){
        Grade  =  "Grade A";
        return Grade;
    }
    else if(avg <90 && avg >=80){
        Grade = "Grade B";
        return Grade;
    }
    else if(avg <80 && avg >=70){
        Grade = "Grade C";
        return Grade;
    }
    else if(avg <70 && avg >=60){
        Grade = "Grade D";
        return Grade;
    }
    else if(avg<60){
        Grade = "Grade F";
        return Grade;
    }
    else{
        System.out.println("Something wrong with Grade Calculation Avg should not be "+avg);
        return Grade;
    }
   }

   public void displayResults(){
        System.out.println("Entered name is : "+this.name);
        System.out.println("Total marks : "+this.calcTotal());
        System.out.println("Average : "+this.average());
        System.out.println("Grade is : "+this.gradecalc());
    }

}
