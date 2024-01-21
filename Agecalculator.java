import java.util.Scanner;

class age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to age calculator");
        System.out.println("Please enter your age : ");
        int age = input.nextInt();

        if(age >= 65){
            System.out.println("your are senior citizen because your age is " + age);
        }else if (age >= 20){
            System.out.println("You are an adult beacuse your age is " + age);
        }else if(age >= 13 ){ 
            System.out.println("You are teenage beacuse your age is " + age);
        }else {
            System.out.println("you are chile beacuse your age is " + age);
        }
    }
}
