public class Main {

  public static void main(String[] args) {
    ContactManager dudeman = new ContactManager();
    Contact rusty = new Contact("Rusty", "000");
    dudeman.add(rusty);
    dudeman.writeDudes();
  }
}
