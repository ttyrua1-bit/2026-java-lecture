package ch08.test;

public enum Operator {
    PLUS,MINUS,MULTIPLY,DIVIDE;
    public int calculate(int a, int b) {
        switch (this) {
            case PLUS:
                return a+b;
            case MINUS:
                return a-b;
            case MULTIPLY:
                return a*b;
            case DIVIDE:
                return a/b;
            default:
                return 0;
        }
//        switch (this) {
//            case PLUS -> a+b;
//            case MINUS -> a-b;
//            case MULTIPLY -> a*b;
//            case DIVIDE -> a/b;
//        }
//        if(this == PLUS) {
//            return a+b;
//        } else if(this == MINUS) {
//            return a-b;
//        } else if(this == MULTIPLY) {
//            return a*b;
//        } else if(this == DIVIDE) {
//            return a/b;
//        } else {
//            return 0;
//        }
    }

}
