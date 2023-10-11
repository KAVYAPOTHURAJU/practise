class Calculator {
    def add(double num1, double num2) {
        return num1 + num2
    }

    def subtract(double num1, double num2) {
        return num1 - num2
    }

    def multiply(double num1, double num2) {
        return num1 * num2
    }

    def divide(double num1, double num2) {
        if (num2 == 0) {
            return "Division by zero is not allowed."
        } else {
            return num1 / num2
        }
    }
}

def calculator = new Calculator()

println("Basic Calculator in Groovy")
println("1. Addition")
println("2. Subtraction")
println("3. Multiplication")
println("4. Division")

print("Enter your choice (1/2/3/4): ")
def choice = System.in.withReader { it.readLine() } as int

print("Enter the first number: ")
def num1 = System.in.withReader { it.readLine() } as double

print("Enter the second number: ")
def num2 = System.in.withReader { it.readLine() } as double

def result

switch (choice) {
    case 1:
        result = calculator.add(num1, num2)
        break
    case 2:
        result = calculator.subtract(num1, num2)
        break
    case 3:
        result = calculator.multiply(num1, num2)
        break
    case 4:
        result = calculator.divide(num1, num2)
        break`qa
    default:
        result = "Invalid choice"
}

println("Result: $result")
