package com.company;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

    public class Pobieranie implements Callable {
        @Override
        public Integer call() throws Exception {
            for (int i = 0; i <10; ++i) {
                TimeUnit.MILLISECONDS.sleep(495);
                System.out.println("Trwa Pobieranie nowych zamówień... ");
            }
            return 0;

        }
    }




