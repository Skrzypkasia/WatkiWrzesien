package com.company;

import java.util.concurrent.*;

public class Zakonczenie implements Callable {

    public Integer call() throws Exception {
        TimeUnit.SECONDS.sleep(8);
        System.out.println("Zrobione. Wszystkie Twoje zamówienia zostały pobrane.");
        return 0;


    }
};

