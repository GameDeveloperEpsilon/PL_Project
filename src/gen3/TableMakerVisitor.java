package gen3;

import java.util.HashMap;

public class TableMakerVisitor extends JSON3BaseVisitor<String> {

    public HashMap<String, String> table = new HashMap<>();

    @Override
    public String visitMember(JSON3Parser.MemberContext ctx) {
        String member = ctx.getText();
        String key = member.split(":")[0];
        String value = member.split(":")[1];
        table.put(key, value);
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
