package sample.animal.base;

public abstract class Animal {

   protected AnimalBase animalBase = new AnimalBase();
   private String kind;

   public String getKind() {
      return kind;
   }

   public void setKind(String kind) {
      this.kind = kind;
   }


   public Animal(String kind) {
      this.kind = kind;
   }

   public void printKind() {
      System.out.println("I am a " + kind);
   }

   public abstract void eat();
   public abstract void makeSound();
}
