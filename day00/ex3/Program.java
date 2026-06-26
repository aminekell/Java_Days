import java.util.Scanner;

class Program {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        int Weak_count = 0;
        long hold = 0;

        
        while(scanner.hasNext())
            { 
                 System.out.print("-> ");
                String weak = scanner.next();

                if(weak.equals("42") && Weak_count < 18)
                {
                        hold /= 10;
                        break;
                }

                if(!weak.equals("weak"))
                {
                    System.err.println("IllegalArgument");
                    System.exit(-1);
                }
                if(!scanner.hasNextInt())
                {
                    System.err.println("IllegalArgument");
                    System.exit(-1);
                }
                int current_weak = scanner.nextInt();
                if(current_weak != Weak_count)
                {
                    System.err.println("IllegalArgument");
                    System.exit(-1);
                }
                Weak_count++;

                if(Weak_count > 18)
                        {
                            System.err.println("IllegalArgument");
                            System.exit(-1);
                        }

                int value = 9;

                for(int i = 0; i < 5 ; i++)
                {
                    int save = scanner.nextInt();
                    if(save < value)
                        value = save;
                }
                hold = (hold + value);
                if(Weak_count < 18)
                    hold *= 10;
            }
            long new_s = 0;

            while(hold != 0)
            {
                new_s = hold % 10;
                hold /= 10;
            }
            System.out.println(hold);
            System.out.println(new_s);
            
   }
}