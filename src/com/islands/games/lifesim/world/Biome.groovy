package com.islands.games.lifesim.world
import com.islands.games.lifesim.Location
import com.islands.games.lifesim.Random
import com.islands.games.lifesim.metaphysics.AdvancementManager

class Biome {
    Location LOCATION
    String TYPE
    //TODO: Make applicable threats and resources able to be read from a file (JSON or config)
    Threat THREATS = []
    Resource RESOURCE =[]


    Biome() {
        this.TYPE = "Grasslands"
    }
    Biome(String type, Location loc){
        this.TYPE=type
        this.LOCATION=loc
    }

    Biome(String type, double x, double y){
        this.TYPE=type
        this.LOCATION = new Location(x, y)
    }
    String toString(){
        return "${this.TYPE}"
    }

}
