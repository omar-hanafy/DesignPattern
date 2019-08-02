package Adapter;

public class GaintAdapter implements IEnemy {
    Gaint gaint;

    GaintAdapter(Gaint gaint1) {
        this.gaint = gaint1;

    }

    @Override
    public void fire() {
        this.gaint.Hit();
    }

    @Override
    public void tankReload() {
        this.gaint.Rest();
    }
}
