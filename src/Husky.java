public class Husky extends Dog {

    RunningBehaviour runningBehaviour = new SlowRunningBehaviour();

    @Override
    public void run() {
//        System.out.println("Husky is running");
        runningBehaviour.run();
    }
}

// code to interfaces not implementation
