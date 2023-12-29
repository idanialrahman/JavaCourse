
/*public class StringBufferUsingForLoop {
    public static void main(String[] args) {
        String Value= "Yes";
        StringBuffer stringBuffer= new StringBuffer(Value);
        stringBuffer.append("I am Danial and Tell me about you:");
        for (int i=0; i<stringBuffer.length();i++){
            char Telme= stringBuffer.charAt(i);
            stringBuffer.append(Telme);

        }
        break;
        System.out.println(stringBuffer.toString());
    }
}*/

public class StringBufferUsingForLoop {
    public static void main(String[] args) {
        String value = "Yes";
        StringBuffer stringBuffer = new StringBuffer(value);
        stringBuffer.append("I am Danial and Tell me about you:");

        for (int i = 0; i < stringBuffer.length(); i++) {
            char currentChar = stringBuffer.charAt(i);
            stringBuffer.append(currentChar);

            // Example: Break the loop when the character ':' is encountered
            if (currentChar == ':') {
                break;
            }
        }

        System.out.println(stringBuffer.toString());
    }
}

