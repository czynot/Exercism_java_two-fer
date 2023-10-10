public class Twofer {
    public String twofer(String name) {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        String cName = name == null ? "you" : name;
        return "One for " + cName + ", one for me.";
    }
}
