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
 * Represents an ImportantTweet.
 * @modifyiedby vvkravch
 * @version 1.5
 * @see Tweet
 * @see ImportantTweet
 *@since 1.0
 */
public class ImportantTweet extends Tweet implements Tweetable {
    /**
     *Constructs an ImportantTweet object.
     *
     * @param message ImportantTweet message
     * @param date ImportantTweet date
     */

    public ImportantTweet(String message){
        super(message);
    }

    public ImportantTweet(String message, Date date) {
        super(message, date);
    }


    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
    /*  Returns True to isImportant method for Important Tweet*/
}
