# ArtificialLife

This is a life stimulation, created in Java by Jacob Estabrook, Anushka Kulshreshtha, with help from Elise Bargman, Kedam Habte, Sam A. Rebelsky, Allie Rogers, stackOverflow for exception info https://stackoverflow.com/questions/218384/what-is-a-nullpointerexception-and-how-do-i-fix-it, relevant reading from CSC207.2019S and relevant Oracle javadocs. It tests the stimulation for a population of Cooperators, Defectors and Partial Cooperators, for a specified number of trials. These values are specified on the command-line. We do not run different seeds for random because our program design makes the seed from the current time stamp.

TEST #1
100 iterations, Population size 10,  1 Cooperator, 9 Defectors

Prediction: none

Test 1.1:

After 100 ticks:
Cooperators = 3
Defectors = 7
Partial Cooperators = 0

Mean Cooperation Probability = 0.3

1.2: 0.3
1.3: 0.3
1.4: 0.3
1.5: 0.3
1.6: 0.2
1.7: 0.2
1.8: 0.1
1.9: 0.3
1.10: 0.1
Average of means: 0.24

We didn't have a prediction for this one because we did not expect the cooperators to change. The result therefore differs from our expectation.

TEST #2.1
100 iterations, Population size 10,  1 Cooperator, 9 Defectors

Prediction: The numbers would remain the same because the cooperators are unlikely to die.

Result:

After 100 ticks:
Cooperators = 9
Defectors = 1
Partial Cooperators = 0

Mean Cooperation Probability = 0.9

2.2: 0.9
2.3: 0.9
2.4: 1
2.5: 1
2.6: 0.9
2.7: 1
2.8: 0.9
2.9: 1
2.10: 1
Average of means: 0.95

Our prediction proved correct because the odds of cooperators being replaced by defectors were extremely low.

TEST #3
100 iterations, Population size 10,  3 Cooperators, 3 Defectors, 4 Partial Cooperators

Prediction: The numbers would not remain the same because the distribution is somewhat balanced.

Result:

After 100 ticks:
Cooperators = 6
Defectors = 3
Partial Cooperators = 1

Mean Cooperation Probability = 0.65

3.2: 0.6
3.3: 0.7
3.4: 0.75
3.5: 0.65
3.6: 0.55
3.7: 0.55
3.8: 0.75
3.9: 0.55
3.10: 0.55
Average of means: 0.63

Our prediction proved true insofar as the numbers changed but we didn't know which types would dominate.

TEST #4
100 iterations, Population size 100,  35 Cooperators, 35 Defectors, 30 Partial Cooperators

Prediction: The cooperators would outnumber everything else because we have partial cooperators in the mix.

Result:

After 100 ticks:
Cooperators = 42
Defectors = 31
Partial Cooperators = 27

Mean Cooperation Probability = 0.56

4.2: 0.53
4.3: 0.56
4.4: 0.55
4.5: 0.55
4.6: 0.55
4.7: 0.53
4.8: 0.55
4.9: 0.55
4.10: 0.53
Average of means: 0.546

Our prediction proved true, but not to the extent that we had anticipated. Maybe increasing the number of rounds would have resulted in a higher proportion of cooperators.

TEST #5
100 iterations, Population size 100,  1 Cooperators, 99 Defectors, 0 Partial Cooperators

Prediction: The cooperators would remain alive because there are many defectors.

Result:

After 100 ticks:
Cooperators = 1
Defectors = 99
Partial Cooperators = 0

Mean Cooperation Probability = 0.01

5.2: 0.02
5.3: 0.01
5.4: 0.01
5.5: 0.02
5.6: 0.01
5.7: 0.01
5.8: 0.01
5.9: 0.01
5.10: 0.01
Average of means: 0.011

Our prediction proved true for the same reason as Test 1.

TEST #6
100 iterations, Population size 100,  99 Cooperators, 1 Defectors, 0 Partial Cooperators

Prediction: The defectors die.
Result:

After 100 ticks:
Cooperators = 100
Defectors = 0
Partial Cooperators = 0

Mean Cooperation Probability = 1

6.2: 0.99
6.3: 0.99
6.4: 0.99
6.5: 0.99
6.6: 1
6.7: 0.99
6.8: 0.99
6.9: 0.99
6.10: 0.99

Average of means: 0.992

Our prediction proved false for the same reason as Test 2. We had thought that the likelihood of defectors vanishing would increase with the large cooperator number, but it proved wrong.

TEST #7 (to demonstrate that the model with 99 defectors for Test #5 does change at some point)

1000 iterations, Population size 100,  1 Cooperators, 99 Defectors, 0 Partial Cooperators

Result:

After 1000 ticks:
Cooperators = 3
Defectors = 97
Partial Cooperators = 0

Mean Cooperation Probability = 0.03
