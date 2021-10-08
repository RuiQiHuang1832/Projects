package alarmClock;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class index {

    static long alarm;
    static boolean alarmStatus = false;
    static boolean started = false;

    public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        Scanner input = new Scanner(System.in);
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("Project/numbers/alarmClock/alarm.wav").getAbsoluteFile());
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        System.out.println("Enter an alarm time in seconds: ");
        alarm = input.nextLong();
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                    alarm--;
                if (alarm == 0 && !started) {
                    clip.start();
                    started =true;
                }

                if (alarm < -4) {
                    timer.cancel();
                }

                }
        }, 0, 1000);


    }




}
