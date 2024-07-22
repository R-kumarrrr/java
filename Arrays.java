public class Arrays {
    public static void main(String[] args) {
        int[] marks = new int[3];  // OR int marks[] = new int[3];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;

             //OR
      
        //  int[] marks2 = {10, 20, 30}; Used in case of known size

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }
    }
}
