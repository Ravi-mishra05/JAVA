package T5_Interfaces;

public class Car implements Engine, Media, Break {

    @Override
    public void acc() {
        // TODO Auto-generated method stub
        System.out.println("accelarated");

    }

    @Override
    public void start() {
        // TODO Auto-generated method stub
        System.out.println("started");

    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        System.out.println("stopped");
    }

    @Override
    public void brake() {
        // TODO Auto-generated method stub
        System.out.println("brake done");

    }

}
