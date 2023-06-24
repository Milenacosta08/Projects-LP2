package TemplateMethod;

public class ConcreteWallHouse extends House {
    @Override
    public void constructWalls() {
        this.walls = "parede de concreto";
    }
    
    @Override
    public void constructDoors() {
        this.doors = "porta de madeira";
    }
    
    @Override
    public void decorateHouse() {
        this.decoration = "moderna";
    }
    
    @Override
    public void paintHouse() {
        this.color = "salmão";
    }

    @Override
    public void constructWindows() {
        this.windows = 4;
    }
}
