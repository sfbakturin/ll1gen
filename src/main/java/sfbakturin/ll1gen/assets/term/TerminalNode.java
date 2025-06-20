package sfbakturin.ll1gen.assets.term;

public interface TerminalNode {
	boolean isRegular();

	boolean isString();

	boolean isEpsilon();

	boolean isStart();

	String asString();

	String name();

	String create(String grammar, String name);
}
