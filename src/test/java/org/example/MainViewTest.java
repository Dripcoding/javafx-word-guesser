package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javafx.scene.image.Image;
import org.junit.jupiter.api.Test;
import org.testfx.api.FxRobot;

public class MainViewTest extends BaseTestHarness {

  @Test
  void stageShouldHaveTitle(FxRobot robot) {
    assertEquals("Word Guesser", primaryStage.getTitle());
  }

  @Test
  void stageShouldHaveIcon() {
    Image image = primaryStage.getIcons().get(0);

    assertNotNull(image);
  }
}
