package main.java.module6.b;

public abstract class Vector {
    int x1, y1, z1, x2, y2, z2;

    public Vector(int x1, int y1, int z1, int x2, int y2, int z2) {
        this.x1 = x1;
        this.y1 = y1;
        this.z1 = z1;
        this.x2 = x2;
        this.y2 = y2;
        this.z2 = z2;
    }

    public abstract double getLength();
    abstract String getVectorCords();
}

class Vector2D extends Vector {

    public Vector2D(int x1, int y1, int x2, int y2) { super(x1, y1, 0, x2, y2, 0); }

    @Override
    public double getLength() { return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)); }

    @Override
    public String getVectorCords() { return (x2 - x1) + " " + (y2 - y1); }

    public double getScalarProduct(Vector2D vector2D) {
        String cords = getVectorCords();
        String cords2 = vector2D.getVectorCords();


        return Integer.parseInt(cords.split(" ")[0]) * Integer.parseInt(cords2.split(" ")[0]) +
                Integer.parseInt(cords2.split(" ")[1]) * Integer.parseInt(cords.split(" ")[1]);
    }

    public double getAngle(Vector2D vector2D) {
        if (getLength() != 0 && vector2D.getLength() != 0) {
            return getScalarProduct(vector2D) / (this.getLength() * vector2D.getLength());
        } else return -2.0;
    }
}


class Vector3D extends Vector {

    public Vector3D(int x1, int y1, int z1, int x2, int y2, int z2) {
        super(x1, y1, z1, x2, y2, z2); }

    @Override
    public double getLength() {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)) + Math.pow(z1 - z2, 2); }

    @Override
    public String getVectorCords() {
        return (x2 - x1) + " " + (y2 -y1) + " " +(z2 - z1); }

    public double getScalarProduct(Vector3D vector3D) {
        String cords = getVectorCords();
        String cords2 = vector3D.getVectorCords();
        int a = Integer.parseInt(cords.split(" ")[0]) * Integer.parseInt(cords2.split(" ")[0]);
        int b = Integer.parseInt(cords2.split(" ")[1]) * Integer.parseInt(cords.split(" ")[1]);
        int c = Integer.parseInt(cords.split(" ")[2]) * Integer.parseInt(cords2.split(" ")[2]);
        return a + b + c;
    }
}