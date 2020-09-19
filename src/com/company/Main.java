package com.company;


import java.util.concurrent.*;


public class Main {


    public static void main(String[] args) throws InterruptedException {
        System.out.println("Witamy w Menedżerze Twojego sklepu internetowego!");
        Runnable runnable = () -> {
            boolean interrupted = false;
            while (!interrupted) {
                try {
                    TimeUnit.SECONDS.sleep(1);

                } catch (InterruptedException e) {
                    System.out.println("__________");
                    interrupted = true;
                }
                System.out.println("Ładowanie... Proszę czekać...");
            }

        };
        Thread thread = new Thread(runnable);
        thread.start();
        TimeUnit.SECONDS.sleep(4);
        thread.interrupt();




        ExecutorService service = Executors.newFixedThreadPool(5);

        service.submit(new Pobieranie());



        Future<Integer> result = service.submit(new Zakonczenie());




        Callable<Integer> callable = () -> {
            int money = 1;

            for (int i = 0; i < 20; i++) {
                money += Math.random() * 100;
                TimeUnit.MILLISECONDS.sleep(265);
                System.out.println("Ktoś własnie złożył zamówienie za " + money + "zł");
            }

            return money;
        };

        try {
            callable.call();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}


