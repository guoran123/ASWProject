package ui.rule;

import java.util.HashMap;

import com.actionsoft.awf.commons.expression.ExpressionAbst;

public class CombineString extends ExpressionAbst {

	@SuppressWarnings("rawtypes")
	public CombineString(HashMap paramMaps, String expressionValue) {
		super(paramMaps, expressionValue);
		// TODO Auto-generated constructor stub
	}
	
	public String expressionParse(String expression) {

		String firstStr = getParameter(expression, 1).trim();

		String secondStr = getParameter(expression, 2).trim();

		return firstStr + secondStr;
	}

}
