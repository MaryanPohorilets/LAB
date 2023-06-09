# Laboratory work 7

# Description
This project involves the following tasks:

1. We will provide a taxi service. So, to start our service, we need cars. 
   - Create a car class with fields: car brand, engine power, driver, price, year of manufacture.
   - Create a driver class with fields: name, age, driving experience.
   !!!!!Types of data for each field must be selected independently. Classes must have all the necessary set of methods, including constructors.
   - Create at least 10 and no more than 20 machines. When creating objects, use constructors with parameters. Put all our created cars in an ArrayList.
   - Repair the motor to half of the fleet, which will increase the power of the cars by 10% (reassignment of the power field). Hire new drivers for repaired cars (reassign the driver field).
   - Next, you need to take every second car (use a loop with a step of 2 and the size() method), and make it increase the engine power by 10% and the price by 5%.
   - After that, check the experience of ALL our drivers. If the driver's experience is less than 5 years, but his age is more than 25, then it is necessary to send him to advanced training courses, which will increase his experience by 1 year.
   - It is necessary to create a helper class, where to write a method that accepts an array of cars as a parameter and selects a random element from this array ( new Random().nextInt(cars.length); cars is the name of the array of cars (substitute your own)).
   - After the element is found, you need to display the text in the console in the style of "Car *model* with driver *name* left for you." Next, pass this car to the following method, which will output to the console "Driver *name* has arrived at the location"


2. Write a Phone Book program that will store names and phone numbers using the HashMap class.
   Try the following Map operations:
   - put (K key, V value) - adds an element to the map;
   - get (Object key) - searches for a value by its key;
   - remove (Object key) - removes the value by its key;
   - containsKey (Object key) - asks whether the given key is in the map;
   - containsValue (Object value) - asks if there is a specified value in the map;
   - size () - returns the size of the map (the number of "key-value" pairs).
   
   To do this, add at least 10 names and phone numbers to the book.
   Output, using a loop, information from the book.
   Find the given number in the book by last name. If the last name is missing, the message "There is no such subscriber in the book" should be displayed on the screen. Delete any record from the book. Display the number of entries in the book.
# Requirements
To run this project, your computer must have:
Java Development Kit (JDK) version [insert version number here]

# Instructions for creation
Clone the repository to your local machine using
```
git clone https://github.com/MaryanPohorilets/LAB/Lab7.git
```
Navigate to the project root directory in your terminal
Run the following command to create the project:
```
build
```

# Instructions for starting
Clone the repository to your PC using
```
git clone https://github.com/MaryanPohorilets/LAB/Lab7.git
```
open the project in a programming environment that is convenient for you and run it.
# Results
__Task 1:__


__Output data:__

![Task1](https://github.com/MaryanPohorilets/LAB/blob/main/Lab7/images/Task1.jpg)

__Task 2:__


__Output data:__

![Task2](https://github.com/MaryanPohorilets/LAB/blob/main/Lab7/images/Task2.jpg)


# Support
If you encounter any problems during the project, please contact us at maryanpogorilez@gmail.com.
