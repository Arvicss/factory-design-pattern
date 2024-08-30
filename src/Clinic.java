import java.util.Scanner;

public class Clinic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stopper = false;

        do {
            System.out.println("Choose Operation: ");
            System.out.println("[1] Dog");
            System.out.println("[2] Cat");
            System.out.println("[3] Exit");
            System.out.print("\nChoose your pet number: ");
            int choice = scanner.nextInt();

            PetRecord petFile = new PetRecord();
            Pet pet;

            switch(choice){
                case 1: pet = new Dog();
                    petFile.setPetID("D01");
                    petFile.setPetName("Bantay");
                    petFile.setPet(pet);
                    ((Dog) pet).setBreed("German Shepperd");
                    System.out.println("Breed: " +
                            ((Dog) pet).getBreed() + "\n");
                    break;
                case 2: pet = new Cat();
                    petFile.setPetID("C01");
                    petFile.setPetName("Muning");
                    petFile.setPet(pet);
                    ((Cat) pet).setNoOfLives(9);
                    System.out.println("No. of Lives: " +
                            ((Cat) pet).getNoOfLives() + "\n");
                    break;
                case 3:
                    stopper = true;
                    System.out.println("System will now exit!");
            }
        } while(!stopper);

    }

}