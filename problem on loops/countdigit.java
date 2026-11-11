//count the number of digits for a given number n.

package problem on loops;

public class countdigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int numofdigits = 0;

    while(n>0){
        n=n/10;
        numofdigits++;
    }

        System.out.println(numofdigits);
    }
}
