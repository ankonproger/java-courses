public class Calculator {
    private int result;

    public void add(int ... params) {
        for (Integer param : params) {
            this.result += param;
        }
    }

    public void sub(int ... params) {
        if (this.result == 0) {
            this.result = params[0] - params[1];
        }
        else {
            for (Integer param : params) {
                this.result -= param;
            }
        }
    }

    public void mult(int ... params) {
        if (this.result == 0) {
            this.result = params[0] * params[1];
        }
        else {
            for (Integer param : params) {
                this.result *= param;
            }
        }
    }

    public void div(int ... params) {
        if (this.result == 0) {
            this.result = params[0] / params[1];
        }
        else {
            for (Integer param : params) {
                this.result /= param;
            }
        }
    }

    public int getResult() {
        return this.result;
    }

    public void cleanResult() {
        this.result = 0;
    }
}