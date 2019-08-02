package Adapter;

public class Canon implements IEnemy {
    @Override
    public void fire() {
        System.out.println("Canon Fire!");
    }

    @Override
    public void tankReload() {
        System.out.println("Canon Reload!");

    }
}
