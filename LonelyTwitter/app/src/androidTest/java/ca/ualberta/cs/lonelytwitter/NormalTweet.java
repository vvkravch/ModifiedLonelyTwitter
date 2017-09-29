/*
 * Copyright (c) 2017 Team _ CMPUT 301 University of Alberta - All Rights reserved. You may use, distribute or modify this code under terms and conditions of the Code of Student Behaviour at University odf Alberta.
 * You may find a copy of the license in this project. Otherwise please contact vvkravch@ualberta.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by watts1 on 9/12/17.
 *
 */
/**
 * Represents a NormalTweet.
 * @modifyiedby vvkravch
 * @version 1.5
 * @see Tweet
 * @see ImportantTweet
 *@since 1.0
 */

public class NormalTweet extends Tweet {
    /**
     *Constructs a NoramlTweet object.
     *
     * @param message NormalTweet message
     * @param date NormalTweet date
     */
    public NormalTweet(String message) {
        super(message);
    }

    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.FALSE;
    }
    /*  Returns False to isImportant method for Normal Tweet*/
}