package benchmark;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
public class MyIPSequentialBenchmark {

    @Param({"10", "50", "100", "250", "500"})
    public int iterations;


    @org.openjdk.jmh.annotations.Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @Fork(1)
    @Warmup(iterations = 2)
    @OutputTimeUnit(TimeUnit.SECONDS)
    public void init(){

        for (int i = 0; i < iterations; i++) {
            Requester requester = new Requester();
            requester.run();
        }
    }
}
