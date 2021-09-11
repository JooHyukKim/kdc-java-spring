package chapter4;

class GenericOperator {

    public GenericOperator() {

    }

    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public int divide(int x, int y) {
        return x / y;
    }
}

enum Operation {
    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE;
}


class ConditionalOperator extends GenericOperator {

    int x;
    int y;

    public ConditionalOperator(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public int perform(Operation operation) {
        if (operation.equals(Operation.ADD)) {
            return add(x, y);
        } else if (operation.equals(Operation.SUBTRACT)) {
            return subtract(x, y);
        } else if (operation.equals(Operation.MULTIPLY)) {
            return multiply(x, y);
        } else {
            return divide(x, y);
        }
    }

}

class SwitchOperator extends GenericOperator {
    int x;
    int y;

    public SwitchOperator(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public int perform(Operation operation) {
        switch (operation) {
            case ADD:
                return add(x, y);
            case SUBTRACT:
                return subtract(x, y);
            case DIVIDE:
                return divide(x, y);
            case MULTIPLY:
                return multiply(x, y);
            default:
                return 0;
        }
    }
}

public class Q1 {

    public static void main(String[] args) {
        SwitchOperator switchOperator = new SwitchOperator(1, 2);
        System.out.println(switchOperator.perform(Operation.ADD));
        System.out.println(switchOperator.perform(Operation.SUBTRACT));
        System.out.println(switchOperator.perform(Operation.DIVIDE));
        System.out.println(switchOperator.perform(Operation.MULTIPLY));

        ConditionalOperator conditionalOperator = new ConditionalOperator(1, 2);
        System.out.println(conditionalOperator.perform(Operation.ADD));
        System.out.println(conditionalOperator.perform(Operation.SUBTRACT));
        System.out.println(conditionalOperator.perform(Operation.DIVIDE));
        System.out.println(conditionalOperator.perform(Operation.MULTIPLY));
    }
}
