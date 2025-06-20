package sfbakturin.ll1gen.assets.rule;

public final class Statement {
	public final boolean isTerminal;
	public final String objectName;
	public String args;
	public String code;

	public Statement(final boolean isTerminal, final String objectName) {
		this.isTerminal = isTerminal;
		this.objectName = objectName;
		this.args = null;
		this.code = null;
	}
}
