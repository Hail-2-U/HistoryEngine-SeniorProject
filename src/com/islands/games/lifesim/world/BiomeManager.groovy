package com.islands.games.lifesim.world

import com.islands.games.lifesim.Printable
import com.islands.games.lifesim.life.Person
import com.islands.games.lifesim.society.Tribe
import com.islands.games.lifesim.Random

class BiomeManager implements Printable{

    final static int MAX_BIOMES = 30
    static ArrayList<Biome> BIOMES = new ArrayList<>()
    static ArrayList<Threat> THREATS = new ArrayList<>()
    static ArrayList<Resource> RESOURCES = new ArrayList<>()


    static Biome addBiome(String type,double x,double y) {
        ArrayList<Threat> newThreats = new ArrayList<>()

        Random.nextInt()
        Biome B = new Biome(type,x,y)
        BIOMES << B

        return B
    }
    boolean biomeCheck(){
        /* Check all tribes currently in sim
         * Create biomes in range if they have none
         * Allow program to
         */

    }



}
