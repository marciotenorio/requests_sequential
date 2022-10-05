package request;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

public class MyIPSequentialBenchmark {
    @org.openjdk.jmh.annotations.Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @Fork(value = 20, warmups = 1)
    @Warmup(iterations = 2)
    @Measurement(iterations = 2)
    @OutputTimeUnit(TimeUnit.SECONDS)
    public void init(){
        for (int i = 0; i < 10; i++) {
            Requester requester = new Requester();
            requester.run();
        }
    }
}
