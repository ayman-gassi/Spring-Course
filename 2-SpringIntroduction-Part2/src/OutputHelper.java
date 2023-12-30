
public class OutputHelper {
    IOutputGenerator outputGenerator;

    public OutputHelper(IOutputGenerator io) {
        this.outputGenerator = io;
    }

    public void setGenerator(IOutputGenerator outputGenerator){
        this.outputGenerator = outputGenerator;
    }
    
    public void generateOutput(){
        outputGenerator.generateOutput();
    }
}
