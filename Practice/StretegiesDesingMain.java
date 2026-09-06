//strategies : 1
interface WalkableRobot {
    void walk();
}

//concreteImplementation
class NormalWalk implements WalkableRobot {

    @Override
    public void walk() {
        System.out.println("Normal Walk");
    }
}

class NoWalk implements WalkableRobot {
    @Override
    public void walk() {
        System.out.println("No Walk Robot");
    }
}

//Strategies : 02
interface FlyableRobot {
    public void fly();
}

//Concrete Implementation
class NonFlyRobot implements FlyableRobot {
    @Override
    public void fly() {
        System.out.println("This Robot is not able to fly");
    }
}

class ZigZagFlyRobot implements FlyableRobot {
    @Override
    public void fly() {
        System.out.println("This robot can fly in Zig-Zag Way");
    }
}


// Strategies : 03
interface TalkableRobot {
    public void talk();
}

//Concrete Implementation
class NormalTalk implements TalkableRobot {
    @Override
    public void talk() {
        System.out.println("This robot can normally talk");
    }
}

class NoTalk implements TalkableRobot {
    @Override
    public void talk() {
        System.out.println("This robot is not able to talk");
    }
}


// Cliet Robot
abstract class Robot {
    private WalkableRobot walkableRobotBehaviour;
    private TalkableRobot talkableRobotBehaviour;
    private FlyableRobot flyableRobotBehaviour;

    Robot(WalkableRobot w, TalkableRobot t, FlyableRobot f) {
        walkableRobotBehaviour = w;
        talkableRobotBehaviour = t;
        flyableRobotBehaviour = f;
    }

    public void walk() {
        walkableRobotBehaviour.walk();
    }

    public void talk() {
        talkableRobotBehaviour.talk();
    }

    public void fly() {
        flyableRobotBehaviour.fly();
    }


    public abstract void projection();
}

class CompaniounRobot extends Robot{
    CompaniounRobot(WalkableRobot w, TalkableRobot t ,FlyableRobot f){
        super(w,t,f);
    }

    public void projection(){
        System.out.println("Displaying friendly companion Robot");
    }
}

class WorkerRobot extends Robot{
    WorkerRobot(WalkableRobot w, TalkableRobot t ,FlyableRobot f){
        super(w,t,f);
    }

    public void projection(){
        System.out.println("Displaying friendly  worker Robot");
    }
}

public class StretegiesDesingMain {

    public static void main(String[] args){
        Robot robot1= new CompaniounRobot(new NormalWalk(),new NormalTalk(),new NonFlyRobot());
        robot1.walk();
        robot1.talk();
        robot1.fly();;

    }
}

