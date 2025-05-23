// Digital Lock Code Challenge
// A digital lock system allows access only if the sum of the first half of the digits in the access code matches the sum of the second half.
// Given a numeric access code, determine whether it is "Valid" or "Invalid".
// Input code: "10122001"
// Output: VALID Code

class DigitalLockcodeChallenge {
    public static void main(String[] args) {
        String accessCode = "10122001"; 
        if (isValidAccessCode(accessCode)) {
            System.out.println("VALID Code");
        } else {
            System.out.println("INVALID Code");
        }
    }

    public static boolean isValidAccessCode(String code) {
        int length = code.length();
        if (length % 2 != 0) {
            return false; // Access code must have an even number of digits
        }

        int mid = length / 2;
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;

        for (int i = 0; i < mid; i++) {
            sumFirstHalf += Character.getNumericValue(code.charAt(i));
            sumSecondHalf += Character.getNumericValue(code.charAt(mid + i));
        }

        return sumFirstHalf == sumSecondHalf;
    }
}