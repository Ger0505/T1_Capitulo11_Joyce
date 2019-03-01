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
public class ShortStory extends Story{
     public ShortStory(String title, String author,Integer pages) {
        super(title, author);
        setPages(pages);
    }
    
    @Override
    public void setPages(Integer pages) {
        if(pages>50)
            System.out.println(this.message);
        else
            this.pages = pages;
    }

    @Override
    public String toString() {
        return "ShortStory:\n"+super.toString();
    }
}
