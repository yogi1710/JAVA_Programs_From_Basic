import java.util.function.Supplier;

class SupplierRandomOTP {
    public static void main(String args[]){
        // Generate a random OTP of 6 digits using Supplier
        Supplier<String> s  =  ()-> {
            String otp = "";   
            for(int i=0;i<6;i++){
                otp += (int)(Math.random()*10);
            }
            return otp;
        };
        System.out.println(s.get());
    }
}