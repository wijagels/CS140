package lab09;

public class Driver {
    public static AnimalFarm go(String[] names, int[] ages) {
        AnimalFarm a = new AnimalFarm();
        if(names.length != ages.length) return null;
        for(int i = 0;i < names.length;i++)
            a.addAnimal(new Bunny(names[i], ages[i]));
        return a;
    }
}
