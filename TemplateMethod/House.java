package TemplateMethod;

public abstract class House {
    protected String doors;
    protected int windows;
    protected String walls;
    protected boolean roof;
    protected boolean foundation;
    protected String color;
    protected String decoration;
    
    public House(String doors, int windows, String walls, boolean roof, boolean foundation, String color, String decoration) {
        this.doors = doors;
        this.windows = windows;
        this.walls = walls;
        this.roof = roof;
        this.foundation = foundation;
        this.color = color;
        this.decoration = decoration;
    }
    
    public House() {
    }
    
    public final void buildHouse() {
        constructFoundation();
        if (this.foundation) {
            constructWalls();
        }
    
        if (this.walls != null) {
            constructRoof();
            constructWindows();
            constructDoors();
            decorateHouse();
            paintHouse();
        }
    }
    
    public abstract void decorateHouse();
    
    public abstract void paintHouse();
    
    public abstract void constructDoors();
    
    public abstract void constructWindows();
    
    public abstract void constructWalls();
    
    public final void constructRoof() {
        this.roof = true;
    }
    
    public final void constructFoundation() {
        this.foundation = true;
    }
    
    public String getDoors() {
        return doors;
    }
    
    public int getWindows() {
        return windows;
    }
    
    public String getWalls() {
        return walls;
    }
    
    public boolean hasRoof() {
        return roof;
    }
    
    public boolean hasFoundation() {
        return foundation;
    }
    
    public String getColor() {
        return color;
    }
    
    public String getDecoration() {
        return decoration;
    }
    
    protected void setDoors(String doors) {
        this.doors = doors;
    }
    
    protected void setWindows(int windows) {
        this.windows = windows;
    }
    
    protected void setWalls(String walls) {
        this.walls = walls;
    }
    
    protected void setRoof(boolean roof) {
        this.roof = roof;
    }
    
    protected void setFoundation(boolean foundation) {
        this.foundation = foundation;
    }
    
    protected void setColor(String color) {
        this.color = color;
    }
    
    protected void setDecoration(String decoration) {
        this.decoration = decoration;
    }
    
    @Override
    public String toString() {
        return "\nPropriedades da casa:\n" +
                "portas\t" + doors +
                "\njanelas\t" + windows +
                "\nparedes\t" + walls +
                "\nteto\t" + roof +
                "\nbase\t" + foundation +
                "\ncor\t" + color +
                "\ndecoracao\t" + decoration;
    }
}