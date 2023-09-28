/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.api;

import au.org.consumerdatastandards.client.ApiCallback;
import au.org.consumerdatastandards.client.ApiException;
import au.org.consumerdatastandards.client.ApiResponse;
import au.org.consumerdatastandards.client.Pair;
import au.org.consumerdatastandards.client.model.ResponseCommonDiscoveryStatus;
import au.org.consumerdatastandards.client.model.ResponseDiscoveryOutagesList;
import com.google.gson.reflect.TypeToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonDiscoveryAPI extends UnprotectedAPI {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommonDiscoveryAPI.class);

    /**
     * Build call for getOutages
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * http.response.details
     * <table summary="Response Details" border="1">
     *    <tr>
     *        <td> Status Code </td>
     *        <td> Description </td>
     *        <td> Response Headers </td>
     *    </tr>
     *    <tr>
     *        <td> 200 </td>
     *        <td> Success </td>
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  </td>
     *    </tr>
     * </table>

*/
    public okhttp3.Call getOutagesCall(final ApiCallback _callback) throws ApiException {

        Object postBody = null;

        // create path and map variables
        String path = "/discovery/outages";

        LOGGER.trace("Building Call for getOutages with path: {}",
            path);

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        Map<String, String> headerParams = new HashMap<>();
        String[] authNames = new String[] {  };
        return apiClient.buildCall(path, "GET", queryParams, collectionQueryParams, postBody, headerParams, authNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getOutagesValidateBeforeCall(final ApiCallback _callback) throws ApiException {


        return getOutagesCall(_callback);
    }

    /**
     * Get Outages
     * Obtain a list of scheduled outages for the implementation
     * @return ResponseDiscoveryOutagesList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     * <table summary="Response Details" border="1">
     *    <tr>
     *        <td> Status Code </td>
     *        <td> Description </td>
     *        <td> Response Headers </td>
     *    </tr>
     *    <tr>
     *        <td> 200 </td>
     *        <td> Success </td>
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  </td>
     *    </tr>
     * </table>

*/
    public ResponseDiscoveryOutagesList getOutages() throws ApiException {

        LOGGER.trace("getOutages");

        ApiResponse<ResponseDiscoveryOutagesList> resp = getOutagesWithHttpInfo();
        return resp.getBody();
    }

    /**
     * Get Outages
     * Obtain a list of scheduled outages for the implementation
     * @return ApiResponse&lt;ResponseDiscoveryOutagesList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     * <table summary="Response Details" border="1">
     *    <tr>
     *        <td> Status Code </td>
     *        <td> Description </td>
     *        <td> Response Headers </td>
     *    </tr>
     *    <tr>
     *        <td> 200 </td>
     *        <td> Success </td>
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  </td>
     *    </tr>
     * </table>

*/
    public ApiResponse<ResponseDiscoveryOutagesList> getOutagesWithHttpInfo() throws ApiException {
        okhttp3.Call call = getOutagesValidateBeforeCall(null);
        Type returnType = new TypeToken<ResponseDiscoveryOutagesList>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Get Outages (asynchronously)
     * Obtain a list of scheduled outages for the implementation
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * http.response.details
     * <table summary="Response Details" border="1">
     *    <tr>
     *        <td> Status Code </td>
     *        <td> Description </td>
     *        <td> Response Headers </td>
     *    </tr>
     *    <tr>
     *        <td> 200 </td>
     *        <td> Success </td>
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  </td>
     *    </tr>
     * </table>


*/
    public okhttp3.Call getOutagesAsync(final ApiCallback<ResponseDiscoveryOutagesList> _callback) throws ApiException {

        LOGGER.trace("Asynchronously getOutages");

        okhttp3.Call call = getOutagesValidateBeforeCall(_callback);
        Type returnType = new TypeToken<ResponseDiscoveryOutagesList>(){}.getType();
        apiClient.executeAsync(call, returnType, _callback);
        return call;
    }
    /**
     * Build call for getStatus
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * http.response.details
     * <table summary="Response Details" border="1">
     *    <tr>
     *        <td> Status Code </td>
     *        <td> Description </td>
     *        <td> Response Headers </td>
     *    </tr>
     *    <tr>
     *        <td> 200 </td>
     *        <td> Success </td>
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  </td>
     *    </tr>
     * </table>

*/
    public okhttp3.Call getStatusCall(final ApiCallback _callback) throws ApiException {

        Object postBody = null;

        // create path and map variables
        String path = "/discovery/status";

        LOGGER.trace("Building Call for getStatus with path: {}",
            path);

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        Map<String, String> headerParams = new HashMap<>();
        String[] authNames = new String[] {  };
        return apiClient.buildCall(path, "GET", queryParams, collectionQueryParams, postBody, headerParams, authNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getStatusValidateBeforeCall(final ApiCallback _callback) throws ApiException {


        return getStatusCall(_callback);
    }

    /**
     * Get Status
     * Obtain a health check status for the implementation
     * @return ResponseCommonDiscoveryStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     * <table summary="Response Details" border="1">
     *    <tr>
     *        <td> Status Code </td>
     *        <td> Description </td>
     *        <td> Response Headers </td>
     *    </tr>
     *    <tr>
     *        <td> 200 </td>
     *        <td> Success </td>
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  </td>
     *    </tr>
     * </table>

*/
    public ResponseCommonDiscoveryStatus getStatus() throws ApiException {

        LOGGER.trace("getStatus");

        ApiResponse<ResponseCommonDiscoveryStatus> resp = getStatusWithHttpInfo();
        return resp.getBody();
    }

    /**
     * Get Status
     * Obtain a health check status for the implementation
     * @return ApiResponse&lt;ResponseCommonDiscoveryStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     * <table summary="Response Details" border="1">
     *    <tr>
     *        <td> Status Code </td>
     *        <td> Description </td>
     *        <td> Response Headers </td>
     *    </tr>
     *    <tr>
     *        <td> 200 </td>
     *        <td> Success </td>
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  </td>
     *    </tr>
     * </table>

*/
    public ApiResponse<ResponseCommonDiscoveryStatus> getStatusWithHttpInfo() throws ApiException {
        okhttp3.Call call = getStatusValidateBeforeCall(null);
        Type returnType = new TypeToken<ResponseCommonDiscoveryStatus>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Get Status (asynchronously)
     * Obtain a health check status for the implementation
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * http.response.details
     * <table summary="Response Details" border="1">
     *    <tr>
     *        <td> Status Code </td>
     *        <td> Description </td>
     *        <td> Response Headers </td>
     *    </tr>
     *    <tr>
     *        <td> 200 </td>
     *        <td> Success </td>
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  </td>
     *    </tr>
     * </table>
     */
    public okhttp3.Call getStatusAsync(final ApiCallback<ResponseCommonDiscoveryStatus> _callback) throws ApiException {

        LOGGER.trace("Asynchronously getStatus");

        okhttp3.Call call = getStatusValidateBeforeCall(_callback);
        Type returnType = new TypeToken<ResponseCommonDiscoveryStatus>(){}.getType();
        apiClient.executeAsync(call, returnType, _callback);
        return call;
    }
}
