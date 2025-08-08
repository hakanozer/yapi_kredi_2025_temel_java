package com.works.useThread;

public class Job extends Thread {

    private String imagePath = "";
    public Job(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
                System.out.println("Upload : " + imagePath);
            }catch (Exception ex){}
        }
        System.out.println(imagePath + " - Finished");
    }
}
