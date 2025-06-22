package Solid.di;

public class Flipkart {
//    RazorpayAPI razorpayAPI = new RazorpayAPI();

//    PayUAPI payUAPI = new PayUAPI();

//    All the API will work on the PaymentAPI 

//    PaymentAPI api = new RPayAPIAdapter();

    PaymentAPI api = new PayUAPIAdapter();

    void pay () {

//        razorpayAPI.enterCardDetails("01010101",
//                "111",
//                "ABC",
//                "01/25"
//        );

//        PayUAPI.putCardDetails (010101010101,
//                01,
//                2025,
//                11,
//                "Aman"
//        );

        api.insertCardValues(
                "010100110L",
                01,
                2025,
                121,
                "Aman"

        );

//        razorpayAPI.initiatePayment(1010010010L);

        api.startTransaction(123);


//        while (razorpayAPI.checkStatus(01010L) != true) {
////            pause
//        }

        while (api.checkCompletion(123) != true){

        }

    }

}
