package org.skexample;

import fitnesse.junit.FitNesseRunner;
import org.junit.runner.RunWith;
import org.junit.Ignore;


@RunWith(FitNesseRunner.class)
@FitNesseRunner.Suite("FrontPage.GreetingsRestApiSuite")
@FitNesseRunner.FitnesseDir(".")
@FitNesseRunner.OutputDir("./target/fitnesse-results")
public class FitNesseRunnerTest {
}
