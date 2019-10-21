


public class TestThat {
    public static void main(String[] args) {
        int[][] maze = {{0,0,0,0},
                        {1,1,1,0},
                        {0,0,0,0},
                        {0,0,0,0}};
        AStar astar = new AStar(maze, 0, 0, 3, 3, "W");
        System.out.println(astar.process());
    }
}
