package org.example;

import java.util.concurrent.TimeoutException;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.stage.Stage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.ApplicationTest;
import org.testfx.framework.junit5.Start;

@ExtendWith(ApplicationExtension.class)
public abstract class BaseTestHarness extends ApplicationTest {

  protected Stage primaryStage;

  @BeforeEach
  private void setUp() throws Exception {
    ApplicationTest.launch(App.class);
  }

  @Start
  public void start(Stage stage) {
    primaryStage = stage;
  }

  @AfterEach
  private void tearDown(FxRobot robot) throws TimeoutException {
    FxToolkit.hideStage();
    robot.release(new KeyCode[] {});
    robot.release(new MouseButton[] {});
  }
}
