package gen3;

import org.antlr.v4.runtime.tree.TerminalNode;

public class TableMakerVisitor extends JSON3BaseVisitor<String> {

    @Override
    public String visitMember(JSON3Parser.MemberContext ctx) {
        TerminalNode identifier = ctx.STRING();
        JSON3Parser.ValueContext value = ctx.value();
        System.out.println(identifier.getSymbol() + ", " + value);
        return super.visitMember(ctx);
    }

    @Override
    public String visitValue(JSON3Parser.ValueContext ctx) {
        //System.out.println(ctx.STRING());
        return super.visitValue(ctx);
    }

    @Override
    public String visitNumber(JSON3Parser.NumberContext ctx) {
        //System.out.println(ctx);
        return super.visitNumber(ctx);
    }
}
