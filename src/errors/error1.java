package errors;

public class error1
{
    public static void main(String[] args) {
        try {
            throw new DoterErrors("У попоа собака");
        } catch (DoterErrors doterErrors) {
            System.out.println(doterErrors.getMessage());
        }




    }

}