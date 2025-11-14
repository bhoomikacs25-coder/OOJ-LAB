import java.util.*;
public class Student{
    public static int credits(int score){
        int points;
        if(score>90){
            points=10;
        }else if (score>80){
            points=9;
        }else if(score>70){
            points=8;
        }else if(score>60){
            points=7;
        }else if(score>50){
            points=6;
        }else{
            points=0;
        }return points;
        }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int credSum=0;
        int pointsSum=0;
        float SGPA;
        System.out.println("Enter Name and USN");
        String name=sc.nextLine();
        String USN=sc.nextLine();
        System.out.println("Enter number of subjects:");
        int a=sc.nextInt();
        int cred[]=new int[a];
        int marks[]=new int[a];
        for(int i=0; i<a; i++){
            System.out.println("Enter sub " +i+ " Credits:");
            cred[i]=sc.nextInt();
            credSum += cred[i];
            System.out.println("Enter marks obtained:");
            marks[i]=sc.nextInt();
            pointsSum += credits(marks[i])*cred[i];
        }
        SGPA=pointsSum/credSum;
        System.out.println("SGPA="+SGPA);
    }
}

