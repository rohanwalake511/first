public static class Player {
    int id;
    String name;
    int phoneNo;

    public void display(){
        System.out.println(name+" "+id+" "+phoneNo);
    }
}
class testPlayer{
    public static void main(String[] args) {
        Player p1=new Player();
        p1.id=100;
        p1.name="Rohan";
        p1.phoneNo=28711717;
        p1.display();
    }

}
