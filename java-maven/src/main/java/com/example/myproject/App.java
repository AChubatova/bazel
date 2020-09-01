package com.example.myproject;

import com.google.common.primitives.Ints;

/**
 * This application compares two numbers, using the Ints.compare
 * method from Guava.
 */
public class App {

  public static int compare(int a, int b) {
    System.out.println("THIS IS A JAVA SYSTEM OUT PRINTLN FROM BAZEL TEST");
    //System.out.println("##teamcity[buildProblem flowId='20' description='Test printTCMessage failed chubatova']");
    //System.out.println("##teamcity[buildStatus status='SUCCESS' text='test_status_chubatova']");
    System.out.println("##teamcity[publishArtifacts '+:**/* => dir40step2']");
    
    return Ints.compare(a, b);

  }

  public static void main(String... args) throws Exception {
    App app = new App();
    System.out.println("Success: " + app.compare(2, 1));
  }

}
