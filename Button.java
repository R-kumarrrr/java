import java.util.*;
public class Button {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int Button = sc.nextInt();
    // if(Button == 1){
    //     System.out.println("Hello");
    // } else if(Button == 2){
    //     System.out.println("Namaste");
    // } else if(Button == 3){
    //     System.out.println("Hola");
    // } else {
    //     System.out.println("Invalid Button");
    // }

    
    switch(Button){
        case 1:System.out.println("Hello");
        break;
        case 2:System.out.println("Namaste");
        break;
        case 3:System.out.println("Hola");
        break;
        default:System.out.println("Invalid Button");
}
}
}