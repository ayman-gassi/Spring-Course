
public class OutputGeneratorHelper {
    IOutputGenerator outputGenerator;
    
    public void setGenerator(IOutputGenerator outputGenerator){
        this.outputGenerator = outputGenerator;
    }
    
    public void generateOutput(){
        outputGenerator.generateOutput();
    }
}
