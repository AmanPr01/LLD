package Projects.TicTacToe.Factory;

import Projects.TicTacToe.models.BotDifficultyLevel;
import Projects.TicTacToe.strategies.botplayingstrategies.BotPlayingStrategy;
import Projects.TicTacToe.strategies.botplayingstrategies.EasyBotPlayingStrategy;
import Projects.TicTacToe.strategies.botplayingstrategies.HardBotPlayingStrategy;
import Projects.TicTacToe.strategies.botplayingstrategies.MediumBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel difficulty) {
        switch (difficulty) {
            case EASY: return new EasyBotPlayingStrategy();
        }
        switch (difficulty) {
            case MEDIUM: return new MediumBotPlayingStrategy();
        }
        switch (difficulty) {
            case HARD: return new HardBotPlayingStrategy();
        }
        return null;
    }
}
