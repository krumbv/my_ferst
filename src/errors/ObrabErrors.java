package errors;

public class ObrabErrors {
    public static void main(String[] args) {

        try {


            int catNumber;
            int zero;
            int[] numbers = new int[5];
            numbers[3] = 45;
            System.out.println(numbers[6]);
        }
        catch (Exception r){
            final String message = r.getMessage();
        }
        finally {
            System.out.println("Блок finally");
        }
        System.out.println("программа завершена");

    }





   /*     try {
    {
        catNumber = 1; // у меня один кот
        zero = 0; // ноль, он и в Африке ноль
        int result = catNumber / zero;
        System.out.println("Не увидите это сообщение!");
    }
        catch (Arithmetic Exception e) {
       // Toast.makeText(this, "Нельзя котов делить на ноль!", Toast.LENGTH_LONG).show();
        System.out.println("Нельзя котов делить на ноль!");
    }
        Toast.makeText(this, "Жизнь продолжается", Toast.LENGTH_LONG).show();
       try{
        throw new MyException("моя первая ошибка");

    }

       catch(MyException e){
        System.out.println(e.getMessage());
        }

    }*/
}

    class MyException extends Exception {
        public MyException(String message) {
            super(message);
        }
    }

