import Projects.TicTacToe.controllers.GameController;
import Projects.TicTacToe.exceptions.InvalidBotCountException;
import Projects.TicTacToe.exceptions.InvalidPlayerCountException;
import Projects.TicTacToe.exceptions.InvalidPlayerSymbolException;
import Projects.TicTacToe.models.*;
import Projects.TicTacToe.strategies.winningstrategies.ColumnWinningStrategy;
import Projects.TicTacToe.strategies.winningstrategies.DiagonalWinningStrategy;
import Projects.TicTacToe.strategies.winningstrategies.RowWinningStrategy;
import Projects.TicTacToe.strategies.winningstrategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InvalidBotCountException, InvalidPlayerCountException, InvalidPlayerSymbolException {

//        Game game = Game.getBuilder().setWiningStrategies(new ArrayList<>()).setPlayers(null).setDimension(3).build();

//        Game game = Game.getBuilder().setPlayers().setDimension().setWiningStrategies().build();

//        GameController gameController = new GameController();
//        Game game = gameController.startGame(3, new ArrayList<>(), new ArrayList<>());

        int dimension = 3;

        List<Player> players = new ArrayList<>();
        players.add(new Player("Aman", new Symbol('X'), PlayerType.HUMAN));
        players.add(new Player("Krishna", new Symbol('O'), PlayerType.HUMAN));

        List<WinningStrategy> winningStrategies = List.of(
                new RowWinningStrategy(),
                new ColumnWinningStrategy(),
                new DiagonalWinningStrategy()
        );

        GameController gameController = new GameController();
        Game game = gameController.startGame(
                dimension,
                players,
                winningStrategies
        );

        // gameController.printBoard(game);

        while (game.getGameState().equals(GameState.IN_PROGRESS)) {
            // 1. Print the board.
            // 2. Ask users to choose where they make want to make a move.

            gameController.printBoard(game);

            gameController.makeMove(game);
        }
    }
}