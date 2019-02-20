public class forLoops {
    public static void main(String[] args){

        for(int i= 0; i < 10; i++){ // number 10 is how many times I want the loop to repeat
            // every time the loop repeats, i will change
            System.out.println("I love dogs!");
        }
        for(int i = 0; i < 15; i++) { //++ means increment by 1
            System.out.println(i); // printing the int i will print out the values in the loops
        }
        int[] grades = {98, 100, 83, 90, 93};

        for(int i = 0; i < grades.length; i++){
            System.out.println(grades[i]); // This loop will print out all of our grades in the array.
        }
    }
}
