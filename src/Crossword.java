public class Crossword {
    private Square[][] puzzle;
    public Crossword(boolean[][] blackSquares) {
        puzzle = new Square[blackSquares.length][blackSquares[0].length];
        int temp = 1;

        for(int i = 0; i < puzzle.length; i++) {
            for(int j = 0; j < puzzle[i].length; j++) {
                if(blackSquares[i][j]) {
                    puzzle[i][j] = new Square(true, 0);
                    continue;
                }
                if(toBeLabeled(i, j, blackSquares)) {
                    puzzle[i][j] = new Square(false, temp);
                    temp++;
                    continue;
                }
                puzzle[i][j] = new Square(false, 0);
            }
        }
    }

    private boolean toBeLabeled(int r, int c, boolean[][] blackSquares) {
        if(r == 0 || c == 0) return true;
        if(blackSquares[r - 1][c] || blackSquares[r][c - 1]) return true;
        return false;
    }

    public Square[][] getPuzzle() {
        return puzzle;
    }
}
