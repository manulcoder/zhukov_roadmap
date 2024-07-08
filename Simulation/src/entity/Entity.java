package entity;

abstract public class Entity {

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
