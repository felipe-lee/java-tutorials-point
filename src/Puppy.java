public class Puppy {
    int puppyAge;

    public Puppy(String name) {
        System.out.println("Passed name is: " + name);
    }

    public static void main(String[] args) {
        Puppy myPuppy = new Puppy("tommy");

        myPuppy.setPuppyAge(2);

        myPuppy.getPuppyAge();

        System.out.println("Variable value: " + myPuppy.puppyAge);
    }

    public int getPuppyAge() {
        System.out.println("Puppy's age is: " + puppyAge);
        return puppyAge;
    }

    public void setPuppyAge(int age) {
        puppyAge = age;
    }
}
