import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        int week_count = 1;
        long hold = 0;
        System.out.print("-> ");

        
        while(scanner.hasNext())
            { 
                String week = scanner.next();
                
                if(week.equals("42"))
                    {
                        if(week_count < 18)
                            hold /= 10;
                        break;
                    }
                    
                    if(!week.equals("Week"))
                        {
                            System.err.println("IllegalArgument");
                            System.exit(-1);
                        }
                        if(!scanner.hasNextInt())
                            {
                                System.err.println("IllegalArgument");
                                System.exit(-1);
                            }
                int current_week = scanner.nextInt();
                            if(current_week != week_count)
                                {
                                    System.err.println("IllegalArgument");
                                    System.exit(-1);
                                }
                                
                                if(week_count > 18)
                                    {
                                        System.err.println("IllegalArgument");
                                        System.exit(-1);
                                    }
                                    
                                    int value = 9;
                                    System.out.print("-> ");
                                    
                                    for(int i = 0; i < 5 ; i++)
                                    {
                                            if (!scanner.hasNextInt()) {
                                            System.err.println("IllegalArgument");
                                            System.exit(-1);
                                        }
                                        int save = scanner.nextInt();
                                        if (save <  1  || save > 9)
                                                {
                                                    System.err.println("IllegalArgument");
                                                    System.exit(-1);
                                                }
                                            if(save < value)
                                                value = save;
                                        }
                                        hold = (hold + value);
                                        if(week_count < 18)
                                            hold *= 10;
                                    week_count++;
                                    System.out.print("-> ");
                    }
            long new_s = 0;

            while(hold != 0)
                {
                    new_s = (new_s * 10) + (hold % 10);
                    hold /= 10;
                }
            
                int weeks = 1;
                while (new_s != 0)
                {
                    System.out.print("   Week " + weeks + " ");

                    for(int i = 0; i < (new_s % 10); i++)
                    {
                        System.out.print("=");
                    }
                    System.out.println(">");
                    new_s /= 10;
                    weeks++;
                }


            scanner.close();
            
   }
}