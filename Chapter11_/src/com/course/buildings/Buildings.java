package com.course.buildings;

/**
 *
 * @author Gerardo A A
 */
public class Buildings {
    protected Integer footage;
    protected Integer stories;

    public Integer getFootage() {
        return footage;
    }

    public void setFootage(Integer footage) {
        this.footage = footage;
    }

    public Integer getStories() {
        return stories;
    }

    public void setStories(Integer stories) {
        this.stories = stories;
    }

    @Override
    public String toString() {
        return "footage=" + footage + ", stories=" + stories + '}';
    }
    
    
    
}
