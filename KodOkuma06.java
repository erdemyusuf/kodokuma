package kodokuma;

public class KodOkuma06 {

        String language;

        // constructor with no parameter
        KodOkuma06() {
            this.language = "Java";
        }

        // constructor with a single parameter
        KodOkuma06(String language) {
            this.language = language;
        }

        public void getName() {
            System.out.println("Programming Langauage: " + this.language);
        }

        public static void main(String[] args) {

            // call constructor with no parameter
            KodOkuma06 obj1 = new KodOkuma06();

            // call constructor with a single parameter
            KodOkuma06 obj2 = new KodOkuma06("Python");

            obj1.getName();
            obj2.getName();
        }
    }

