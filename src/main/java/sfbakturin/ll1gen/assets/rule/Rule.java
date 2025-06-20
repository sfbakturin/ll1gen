package sfbakturin.ll1gen.assets.rule;

import java.util.ArrayList;
import java.util.List;

public final class Rule {
	public final List<Field> arguments;
	public final Field returnArg;
	public final List<List<Statement>> statements;

	public Rule(final Field returnArg) {
		this.arguments = new ArrayList<>();
		this.returnArg = returnArg;
		this.statements = new ArrayList<>();
	}

	public void addArg(final Field arg) {
		this.arguments.add(arg);
	}

	public void addStmt(final List<Statement> stmt) {
		this.statements.add(stmt);
	}
}
