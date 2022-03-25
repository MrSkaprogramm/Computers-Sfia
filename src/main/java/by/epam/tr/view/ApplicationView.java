package by.epam.tr.view;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import by.epam.tr.controller.Controller;
import by.epam.tr.controller.ParsingController;

public class ApplicationView {
  private static final String CHOISE_REGEXP = "[0-9]+";
  private Scanner sc = new Scanner(System.in);
  private Controller controller = new ParsingController();
  private String request;
  private String menuAnswer;
  private Logger logger = LogManager.getLogger(ApplicationView.class);

  public void applicationMenu() {
    logger.info("Welcome to XML File prser application!" + "\n" + "Select method to parse file:"
        + "Press 1 to select DOM method" + "\n" + "Press 2 to select SAX method" + "\n"
        + "Press 3 to select StAX method" + "\n" + "Press 4 to read using JAXB" + "\n"
        + "Press any other number to exit");
    String choise = sc.nextLine();

    if (choise.matches(CHOISE_REGEXP) && Integer.valueOf(choise) == 1) {
      request = "DOMParse";
      menuAnswer = controller.doAction(request);
      logger.info(menuAnswer);
      logger.info("File successfully parsed!");
      applicationMenu();
    } else if (choise.matches(CHOISE_REGEXP) && Integer.valueOf(choise) == 2) {
      request = "SAXParse";
      menuAnswer = controller.doAction(request);
      logger.info(menuAnswer);
      logger.info("File successfully parsed!");
      applicationMenu();
    } else if (choise.matches(CHOISE_REGEXP) && Integer.valueOf(choise) == 3) {
      request = "StAXParse";
      menuAnswer = controller.doAction(request);
      logger.info(menuAnswer);
      logger.info("File successfully parsed!");
      applicationMenu();
    } else if (choise.matches(CHOISE_REGEXP) && Integer.valueOf(choise) == 3) {
      request = "StAXParse";
      menuAnswer = controller.doAction(request);
      logger.info(menuAnswer);
      logger.info("File successfully parsed!");
      applicationMenu();
    } else if (choise.matches(CHOISE_REGEXP) && Integer.valueOf(choise) == 4) {
      request = "JAXBRead";
      menuAnswer = controller.doAction(request);
      logger.info(menuAnswer);
      logger.info("File successfully parsed!");
      applicationMenu();
    } else if (!choise.matches(CHOISE_REGEXP)) {
      applicationMenu();
    } else {
      logger.info("Have a nice day!");
      return;
    }
  }
}
