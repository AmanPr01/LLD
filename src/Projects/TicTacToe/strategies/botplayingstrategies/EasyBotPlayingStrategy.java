package Projects.TicTacToe.strategies.botplayingstrategies;

import Projects.TicTacToe.models.Board;
import Projects.TicTacToe.models.Cell;
import Projects.TicTacToe.models.CellState;
import Projects.TicTacToe.models.Move;

import java.util.List;

public class EasyBotPlayingStrategy implements  BotPlayingStrategy {

    @Override
    public Move makeMove(Board board) {
        // Iterate through the board and make the move at the first available cell
        for (List<Cell> cells : board.getBoard()) {
            for (Cell cell : cells) {
                if (cell.getCellState().equals(CellState.EMPTY)) {
                    return new Move(null, cell);
                }
            }
        }

        return null;
    }
}
