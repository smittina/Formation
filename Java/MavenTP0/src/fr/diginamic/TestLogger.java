package fr.diginamic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLogger {

	private static final Logger LOG = LoggerFactory.getLogger(TestLogger.class);
	
	public static void main(String[] args) {
		LOG.info("Bonjour Slf4J !");
		LOG.info("Implémentation LogBack");

	}

}
