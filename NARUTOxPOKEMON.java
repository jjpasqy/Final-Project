import java.util.*;
public class NARUTOxPOKEMON {
    public static void fight(Scanner in, Fighters realPlayer, String[] clanChoice, String[] otherAttacks, Fighters other){
        //the fight method is a method that makes fights for the game. It intakes the real player and an empty opponnet. 
        while(other.getHP() > 0){   
            System.out.println("Please choose an attack. Remember the Tutorial!"); //makes sure it only runs while the characters are alive.
            int x = in.nextInt();
            if(realPlayer.getHP() <= 0){
                System.out.println("You Died, you have to restart.");
                break;
            }
            //the next three are attack choices the player makes. 
            else if(x == 0){
                System.out.println(realPlayer.getName() + " used " + clanChoice[x]);
                realPlayer.simpleAttack(realPlayer.getPOW(), other);
                System.out.println(other.getName() + "'s health is now " + other.getHP());
                System.out.println(other.getName() + " used " + otherAttacks[x]);
                other.villianAttack(other.getPOW(), realPlayer);
                if(realPlayer.getHP()>0){ //fixes the bug with printing the players health when they have no heath
                System.out.println(realPlayer.getName() + "'s heath is now " + realPlayer.getHP());}
            }
            else if(x == 1){
                System.out.println(realPlayer.getName() + " used " + clanChoice[x]);
                realPlayer.specialAttack(realPlayer.getPOW(), other);
                System.out.println(other.getName() + "'s health is now " + other.getHP());
                System.out.println(other.getName() + " used " + otherAttacks[x]);
                other.villianAttack(other.getPOW(), realPlayer);
                if(realPlayer.getHP()>0){
                System.out.println(realPlayer.getName() + "'s heath is now " + realPlayer.getHP());}
            }
            else if(x == 2){
                System.out.println(realPlayer.getName() + " used " + clanChoice[x]);
                realPlayer.specialAttack(realPlayer.getPOW(), other);
                System.out.println(other.getName() + "'s health is now " + other.getHP());
                System.out.println(other.getName() + " used " + otherAttacks[x]);
                other.villianAttack(other.getPOW(), realPlayer);
                if(realPlayer.getHP()>0){
                System.out.println(realPlayer.getName() + "'s heath is now " + realPlayer.getHP());}
            }
        }
       //this resets the player's health after the battle. 
        if(other.getHP() <= 0){
            System.out.println("You Won");
            realPlayer.setHP(100.0);
            realPlayer.setPOW(35.0);
        }
    }
    public static void clanChoice(String[] clanChoice, Scanner in, String[] attacksNARA, String[] attacksLEE, String[] attacksUchiha, String[] attacksUzumaki){
        //these allow the player to choose what clan they would like to be apart of. The different choices are mapped to numbers to make choosing easier.
        int x = in.nextInt();
        if(x == 0){
            clanChoice[0] = attacksNARA[0];
            clanChoice[1] = attacksNARA[1];
            clanChoice[2] = attacksNARA[2];
            System.out.println("You choose the Nara Clan");
        }
        else if(x==1){
            clanChoice[0] = attacksUchiha[0];
            clanChoice[1] = attacksUchiha[1];
            clanChoice[2] = attacksUchiha[2];
            System.out.println("You choose the Uchiha Clan");
        }
        else if(x==2){
            clanChoice[0] = attacksUzumaki[0];
            clanChoice[1] = attacksUzumaki[1];
            clanChoice[2] = attacksUzumaki[2];
            System.out.println("You choose the Uzumaki Clan");
        }
        else if(x==3){
            clanChoice[0] = attacksLEE[0];
            clanChoice[1] = attacksLEE[1];
            clanChoice[2] = attacksLEE[2];
            System.out.println("You choose the Lee Clan");
        }
    }
    public static void kakashiTutorial(String[] attacksLEE, Scanner in, String playerName, Fighters Kakashi, Fighters player){
       //this tutorial explains how to fight as the player and gives a preview to the last fight.
        System.out.println("Welcome to the HiddenLeaf, " + playerName + ". My Name is Kakashi and today I will be teaching you how to fight.");
        System.out.println("First we will start off with a simple attack.");
        System.out.println("Simple attacks do 100% of your attack Power when you attack the enemy. Try it out.");
        System.out.println("Please input 0 to do a simple attack.");
        int a = in.nextInt();
        if(a==0){
            System.out.println(playerName + " used " + attacksLEE[0] + "!!");
            player.simpleAttack(25.0, Kakashi);
            System.out.println("Kakashi's health is now " + Kakashi.getHP());
        }
        System.out.println("Now lets try a special attack.");
        System.out.println("Special attacks have a chance to do 125% of your Power, but can also do less than your power.");
        System.out.println("To do a special attack, input 1");
        int x = in.nextInt();
        if(x==1){
            System.out.println(playerName + " used " + attacksLEE[1] + "!!");
            player.specialAttack(25.0, Kakashi);
            System.out.println("Kakashi's health is now " + Kakashi.getHP());
        }
        System.out.println("Now lets try a Super Attack!!");
        System.out.println("Super Attacks have a chance to do 150% of your Power, but can also do less than your power.");
        System.out.println("To do a Super Attack, input 2");
        int w = in.nextInt();
        if(w==2){
            System.out.println(playerName + " used " + attacksLEE[2] + "!!");
            player.superAttack(25.0, Kakashi);
            System.out.println("Kakashi's health is now " + Kakashi.getHP());
        }
        System.out.println("You have complete the tutorial, now go fight to become the best Ninja!!!");
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] attacksNARA = {"Punch", "Shadow Strangle", "Shadow Jutsu"};
        String[] attacksUCHIHA = {"Punch", "Chidori", "Fireball"};
        String[] attacksUZUMAKI = {"Punch", "Rasengan", "Clone Jutsu"};
        String[] attacksLEE = {"Punch", "Drunken Fist", "Primary Lotus"};
        String[] attacksKAKASHI = {"Punch", "Lighting Blade", "Water Dragon"};
        String[] attacksZabuza = {"Kick", "Water Dragon", "Hidden Mist Jutsu"};
        String[] attacksPain = {"Gravity Rod", "Universal Pull", "Almighty Push"};
        String[] attacksKAGUYA = {"Ash Rod", "Dimensional Shifting", "Shockwave"};
        System.out.println("What is your name?");
        String playerName = in.nextLine();
        Fighters tutorialPlayer = new Fighters(100.0, 25.0, playerName, attacksLEE);
        Fighters Kakashi = new Fighters(1000.0, 2.0, "Kakashi", attacksKAKASHI);
        System.out.println();
        System.out.println();
        System.out.println();
        kakashiTutorial(attacksLEE, in, playerName, Kakashi, tutorialPlayer);
        System.out.println("There are many clans in the Naruto world.");
        System.out.println("The one you were just using is for the Lee clan.");
        System.out.println("There are three other clans!!");
        System.out.println("Nara: Uses both fist combat and Shadow Jutsu. This will be 0");
        System.out.println("Uchiha: Known for their use of Lighting and Fire. This will be 1.");
        System.out.println("Uzumaki: Uses Wind and various other types. This will be 2");
        System.out.println("Lee will be 3");
        String[] clanChoice = new String[50];
        System.out.println("Please pick your Clan. Scroll up for refreshers.");
        clanChoice(clanChoice, in, attacksNARA, attacksLEE, attacksUCHIHA, attacksUZUMAKI);
        Fighters realPlayer = new Fighters(100.0, 25.0, playerName, clanChoice);
        Fighters Zabuza = new Fighters(75.0, 15.0, "Zabuza", attacksZabuza);
        System.out.println("Your first test is a fight against Zabuza.");
        System.out.println("Zabuza is an assassin who is known for his unique style of hiding in mist that he creats.");
        fight(in, realPlayer, clanChoice, attacksZabuza, Zabuza);
        System.out.println("You've leveled up, your power has gone up by 10.");
        realPlayer.setHP(115.0);
        System.out.println("Your health has gone up by 15");
        Fighters Pain = new Fighters(125.0, 20.0, "Pain", attacksPain);
        System.out.println("You will now fight Pain");
        System.out.println("Pain is the leader of an gang that is trying to kill you. Make sure to choose your attacks wisely.");
        System.out.println("If you die, you will have to restart.");
        fight(in, realPlayer, clanChoice, attacksPain, Pain);
        System.out.println("You've leveled up, your power has gone up by 10.");
        Fighters Kaguya = new Fighters(200.0, 20.0, "Kaguya", attacksKAGUYA);
        System.out.println("Kaguya is one of the strongest beings in the universe, be careful. You will likely die.");
        fight(in, realPlayer, clanChoice, attacksKAGUYA, Kaguya);
        System.out.println("Now, for your last battle, you will fight your master Kakashi. This should be easy, you are the best ninja in the world!!");
        Kakashi.setPOW(50.0);
        fight(in, realPlayer, clanChoice, attacksKAKASHI, Kakashi);
        //the last fight is unwinable and it is meant to frustrate the player.


        



        //int chooseAtttack = in.nextInt();
        /*if(chooseAtttack == 0){
            for(int i = 0; i < 1; i++){
                player.simpleAttack(25.0, Kakashi);
                System.out.println("Kakashi HP: " + Kakashi.getHP());
                Kakashi.villianAttack(2.0, player);
                System.out.println(playerName + " HP: " + player.getHP());*/
           // }
       // }
    }
}
