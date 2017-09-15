package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by watts1 on 9/12/17.
 */

public class ImportantTweet extends Tweet implements Tweetable {

    public ImportantTweet(String message){
        super(message);
    }

    public ImportantTweet(String message, Date date, CMood mood) {
        super(message, date, mood);
    }


    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}
