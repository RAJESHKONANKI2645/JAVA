import java.util.*;
class student
{
    public static void main(String args[])
    {
        int staffuser,studentuser,nonteaching,totaluser,finaluser;
        Scanner S=new Scanner(System.in);
        System.out.println("enter the staffer user:");
        staffuser=S.nextInt();
        System.out.println("enter the total user:");
        totaluser=S.nextInt();
        System.out.println("enter the non teaching:");
        nonteaching=staffuser/3;
        studentuser=totaluser-nonteaching-staffuser;
        System.out.println("total student users is:"+studentuser);
}}