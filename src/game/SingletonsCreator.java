package game;

import game.gameObjects.Submarine;
import game.level.Level;
import game.sceneControllers.LevelSceneController;
import game.state.LevelState;
import game.state.StateComposer;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class SingletonsCreator {
    static Submarine playerSubmarine;
    static LevelState levelState;
    static Level level;
    static StateComposer composer;

    public static Submarine getOrCreatePlayerSubmarineFactoryMethod() {
        if(playerSubmarine == null) {
            //TODO: give actual starting values based on size of map
            playerSubmarine = new Submarine(0, 0);
        }
        return playerSubmarine;
    }

    public static LevelState getOrCreateLevelStateFactoryMethod() {
        if(levelState == null) {
            levelState = new LevelState();
        }
        return levelState;
    }
    public static Level getOrCreateLevelFactoryMethod() {
        if(level == null) {
            level = new Level();
        }
        return level;
    }
    public static StateComposer getOrCreateStateComposerFactoryMethod() {
        if(composer == null) {
            composer = new StateComposer();
        }
        return composer;
    }
    public static void resetLevelComponents() {
        level = null;
        playerSubmarine = null;
        levelState = null;
        composer = null;
//        getOrCreateLevelStateFactoryMethod();
//        getOrCreateLevelFactoryMethod();
//        getOrCreatePlayerSubmarineFactoryMethod();
//        getOrCreateStateComposerFactoryMethod();
    }

}
