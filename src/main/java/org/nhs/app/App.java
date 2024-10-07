public class App{

    public static void main(String args[]){
        int lim = 1;
        for (int number = 1; number <= 5; number++){
            for (int counter = 1; counter <= lim; counter++){
                System.out.print(number);
                
            }
            System.out.println();
            lim += 1;
        }
        System.out.println();
        two();
        System.out.println();
        three();
    }

    public static void two(){
        for (int number = 1; number <= 5; number++){
            for (int dot = 5 - number; dot > 0; dot--){
                System.out.print(".");
            }
            
            for (int counter = number; counter > 0; counter--){
                System.out.print(number);
            }

            System.out.println();
        }


    }

    public static void three(){
        for (int number = 1; number <= 5; number++){
            for (int dot = 5 - number; dot > 0; dot--){
                System.out.print(".");
            }

            System.out.print(number);

            for (int dot = number - 1; dot > 0; dot--){
                System.out.print(".");
            }

            System.out.println();
        }

    }


}