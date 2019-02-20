public class nestedForLoops {
    public static void main(String[] args){
        for(int i = 0; i < 5; i++){
            System.out.println("It's so freaking cold outside!");
        }
        System.out.println("-------------");
        String[] colors = {"Red","Blue","Green"};

        for(int i = 0; i <= 2; i++){
            System.out.println(colors[i]); // i basically gets each element in the array
        }
        System.out.println("-------------");

        String[][] fancyColors = {
                {"Red","Blue","Green"},
                {"Cyan","Magenta","Turquoise"}
        };

        for(int row  = 0; row < 2; row++){
            for (int column = 0; column <= 2; column++){
                System.out.println(fancyColors[row][column]);
            }
        }
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 10; j++){
                System.out.println("i: " + i + ", j:" + j);
            }
        }
    }
}
