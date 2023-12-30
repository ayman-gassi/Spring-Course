
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("dataHandlerConfig.cfg"));

            // Fetch les noms des classes depuis ficher de config
            Class OutputGeneratorClass = Class.forName(sc.nextLine());
            Class GenHelperClass = Class.forName(sc.nextLine());

            // Instantiation de outPutGenerator
            IOutputGenerator outputGenerator = (IOutputGenerator) OutputGeneratorClass.newInstance();
            OutputGeneratorHelper outputHelper = (OutputGeneratorHelper) GenHelperClass.newInstance();

            // appel de helper function
            outputHelper.setGenerator(outputGenerator);
            outputHelper.generateOutput();
            
            sc.close();
        } catch (FileNotFoundException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        
    }
}
