package adapters;

import api.Nhan2soResponse;
import nhan2so.OutputData;
import nhan2so.OutputInterface;

public class Nhan2SoPresenterAPI implements OutputInterface {

    private final Nhan2soResponse responseModel;

    public Nhan2SoPresenterAPI(Nhan2soResponse responseModel) {
        this.responseModel = responseModel;
    }

    @Override
    public void present(OutputData output) {
        // Formatting, mapping and error handling would go here
        responseModel.setResult(output.result);
        responseModel.setMessage("OK");
        responseModel.setSuccess(true);
    }
}