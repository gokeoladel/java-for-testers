package com.serenitydojo;

import org.junit.Ignore;
import org.junit.Test;

public class WhenCreatingObjects {
    @Test
    public void whenDogGetFed(){
        Dog fido = new Dog("Fido","Bone",5);
        fido.isFed();
//        fido.isFed
    }

    @Test
    public void whenDogMakeNoise(){
       Dog dogNoise = new Dog("Fido", "Bone",5);
       dogNoise.makeNoise();

    }
}
