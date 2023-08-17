package mvss.samples.models;

import java.util.Objects;

public class Box {
    public static int STANDARD_DIMENSION = 1;

    static {
        System.out.println("Initializing class " + Box.class.getName());
    }

    private int length;
    private int width;
    private int height;

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return length == box.length && width == box.width && height == box.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width, height);
    }

    @Override
    public String toString() {
        return "Box{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    public synchronized  static int myPrivateMethod() {
        return 210909;
    }
}
