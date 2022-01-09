package org.example.java_jenkins_in_docker1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {
		@Test
		public void testInputIsEven(){
		assertTrue(App.checkIfInputIsAnEvenNumber(22)); //
		}
}