


public class TestThat {
    public static void main(String[] args) {
        int[][] maze = {{0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0}};
        AStar astar = new AStar(maze, 0, 0, 3, 3, "E");
        astar.process();
    }
}
