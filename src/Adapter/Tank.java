package Adapter;

public class Tank implements IEnemy {
    @Override
    public void fire() {
        System.out.println("Tank Fire!");
    }

    @Override
    public void tankReload() {
        System.out.println("Tank Reload!");

    }
}
