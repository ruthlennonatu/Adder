

Create a program with a chatgpt prompt:
I want to build a very simple web application in Java that adds two numbers.

Use:

Java 21

Spring Boot

Maven

Thymeleaf

A normal HTML form submission

No JavaScript

No AJAX

No CSS or styling

No unnecessary libraries, classes, or complexity

The application should be beginner-friendly and as minimal as possible.

Existing Java class

I already have this class:

public class Adder {
    public static int add(int a, int b) {
        return a + b;
    }
}


Use the existing Adder.add() method to perform the actual addition. Do not duplicate the addition logic in the controller.

Remove any unused imports from the class.

Web interface

The web page should contain only:

A label for the first number

A number input for the first number

A label for the second number

A number input for the second number

An "Add" button

The calculated result

The user enters two numbers and clicks Add.

Use a standard HTML <form> with method="post".

The page should reload after the form is submitted. Do not use JavaScript, AJAX, REST APIs, or client-side calculation.

Spring Boot implementation

Create only these Java classes:

Adder.java

AdderApplication.java

AdderController.java

Use the package:

com.example.adder


The controller should:

Handle GET / and display index.html.

Handle POST /.

Receive the two form values as integers.

Explicitly specify the request parameter names using:

@RequestParam(name = "a") int a
@RequestParam(name = "b") int b


Do not rely on Java compiler parameter-name discovery.

The controller should call:

Adder.add(a, b)


and place the result into the Thymeleaf model using the attribute name:

result


Then return the index view.

Thymeleaf template

The file must be located exactly at:

src/main/resources/templates/index.html


Do not put it in src/main/resources directly or under src/main/java.

The HTML form inputs must have names that exactly match the controller parameters:

name="a"
name="b"


Use Thymeleaf only to display the result, for example:

<p th:if="${result != null}">
    Result: <span th:text="${result}"></span>
</p>

Project structure

Provide this exact recommended structure:
'''
adder/
├── pom.xml
└── src/
    └── main/
        ├── java/
        │   └── com/
        │       └── example/
        │           └── adder/
        │               ├── Adder.java
        │               ├── AdderApplication.java
        │               └── AdderController.java
        └── resources/
            └── templates/
                └── index.html

'''
Maven configuration

Provide a complete pom.xml.

It must:

Use Spring Boot.

Set Java version to 21.

Include spring-boot-starter-web.

Include spring-boot-starter-thymeleaf.

Include the spring-boot-maven-plugin.

Keep the Maven configuration minimal.

Important compatibility requirement

The project must be compatible with Java 21.

Do not require Java 24 or another Java version.

Required output

Provide the complete contents of every file:

pom.xml

src/main/java/com/example/adder/Adder.java

src/main/java/com/example/adder/AdderApplication.java

src/main/java/com/example/adder/AdderController.java

src/main/resources/templates/index.html

Show each file in its own code block.

Also show the complete project directory structure.

Provide the Maven command to start the application:

mvn spring-boot:run


Tell me to run that command from the directory containing pom.xml.

Provide the URL:

http://localhost:8080


Explain briefly how the request flows:

HTML form
    ↓
POST /
    ↓
AdderController
    ↓
Adder.add(a, b)
    ↓
result added to Model
    ↓
Thymeleaf renders index.html
    ↓
Browser displays result


Do not add error handling, validation, styling, JavaScript, databases, REST endpoints, or other features unless they are required for the application to work.

Before presenting the final code, check carefully that:

index.html is under src/main/resources/templates/.

The HTML form uses method="post" and action="/".

The first input has name="a".

The second input has name="b".

The controller uses @RequestParam(name = "a").

The controller uses @RequestParam(name = "b").

The controller calls Adder.add(a, b).

The controller adds the result to the model as "result".

The controller returns "index".

There is no JavaScript.

There is no client-side addition.

The project uses Java 21.

The Maven project contains the Spring Boot Maven plugin.

## Test the code so far
The application can be started with 
    mvn spring-boot:run.
When complete run the program from here: http://localhost:8080/
If it doesn't work get your LLM to debug the issue


# Next Prompt
adder/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── example/
│   │               └── adder/
│   │                   └── Adder.java
│   │
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── adder/
│                       ├── AdderTest.java
│                       └── AdderTestSuite.java
│
└── pom.xml

For the java class only, write unit tests. Include one unit test for security. Put the unit tests in an appropriate folder structure. Include a test suite. Provide the full updated pom.xml.

## run
In the top level adder folder run the tests.
mvn test

## Test the code so far
If it doesn't work get your LLM to debug the issue

# Git
In the adder folder initialise it as a git repo.
check the status and run git add .
git commit -m "Initial version of adder application"
create a github repo (note to edit for your github account name
git remote add origin https://github.com/yourgithubaccountname/Adder
check the status
git push -u origin main


# Questions
## How long did it take for this simple program?
## Did the llm produce good code?
## Did it test the code well?
## Was it secure, have good performance, clean code...


The application is accessible at http://localhost:8080.


# Java Extension Packs
In visual studio code add the module called Java Extension pack
If you like also install Extension Pack for Java Auto Config; the security restrictions on ATU will block this extension.
If your vscode is set up correctly (not ATU machines) you should see a blue 'play' button beside the tests in order to run them. If mvn test worked but you don't see the button it is most likely a fault with the set up of vscode and the relevant extensions.


# Other languages
You can do this lab in any of your preferred languages, just modify the instructions appropriatly. I will only provide sample notes for Java.
Python is another easy example. 
