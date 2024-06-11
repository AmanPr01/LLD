package Projects.TicTacToe.controllers;

import Projects.TicTacToe.exceptions.InvalidBotCountException;
import Projects.TicTacToe.exceptions.InvalidPlayerCountException;
import Projects.TicTacToe.exceptions.InvalidPlayerSymbolException;
import Projects.TicTacToe.models.Game;
import Projects.TicTacToe.models.GameState;
import Projects.TicTacToe.models.Player;
import Projects.TicTacToe.strategies.winningstrategies.WinningStrategy;

import java.util.List;

public class GameController {

    public Game startGame(int dimension, List<Player> players, List<WinningStrategy> winningStrategies) throws InvalidBotCountException, InvalidPlayerCountException, InvalidPlayerSymbolException {
        return Game.getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
    }

    public void makeMove(Game game) {

    }

    public GameState gameState(Game game) {
        return game.getGameState();
    }

    public void printBoard(Game game) {
        game.printBoard();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }
}
