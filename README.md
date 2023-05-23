# Guided13-Collection
Buatlah sebuah program Java menggunakan stack untuk mengubah dari notasi infix ke postfix.
Contoh Input:
a+b*(c^d-e)^(f+g*h)-i
A*(B+C)/D
Contoh Output:
abcd^e-fgh*+^*+iABC+*D/
Algoritma:122 BAB 12. Java Collection
1. Scan the infix expression from left to right.
2. If the scanned character is an operand, output it.
3. Else,
4. If the precedence of the scanned operator is greater than the precedence of the operator in the
stack(or the stack is empty or the stack contains a ‘(‘ ), push it.
5. Else, Pop all the operators from the stack which are greater than or equal to in precedence
than that of the scanned operator. After doing that Push the scanned operator to the stack. (If
you encounter parenthesis while popping then stop there and push the scanned operator in
the stack.)
6. If the scanned character is an ‘(‘, push it to the stack.
7. If the scanned character is an ‘)’, pop the stack and and output it until a ‘(‘ is encountered,
and discard both the parenthesis.
8. Repeat steps 2-6 until infix expression is scanned.
9. Print the output
10. Pop and output from the stack until it is not empty
