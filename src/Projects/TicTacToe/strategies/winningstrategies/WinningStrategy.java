package Projects.TicTacToe.strategies.winningstrategies;

import Projects.TicTacToe.models.Board;
import Projects.TicTacToe.models.Move;

public interface WinningStrategy {
    boolean checkWinner(Board board, Move move);
}
