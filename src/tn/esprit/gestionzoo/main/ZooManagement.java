package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.entities.Zoo;
public class ZooManagement
{
    //int nbrCages=20;
    //String zooName="my zoo";

    public static void main(String[] args) {


       // Aquatic aquatic = new Aquatic("aquatic","aq",10,true,"ocean");
        Terrestrial terrestrial = new Terrestrial("terrestrial","ter",15,true,4);
        Dolphin dolphin = new Dolphin("aquatic","aq",10,true,"a",50);
        Penguin penguin = new Penguin("aquatic", "alex", 10, true ,"belvedere", 15);
        Zoo z= new Zoo("Belvedere", "Tunis");

        Dolphin a = new Dolphin("aquatic","aq",10,true,"a",50);
        Penguin b = new Penguin("aquatic","aq2",10,true ,"belvedere", 15);
        z.addAquaticAnimal(a);
        z.addAquaticAnimal(b);

        a.swim();
        b.swim();

        z.displayNumberOfAquaticsByType();
        if(a.equals(b)==true)
        {
            System.out.println(a.getName() + " est identique à "+ b.getName() );
        }
        else
        {
            System.out.println(a.getName() + " est différent de "+ b.getName() );
        }
        /* lion= new Animal("lion","Alex",10,true);
        Animal tiger= new Animal("Tiger","John",5,true);
        Zoo zoo=new Zoo(" Africa", "Mourouj");
        zoo.addAnimal(lion);
        zoo.addAnimal(tiger);


        System.out.println("Le nombre d'animaux est : " +zoo.getNbrAnimal());

        Animal singe=new Animal("singe","Bob",5,true);
        zoo.addAnimal(singe);
        System.out.println("L'index de l'animal est : "+zoo.searchAnimal(singe));
        zoo.displayAnimals();
        Animal singe1=new Animal("singe","Bob",5,true);
        zoo.addAnimal(singe1);
        System.out.println("L'index de l'animal identique est : "+zoo.searchAnimal(singe1));
        zoo.removeAnimal(singe);
        zoo.displayAnimals();
        if(zoo.isZooFull())
        {
            System.out.println("Le zoo est plein");
        }
        else
        {
            System.out.println("Le zoo contient " + zoo.getNbrAnimal() + " animaux");
        }
        Zoo z1= new Zoo("Excellence", "Mourouj");
        Zoo z2= new Zoo("Belvedere", "Mourouj");
        z1.addAnimal(tiger);
        z1.addAnimal(lion);
        z2.addAnimal(lion);

        zoo.comparerZoo(z1,z2);
*/




       // tn.esprit.gestionzoo.main.ZooManagement zm=new tn.esprit.gestionzoo.main.ZooManagement();
       // Scanner sc=new Scanner(System.in);

        /*tn.esprit.gestionzoo.entities.Animal lionn=new tn.esprit.gestionzoo.entities.Animal();
        tn.esprit.gestionzoo.entities.Zoo zooo.new tn.esprit.gestionzoo.entities.Zoo();
        lionn.family="Carnivore";
        lionn.name="Alex";
        lionn.age="15";
        lionn.isMammal=true;
        zooo.name="Belvedere";
        zooo.nbrCages=25;
        zooo.city="Tunis";
        tn.esprit.gestionzoo.entities.Animal lion=new tn.esprit.gestionzoo.entities.Animal("Carnivore","Alex",10,true);
        tn.esprit.gestionzoo.entities.Zoo myZoo=new tn.esprit.gestionzoo.entities.Zoo("tn.esprit.gestionzoo.entities.Zoo Africa", "Mourouj", 25);
        System.out.println(lion.toString());*/

        /*System.out.println("Donnez le nombre de cages");
        while (!sc.hasNextInt()) {
            System.out.println("Entrée invalide. Veuillez entrer un nombre entier.");
            sc.nextInt();
        }
        zm.nbrCages = sc.nextInt();
        sc.nextLine();


        System.out.println("Donnez le nom du zoo");
        while (true) {
            zm.zooName = sc.nextLine();
            if (zm.zooName.trim().isEmpty()) {
                System.out.println("Entrée invalide. Veuillez entrer un nom valide.");
            } else {
                break;
            }
        }

        System.out.println(zm.zooName + " comporte " + zm.nbrCages + " cages");
*/
    }

}

