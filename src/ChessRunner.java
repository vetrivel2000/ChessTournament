import java.util.Scanner;

public class ChessRunner {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of Players");
        int num= scan.nextInt();
        double[] marks=new double[num];
        String[] name = new String[num];
        if (num%2!=0)
        {
            marks[num-1]=1;
        }
        for (int i = 0; i <num ; i++) {
            name[i]=scan.next();
        }
        for (int i = 0; i <num ; i++) {
            for (int j = i+1; j <num ; j++) {
                double a=1+(Math.random()*10);
                double b=1+(Math.random()*10);
                if (a>b)
                {
                    marks[i]+=1;
                    System.out.println("The winner is "+name[i]);
                }
                else if(a<b)
                {
                    marks[j]+=1;
                    System.out.println("The winner is "+name[j]);
                }
                else
                {
                    marks[i]+=0.5;
                    marks[j]+=0.5;
                    System.out.println("The match is tie");
                }
            }
        }
        for (int i = 0; i <num ; i++) {
            for (int j = 0; j <num ; j++) {
                if (marks[i]>marks[j])
                {
                    double temp=marks[i];
                    marks[i]=marks[j];
                    marks[j]=temp;
                    String temp1 = name[i];
                    name[i]=name[j];
                    name[j]=temp1;
                }
            }
        }
        System.out.println("The tournament winner is "+name[0]);
    }
}
