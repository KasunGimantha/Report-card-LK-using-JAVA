import java.util.Scanner;
public class ReportCard{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("Input first subject marks:");
float SubjectOne=sc.nextFloat();

System.out.println("Input second subject marks:");
float SubjectTwo=sc.nextFloat();

System.out.println("Input third subject marks:");
float SubjectThree=sc.nextFloat();

Float Average= (SubjectOne+SubjectTwo+SubjectThree)/3;

if(0<Average && Average<=39.0){
System.out.println("Fail");
}

else if(39.0<Average && Average<=54.0){
System.out.println("Pass");
}

else if(54.0<Average && Average<=69.0){
System.out.println("Good");
}
  
else if(69.0<Average){
System.out.println("Very good");
}

else if(0>Average){
System.out.println("Invalid Marks");
}

}
}
