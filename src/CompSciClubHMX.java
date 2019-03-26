public class CompSciClubHMX {
    public static void main(String[] args) {
        //This program prints some numbers and some stars
        System.out.println("Hello");
        for (int i = 0; i< 10; i++){
            if(i%2==0){
                System.out.println(2*i);
                for(int j = 0; j<i; j++){

                    System.out.println("***");
                    mystery(j);
                }
            } else{
                /*Nothing
                I
                write
                here
                prints
                 */
                System.out.println(i);
                mystery(i);
            }
        }
        System.out.println("Things I like");
        mystery(7);
    }
    /**
     * This method does mystery actions with the parameter i
     * @param i
     */
    public static void mystery(int i){
        i+=6;
        i+=i;
        i-=i-1;
        System.out.println(i);
    }
}
