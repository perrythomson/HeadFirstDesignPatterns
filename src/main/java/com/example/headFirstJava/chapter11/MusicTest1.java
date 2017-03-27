package com.example.headFirstJava.chapter11;

import javax.sound.midi.*;
/**
 * Created by perrythomson on 3/24/17.
 */
public class MusicTest1 {

    public void play() {
        
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Successfully got a sequencer");
        } catch (MidiUnavailableException ex) {
            System.out.println("Bummer dude");
        }
    }

    public static void main (String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }
}
