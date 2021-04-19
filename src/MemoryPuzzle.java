import java.util.Scanner;

public class MemoryPuzzle {
    public static void main(String[] args) {
        String puzzle[][] = {
                {"@","@","&","&"},
                {"%","%","#","#"},
                {"X","X","$","$"}
        };
        int status[][] = new int[puzzle.length][puzzle[0].length];
        //status[0][1]=1;

        Scanner scanner = new Scanner(System.in);
        int count=0;
        while(!isAllOne(status)) {
            char letter = 'a';
            System.out.println("\t1\t2\t3\t4\t");
            for (int i = 0; i < puzzle.length; i++) {
                System.out.print(letter + "\t");
                for (int j = 0; j < puzzle[0].length; j++) {
                    if (status[i][j] == 0) {
                        System.out.print("*\t");
                    } else {
                        System.out.print(puzzle[i][j] + "\t");
                    }
                }
                System.out.println();
                letter++;
            }
            String location;
            int locFirst[] = {0, 0};
            int locSecond[] = {0, 0};
            String loc1, loc2;
            System.out.print("First location : ");
            location = scanner.next();
            locFirst[0] = (int) (location.charAt(0) - 97);
            locFirst[1] = (int) (location.charAt(1) - 49);
            loc1 = puzzle[locFirst[0]][locFirst[1]];
            //System.out.println(loc1);
            System.out.print("Second location : ");
            location = scanner.next();
            locSecond[0] = (int) (location.charAt(0) - 97);
            locSecond[1] = (int) (location.charAt(1) - 49);
            loc2 = puzzle[locSecond[0]][locSecond[1]];
            if (loc1.equalsIgnoreCase(loc2)) {
                status[locFirst[0]][locFirst[1]] = 1;
                status[locSecond[0]][locSecond[1]] = 1;
            }
            System.out.println("Attempt :"+count);
            count++;
        }
        System.out.println("CONGRATS !!! YOU WON !!!");
        System.out.println("Total attempts :"+count);
    }
    public static boolean isAllOne(int arr[][]){
        boolean result = true;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[0].length ; j++) {
                if(arr[i][j] != 1){
                    result = false;
                }
            }
        }
        return result;
    }

}
