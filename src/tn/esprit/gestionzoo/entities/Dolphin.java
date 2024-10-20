package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    protected float swimmingSpeed;
    public Dolphin() {}

    public Dolphin(String family, String name, int age, boolean isMammal ,String habitat, float swimmingSpeed) {
        super(family,name,age,isMammal,habitat);
        this.swimmingSpeed = swimmingSpeed;
    }
    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    @Override
    public String toString() {
        return "Dolphin{" +
                super.toString() +
                "swimmingSpeed=" + swimmingSpeed +
                '}';
    }
    @Override
    public void swim()
    {
        System.out.println("This dolphin is swimming");
    }
}
