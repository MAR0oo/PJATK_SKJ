import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        int licznikPolaczen = 4;
        if(licznikPolaczen == 4){

            int gcd = 1;
            for(int i = 1; i <= list.get(0) && i <= list.get(1)
                    && i <= list.get(2) && i <= list.get(3); i++)
            {
                if(list.get(0)%i==0 && list.get(1)%i==0 && list.get(2)%i==0 && list.get(3)%i==0)
                    gcd = i;
            }
            System.out.printf("GCD of %d and %d and %d and %d is: %d", list.get(0),list.get(1),list.get(2),list.get(3) , gcd);
        }
    }
}
