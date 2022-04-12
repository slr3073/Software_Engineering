import compiler.Compiler;

public class Application {

    public static void main(String[] args) {
        String my_code = "public class Application {\n" +
                "\n" +
                "    public static void main(String[] args) {\n" +
                "        System.out.println(\"Hello world !\");\n" +
                "    }\n" +
                "}";
        Compiler compiler = new Compiler();
        System.out.println(compiler.compile(my_code));
    }
}
