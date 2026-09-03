


interface Character {
    String getAbilities();
}


class Mario implements Character {

    @Override
    public String getAbilities() {
        return "Mario";
    }
}


abstract class Decorator implements Character {
    Character ch;

    public Decorator(Character ch) {
        this.ch = ch;
    }

}


//concrete class
class HeightUp extends Decorator {

    HeightUp(Character character) {
        super(character);
    }

    public String getAbilities() {
        return ch.getAbilities() + "with HeightUp";
    }

}

class GunPowerUp extends Decorator {
    GunPowerUp(Character character) {
        super(character);
    }

    public String getAbilities() {
        return ch.getAbilities() + "with GunPower";
    }
}


class StartPowerUp extends Decorator {
    StartPowerUp(Character character) {
        super(character);
    }

    public String getAbilities() {
        return ch.getAbilities() + "with StartPower";
    }
}


public class DecoratorDesignPatternMain {

    public static void main(String[] args) {
        Character mario = new Mario();
        System.out.println("Basic Character: " + mario.getAbilities());

        mario = new HeightUp(mario);
        System.out.println("After HeightUp: " + mario.getAbilities());

        // Decorate Mario further with a GunPowerUp.
        mario = new GunPowerUp(mario);
        System.out.println("After GunPowerUp: " + mario.getAbilities());

        // Finally, add a StarPowerUp decoration.
        mario = new StartPowerUp(mario);
        System.out.println("After StarPowerUp: " + mario.getAbilities());
    }

}
