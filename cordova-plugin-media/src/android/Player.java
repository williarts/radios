
package org.apache.cordova.media;

import java.util.HashMap;

/**
 * Created by Valdir on 15/03/17.
 */
public class Player {

    HashMap<String, AudioPlayer> players = new HashMap<String, AudioPlayer>();  // Audio player object

    private static Player ourInstance = new Player();

    public static Player getInstance() {
        return ourInstance;
    }

    private Player() {
    }

    public HashMap<String, AudioPlayer> getPlayers() {
        return players;
    }
}
