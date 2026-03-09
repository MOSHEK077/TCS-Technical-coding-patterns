import java.util.Scanner;

class prblm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the normal String: ");
        String str = sc.nextLine();
        String rev = "";//Empty string to store the reversed String;
        for(int i = 0 ; i < str.length();i++){
            rev = str.charAt(i)+rev;
        }
        System.out.println("Revered String : "+rev);
    }

}