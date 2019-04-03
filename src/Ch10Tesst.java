public class Ch10Tesst {
    public static void main(String[] args) {
        String[] a = {"A",null,null,"B",null,"C"};
        a=consolidate(a);
        for(int i = 0; i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static String[] consolidate(String[] a){
        for(int i = 0; i<a.length; i++){
            if(a[i]==null){
                int x = i;
                do{
                    x++;
                }while(a[x]==null&&x<a.length);
                if(!(x>a.length-1)) {
                    a[i] = a[x];
                    a[x] = null;
                }

            }
        }
        return a;
    }
}
