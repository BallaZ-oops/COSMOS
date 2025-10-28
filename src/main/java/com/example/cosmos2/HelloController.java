package com.example.cosmos2;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView rocket, space, space2, stone, stone1, stone2, stone3, stone4, stone5, stone6, stone7, stone8, stone9, stone10;

    @FXML
    private Label gamePause, gameLose;

    @FXML

    private final int SPACE_WIDTH = 700;

    private ParallelTransition parallelTransition;
    private TranslateTransition enamyTransition;
    private TranslateTransition enamy1Transition;
    private TranslateTransition enamy2Transition;
    private TranslateTransition enamy3Transition;
    private TranslateTransition enamy4Transition;
    private TranslateTransition enamy5Transition;
    private TranslateTransition enamy6Transition;
    private TranslateTransition enamy7Transition;
    private TranslateTransition enamy8Transition;
    private TranslateTransition enamy9Transition;
    private TranslateTransition enamy10Transition;

    public static boolean right = false;
    public static boolean left = false;
    public static boolean isPause = false;
    private int rocketSpeed = 3;

    AnimationTimer timer = new AnimationTimer(){

        @Override
        public void handle(long l) {
            if (right && rocket.getLayoutX() < 650f)
                rocket.setLayoutX(rocket.getLayoutX() + rocketSpeed);

            if (left && rocket.getLayoutX() > 0f)
                rocket.setLayoutX(rocket.getLayoutX() - rocketSpeed);


            if(isPause && !gamePause.isVisible()) {
                gamePause.setVisible(true);
                rocketSpeed = 0;
                parallelTransition.pause();
                enamyTransition.pause();
                enamy1Transition.pause();
                enamy2Transition.pause();
                enamy3Transition.pause();
                enamy4Transition.pause();
                enamy5Transition.pause();
                enamy6Transition.pause();
                enamy7Transition.pause();
                enamy8Transition.pause();
                enamy9Transition.pause();
                enamy10Transition.pause();
            }
            else if
                (!isPause && gamePause.isVisible()){
                gamePause.setVisible(false);
                rocketSpeed = 3;
                parallelTransition.play();
                enamyTransition.play();
                enamy1Transition.play();
                enamy2Transition.play();
                enamy3Transition.play();
                enamy4Transition.play();
                enamy5Transition.play();
                enamy6Transition.play();
                enamy7Transition.play();
                enamy8Transition.play();
                enamy9Transition.play();
                enamy10Transition.play();
            }
            if(rocket.getBoundsInParent().intersects(stone.getBoundsInParent()) || rocket.getBoundsInParent().intersects(stone1.getBoundsInParent()) || rocket.getBoundsInParent().intersects(stone2.getBoundsInParent()) || rocket.getBoundsInParent().intersects(stone3.getBoundsInParent()) || rocket.getBoundsInParent().intersects(stone4.getBoundsInParent()) || rocket.getBoundsInParent().intersects(stone5.getBoundsInParent()) || rocket.getBoundsInParent().intersects(stone6.getBoundsInParent()) || rocket.getBoundsInParent().intersects(stone7.getBoundsInParent()) || rocket.getBoundsInParent().intersects(stone8.getBoundsInParent()) || rocket.getBoundsInParent().intersects(stone9.getBoundsInParent()) ) {
                gameLose.setVisible(true);
                rocketSpeed = 0;
                parallelTransition.pause();
                enamyTransition.pause();
                enamy1Transition.pause();
                enamy2Transition.pause();
                enamy3Transition.pause();
                enamy4Transition.pause();
                enamy5Transition.pause();
                enamy6Transition.pause();
                enamy7Transition.pause();
                enamy8Transition.pause();
                enamy9Transition.pause();
                enamy10Transition.pause();
            }


        }





    };

    public HelloController() {
    }



    @FXML
    void initialize() {

        TranslateTransition spaceTransition = new TranslateTransition(Duration.millis(5000), space);
        spaceTransition.setFromY(0);
        spaceTransition.setToY(442);
        spaceTransition.setInterpolator(Interpolator.LINEAR);

        TranslateTransition space2Transition = new TranslateTransition(Duration.millis(5000), space2);
        space2Transition.setFromY(0);
        space2Transition.setToY(442);
        space2Transition.setInterpolator(Interpolator.LINEAR);

        enamyTransition = new TranslateTransition(Duration.millis(4500), stone);
        enamyTransition.setFromY(0);
        enamyTransition.setToY(1000);
        enamyTransition.setInterpolator(Interpolator.LINEAR);
        enamyTransition.setCycleCount(Animation.INDEFINITE);
        enamyTransition.play();

        enamy1Transition = new TranslateTransition(Duration.millis(4000), stone1);
        enamy1Transition.setFromY(0);
        enamy1Transition.setToY(800);
        enamy1Transition.setInterpolator(Interpolator.LINEAR);
        enamy1Transition.setCycleCount(Animation.INDEFINITE);
        enamy1Transition.play();

        enamy2Transition = new TranslateTransition(Duration.millis(5500), stone2);
        enamy2Transition.setFromY(0);
        enamy2Transition.setToY(700);
        enamy2Transition.setInterpolator(Interpolator.LINEAR);
        enamy2Transition.setCycleCount(Animation.INDEFINITE);
        enamy2Transition.play();

        enamy3Transition = new TranslateTransition(Duration.millis(3500), stone3);
        enamy3Transition.setFromY(0);
        enamy3Transition.setToY(1000);
        enamy3Transition.setInterpolator(Interpolator.LINEAR);
        enamy3Transition.setCycleCount(Animation.INDEFINITE);
        enamy3Transition.play();

        enamy4Transition = new TranslateTransition(Duration.millis(3500), stone4);
        enamy4Transition.setFromY(0);
        enamy4Transition.setToY(1000);
        enamy4Transition.setInterpolator(Interpolator.LINEAR);
        enamy4Transition.setCycleCount(Animation.INDEFINITE);
        enamy4Transition.play();

        enamy5Transition = new TranslateTransition(Duration.millis(3500), stone5);
        enamy5Transition.setFromY(0);
        enamy5Transition.setToY(800);
        enamy5Transition.setInterpolator(Interpolator.LINEAR);
        enamy5Transition.setCycleCount(Animation.INDEFINITE);
        enamy5Transition.play();

        enamy6Transition = new TranslateTransition(Duration.millis(4500), stone6);
        enamy6Transition.setFromY(0);
        enamy6Transition.setToY(800);
        enamy6Transition.setInterpolator(Interpolator.LINEAR);
        enamy6Transition.setCycleCount(Animation.INDEFINITE);
        enamy6Transition.play();

        enamy7Transition = new TranslateTransition(Duration.millis(5500), stone7);
        enamy7Transition.setFromY(0);
        enamy7Transition.setToY(800);
        enamy7Transition.setInterpolator(Interpolator.LINEAR);
        enamy7Transition.setCycleCount(Animation.INDEFINITE);
        enamy7Transition.play();

        enamy8Transition = new TranslateTransition(Duration.millis(4700), stone8);
        enamy8Transition.setFromY(0);
        enamy8Transition.setToY(1100);
        enamy8Transition.setInterpolator(Interpolator.LINEAR);
        enamy8Transition.setCycleCount(Animation.INDEFINITE);
        enamy8Transition.play();

        enamy9Transition = new TranslateTransition(Duration.millis(4500), stone9);
        enamy9Transition.setFromY(0);
        enamy9Transition.setToY(1000);
        enamy9Transition.setInterpolator(Interpolator.LINEAR);
        enamy9Transition.setCycleCount(Animation.INDEFINITE);
        enamy9Transition.play();

        enamy10Transition = new TranslateTransition(Duration.millis(5000), stone10);
        enamy10Transition.setFromY(0);
        enamy10Transition.setToY(900);
        enamy10Transition.setInterpolator(Interpolator.LINEAR);
        enamy10Transition.setCycleCount(Animation.INDEFINITE);
        enamy10Transition.play();



        parallelTransition = new ParallelTransition(spaceTransition, space2Transition);
        parallelTransition.setCycleCount(Animation.INDEFINITE);
        parallelTransition.play();

        timer.start();

    }

}