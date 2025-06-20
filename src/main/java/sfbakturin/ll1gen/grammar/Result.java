package sfbakturin.ll1gen.grammar;

import java.util.Map;

import sfbakturin.ll1gen.assets.rule.Rule;
import sfbakturin.ll1gen.assets.term.TerminalNode;

public record Result(String grammar, String start, Map<String, TerminalNode> terminals,
                     Map<String, Rule> rules) {
}
