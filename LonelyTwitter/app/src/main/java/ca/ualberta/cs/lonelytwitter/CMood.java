package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Vlad Kravchnko on 9/15/2017.
 */

public abstract class CMood {
    private String mood;
    private Date date;

    public CMood(String mood) {
        this.mood = mood;
        this.date = new Date();
    }


    public CMood(String mood, Date date) {
        this.mood = mood;
        this.date = date;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
