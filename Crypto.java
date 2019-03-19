class Crypto {
    public String s;

    public String acceptor(String sntnc) {
        String s;
        s = sntnc;
        return null;

    }

    public String encrypt(String sntnc) {
        sntnc = sntnc.replaceAll("V", "ag',r");
        sntnc = sntnc.replaceAll("v", "ag',r");
        sntnc = sntnc.replaceAll("M", "ssad");
        sntnc = sntnc.replaceAll("m", "ssad");
        sntnc = sntnc.replaceAll("G", "jeb..w");
        sntnc = sntnc.replaceAll("g", "jeb..w");
        sntnc = sntnc.replaceAll("B", "dug>?/");
        sntnc = sntnc.replaceAll("b", "dug>?/");

        return sntnc;
    }

    public String decrypt(String sntnc) {

        s = sntnc.replaceAll("ag',r", "V");
        s = sntnc.replaceAll("ag',r", "V");
        s = sntnc.replaceAll("ssad", "M");
        s = sntnc.replaceAll("ssad", "m");
        s = sntnc.replaceAll("jeb..w", "g");
        s = sntnc.replaceAll("jeb..w", "G");
        s = sntnc.replaceAll("dug>?/", "B");
        s = sntnc.replaceAll("dug>?/", "b");

        return sntnc;
    }

}