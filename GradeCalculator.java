
import java.util.Scanner;
import javax.security.auth.Subject;
    class GradeCalculator{

            static String BrightRed = "\u001b[31;1m";
            static String Yellow = "\u001b[33m";  
            static String Green = "\u001b[32m";
            static String BrightWhite = "\u001b[37;1m";
            static String BrightMagenta = "\u001b[35;1m";
            static String Reset = "\u001b[0m";    

        public static void main(String []args){
            System.out.print(Green + "\n\n\t\t-----------WELCOME TO YOU GRADE CALCULATOR---------\n\n" + Reset);
            System.out.print(Yellow +"NOTE:-\nOur Grade calculator calculate Grade out of 100 So, Enter Marks between Min 0 to Max 100.\n\n" + Reset);

            Scanner sc = new Scanner(System.in); 
            int total=0;
            float avg=0; 
            System.out.print("\nEnter the number of subjects you have : ");   
              int n=sc.nextInt();  
            String[] subjects = new String [n];
            int[] marks = new int[n];       
            sc.nextLine();   
            for (int i = 0; i < subjects.length; i++)   
            {  
                System.out.print((i+1) + ". Subject Name: ");
                subjects[i] = sc.nextLine();  
            } 

            System.out.println(BrightMagenta + "\nEnter Marks For Each Subject Between 0 to 100: " + Reset);  

            for (int i = 0; i < subjects.length; i++)   
            {  
                System.out.print(subjects[i] + " marks: ");
                marks[i]=sc.nextInt();
                if(marks[i]>100){
                    System.out.println(BrightRed + "Marks is more than 100...?: "+ Reset);
                    System.out.print("Enter again: ");
                    marks[i]=sc.nextInt();
                }
            }  
            for(int i=0; i<marks.length; i++){
                total+=marks[i];
            } 
            avg =(float) total/n;
            System.out.println(Green +"\nTotal marks: " + n*100);
            System.out.println("Obtained marks: "+ total);
            System.out.println("Total Percentage: "+ avg +"%");
            if(avg>=90){
                System.out.println("Grade: A+");
            }   
            else if(avg>=80){
                System.out.println("Grade: A");
            }  
            else if(avg>=70){
                System.out.println("Grade: B+");
            }  
            else if(avg>=60){
                System.out.println("Grade: B");
            }  
            else if(avg>=50){
                System.out.println("Grade: C");
            }  
            else{
                System.out.println("Grade: Fail");
            }
            System.out.println("\n" + Reset);
        }

    }