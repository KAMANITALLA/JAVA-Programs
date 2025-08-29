/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package threads;


public class ThreadExample {
    public static void main(String[] args) {
        // Création de quatre threads
        Thread thread1 = new Thread(new Task("Thread 1"));
        Thread thread2 = new Thread(new Task("Thread 2"));
        Thread thread3 = new Thread(new Task("Thread 3"));
        Thread thread4 = new Thread(new Task("Thread 4"));

        // Démarrage des threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        // Attendre la fin de tous les threads
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            System.err.println("Un thread a été interrompu.");
        }

        System.out.println("Tous les threads ont terminé leur exécution.");
    }
}

// Classe de tâche qui sera exécutée par les threads
class Task implements Runnable {
    private final String threadName;

    public Task(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        System.out.println(threadName + " est en cours d'exécution.");
        try {
            // Simuler une tâche avec un délai de 1 seconde
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.println(threadName + " a été interrompu.");
        }
        System.out.println(threadName + " a terminé son exécution.");
    }
}
