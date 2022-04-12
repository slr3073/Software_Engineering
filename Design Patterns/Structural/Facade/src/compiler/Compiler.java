package compiler;

import com.sun.source.tree.BinaryTree;

public class Compiler {
    private final LexicalAnalyser lexer = new LexicalAnalyser();
    private final SyntacticAnalyser parser = new SyntacticAnalyser();
    private final SemanticAnalyser semanticAnalyser = new SemanticAnalyser();
    private final IntermediateCodeGenerator intermediateGenerator = new IntermediateCodeGenerator();
    private final CodeOptimizer optimizer = new CodeOptimizer();
    private final FinalCodeGenerator finalGenerator = new FinalCodeGenerator();

    // Easy function to use
    public String compile(String code){
        //Some really complex stuff
        String[] tokens = lexer.tokenize(code);
        BinaryTree parsedTree = parser.calculateTree(tokens);
        BinaryTree semanticCheckedTree = semanticAnalyser.checkSemantic(parsedTree);
        BinaryTree highLevelOptimizedTree = optimizer.highLevelOptimization(semanticCheckedTree, 0);
        String byteCode = intermediateGenerator.generate(highLevelOptimizedTree);
        String optimizedCode = optimizer.lowLevelOptimization(byteCode, 3);
        Byte[] bin = finalGenerator.generate(optimizedCode);

        return "0101111010101111100111001010111101010101111010101111100000010100001001\n" +
                "0101111010101111100000010101111010101011110101011111000000101011110101\n" +
                "0101100000000011100000010101111010101011110101011111000000101011110101\n" +
                "0101111010101111101111101010111101010101111010101111100000010101111010\n" +
                "0101111010101111100000010101111010101011110101011111000000101011110101\n" +
                "0101111010101111100000010101111010101011110000000111000000101011110101\n" +
                "0101111010101111100000010100000000000011110101011111000000101011110101\n" +
                "0101111010101111100000010101111010101011110101011111000000101011110101\n" +
                "0101111010101111100000010101111010101011110101011111000000101011110101\n" +
                "0101111010101111100000010101111010101011110101011111000000101011110101\n" +
                "0101111010101111100000010101111010101011110101011111000000101011110101\n" +
                "0101111010101111100000010101111010101011110101011111000000101011110101\n" +
                "0101111010101111100000010101111010101011110101011111000000101011110101\n";
    }
}
