import java.util.ArrayList;
import java.util.List;

public class J_Grid_OptimizeList {

    public static List<List<String>> findAllPaths(int n, int m) {
        List<List<String>> paths = new ArrayList<>();
        findAllPathsHelper(0, 0, n, m, new ArrayList<>(), paths);
        return paths;
    }

    public static void findAllPathsHelper(int i, int j, int n, int m, List<String> currentPath, List<List<String>> paths) {
        // Add current cell to the path
        currentPath.add("(" + i + "," + j + ")");

        // If reached destination
        if (i == n - 1 && j == m - 1) {
            paths.add(new ArrayList<>(currentPath));
        } else {
            // Move right if within bounds
            if (j + 1 < m) {
                findAllPathsHelper(i, j + 1, n, m, currentPath, paths);
            }
            // Move down if within bounds
            if (i + 1 < n) {
                findAllPathsHelper(i + 1, j, n, m, currentPath, paths);
            }
        }

        // Backtrack: remove current cell from the path
        currentPath.remove(currentPath.size() - 1);
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        List<List<String>> paths = findAllPaths(n, m);
        
        // Print all paths
        for (List<String> path : paths) {
            System.out.println(path);
        }
        
        // Print the count of paths
        System.out.println("Total paths: " + paths.size());
    }


}
