package soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="Soap")
public class Soap {
    @WebMethod(operationName = "getNumber")
    public float getNumber(@WebParam(name = "parameter") String parameter) {
        return 23.0f;
    }
}
