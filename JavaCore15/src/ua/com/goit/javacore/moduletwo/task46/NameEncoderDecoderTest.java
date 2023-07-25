package ua.com.goit.javacore.moduletwo.task46;

public class NameEncoderDecoderTest {
    public static void main(String[] args) {
        NameEncoderDecoder ned = new NameEncoderDecoder();
        System.out.println(ned.encode("Crab").equals("NOTFORYOUCr5bYESNOTFORYOU") + "\n" +
                ned.decode("NOTFORYOUCr5bYESNOTFORYOU").equals("Crab") + "\n" +
                ned.decode("NOTFORYOUNOTFORYOUYESNOTFORYOU").equals("NOTFORYOU"));
}
}
