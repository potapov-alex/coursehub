package ru.courcehb.c10.jv47;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;

public class GameField extends JPanel implements ActionListener {
    private int numberOfApples = 1;
    private int successfulApples = 2;
    private final int SIZE = 320;

    protected static final int DOT_SIZE = 16;
    private final int ALL_DOTS = 400;

    private Image brick;

    private int[] x = new int[ALL_DOTS];
    private int[] y = new int[ALL_DOTS];

    private int dots;
    private Timer timer;
    private boolean inGame = true;

    private boolean left = false;
    private boolean right = true;
    private boolean up = false;
    private boolean down = false;

    private void loadImage() {
        ImageIcon ii = new ImageIcon("src/main/java/by/overone/game/snake/images/brick.png");
        brick = ii.getImage();
    }

    ArrayList<Apple> appleList = new ArrayList<>();

    public void createApple() {
//        if (successfulApples == 0) {
//            numberOfApples++;
//            successfulApples = numberOfApples * numberOfApples;
//        } else {
//            for (int i = 0; i < 3; i++) {
        Random random = new Random();
        Apple apple = new Apple(random.nextInt(20) * DOT_SIZE, random.nextInt(20) * DOT_SIZE);
        appleList.add(apple);
    }
//        }
//    }

    public void checkApple() {
        for (int i = 0; i < appleList.size(); i++) {
            if (x[0] == appleList.get(i).getAppleX() && y[0] == appleList.get(i).getAppleY()) {
                dots++;
//                successfulApples--;
                appleList.remove(i);
                createApple();
            }
        }
    }

    public void initGame() {
        dots = 3;
        for (int i = 0; i < dots; i++) {
            y[i] = 48;
            x[i] = 48 - i * DOT_SIZE;
        }
        timer = new Timer(350, this);
        timer.start();
        for (int i = 0; i < 3; i++) {
            createApple();
        }
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (inGame == true) {
            for (int k = 0; k < appleList.size(); k++) {
                g.drawImage(brick, appleList.get(k).getAppleX(), appleList.get(k).getAppleY(), this);
                for (int i = 0; i < dots; i++) {
                    g.drawImage(brick, x[i], y[i], this);
                }
            }
        } else {
            String str = "GamOver";
            g.setColor(Color.black);
            g.setFont(new Font("Verdana", Font.PLAIN, 30));
            g.drawString(str, SIZE / 4, ((SIZE - 25) / 2));
        }
    }

    public void checkCollisions() {
        for (int i = dots; i > 0; i--) {
            if (x[0] == x[i] && y[0] == y[i]) {
                inGame = false;
            }
        }
        if (x[0] > SIZE) inGame = false;
        if (x[0] < 0) inGame = false;
        if (y[0] > SIZE) inGame = false;
        if (y[0] < 0) inGame = false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (inGame) {
            checkApple();
            checkCollisions();
            move();
        }
        repaint();
    }

    public GameField() {
        setBackground(Color.lightGray);
        loadImage();
        initGame();
        addKeyListener(new FiledKeyListener());
        setFocusable(true);
    }

    public void move() {
        for (int i = dots; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }
        if (left) x[0] -= DOT_SIZE;
        if (right) x[0] += DOT_SIZE;
        if (up) y[0] -= DOT_SIZE;
        if (down) y[0] += DOT_SIZE;
    }

    public class FiledKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent k) {
            super.keyPressed(k);
            int key = k.getKeyCode();
            if (key == KeyEvent.VK_LEFT && !right) {
                left = true;
                up = false;
                down = false;
            }
            if (key == KeyEvent.VK_RIGHT && !left) {
                right = true;
                up = false;
                down = false;
            }
            if (key == KeyEvent.VK_UP && !down) {
                left = false;
                up = true;
                right = false;
            }
            if (key == KeyEvent.VK_DOWN && !up) {
                left = false;
                down = true;
                right = false;
            }
        }
    }
}