package sisiend;

public class StringParse {

    public static void main(String[] args) {
        //Stringi parsimine
        String  numberAsString = "2022";
        System.out.println("numberAsString =" + numberAsString);

        //Integer on int wrapper klass
        int number = Integer.parseInt(numberAsString);
        System.out.println("Number = " + number);

        numberAsString += 1; //"2022"; 1->"1"; "2022" + "1"; 20221"
        number +=1; // 2022 + 1; 2023
        System.out.println("numberAsString =" + numberAsString);
        System.out.println("Number = " + number);

        String doubleAsString = "2022.125";
        double doubleNumber = Double.parseDouble(doubleAsString);
        System.out.println("doubleAsString = " + doubleAsString);
        System.out.println("doubleNumber = " + doubleNumber);


        doubleAsString +=1;
        doubleNumber +=1;
        System.out.println("doubleAsString = " + doubleAsString);
        System.out.println("doubleNumber = " + doubleNumber);


    }

}
