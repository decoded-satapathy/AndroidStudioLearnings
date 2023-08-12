package Theads;

public class ThreadsLearning {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
        
            @Override
            public void run(){
                for(int i=0 ; i<5 ; i++){
                    System.out.println("The i in worker thread is : "+i);
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        });
        // thread.start();
        for(int i=0 ; i<5 ; i++){
                    System.out.println("The i in main/ui thread is : "+i);
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
    }
}
