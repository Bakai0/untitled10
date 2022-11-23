public class Main {
    public static void main(String[] args) {
        Human objectA = new Human("Werty",23);
        Child objectB = new Child("Musaev",8);
        Child objectC= new Child("Assanov",4);

        objectA.life();
        objectB.life(4,"Assanov");
        objectC.life(8,"Musaev");
        System.out.println(objectA.life(4,"Assanov" + Name.Iman));
        System.out.println(objectB.life(3,"Musaev" + Name.Sultan));
        System.out.println(objectC.life(21,"Werty" + Name.Bakai));


    }
    }
