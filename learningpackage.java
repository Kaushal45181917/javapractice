import java.util.Scanner;
class Proj3_1_LearningPackages
{
    public static void main(String[] args)
    {
        System.out.println("Enter the package number you have to learn in:");        
        int pn,ce,total=0,a=1; 
        Scanner sc=new Scanner(System.in);      
        pn=sc.nextInt();     
        System.out.println("Tell me how many courses you have to enroll in this month:");   
        ce=sc.nextInt();   
        switch(pn)        
        {
            case 1:
                total+=10;
                if(ce>2)
                {
                    ce-=2;
                    a=ce*6;
                    } 
                    total+=a;
                 System.out.println("Total cost is:"+total+"$");         
                break;      
            case 2:  
                    total+=12;     
                    if(ce>4)          
                    {
                        ce-=4;
                        a=ce*4; 
                        }
                    total+=a;
                    System.out.println("Total cost is:"+total+"$"); 
                    break;
            case 3: 
                total+=15; 
                if(ce>6)      
                {
                    ce-=6; 
                    a=ce*3;
                }
                total+=a;
                System.out.println("Total cost is:"+total+"$");
                break; 
            default:
                Sytem.out.println("Enter a valid number:");
         }
   }
}

