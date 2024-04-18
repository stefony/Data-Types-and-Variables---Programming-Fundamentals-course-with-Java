# Data-Types-and-Variables---Programming-Fundamentals-course-with-Java
Courses from my education Java fundamental  in @SoftUni

Problems for exercises Data Types and Variables
1.	Convert Meters to Kilometers
You will be given an integer that will be a distance in meters. Write a program that converts meters to kilometers formatted to the second decimal point.
2.	Pounds to Dollars
Write a program that converts British pounds to US dollars formatted to the 3rd decimal point.
1 British Pound = 1.36 Dollars
3.	Exact Sum of Real Numbers
Write a program to enter n numbers and calculate and print their exact sum (without rounding).Data Types and Type Conversion
4.	Town Info
You will be given 3 lines of input. On the first line, you will be given the name of the town, on the second – the population, and on the third – the area. Use the correct data types and print the result in the following format:
"Town {town name} has population of {population} and area {area} square km.".
5.	Concat Names
Read two names and a delimiter. Print the names joined by the delimiter
6.	Chars to String
Write a program that reads 3 lines of input. On each line, you get a single character. Combine all the characters into one string and print it on the console.
7.	Reversed Chars
Write a program that takes 3 lines of characters and prints them in reversed order with a space between them
8.	Lower or Upper
Write a program that prints whether a given character is upper-case or lower-case.
9.	Centuries to Minutes
Write a program to enter an integer number of centuries and convert it to years, days, hours, and minutes
10.	Special Numbers
A number is special when its sum of digits is 5, 7, or 11.
Write a program to read an integer n and for all numbers in the range 1…n to print the number and if it is special or not (True / False).
11.	Refactor Volume of Pyramid 
You are given a working code that finds the volume of a pyramid. However, you should consider that the variables exceed their optimum span and have improper naming. Also, search for variables that have multiple purposes.
12.	Refactor Special Numbers
You are given a working code that is a solution to Problem 9. Special Numbers. However, the variables are improperly named, declared before they are needed, and some of them are used for multiple things. Without using your previous solution, modify the code so that it is easy to read and understand.
13.	Integer Operations
Read four integer numbers. Add first to the second, divide (integer) the sum by the third number, and multiply the result by the fourth number. Print the result.
14.	Sum Digits
You will be given a single integer. Your task is to find the sum of its digits.
15.	Elevator
Calculate how many courses will be needed to elevate n persons by using an elevator with a capacity of p persons. 
The input holds two lines: the number of people n and the capacity p of the elevator.
16.	Sum of Chars
Write a program that sums the ASCII codes of n characters. Print the sum on the console.
17.	Print Part of the ASCII Table
Find online more information about ASCII (American Standard Code for Information Interchange) and write a program that prints part of the ASCII table of characters at the console.  
On the first line of input, you will receive the char index you should start with, and on the second line - the index of the last character you should print.
18.	Triples of Latin Letters
Write a program to read an integer n and print all triples of the first n small Latin letters, ordered alphabetically
19.	Water Overflow
You have a water tank with a capacity of 255 liters. 
On the next n lines, you will receive liters of water, which you must pour into your tank. 
If the capacity is not enough, print "Insufficient capacity!" and continue reading the next line. On the last line, print the liters in the tank.
20.	Beer Kegs
Write a program that calculates the volume of n beer kegs. 
You will receive in total 3 * n lines. Every three lines will hold information for a single keg. 
First up is the model of the keg, after that is the radius of the keg, and lastly is the height of the keg.
Calculate the volume using the following formula: π * r^2 * h. 
In the end, print the model of the biggest keg.
21.	Spice Must Flow 
Write a program that calculates the total amount of spice extracted from a source. 
The source has a starting yield, which indicates how much spice can be mined on the first day. After it has been mined for a day, the yield drops by 10, meaning on the second day, it'll produce 10 less spice than on the first, on the third day 10 less than on the second, and so on (see examples). 
A source is considered profitable only while its yield is at least 100 – when less than 100 spices are expected in a day, abandon the source. 
The mining crew consumes 26 spices every day at the end of their shift and an additional 26 after the mine has been exhausted. Note that the workers cannot consume more spice than there is in storage. 
When the operation is complete, print on the console on two separate lines how many days the mine has operated and the total amount of spice extracted. 
22.	Poke Mon
A Poke Mon is a special type of pokemon which likes to Poke others. But at the end of the day, the Poke Mon wants to keep statistics about how many pokes it has managed to make.
The Poke Mon pokes his target and then proceeds to poke another target. The distance between his targets reduces his poke power.
You will be given the poke power the Poke Mon has, N – an integer.
Then you will be given the distance between the poke targets, M – an integer.
Then you will be given the exhaustionFactor Y – an integer.
Your task is to start subtracting M from N until N becomes less than M, i.e. the Poke Mon does not have enough power to reach the next target. 
Every time you subtract M from N, that means you've reached a target and poked it successfully. COUNT how many targets you've poked – you'll need that count.
The Poke Mon becomes gradually more exhausted. IF N becomes equal to EXACTLY 50 % of its original value, you must divide N by Y, if it is POSSIBLE. This DIVISION is between integers.
If a division is not possible, you should NOT do it. Instead, you should continue subtracting.
After dividing, you should continue subtracting from N, until it becomes less than M.
When N becomes less than M, you must take what has remained of N and the count of targets you've poked and print them as output
23.	Snowballs
Tony and Andi love playing in the snow and having snowball fights, but they always argue about which makes the best snowballs. They have decided to involve you in their fray by making you write a program that calculates snowball data and outputs the best snowball value.
You will receive N – an integer, the number of snowballs being made by Tony and Andi.
For each snowball, you will receive 3 input lines:
•	On the first line, you will get the snowballSnow – an integer.
•	On the second line, you will get the snowballTime – an integer.
•	On the third line, you will get the snowballQuality – an integer.
For each snowball, you must calculate its snowballValue by the following formula:
(snowballSnow / snowballTime) ^ snowballQuality
In the end, you must print the highest calculated snowballValue

.


