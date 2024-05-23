class carThread implements Runnable {
    final String brand;
    final String model;
    final double price;

    public carThread(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.price = 2.50;
    }

    public void run() {
        int i = 0;
        while (i < 5) {
            System.out.println("Car is running");
            try {
                Thread.sleep(300);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }

    public static void main(String[] args) {
       Thread audiBrand = new Thread(new carThread("Audi", "A6"));
       Thread bmwBrand = new Thread(new carThread("BMW", "classS"));
        audiBrand.start();
        bmwBrand.start();

        System.out.println("CarThreads are running...");
    }
}