package com.dovalle.util;

import java.util.stream.IntStream;

public class MyParalelStream {
    private long startTime;
    private long endTime;
    private long resultTime;
    private IntStream myIntStream;
    private final int MAX_RANGE_FACTORIAL = 100000;


    public void showTimesOfProcessing(){
        System.out.println(String.format("\nUsing simple stream to process the factorial: %s \nSimple Stream time (milliseconds): %s \nParallel Stream time (milliseconds): %s"
                                        , this.MAX_RANGE_FACTORIAL, streamResulTime(), parallelStreamResulTime()));
    }

    private long caculateFactorial(long number){
        long factorial = 1;
        for (int count = 2; count <= number; count++) {
            factorial *= count;
        }
        return factorial;
    }

    private long streamResulTime(){
        this.startTime = System.currentTimeMillis();
        this.myIntStream = IntStream.range(1,this.MAX_RANGE_FACTORIAL);
        this.myIntStream.forEach(num -> caculateFactorial(num));
        this.endTime = System.currentTimeMillis();
        this.resultTime = this.endTime - this.startTime;

        return this.resultTime;
    }

    private long parallelStreamResulTime(){
        this.startTime = System.currentTimeMillis();
        this.myIntStream = IntStream.range(1,this.MAX_RANGE_FACTORIAL);
        this.myIntStream.parallel().forEach(num -> caculateFactorial(num));
        this.endTime = System.currentTimeMillis();
        this.resultTime = this.endTime - this.startTime;

        return this.resultTime;
    }
}
