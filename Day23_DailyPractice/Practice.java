class A{
    int x;
}
class B{
    int y;
    public static void main(String args[]){
        A ob1 = new A();
        ob1.x = 8;
        B ob2 = new B();
        ob2.y = 8566555;

        System.out.println(ob1.x * ob2.y);
    }
}