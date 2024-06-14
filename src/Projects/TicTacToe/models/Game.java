package Projects.TicTacToe.models;

import Projects.TicTacToe.exceptions.InvalidBotCountException;
import Projects.TicTacToe.exceptions.InvalidPlayerCountException;
import Projects.TicTacToe.exceptions.InvalidPlayerSymbolException;
import Projects.TicTacToe.strategies.winningstrategies.WinningStrategy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Game {
    private List<Player> players;
    private Board board;
    private List<Move> moves;
    private Player winner;
    private GameState gameState;
    private int nextPlayerMoveIndex;
    List<WinningStrategy> winningStrategies;

    private Game(int dimension, List<Player> players, List<WinningStrategy> winningStrategies) {
        this.players = players;
        this.moves = new ArrayList<>();
        this.board = new Board(dimension);
        this.gameState = GameState.IN_PROGRESS;
        this.nextPlayerMoveIndex = 0;
        this.winningStrategies = winningStrategies;

    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public void printBoard() {
        board.print();
    }

    public void makeMove() {}

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public int getNextPlayerMoveIndex() {
        return nextPlayerMoveIndex;
    }

    public void setNextPlayerMoveIndex(int nextPlayerMoveIndex) {
        this.nextPlayerMoveIndex = nextPlayerMoveIndex;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winingStrategies) {
        this.winningStrategies = winingStrategies;
    }

    public static class Builder {
        private List<Player> players;
        private int dimension;
        List<WinningStrategy> winningStrategies;

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winingStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        private void validateBotCount() throws InvalidBotCountException {
            int botCount = 0;
            for (Player player : players) {
                if (player.getPlayerType().equals(PlayerType.BOT)) {
                    botCount+=1;
                }
            }
            if (botCount > 1) {
                throw new InvalidBotCountException("Only 1 bot is allowed per Game.");
            }
        }

        private void validatePlayerCount() throws InvalidPlayerCountException {
            if (players.size() != dimension-1) {
                throw new InvalidPlayerCountException("Number of Players should be 1 less than the dimension");
            }
        }

        private void validateUniquePlayerSymbol() throws InvalidPlayerSymbolException {
            HashSet<Player> uniquePlayer = new HashSet<>();
            for (Player player : players) {
                if (uniquePlayer.contains(player)) {
                    throw new InvalidPlayerSymbolException("No two Player can have same symbol.");
                }
                uniquePlayer.add(player);
            }
        }

        private void validate() throws InvalidBotCountException, InvalidPlayerCountException, InvalidPlayerSymbolException {
            validateBotCount();
            validatePlayerCount();
            validateUniquePlayerSymbol();
        }

        public Game build() throws InvalidBotCountException, InvalidPlayerCountException, InvalidPlayerSymbolException {
            // Before building the game we should first validate whether all the attributes are correct or not.
            validate();

            return new Game(
                    dimension,
                    players,
                    winningStrategies
            );
        }
    }
}
