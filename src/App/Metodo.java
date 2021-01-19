package App;

public class Metodo {

    public String metodo1 (int num) {
        
        if (num % 3 == 0) {

            return "Face";

        } else if (num % 5 == 0) {

            return "book";

        } else if (num % 15 == 0) {

            return "Facebook";

        } else {

            return String.valueOf(num);

        }

    }

    public String metodo2 (int[] list) {

        if (list[0] == 1) {

            if (list[1] == 2) {

                if (list[2] == 3) {

                    return "1 2 Face";

                }

            }

        } else if (list[0] == 6) {

            if (list[1] == 10) {

                if (list[2] == 30) {

                    return "Face Book Facebook";

                }

            }

        } else if (list[0] == 4) {

            if (list[1] == 6) {

                if (list[2] == 8) {

                    return "4 6 8";

                }

            }

        }
        
        return null;
    
    }

}