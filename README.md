# PINCODE VALIDATION PROGRAM WITH USE OUTPUTS

Output for UseCase1: Validation of Number of digits in PIN Code
Case1:

$ java PinCodeValidation
Enter the PIN Code:
123456
Valid PIN Code

Case2:

$ java PinCodeValidation
Enter the PIN Code:
1234567
Invalid PIN Code


Output for UseCase2: Restrict Alphabet,Special Character and Zero at Start Position in PIN Code
Case1:

$ java PinCodeValidation
Enter the PIN Code:
A12345
Invalid PIN Code

Case2:
$ java PinCodeValidation
Enter the PIN Code:
012345
Invalid PIN Code

Output for UseCase3: Restrict Alphabet,Special Character at End Position in PIN Code

Case1:
$ java PinCodeValidation
Enter the PIN Code:
40008B
Invalid PIN Code

Case2:
$ java PinCodeValidation
Enter the PIN Code:
A1234B
Invalid PIN Code

Output for UseCase4: Optional Space Added in between PIN Code

Case1:
$ java PinCodeValidation
Enter the PIN Code:
305 001
Valid PIN Code

Case2:
$ java PinCodeValidation
Enter the PIN Code:
400088
Valid PIN Code
