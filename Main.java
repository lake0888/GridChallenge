import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
    static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //initChallenge();
        //List<String> grid = new ArrayList<>(List.of("ebacd", "fghij", "olmkn", "trpqs", "xywuv"));
        //System.out.println(gridChallenge(grid));
        initChallenge();
    }

    public static void initChallenge() {
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            List<String> grid = initGrid();
            
            System.out.println(gridChallenge(grid));
        }
    }

    public static List<String> initGrid() {
        List<String> grid = new ArrayList<>();        
        
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int j = 0; j < n; j++) {
            grid.add(scanner.nextLine());
        }
        return grid;
    }

    public static String gridChallenge(List<String> grid) {
        // Write your code here
            rearrangeElements(grid);
            for (int i = 0; i < grid.get(0).length(); i++) {
                String element = "";
                for (int j = 0; j < grid.size(); j++) {
                    element += grid.get(j).charAt(i);
                }
                
                //CHECK IF THE COLUMN IS SORTED
                char[] elements = element.toCharArray();
                Arrays.sort(elements);
                if (!element.equals(new String(elements))) return "NO";
            }
            return "YES";
        }

    public static void rearrangeElements(List<String> grid) {
        for (int i = 0; i < grid.size(); i++) {
            char[] elements = grid.get(i).toCharArray();
            Arrays.sort(elements);
            grid.set(i, new String(elements));
        }
    }
}