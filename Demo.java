
class A extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("A");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("B");
        }
    }
}

class Demo {
    public static void main(String[] args) {
        A obj = new A();
        obj.start();
        // obj.setPriority(Thread.MAX_PRIORITY);
        B obj1 = new B();
        obj1.start();
    }
}