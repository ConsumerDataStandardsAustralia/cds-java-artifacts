/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.api.banking;

import au.org.consumerdatastandards.client.ApiCallback;
import au.org.consumerdatastandards.client.ApiException;
import au.org.consumerdatastandards.client.ApiResponse;
import au.org.consumerdatastandards.client.Pair;
import au.org.consumerdatastandards.client.api.ProtectedAPI;
import au.org.consumerdatastandards.client.api.ReturnTypeResolver;
import au.org.consumerdatastandards.client.model.banking.BankingAccount;
import au.org.consumerdatastandards.client.model.banking.BankingAccountDetailV2;
import au.org.consumerdatastandards.client.model.banking.BankingAccountDetailV3;
import au.org.consumerdatastandards.client.model.banking.BankingAccountV1;
import au.org.consumerdatastandards.client.model.banking.BankingAccountV2;
import au.org.consumerdatastandards.client.model.banking.BankingProductCategory;
import au.org.consumerdatastandards.client.model.banking.ParamAccountOpenStatus;
import au.org.consumerdatastandards.client.model.banking.RequestAccountIds;
import au.org.consumerdatastandards.client.model.banking.ResponseBankingAccountById;
import au.org.consumerdatastandards.client.model.banking.ResponseBankingAccountList;
import au.org.consumerdatastandards.client.model.banking.ResponseBankingAccountsBalanceById;
import au.org.consumerdatastandards.client.model.banking.ResponseBankingAccountsBalanceList;
import au.org.consumerdatastandards.client.model.banking.ResponseBankingTransactionById;
import au.org.consumerdatastandards.client.model.banking.ResponseBankingTransactionList;
import com.google.gson.reflect.TypeToken;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.lang.reflect.Type;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankingAccountsAPI extends ProtectedAPI {

    private static final Logger LOGGER = LoggerFactory.getLogger(BankingAccountsAPI.class);

    /**
     * Build call for getAccountDetail
     *
     * @param accountId A tokenised identifier for the account which is unique but not shareable (required)
     * @param version endpoint version
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     *                      http.response.details
     *                      <table summary="Response Details" border="1">
     *                        <tr>
     *                            <td> Status Code </td>
     *                            <td> Description </td>
     *                            <td> Response Headers </td>
     *                        </tr>
     *                        <tr>
     *                            <td> 200 </td>
     *                            <td> Success </td>
     *                            <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  * x-fapi-interaction-id - An [RFC4122](https://tools.ietf.org/html/rfc4122) UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction. <br>  </td>
     *                        </tr>
     *                      </table>
     */
    public okhttp3.Call getAccountDetailCall(String accountId, int version, final ApiCallback _callback) throws ApiException {

        Object postBody = null;

        // create path and map variables
        String path = "/banking/accounts/{accountId}"
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId));

        LOGGER.trace("Building Call for getAccountDetail with path: {}, accountId: {}",
            path,
            accountId);

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        Map<String, String> headerParams = new HashMap<>();
        headerParams.put("x-v", "" + version);
        addCdsProtectedApiHeaders(headerParams);
        String[] authNames = new String[] {  };
        return apiClient.buildCall(path, "GET", queryParams, collectionQueryParams, postBody, headerParams, authNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAccountDetailValidateBeforeCall(String accountId, int version, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling getAccountDetail(Async)");
        }


        return getAccountDetailCall(accountId, version, _callback);
    }

    /**
     * Get Account Detail
     * Obtain detailed information on a single account
     * @param accountId A tokenised identifier for the account which is unique but not shareable (required)
     * @param version endpoint version
     * @return ResponseBankingAccountById
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     * <table summary="Response Details" border="1">
     *   <tr>
     *       <td> Status Code </td>
     *       <td> Description </td>
     *       <td> Response Headers </td>
     *   </tr>
     *   <tr>
     *       <td> 200 </td>
     *       <td> Success </td>
     *       <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  * x-fapi-interaction-id - An [RFC4122](https://tools.ietf.org/html/rfc4122) UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction. <br>  </td>
     *   </tr>
     * </table>
     */
    public ResponseBankingAccountById getAccountDetail(String accountId, int version) throws ApiException {

        LOGGER.trace("getAccountDetail with accountId: {}",
            accountId);

        ApiResponse<ResponseBankingAccountById> resp = getAccountDetailWithHttpInfo(accountId, version);
        return resp.getBody();
    }

    /**
     * Get Account Detail
     * Obtain detailed information on a single account
     * @param accountId A tokenised identifier for the account which is unique but not shareable (required)
     * @param version endpoint version
     * @return ApiResponse&lt;ResponseBankingAccountById&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     * <table summary="Response Details" border="1">
     *   <tr>
     *       <td> Status Code </td>
     *       <td> Description </td>
     *       <td> Response Headers </td>
     *   </tr>
     *   <tr>
     *       <td> 200 </td>
     *       <td> Success </td>
     *       <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  * x-fapi-interaction-id - An [RFC4122](https://tools.ietf.org/html/rfc4122) UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction. <br>  </td>
     *   </tr>
     * </table>
     */
    public ApiResponse<ResponseBankingAccountById> getAccountDetailWithHttpInfo(String accountId, int version) throws ApiException {
        okhttp3.Call call = getAccountDetailValidateBeforeCall(accountId, version, null);
        try {
            Response response = call.execute();
            Type returnType = new ListAccountDetailReturnTypeResolver().resolve(response);
            return apiClient.handle(response, returnType);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Get Account Detail (asynchronously)
     * Obtain detailed information on a single account
     * @param accountId A tokenised identifier for the account which is unique but not shareable (required)
     * @param version endpoint version
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
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  * x-fapi-interaction-id - An [RFC4122](https://tools.ietf.org/html/rfc4122) UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction. <br>  </td>
     *    </tr>
     * </table>
     */
    public okhttp3.Call getAccountDetailAsync(String accountId, int version, final ApiCallback<ResponseBankingAccountById> _callback) throws ApiException {

        LOGGER.trace("Asynchronously getAccountDetail with accountId: {}",
            accountId);

        okhttp3.Call call = getAccountDetailValidateBeforeCall(accountId, version, _callback);
        Type returnType = new TypeToken<ResponseBankingAccountById>(){}.getType();
        apiClient.executeAsync(call, returnType, _callback);
        return call;
    }
    /**
     * Build call for getBalance
     * @param accountId ID of the specific account requested (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * http.response.details
     * <table summary="Response Details" border="1">
     *   <tr>
     *       <td> Status Code </td>
     *       <td> Description </td>
     *       <td> Response Headers </td>
     *   </tr>
     *   <tr>
     *       <td> 200 </td>
     *       <td> Success </td>
     *       <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  * x-fapi-interaction-id - An [RFC4122](https://tools.ietf.org/html/rfc4122) UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction. <br>  </td>
     *   </tr>
     * </table>
     */
    public okhttp3.Call getBalanceCall(String accountId, final ApiCallback _callback) throws ApiException {

        Object postBody = null;

        // create path and map variables
        String path = "/banking/accounts/{accountId}/balance"
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId));

        LOGGER.trace("Building Call for getBalance with path: {}, accountId: {}",
            path,
            accountId);

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        Map<String, String> headerParams = new HashMap<>();
        addCdsProtectedApiHeaders(headerParams);
        String[] authNames = new String[] {  };
        return apiClient.buildCall(path, "GET", queryParams, collectionQueryParams, postBody, headerParams, authNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getBalanceValidateBeforeCall(String accountId, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling getBalance(Async)");
        }


        return getBalanceCall(accountId, _callback);
    }

    /**
     * Get Account Balance
     * Obtain the balance for a single specified account
     * @param accountId ID of the specific account requested (required)
     * @return ResponseBankingAccountsBalanceById
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     * <table summary="Response Details" border="1">
     *   <tr>
     *       <td> Status Code </td>
     *       <td> Description </td>
     *       <td> Response Headers </td>
     *   </tr>
     *   <tr>
     *       <td> 200 </td>
     *       <td> Success </td>
     *       <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  * x-fapi-interaction-id - An [RFC4122](https://tools.ietf.org/html/rfc4122) UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction. <br>  </td>
     *   </tr>
     * </table>
     */
    public ResponseBankingAccountsBalanceById getBalance(String accountId) throws ApiException {

        LOGGER.trace("getBalance with accountId: {}",
            accountId);

        ApiResponse<ResponseBankingAccountsBalanceById> resp = getBalanceWithHttpInfo(accountId);
        return resp.getBody();
    }

    /**
     * Get Account Balance
     * Obtain the balance for a single specified account
     * @param accountId ID of the specific account requested (required)
     * @return ApiResponse&lt;ResponseBankingAccountsBalanceById&gt;
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
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  * x-fapi-interaction-id - An [RFC4122](https://tools.ietf.org/html/rfc4122) UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction. <br>  </td>
     *    </tr>
     * </table>
*/
    public ApiResponse<ResponseBankingAccountsBalanceById> getBalanceWithHttpInfo(String accountId) throws ApiException {
        okhttp3.Call call = getBalanceValidateBeforeCall(accountId, null);
        Type returnType = new TypeToken<ResponseBankingAccountsBalanceById>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Get Account Balance (asynchronously)
     * Obtain the balance for a single specified account
     * @param accountId ID of the specific account requested (required)
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
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  * x-fapi-interaction-id - An [RFC4122](https://tools.ietf.org/html/rfc4122) UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction. <br>  </td>
     *    </tr>
     * </table>
     */
    public okhttp3.Call getBalanceAsync(String accountId, final ApiCallback<ResponseBankingAccountsBalanceById> _callback) throws ApiException {

        LOGGER.trace("Asynchronously getBalance with accountId: {}",
            accountId);

        okhttp3.Call call = getBalanceValidateBeforeCall(accountId, _callback);
        Type returnType = new TypeToken<ResponseBankingAccountsBalanceById>(){}.getType();
        apiClient.executeAsync(call, returnType, _callback);
        return call;
    }
    /**
     * Build call for getTransactionDetail
     * @param accountId ID of the account to get transactions for.  Must have previously been returned by one of the account list end points (required)
     * @param transactionId ID of the transaction obtained from a previous call to one of the other transaction end points (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * http.response.details
     * <table summary="Response Details" border="1">
     *   <tr>
     *       <td> Status Code </td>
     *       <td> Description </td>
     *       <td> Response Headers </td>
     *   </tr>
     *   <tr>
     *       <td> 200 </td>
     *       <td> Success </td>
     *       <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  * x-fapi-interaction-id - An [RFC4122](https://tools.ietf.org/html/rfc4122) UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction. <br>  </td>
     *   </tr>
     * </table>
     */
    public okhttp3.Call getTransactionDetailCall(String accountId, String transactionId, final ApiCallback _callback) throws ApiException {

        Object postBody = null;

        // create path and map variables
        String path = "/banking/accounts/{accountId}/transactions/{transactionId}"
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId))
            .replaceAll("\\{" + "transactionId" + "\\}", apiClient.escapeString(transactionId));

        LOGGER.trace("Building Call for getTransactionDetail with path: {}, accountId: {}, transactionId: {}",
            path,
            accountId,
            transactionId);

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        Map<String, String> headerParams = new HashMap<>();
        addCdsProtectedApiHeaders(headerParams);
        String[] authNames = new String[] {  };
        return apiClient.buildCall(path, "GET", queryParams, collectionQueryParams, postBody, headerParams, authNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getTransactionDetailValidateBeforeCall(String accountId, String transactionId, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling getTransactionDetail(Async)");
        }

        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new ApiException("Missing the required parameter 'transactionId' when calling getTransactionDetail(Async)");
        }


        return getTransactionDetailCall(accountId, transactionId, _callback);
    }

    /**
     * Get Transaction Detail
     * Obtain detailed information on a transaction for a specific account
     * @param accountId ID of the account to get transactions for.  Must have previously been returned by one of the account list end points (required)
     * @param transactionId ID of the transaction obtained from a previous call to one of the other transaction end points (required)
     * @return ResponseBankingTransactionById
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     * <table summary="Response Details" border="1">
     *   <tr>
     *       <td> Status Code </td>
     *       <td> Description </td>
     *       <td> Response Headers </td>
     *   </tr>
     *   <tr>
     *       <td> 200 </td>
     *       <td> Success </td>
     *       <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  * x-fapi-interaction-id - An [RFC4122](https://tools.ietf.org/html/rfc4122) UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction. <br>  </td>
     *   </tr>
     * </table>
     */
    public ResponseBankingTransactionById getTransactionDetail(String accountId, String transactionId) throws ApiException {

        LOGGER.trace("getTransactionDetail with accountId: {}, transactionId: {}",
            accountId,
            transactionId);

        ApiResponse<ResponseBankingTransactionById> resp = getTransactionDetailWithHttpInfo(accountId, transactionId);
        return resp.getBody();
    }

    /**
     * Get Transaction Detail
     * Obtain detailed information on a transaction for a specific account
     * @param accountId ID of the account to get transactions for.  Must have previously been returned by one of the account list end points (required)
     * @param transactionId ID of the transaction obtained from a previous call to one of the other transaction end points (required)
     * @return ApiResponse&lt;ResponseBankingTransactionById&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     * <table summary="Response Details" border="1">
     *   <tr>
     *       <td> Status Code </td>
     *       <td> Description </td>
     *       <td> Response Headers </td>
     *   </tr>
     *   <tr>
     *       <td> 200 </td>
     *       <td> Success </td>
     *       <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  * x-fapi-interaction-id - An [RFC4122](https://tools.ietf.org/html/rfc4122) UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction. <br>  </td>
     *   </tr>
     * </table>
     */
    public ApiResponse<ResponseBankingTransactionById> getTransactionDetailWithHttpInfo(String accountId, String transactionId) throws ApiException {
        okhttp3.Call call = getTransactionDetailValidateBeforeCall(accountId, transactionId, null);
        Type returnType = new TypeToken<ResponseBankingTransactionById>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Get Transaction Detail (asynchronously)
     * Obtain detailed information on a transaction for a specific account
     * @param accountId ID of the account to get transactions for.  Must have previously been returned by one of the account list end points (required)
     * @param transactionId ID of the transaction obtained from a previous call to one of the other transaction end points (required)
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
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  * x-fapi-interaction-id - An [RFC4122](https://tools.ietf.org/html/rfc4122) UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction. <br>  </td>
     *    </tr>
     * </table>
     */
    public okhttp3.Call getTransactionDetailAsync(String accountId, String transactionId, final ApiCallback<ResponseBankingTransactionById> _callback) throws ApiException {

        LOGGER.trace("Asynchronously getTransactionDetail with accountId: {}, transactionId: {}",
            accountId,
            transactionId);

        okhttp3.Call call = getTransactionDetailValidateBeforeCall(accountId, transactionId, _callback);
        Type returnType = new TypeToken<ResponseBankingTransactionById>(){}.getType();
        apiClient.executeAsync(call, returnType, _callback);
        return call;
    }
    /**
     * Build call for getTransactions
     * @param accountId ID of the account to get transactions for.  Must have previously been returned by one of the account list end points. (required)
     * @param oldestTime Constrain the transaction history request to transactions with effective time at or after this date/time. If absent defaults to newest-time minus 90 days.  Format is aligned to DateTimeString common type (optional)
     * @param newestTime Constrain the transaction history request to transactions with effective time at or before this date/time.  If absent defaults to today.  Format is aligned to DateTimeString common type (optional)
     * @param minAmount Filter transactions to only transactions with amounts higher than or equal to this amount (optional)
     * @param maxAmount Filter transactions to only transactions with amounts less than or equal to this amount (optional)
     * @param text Filter transactions to only transactions where this string value is found as a substring of either the reference or description fields. Format is arbitrary ASCII string. This parameter is optionally implemented by data holders. If it is not implemented then a response should be provided as normal without text filtering applied and an additional boolean field named isQueryParamUnsupported should be included in the meta object and set to true (whether the text parameter is supplied or not) (optional)
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * http.response.details
     * <table summary="Response Details" border="1">
     *   <tr>
     *       <td> Status Code </td>
     *       <td> Description </td>
     *       <td> Response Headers </td>
     *   </tr>
     *   <tr>
     *       <td> 200 </td>
     *       <td> Success </td>
     *       <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  * x-fapi-interaction-id - An [RFC4122](https://tools.ietf.org/html/rfc4122) UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction. <br>  </td>
     *   </tr>
     * </table>
     */
    public okhttp3.Call getTransactionsCall(String accountId, OffsetDateTime oldestTime, OffsetDateTime newestTime, String minAmount, String maxAmount, String text, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {

        Object postBody = null;

        // create path and map variables
        String path = "/banking/accounts/{accountId}/transactions"
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId));

        LOGGER.trace("Building Call for getTransactions with path: {}, accountId: {}, oldest-time: {}, newest-time: {}, min-amount: {}, max-amount: {}, text: {}, page: {}, page-size: {}",
            path,
            accountId,
            oldestTime,
            newestTime,
            minAmount,
            maxAmount,
            text,
            page,
            pageSize);

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        addQueryParam(queryParams, "oldest-time", oldestTime);
        addQueryParam(queryParams, "newest-time", newestTime);
        addQueryParam(queryParams, "min-amount", minAmount);
        addQueryParam(queryParams, "max-amount", maxAmount);
        addQueryParam(queryParams, "text", text);
        addQueryParam(queryParams, "page", page);
        addQueryParam(queryParams, "page-size", pageSize);
        Map<String, String> headerParams = new HashMap<>();
        addCdsProtectedApiHeaders(headerParams);
        String[] authNames = new String[] {  };
        return apiClient.buildCall(path, "GET", queryParams, collectionQueryParams, postBody, headerParams, authNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getTransactionsValidateBeforeCall(String accountId, OffsetDateTime oldestTime, OffsetDateTime newestTime, String minAmount, String maxAmount, String text, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling getTransactions(Async)");
        }


        return getTransactionsCall(accountId, oldestTime, newestTime, minAmount, maxAmount, text, page, pageSize, _callback);
    }

    /**
     * Get Transactions For Account
     * Obtain transactions for a specific account.  Some general notes that apply to all end points that retrieve transactions:  - Where multiple transactions are returned, transactions should be ordered according to effective date in descending order - As the date and time for a transaction can alter depending on status and transaction type two separate date/times are included in the payload. There are still some scenarios where neither of these time stamps is available. For the purpose of filtering and ordering it is expected that the data holder will use the “effective” date/time which will be defined as:   - Posted date/time if available, then   - Execution date/time if available, then   - A reasonable date/time nominated by the data holder using internal data structures - For transaction amounts it should be assumed that a negative value indicates a reduction of the available balance on the account while a positive value indicates an increase in the available balance on the account - For aggregated transactions (ie. groups of sub transactions reported as a single entry for the account) only the aggregated information, with as much consistent information across the subsidiary transactions as possible, is required to be shared
     * @param accountId ID of the account to get transactions for.  Must have previously been returned by one of the account list end points. (required)
     * @param oldestTime Constrain the transaction history request to transactions with effective time at or after this date/time. If absent defaults to newest-time minus 90 days.  Format is aligned to DateTimeString common type (optional)
     * @param newestTime Constrain the transaction history request to transactions with effective time at or before this date/time.  If absent defaults to today.  Format is aligned to DateTimeString common type (optional)
     * @param minAmount Filter transactions to only transactions with amounts higher than or equal to this amount (optional)
     * @param maxAmount Filter transactions to only transactions with amounts less than or equal to this amount (optional)
     * @param text Filter transactions to only transactions where this string value is found as a substring of either the reference or description fields. Format is arbitrary ASCII string. This parameter is optionally implemented by data holders. If it is not implemented then a response should be provided as normal without text filtering applied and an additional boolean field named isQueryParamUnsupported should be included in the meta object and set to true (whether the text parameter is supplied or not) (optional)
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
     * @return ResponseBankingTransactionList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     * <table summary="Response Details" border="1">
     *   <tr>
     *       <td> Status Code </td>
     *       <td> Description </td>
     *       <td> Response Headers </td>
     *   </tr>
     *   <tr>
     *       <td> 200 </td>
     *       <td> Success </td>
     *       <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  * x-fapi-interaction-id - An [RFC4122](https://tools.ietf.org/html/rfc4122) UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction. <br>  </td>
     *   </tr>
     * </table>
     */
    public ResponseBankingTransactionList getTransactions(String accountId, OffsetDateTime oldestTime, OffsetDateTime newestTime, String minAmount, String maxAmount, String text, Integer page, Integer pageSize) throws ApiException {

        LOGGER.trace("getTransactions with accountId: {}, oldest-time: {}, newest-time: {}, min-amount: {}, max-amount: {}, text: {}, page: {}, page-size: {}",
            accountId,
            oldestTime,
            newestTime,
            minAmount,
            maxAmount,
            text,
            page,
            pageSize);

        ApiResponse<ResponseBankingTransactionList> resp = getTransactionsWithHttpInfo(accountId, oldestTime, newestTime, minAmount, maxAmount, text, page, pageSize);
        return resp.getBody();
    }

    /**
     * Get Transactions For Account
     * Obtain transactions for a specific account.  Some general notes that apply to all end points that retrieve transactions:  - Where multiple transactions are returned, transactions should be ordered according to effective date in descending order - As the date and time for a transaction can alter depending on status and transaction type two separate date/times are included in the payload. There are still some scenarios where neither of these time stamps is available. For the purpose of filtering and ordering it is expected that the data holder will use the “effective” date/time which will be defined as:   - Posted date/time if available, then   - Execution date/time if available, then   - A reasonable date/time nominated by the data holder using internal data structures - For transaction amounts it should be assumed that a negative value indicates a reduction of the available balance on the account while a positive value indicates an increase in the available balance on the account - For aggregated transactions (ie. groups of sub transactions reported as a single entry for the account) only the aggregated information, with as much consistent information across the subsidiary transactions as possible, is required to be shared
     * @param accountId ID of the account to get transactions for.  Must have previously been returned by one of the account list end points. (required)
     * @param oldestTime Constrain the transaction history request to transactions with effective time at or after this date/time. If absent defaults to newest-time minus 90 days.  Format is aligned to DateTimeString common type (optional)
     * @param newestTime Constrain the transaction history request to transactions with effective time at or before this date/time.  If absent defaults to today.  Format is aligned to DateTimeString common type (optional)
     * @param minAmount Filter transactions to only transactions with amounts higher than or equal to this amount (optional)
     * @param maxAmount Filter transactions to only transactions with amounts less than or equal to this amount (optional)
     * @param text Filter transactions to only transactions where this string value is found as a substring of either the reference or description fields. Format is arbitrary ASCII string. This parameter is optionally implemented by data holders. If it is not implemented then a response should be provided as normal without text filtering applied and an additional boolean field named isQueryParamUnsupported should be included in the meta object and set to true (whether the text parameter is supplied or not) (optional)
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
     * @return ApiResponse&lt;ResponseBankingTransactionList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     * <table summary="Response Details" border="1">
     *   <tr>
     *       <td> Status Code </td>
     *       <td> Description </td>
     *       <td> Response Headers </td>
     *   </tr>
     *   <tr>
     *       <td> 200 </td>
     *       <td> Success </td>
     *       <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  * x-fapi-interaction-id - An [RFC4122](https://tools.ietf.org/html/rfc4122) UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction. <br>  </td>
     *   </tr>
     * </table>
     */
    public ApiResponse<ResponseBankingTransactionList> getTransactionsWithHttpInfo(String accountId, OffsetDateTime oldestTime, OffsetDateTime newestTime, String minAmount, String maxAmount, String text, Integer page, Integer pageSize) throws ApiException {
        okhttp3.Call call = getTransactionsValidateBeforeCall(accountId, oldestTime, newestTime, minAmount, maxAmount, text, page, pageSize, null);
        Type returnType = new TypeToken<ResponseBankingTransactionList>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Get Transactions For Account (asynchronously)
     * Obtain transactions for a specific account.  Some general notes that apply to all end points that retrieve transactions:  - Where multiple transactions are returned, transactions should be ordered according to effective date in descending order - As the date and time for a transaction can alter depending on status and transaction type two separate date/times are included in the payload. There are still some scenarios where neither of these time stamps is available. For the purpose of filtering and ordering it is expected that the data holder will use the “effective” date/time which will be defined as:   - Posted date/time if available, then   - Execution date/time if available, then   - A reasonable date/time nominated by the data holder using internal data structures - For transaction amounts it should be assumed that a negative value indicates a reduction of the available balance on the account while a positive value indicates an increase in the available balance on the account - For aggregated transactions (ie. groups of sub transactions reported as a single entry for the account) only the aggregated information, with as much consistent information across the subsidiary transactions as possible, is required to be shared
     * @param accountId ID of the account to get transactions for.  Must have previously been returned by one of the account list end points. (required)
     * @param oldestTime Constrain the transaction history request to transactions with effective time at or after this date/time. If absent defaults to newest-time minus 90 days.  Format is aligned to DateTimeString common type (optional)
     * @param newestTime Constrain the transaction history request to transactions with effective time at or before this date/time.  If absent defaults to today.  Format is aligned to DateTimeString common type (optional)
     * @param minAmount Filter transactions to only transactions with amounts higher than or equal to this amount (optional)
     * @param maxAmount Filter transactions to only transactions with amounts less than or equal to this amount (optional)
     * @param text Filter transactions to only transactions where this string value is found as a substring of either the reference or description fields. Format is arbitrary ASCII string. This parameter is optionally implemented by data holders. If it is not implemented then a response should be provided as normal without text filtering applied and an additional boolean field named isQueryParamUnsupported should be included in the meta object and set to true (whether the text parameter is supplied or not) (optional)
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
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
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  * x-fapi-interaction-id - An [RFC4122](https://tools.ietf.org/html/rfc4122) UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction. <br>  </td>
     *    </tr>
     * </table>
     */
    public okhttp3.Call getTransactionsAsync(String accountId, OffsetDateTime oldestTime, OffsetDateTime newestTime, String minAmount, String maxAmount, String text, Integer page, Integer pageSize, final ApiCallback<ResponseBankingTransactionList> _callback) throws ApiException {

        LOGGER.trace("Asynchronously getTransactions with accountId: {}, oldest-time: {}, newest-time: {}, min-amount: {}, max-amount: {}, text: {}, page: {}, page-size: {}",
            accountId,
            oldestTime,
            newestTime,
            minAmount,
            maxAmount,
            text,
            page,
            pageSize);

        okhttp3.Call call = getTransactionsValidateBeforeCall(accountId, oldestTime, newestTime, minAmount, maxAmount, text, page, pageSize, _callback);
        Type returnType = new TypeToken<ResponseBankingTransactionList>(){}.getType();
        apiClient.executeAsync(call, returnType, _callback);
        return call;
    }
    /**
     * Build call for listAccounts
     * @param productCategory Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. (optional)
     * @param openStatus Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed (optional, default to ALL)
     * @param isOwned Filters accounts based on whether they are owned by the authorised customer.  True for owned accounts, false for unowned accounts and absent for all accounts (optional)
     * @param version endpoint version
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * http.response.details
     * <table summary="Response Details" border="1">
     *   <tr>
     *       <td> Status Code </td>
     *       <td> Description </td>
     *       <td> Response Headers </td>
     *   </tr>
     *   <tr>
     *       <td> 200 </td>
     *       <td> Success </td>
     *       <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  * x-fapi-interaction-id - An [RFC4122](https://tools.ietf.org/html/rfc4122) UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction. <br>  </td>
     *   </tr>
     * </table>
     */
    public okhttp3.Call listAccountsCall(BankingProductCategory productCategory, ParamAccountOpenStatus openStatus, Boolean isOwned, int version, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {

        Object postBody = null;

        // create path and map variables
        String path = "/banking/accounts";

        LOGGER.trace("Building Call for listAccounts with path: {}, product-category: {}, open-status: {}, is-owned: {}, page: {}, page-size: {}",
            path,
            productCategory,
            openStatus,
            isOwned,
            page,
            pageSize);

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        addQueryParam(queryParams, "product-category", productCategory);
        addQueryParam(queryParams, "open-status", openStatus);
        addQueryParam(queryParams, "is-owned", isOwned);
        addQueryParam(queryParams, "page", page);
        addQueryParam(queryParams, "page-size", pageSize);
        Map<String, String> headerParams = new HashMap<>();
        headerParams.put("x-v", "" + version);
        addCdsProtectedApiHeaders(headerParams);
        String[] authNames = new String[] {  };
        return apiClient.buildCall(path, "GET", queryParams, collectionQueryParams, postBody, headerParams, authNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listAccountsValidateBeforeCall(BankingProductCategory productCategory, ParamAccountOpenStatus openStatus, Boolean isOwned, int version, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {

        return listAccountsCall(productCategory, openStatus, isOwned, version, page, pageSize, _callback);
    }

    /**
     * Get Accounts
     * Obtain a list of accounts
     * @param <T> Concrete class for <code>BankingAccount</code>
     * @param productCategory Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. (optional)
     * @param openStatus Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed (optional, default to ALL)
     * @param isOwned Filters accounts based on whether they are owned by the authorised customer.  True for owned accounts, false for unowned accounts and absent for all accounts (optional)
     * @param version endpoint version
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
     * @return ResponseBankingAccountList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     * <table summary="Response Details" border="1">
     *   <tr>
     *       <td> Status Code </td>
     *       <td> Description </td>
     *       <td> Response Headers </td>
     *   </tr>
     *   <tr>
     *       <td> 200 </td>
     *       <td> Success </td>
     *       <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  * x-fapi-interaction-id - An [RFC4122](https://tools.ietf.org/html/rfc4122) UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction. <br>  </td>
     *   </tr>
     * </table>
     */
    public <T extends BankingAccount> ResponseBankingAccountList<T> listAccounts(BankingProductCategory productCategory, ParamAccountOpenStatus openStatus, Boolean isOwned, int version, Integer page, Integer pageSize) throws ApiException {

        LOGGER.trace("listAccounts with product-category: {}, open-status: {}, is-owned: {}, page: {}, page-size: {}",
            productCategory,
            openStatus,
            isOwned,
            page,
            pageSize);

        ApiResponse<ResponseBankingAccountList<T>> resp = listAccountsWithHttpInfo(productCategory, openStatus, isOwned, version, page, pageSize);
        return resp.getBody();
    }

    /**
     * Get Accounts
     * Obtain a list of accounts
     * @param <T> Concrete class for <code>BankingAccount</code>
     * @param productCategory Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. (optional)
     * @param openStatus Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed (optional, default to ALL)
     * @param isOwned Filters accounts based on whether they are owned by the authorised customer.  True for owned accounts, false for unowned accounts and absent for all accounts (optional)
     * @param version endpoint version
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
     * @return ApiResponse&lt;ResponseBankingAccountList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     * <table summary="Response Details" border="1">
     *   <tr>
     *       <td> Status Code </td>
     *       <td> Description </td>
     *       <td> Response Headers </td>
     *   </tr>
     *   <tr>
     *       <td> 200 </td>
     *       <td> Success </td>
     *       <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  * x-fapi-interaction-id - An [RFC4122](https://tools.ietf.org/html/rfc4122) UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction. <br>  </td>
     *   </tr>
     * </table>
     */
    public <T extends BankingAccount> ApiResponse<ResponseBankingAccountList<T>> listAccountsWithHttpInfo(BankingProductCategory productCategory, ParamAccountOpenStatus openStatus, Boolean isOwned, int version, Integer page, Integer pageSize) throws ApiException {
        okhttp3.Call call = listAccountsValidateBeforeCall(productCategory, openStatus, isOwned, version, page, pageSize, null);
        try {
            Response response = call.execute();
            Type returnType = new ListAccountsReturnTypeResolver().resolve(response);
            return apiClient.handle(response, returnType);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Get Accounts (asynchronously)
     * Obtain a list of accounts
     * @param productCategory Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. (optional)
     * @param openStatus Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed (optional, default to ALL)
     * @param isOwned Filters accounts based on whether they are owned by the authorised customer.  True for owned accounts, false for unowned accounts and absent for all accounts (optional)
     * @param version endpoint version
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
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
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  * x-fapi-interaction-id - An [RFC4122](https://tools.ietf.org/html/rfc4122) UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction. <br>  </td>
     *    </tr>
     * </table>
     */
    public okhttp3.Call listAccountsAsync(BankingProductCategory productCategory, ParamAccountOpenStatus openStatus, Boolean isOwned, int version, Integer page, Integer pageSize, final ApiCallback<ResponseBankingAccountList> _callback) throws ApiException {

        LOGGER.trace("Asynchronously listAccounts with product-category: {}, open-status: {}, is-owned: {}, page: {}, page-size: {}",
            productCategory,
            openStatus,
            isOwned,
            page,
            pageSize);

        okhttp3.Call call = listAccountsValidateBeforeCall(productCategory, openStatus, isOwned, version, page, pageSize, _callback);
        apiClient.executeAsync(call, _callback, new ListAccountsReturnTypeResolver());
        return call;
    }

    /**
     * Build call for listBalancesBulk
     * @param productCategory Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. (optional)
     * @param openStatus Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed (optional, default to ALL)
     * @param isOwned Filters accounts based on whether they are owned by the authorised customer.  True for owned accounts, false for unowned accounts and absent for all accounts (optional)
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * http.response.details
     * <table summary="Response Details" border="1">
     *   <tr>
     *       <td> Status Code </td>
     *       <td> Description </td>
     *       <td> Response Headers </td>
     *   </tr>
     *   <tr>
     *       <td> 200 </td>
     *       <td> Success </td>
     *       <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  * x-fapi-interaction-id - An [RFC4122](https://tools.ietf.org/html/rfc4122) UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction. <br>  </td>
     *   </tr>
     * </table>
     */
    public okhttp3.Call listBalancesBulkCall(BankingProductCategory productCategory, ParamAccountOpenStatus openStatus, Boolean isOwned, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {

        Object postBody = null;

        // create path and map variables
        String path = "/banking/accounts/balances";

        LOGGER.trace("Building Call for listBalancesBulk with path: {}, product-category: {}, open-status: {}, is-owned: {}, page: {}, page-size: {}",
            path,
            productCategory,
            openStatus,
            isOwned,
            page,
            pageSize);

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        addQueryParam(queryParams, "product-category", productCategory);
        addQueryParam(queryParams, "open-status", openStatus);
        addQueryParam(queryParams, "is-owned", isOwned);
        addQueryParam(queryParams, "page", page);
        addQueryParam(queryParams, "page-size", pageSize);
        Map<String, String> headerParams = new HashMap<>();
        addCdsProtectedApiHeaders(headerParams);
        String[] authNames = new String[] {  };
        return apiClient.buildCall(path, "GET", queryParams, collectionQueryParams, postBody, headerParams, authNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listBalancesBulkValidateBeforeCall(BankingProductCategory productCategory, ParamAccountOpenStatus openStatus, Boolean isOwned, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {


        return listBalancesBulkCall(productCategory, openStatus, isOwned, page, pageSize, _callback);
    }

    /**
     * Get Bulk Balances
     * Obtain balances for multiple, filtered accounts
     * @param productCategory Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. (optional)
     * @param openStatus Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed (optional, default to ALL)
     * @param isOwned Filters accounts based on whether they are owned by the authorised customer.  True for owned accounts, false for unowned accounts and absent for all accounts (optional)
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
     * @return ResponseBankingAccountsBalanceList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     * <table summary="Response Details" border="1">
     *   <tr>
     *       <td> Status Code </td>
     *       <td> Description </td>
     *       <td> Response Headers </td>
     *   </tr>
     *   <tr>
     *       <td> 200 </td>
     *       <td> Success </td>
     *       <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  * x-fapi-interaction-id - An [RFC4122](https://tools.ietf.org/html/rfc4122) UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction. <br>  </td>
     *   </tr>
     * </table>
     */
    public ResponseBankingAccountsBalanceList listBalancesBulk(BankingProductCategory productCategory, ParamAccountOpenStatus openStatus, Boolean isOwned, Integer page, Integer pageSize) throws ApiException {

        LOGGER.trace("listBalancesBulk with product-category: {}, open-status: {}, is-owned: {}, page: {}, page-size: {}",
            productCategory,
            openStatus,
            isOwned,
            page,
            pageSize);

        ApiResponse<ResponseBankingAccountsBalanceList> resp = listBalancesBulkWithHttpInfo(productCategory, openStatus, isOwned, page, pageSize);
        return resp.getBody();
    }

    /**
     * Get Bulk Balances
     * Obtain balances for multiple, filtered accounts
     * @param productCategory Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. (optional)
     * @param openStatus Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed (optional, default to ALL)
     * @param isOwned Filters accounts based on whether they are owned by the authorised customer.  True for owned accounts, false for unowned accounts and absent for all accounts (optional)
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
     * @return ApiResponse&lt;ResponseBankingAccountsBalanceList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     * <table summary="Response Details" border="1">
     *   <tr>
     *       <td> Status Code </td>
     *       <td> Description </td>
     *       <td> Response Headers </td>
     *   </tr>
     *   <tr>
     *       <td> 200 </td>
     *       <td> Success </td>
     *       <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  * x-fapi-interaction-id - An [RFC4122](https://tools.ietf.org/html/rfc4122) UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction. <br>  </td>
     *   </tr>
     * </table>
     */
    public ApiResponse<ResponseBankingAccountsBalanceList> listBalancesBulkWithHttpInfo(BankingProductCategory productCategory, ParamAccountOpenStatus openStatus, Boolean isOwned, Integer page, Integer pageSize) throws ApiException {
        okhttp3.Call call = listBalancesBulkValidateBeforeCall(productCategory, openStatus, isOwned, page, pageSize, null);
        Type returnType = new TypeToken<ResponseBankingAccountsBalanceList>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Get Bulk Balances (asynchronously)
     * Obtain balances for multiple, filtered accounts
     * @param productCategory Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. (optional)
     * @param openStatus Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed (optional, default to ALL)
     * @param isOwned Filters accounts based on whether they are owned by the authorised customer.  True for owned accounts, false for unowned accounts and absent for all accounts (optional)
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
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
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  * x-fapi-interaction-id - An [RFC4122](https://tools.ietf.org/html/rfc4122) UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction. <br>  </td>
     *    </tr>
     * </table>
     */
    public okhttp3.Call listBalancesBulkAsync(BankingProductCategory productCategory, ParamAccountOpenStatus openStatus, Boolean isOwned, Integer page, Integer pageSize, final ApiCallback<ResponseBankingAccountsBalanceList> _callback) throws ApiException {

        LOGGER.trace("Asynchronously listBalancesBulk with product-category: {}, open-status: {}, is-owned: {}, page: {}, page-size: {}",
            productCategory,
            openStatus,
            isOwned,
            page,
            pageSize);

        okhttp3.Call call = listBalancesBulkValidateBeforeCall(productCategory, openStatus, isOwned, page, pageSize, _callback);
        Type returnType = new TypeToken<ResponseBankingAccountsBalanceList>(){}.getType();
        apiClient.executeAsync(call, returnType, _callback);
        return call;
    }

    /**
     * Build call for listBalancesSpecificAccounts
     * @param accountIds The list of account IDs to obtain balances for (required)
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * http.response.details
     * <table summary="Response Details" border="1">
     *   <tr>
     *       <td> Status Code </td>
     *       <td> Description </td>
     *       <td> Response Headers </td>
     *   </tr>
     *   <tr>
     *       <td> 200 </td>
     *       <td> Success </td>
     *       <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  * x-fapi-interaction-id - An [RFC4122](https://tools.ietf.org/html/rfc4122) UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction. <br>  </td>
     *   </tr>
     *   <tr>
     *       <td> 422 </td>
     *       <td> The request was well formed but was unable to be processed due to business logic specific to the request. For this API a 422 response must be given if any of the account IDs provided are invalid for the consent context </td>
     *       <td>  * x-fapi-interaction-id - An [RFC4122](https://tools.ietf.org/html/rfc4122) UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction. <br>  </td>
     *   </tr>
     * </table>
     */
    public okhttp3.Call listBalancesSpecificAccountsCall(RequestAccountIds accountIds, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
        // create path and map variables
        String path = "/banking/accounts/balances";

        LOGGER.trace("Building Call for listBalancesSpecificAccounts with path: {}, accountIds: {}, page: {}, page-size: {}",
            path,
            accountIds,
            page,
            pageSize);

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        addQueryParam(queryParams, "page", page);
        addQueryParam(queryParams, "page-size", pageSize);
        Map<String, String> headerParams = new HashMap<>();
        addCdsProtectedApiHeaders(headerParams);
        String[] authNames = new String[] {  };
        return apiClient.buildCall(path, "POST", queryParams, collectionQueryParams, accountIds, headerParams, authNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listBalancesSpecificAccountsValidateBeforeCall(RequestAccountIds accountIds, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'accountIds' is set
        if (accountIds == null) {
            throw new ApiException("Missing the required parameter 'accountIds' when calling listBalancesSpecificAccounts(Async)");
        }


        return listBalancesSpecificAccountsCall(accountIds, page, pageSize, _callback);
    }

    /**
     * Get Balances For Specific Accounts
     * Obtain balances for a specified list of accounts
     * @param accountIds The list of account IDs to obtain balances for (required)
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
     * @return ResponseBankingAccountsBalanceList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     * <table summary="Response Details" border="1">
     *   <tr>
     *       <td> Status Code </td>
     *       <td> Description </td>
     *       <td> Response Headers </td>
     *   </tr>
     *   <tr>
     *       <td> 200 </td>
     *       <td> Success </td>
     *       <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  * x-fapi-interaction-id - An [RFC4122](https://tools.ietf.org/html/rfc4122) UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction. <br>  </td>
     *   </tr>
     *   <tr>
     *       <td> 422 </td>
     *       <td> The request was well formed but was unable to be processed due to business logic specific to the request. For this API a 422 response must be given if any of the account IDs provided are invalid for the consent context </td>
     *       <td>  * x-fapi-interaction-id - An [RFC4122](https://tools.ietf.org/html/rfc4122) UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction. <br>  </td>
     *   </tr>
     * </table>
     */
    public ResponseBankingAccountsBalanceList listBalancesSpecificAccounts(RequestAccountIds accountIds, Integer page, Integer pageSize) throws ApiException {

        LOGGER.trace("listBalancesSpecificAccounts with accountIds: {}, page: {}, page-size: {}",
            accountIds,
            page,
            pageSize);

        ApiResponse<ResponseBankingAccountsBalanceList> resp = listBalancesSpecificAccountsWithHttpInfo(accountIds, page, pageSize);
        return resp.getBody();
    }

    /**
     * Get Balances For Specific Accounts
     * Obtain balances for a specified list of accounts
     * @param accountIds The list of account IDs to obtain balances for (required)
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
     * @return ApiResponse&lt;ResponseBankingAccountsBalanceList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     * <table summary="Response Details" border="1">
     *   <tr>
     *       <td> Status Code </td>
     *       <td> Description </td>
     *       <td> Response Headers </td>
     *   </tr>
     *   <tr>
     *       <td> 200 </td>
     *       <td> Success </td>
     *       <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  * x-fapi-interaction-id - An [RFC4122](https://tools.ietf.org/html/rfc4122) UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction. <br>  </td>
     *   </tr>
     *   <tr>
     *       <td> 422 </td>
     *       <td> The request was well formed but was unable to be processed due to business logic specific to the request. For this API a 422 response must be given if any of the account IDs provided are invalid for the consent context </td>
     *       <td>  * x-fapi-interaction-id - An [RFC4122](https://tools.ietf.org/html/rfc4122) UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction. <br>  </td>
     *   </tr>
     * </table>
     */
    public ApiResponse<ResponseBankingAccountsBalanceList> listBalancesSpecificAccountsWithHttpInfo(RequestAccountIds accountIds, Integer page, Integer pageSize) throws ApiException {
        okhttp3.Call call = listBalancesSpecificAccountsValidateBeforeCall(accountIds, page, pageSize, null);
        Type returnType = new TypeToken<ResponseBankingAccountsBalanceList>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Get Balances For Specific Accounts (asynchronously)
     * Obtain balances for a specified list of accounts
     * @param accountIds The list of account IDs to obtain balances for (required)
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
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
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  * x-fapi-interaction-id - An [RFC4122](https://tools.ietf.org/html/rfc4122) UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction. <br>  </td>
     *    </tr>
     *    <tr>
     *        <td> 422 </td>
     *        <td> The request was well formed but was unable to be processed due to business logic specific to the request. For this API a 422 response must be given if any of the account IDs provided are invalid for the consent context </td>
     *        <td>  * x-fapi-interaction-id - An [RFC4122](https://tools.ietf.org/html/rfc4122) UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction. <br>  </td>
     *    </tr>
     * </table>
     */
    public okhttp3.Call listBalancesSpecificAccountsAsync(RequestAccountIds accountIds, Integer page, Integer pageSize, final ApiCallback<ResponseBankingAccountsBalanceList> _callback) throws ApiException {

        LOGGER.trace("Asynchronously listBalancesSpecificAccounts with accountIds: {}, page: {}, page-size: {}",
            accountIds,
            page,
            pageSize);

        okhttp3.Call call = listBalancesSpecificAccountsValidateBeforeCall(accountIds, page, pageSize, _callback);
        Type returnType = new TypeToken<ResponseBankingAccountsBalanceList>(){}.getType();
        apiClient.executeAsync(call, returnType, _callback);
        return call;
    }
}

class ListAccountsReturnTypeResolver implements ReturnTypeResolver {
    @Override
    public Type resolve(Response response) {
        if (!response.isSuccessful()) {
            return null;
        }
        String version = response.header("x-v");
        switch (Integer.parseInt(version)) {
            case 2:
                return new TypeToken<ResponseBankingAccountList<BankingAccountV2>>() {}.getType();
            default:
                return new TypeToken<ResponseBankingAccountList<BankingAccountV1>>() {}.getType();
        }
    }
}
class ListAccountDetailReturnTypeResolver implements ReturnTypeResolver {
    @Override
    public Type resolve(Response response) {
        if (!response.isSuccessful()) {
            return null;
        }
        String version = response.header("x-v");
        switch (Integer.parseInt(version)) {
            case 3:
                return new TypeToken<ResponseBankingAccountById<BankingAccountDetailV3>>() {}.getType();
            default:
                return new TypeToken<ResponseBankingAccountById<BankingAccountDetailV2>>() {}.getType();
        }
    }
}
