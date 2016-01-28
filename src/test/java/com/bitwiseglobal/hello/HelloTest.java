package com.bitwiseglobal.hello;

import com.bitwiseglobal.Hello;

/**
 * Created by balajeev on 1/28/2016.
 */
public class HelloTest {

    public void checkIfYouHaveSaidHelloToTheWorld()
    {
        //given
        Hello hello=new Hello();

        //when
        hello.printMessage();
    }
}
