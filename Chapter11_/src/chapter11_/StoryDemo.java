/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_;

/**
 *
 * @author Gerardo A A
 */
public class StoryDemo {
    public static void storyDemo(){
        Story[] story = new Story[6];
        story[0] = new Novel("Maria","Maria",500);
        story[1] = new Novella("Noella","Erick",70);
        story[2] = new ShortStory("Vidas","ELena",30);
        story[3] = new Novel("Marias","Mario",300);
        story[4] = new Novella("Muertes","Geisha",66);
        story[5] = new ShortStory("Linea","Lineo",30);
        
        for(Story s:story){
            System.out.println(s.toString());
        }
    }
}
