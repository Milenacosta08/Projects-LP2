package TemplateMethod;

public class GlassWallHouse extends House {
    @Override
    public void constructWalls() {
        this.walls = "parede de vidro";
    }
    
    @Override
    public void constructDoors() {
        this.doors = "porta de vidro";
    }
    
    @Override
    public void decorateHouse() {
        this.decoration = "minimalista";
    }
    
    @Override
    public void paintHouse() {
        this.color = "branco";
    }
    
    @Override
    public void constructWindows() {
        this.windows = 6;
    }
}
