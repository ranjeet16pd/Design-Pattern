


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
}
