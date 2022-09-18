package main.java.LLD.NokiaSnakeGame;

public class Game {

    public static int DIRECTION_NONE = 0;
    public static int DIRECTION_RIGHT = 1;
    public static int DIRECTION_LEFT = -1;
    public static int DIRECTION_UP = 2;
    public static int DIRECTION_DOWN = -2;

    Snake snake;
    Board board;
    int direction;
    boolean gameOver;

    Game(Snake snake, Board board) {
        this.snake = snake;
        this.board = board;
    }

    public Snake getSnake() {
        return snake;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }


    public void update() {
        System.out.println("Going to update the game :: ");

        if (!gameOver) {
            if (direction != DIRECTION_NONE) {
                Cell nextCell = getNextCell(snake.getHead());

                if (snake.hasCollision(nextCell)) {
                    System.out.println(" Collision has happened");
                    setDirection(DIRECTION_NONE);
                    gameOver = true;
                } else {
                    snake.move(nextCell);
                    if (nextCell.getCellType() == CellType.FOOD) {
                        System.out.println(" Snake has grown after eating food...");
                        snake.grow();
                        board.generateFood();
                    }
                }
            }
        }
    }

    private Cell getNextCell(Cell cell) {

        System.out.println("Getting the next cell :: ");
        int row = cell.getRow();
        int col = cell.getCol();

        if (direction == DIRECTION_RIGHT) {
            col++;
        }

        if (direction == DIRECTION_LEFT) {
            col--;
        }

        if (direction == DIRECTION_UP) {
            row--;
        }

        if (direction == DIRECTION_DOWN) {
            row++;
        }

        Cell nextCell = board.getCells()[row][col];

        return nextCell;
    }

    public static void main(String[] args) {

        System.out.println("Going to start game");

        Cell initPos = new Cell(0, 0);
        Snake initSnake = new Snake(initPos);
        Board board = new Board(10, 10);
        Game newGame = new Game(initSnake, board);
        newGame.gameOver = false;
        newGame.direction = DIRECTION_RIGHT;

        // We need to update the game at regular intervals,
        // and accept user input from the Keyboard.

        // here I have just called the different methods
        // to show the functionality
        for (int i = 0; i < 5; i++) {
            if (i == 2) newGame.board.generateFood();
            newGame.update();
            if (i == 3) newGame.direction = DIRECTION_RIGHT;
            if (newGame.gameOver == true) break;
        }
    }
}
