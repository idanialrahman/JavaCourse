
public class StringBufferExample {

    public static void main(String[] args) {
        String Value = "Hello:";
      StringBuffer stringBuffer= new StringBuffer(Value);

      stringBuffer.append("World:");
      stringBuffer.insert(11," My name is Danial :");

        System.out.println(stringBuffer);

        stringBuffer.append("Yeah I am intrested to learn new Technology:");// Append used to add the another text with it:

        System.out.println(stringBuffer);

        stringBuffer.delete(6, 11); // In this we are giving the charater Number from where we can delete and where

        System.out.println(stringBuffer);

        stringBuffer.reverse(); // Reversing the sentence the start is come to end

        System.out.println(stringBuffer);

    }
}

