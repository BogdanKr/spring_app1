package ua.krasun.springtest;

public class UkraineMusic implements Music{

    private void initMethod(){
        System.out.println("Init Ukraine music bean");
    }
    private void destroyMethod(){
        System.out.println("Destroy method");
    }

    @Override
    public String getSong() {
        return "This is Ukraine music";
    }
}
