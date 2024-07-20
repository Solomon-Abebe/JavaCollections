package Classes.Inheritance.CompositeClasses;

    // Component classes
    class Engine {
        public void start() {
            System.out.println("Engine started.");
        }

        public void stop() {
            System.out.println("Engine stopped.");
        }
    }

    class Wheels {
        public void rotate() {
            System.out.println("Wheels rotating.");
        }

        public void stop() {
        }
    }

    // Composite class (Car)
    class Car {
        private Engine engine;
        private Wheels wheels;

        public Car(Engine engine, Wheels wheels) {
            this.engine = engine;
            this.wheels = wheels;
        }

        public void drive() {
            engine.start();
            wheels.rotate();
            System.out.println("Car is driving.");
        }

        public void stop() {
            engine.stop();
            wheels.stop(); // Assuming a stop() method in Wheels
            System.out.println("Car has stopped.");
        }
    }

    // Usage
     class Main {
        public static void main(String[] args) {
            Engine myEngine = new Engine();
            Wheels myWheels = new Wheels();

            Car myCar = new Car(myEngine, myWheels);
            myCar.drive(); // Output: Engine started. Wheels rotating. Car is driving.
            myCar.stop();  // Output: Engine stopped. Wheels stopped. Car has stopped.
        }
    }


