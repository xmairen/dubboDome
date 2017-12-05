package com.buddo;

import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;

/**
 * Created by CWGJ008 on 2017/10/13.
 */
public class TestMain {
    public static final void  main(String [] args){

        JavaSamplerContext arg0 = new JavaSamplerContext(new Arguments());

        Dubbo_port test=new Dubbo_port();
        test.setupTest(arg0);
        test.runTest(arg0);

    }
}