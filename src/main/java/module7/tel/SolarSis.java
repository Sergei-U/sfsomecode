package module7.tel;

public class SolarSis {
    static Planet[] planets;

    public static void main(String[] args) {
        planets = new Planet[2];
        planets[0] = new Earth();
        planets[1] = new Mars();
        for (Planet planet :
                planets) {
            if (planet instanceof WaterAble) {
                System.out.println(((WaterAble) planet).getWater());
                System.out.println(planet);
            }
        }
    }
}
