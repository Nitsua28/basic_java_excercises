package exercises.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class StreamsExample{
    public static void main(String[] args) {
        ArrayList<String> pokemon = new ArrayList<>();

        String[] pulledPokemonFromGithub = {"Bulbasaur","Ivysaur","Venusaur","Charmander","Charmeleon","Charizard","Squirtle","Wartortle","Blastoise","Caterpie","Metapod","Butterfree","Weedle","Kakuna","Beedrill","Pidgey","Pidgeotto","Pidgeot","Rattata","Raticate","Spearow","Fearow","Ekans","Arbok","Pikachu","Raichu","Sandshrew","Sandslash","Nidoran","Nidorina","Nidoqueen","Nidoran","Nidorino","Nidoking","Clefairy","Clefable","Vulpix","Ninetales","Jigglypuff","Wigglytuff","Zubat","Golbat","Oddish","Gloom","Vileplume","Paras","Parasect","Venonat","Venomoth","Diglett","Dugtrio","Meowth","Persian","Psyduck","Golduck","Mankey","Primeape","Growlithe","Arcanine","Poliwag","Poliwhirl","Poliwrath","Abra","Kadabra","Alakazam","Machop","Machoke","Machamp","Bellsprout","Weepinbell","Victreebel","Tentacool","Tentacruel","Geodude","Graveler","Golem","Ponyta","Rapidash","Slowpoke","Slowbro","Magnemite","Magneton","Farfetch'd","Doduo","Dodrio","Seel","Dewgong","Grimer","Muk","Shellder","Cloyster","Gastly","Haunter","Gengar","Onix","Drowzee","Hypno","Krabby","Kingler","Voltorb","Electrode","Exeggcute","Exeggutor","Cubone","Marowak","Hitmonlee","Hitmonchan","Lickitung","Koffing","Weezing","Rhyhorn","Rhydon","Chansey","Tangela","Kangaskhan","Horsea","Seadra","Goldeen","Seaking","Staryu","Starmie","Mr. Mime","Scyther","Jynx","Electabuzz","Magmar","Pinsir","Tauros","Magikarp","Gyarados","Lapras","Ditto","Eevee","Vaporeon","Jolteon","Flareon","Porygon","Omanyte","Omastar","Kabuto","Kabutops","Aerodactyl","Snorlax","Articuno","Zapdos","Moltres","Dratini","Dragonair","Dragonite","Mewtwo","Mew"};
        
        for (String elem: pulledPokemonFromGithub) pokemon.add(elem);
        
        pokemon.stream().forEach(val -> {
            System.out.println(val);
  
        });
        List<String> sortedPokemon= pokemon.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted Pokemon" + sortedPokemon);
        List<String> turnToDudes = pokemon.stream().map(x -> x + "dude").collect(Collectors.toList());
        System.out.println("pokemon dudes:" + turnToDudes);
        List<String> onlyStartS = pokemon.stream().filter(x -> Character.toLowerCase(x.charAt(0))== 's').collect(Collectors.toList());
        System.out.println("pokemon that starts with S:" + onlyStartS);
        String pokemonBigString = pokemon.stream().reduce("", (bigString, current) -> bigString+= current);
        System.out.println("big string of Pokemon: " + pokemonBigString);
    }
}