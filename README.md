FitNesse Tests for REST APIs
============================


This is a small project that pulls together the pieces
required to create FitNesse Tests for REST APIs. This
should help get started on how to include FitNesse Tests
within a typical mvn build cycle. This uses the very 
convenient Rest Fixture from https://github.com/smartrics/RestFixture


If there's no FitNesse directory where the wiki would be 
at the root of the project, then we will need to get it.
These steps also help you if you'd like to start the wiki 
fresh dropping anything that's already in this project.
We can do that easily by getting FitNesse via the maven 
dependencies. After we do, we start FitNesse using the start.sh 
script and that will bootstrap the FitNesse wiki.

1. mvn clean package
   (with @Ignore the test in FitnesseTestRunner.java)
   This will pull Fitnesse via maven dependencies.
2. run fitnesse with start.sh
   This will setup FitNesse in this directory which
   is also configured as such in FitnesseTestRunner.
3. open the wiki at the port
4. create the fit tests
5. then on mvn test will run the tests via FitNesseRunner

For everthing FitNesse, see http://fitnesse.org/.

For documentation on the Rest Fixture, see:
* http://github.com/smartrics/RestFixtureLiveDoc
* http://github.com/smartrics/RestFixture

In this example, we have a GreetingsRestApiSuite
which then has on test page HelloApiTest.

These can be run in two ways:

Wiki
----
1. Start the wiki using the start.sh script
2. Open the GreetingRestApiSuite page
3. Click the Test button

Maven Command Line
------------------

The Test Suite is configured to run via the FitNesseRunnerTest
which is setup to run as typical java test. So, running mvn test
will execute the FitNesse wiki test in memory.

In both cases, since we are making calls to the REST Endpoint,
make sure you are running the app that will respond to the
REST API invocation. E.g. java -jar target/fitnesse-0.0.0-SNAPSHOT.jar

It's a little hard to have the app that you are building to be
running...so please treat this example as just that -- an example.
One way to handle ths would be to run a copy of the app at a
different port and adjust that port in the tests. When putting
this together, I ran the app in the IDE and then I ran the tests
via mvn test or off the wiki.

