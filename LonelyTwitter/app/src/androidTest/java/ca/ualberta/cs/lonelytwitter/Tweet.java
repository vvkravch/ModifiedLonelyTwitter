/*
 * Copyright (c) 2017 Team _ CMPUT 301 University of ALberta - All Rights reserved. ou may use, distribute or modify this code under terms and conditions of the Code of Student Behaviour at University odf Alberta.
 * You may find a copy of the license in this project. Otherwise please vvkravch@ualberta.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by watts1 on 9/12/17.
 */

/**
 * Represents a tweet.
 * @modifyiedby vvkravch
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 *@since 1.0
 */
public abstract class Tweet {

    private String message;
    private Date date;
    /**
     *Constructs a tweet object.
     *
     * @param message tweet message
     * @param date Tweet date
     */
    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public abstract Boolean isImportant();

    /**
     * Sets tweet message.
     * 
     * @param message
     * @throws TweetTooLongException
     */



    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    public String getMessage(){
        return this.message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }
}
