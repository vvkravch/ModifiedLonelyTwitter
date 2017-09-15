package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by watts1 on 9/12/17.
 */

public class NormalTweet extends Tweet {

    public NormalTweet(String message) {
        super(message);
    }

    public NormalTweet(String message, Date date, CMood mood) {
        super(message, date, mood);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.FALSE;
    }

}
