public interface fizz {
    void getFizz(int form, int to);

}

class Console implements fizz {
    @Override
    public void getFizz(int form, int to) {
        for ( int numeros = 0; numeros <= to; numeros++)
        if ( numeros % 3 == 0 && numeros % 5 == 0) {
            System.out.println("FizzBuzz: " + numeros);

        } else if (numeros % 3 == 0) {
            System.out.println("Buzz: " + numeros);

        } else if ( numeros % 5 == 0) {
            System.out.println("Fizz: " + numeros);

        } else
        System.out.println( numeros);

    }
}

class Main {
    public static void main(String[] args) {
        Console console = new Console();
        console.getFizz(1, 100);


    }
}
