package synchronize;

public class mainSynchronize {
    final MathClass mathClass = new MathClass();
    public mainSynchronize(){
        Runnable r = new Runnable() {
            @Override
            public void run() {
                try{
                    mathClass.printNumbers(3);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        new Thread(r,"ONE").start();
        new Thread(r,"TWO").start();
    }

}
