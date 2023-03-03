import java.util.*;
class Fighters{
    private Double hp;
    private String name;
    private Double POW;
    private String[] MoveSet;
    private String type;
    private Random rand;

    public Fighters(){
        this.POW = 25.0;
        this.hp = 100.0;
        this.name = "NewName";
        this.MoveSet = new String[3];
    }
    public Fighters(Double hp, Double POW, String name, String[] MoveSet){
        this.POW = POW;
        this.hp = hp;
        this.name = name;
        this.MoveSet = MoveSet;
    }
    public void simpleAttack(Double POW, Fighters other){
        other.hp = other.hp - POW;
    }
    public void villianAttack(Double POW, Fighters other){
        Random rand = new Random();
        int x = rand.nextInt(3);
        if(x==0){
            other.hp = other.hp - (POW * .5);
        }
        else if(x==1){
            other.hp = other.hp - (POW);
        }
        else if(x==2){
            other.hp = other.hp - (POW * 1.25);
        }
    }
    public void specialAttack(Double POW, Fighters other){
        Random rand = new Random();
        int x = rand.nextInt(5);
        if(x == 0){
            other.hp = other.hp - (POW * .25);
        }
        else if(x == 1){
            other.hp = other.hp - (POW * .5);
        }
        else if(x == 2){
            other.hp = other.hp - (POW * .75);
        }
        else if(x == 3){
            other.hp = other.hp - (POW);
        }
        else if(x == 4){
            other.hp = other.hp - (POW * 1.25);
        }
    }
    public void superAttack(Double POW, Fighters other){
        Random rand = new Random();
        int x = rand.nextInt(11);
            if(x==0){
                other.hp = other.hp - (POW * 0); 
            }
            else if(x==1){
                other.hp = other.hp - (POW * .15);
            }
            else if(x==2){
                other.hp = other.hp - (POW * .25);
            }
            else if(x==3){
                other.hp = other.hp - (POW * 40);
            }
            else if(x==4){
                other.hp = other.hp - (POW * .5);
            }
            else if(x==5){
                other.hp = other.hp - (POW * .65);
            }
            else if(x==6){
                other.hp = other.hp - (POW * .75);
            }
            else if(x==7){
                other.hp = other.hp - (POW * .85);
            }
            else if(x==8){
                other.hp = other.hp - (POW);
            }
            else if(x==9){
                other.hp = other.hp - (POW * 1.25);
            }
            else if(x==10){
                other.hp = other.hp - (POW * 1.5);
            }
        }
    
    public Double getHP(){
        return this.hp;
    }
    public String getName(){
        return this.name;
    }
    public void setHP(Double hp){
        this.hp = hp;
    }
    public void setPOW(Double POW){
        this.POW = POW;
    }
    public Double getPOW(){
        return this.POW;
    }
}