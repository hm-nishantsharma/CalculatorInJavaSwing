# CalculatorInJavaSwing
Calculator App created using Java's Swing in Grid Layout.

Functioning of this Calculator App:

1. User Input: The application accepts user input through both keyboard and dedicated calculator app buttons.

2. Data Representation: User input is processed as a single string representing the mathematical expression.

3. Expression Parsing: The string is parsed into three distinct components: the first operand (Num1), the operator, and the second operand (Num2).

4. Operand Evaluation: Both Num1 and Num2 are converted to integer data types for accurate calculation. The resulting value (res) is stored as a string and assigned back to the original input string, effectively updating the displayed expression.

5. Backspace Functionality: The backspace button removes the last character from the input string, dynamically adjusting its length.

6. Output and Error Display: The label between the input field and the backspace button serves as the primary output interface, displaying both calculated results and informative messages in case of invalid input or errors.

7. Negative Number Handling: The "(+/-)" button allows entering and performing mathematical operations on negative integers, enhancing the calculator's functionality.

8. Reset Function: The reset button performs a complete system reset, clearing the input string, all internal variables, and counters within the calculator class, effectively creating a clean slate for a new calculation.

9. Screenshot of Calculator App
![Calculator App Pic](https://github.com/empereurns/CalculatorInJavaSwing/assets/78228291/9d06c10a-358d-48dc-8598-fb6562894443)
