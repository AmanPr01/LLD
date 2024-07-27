package Projects.TicTacToe.strategies.botplayingstrategies;

import Projects.TicTacToe.models.Board;
import Projects.TicTacToe.models.Move;

public interface BotPlayingStrategy {
    Move makeMove(Board board);
}
