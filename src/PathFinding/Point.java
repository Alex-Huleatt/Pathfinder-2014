/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PathFinding;

/**
 * Integer based coordinate.
 * @author alexhuleatt
 */
public class Point {

    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Point && ((Point) o).x == x && ((Point) o).y == y);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.x;
        hash = 59 * hash + this.y;
        return hash;
    }
    
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
