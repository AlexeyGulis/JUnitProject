package by.academy.hmwk7.task3.listner;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class RunnerListener extends BlockJUnit4ClassRunner {
    private CalculatorTestListener calculatorTestListener;
    public RunnerListener(Class<CalculatorTestListener> ctl) throws InitializationError {
        super(ctl);
        calculatorTestListener = new CalculatorTestListener();
    }

    @Override
    public void run(RunNotifier notifier) {
        notifier.addListener(calculatorTestListener);
        super.run(notifier);
    }
}
