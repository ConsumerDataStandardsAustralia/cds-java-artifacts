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
import au.org.consumerdatastandards.client.model.banking.BankingProductCategory;
import au.org.consumerdatastandards.client.model.banking.ParamAccountOpenStatus;
import au.org.consumerdatastandards.client.model.banking.RequestAccountIds;
import au.org.consumerdatastandards.client.model.banking.ResponseBankingDirectDebitAuthorisationList;
import com.google.gson.reflect.TypeToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankingDirectDebitsAPI extends ProtectedAPI {

    private static final Logger LOGGER = LoggerFactory.getLogger(BankingDirectDebitsAPI.class);

    /**
     * Build call for listDirectDebits
     * @param accountId ID of the account to get direct debit authorisations for.  Must have previously been returned by one of the account list end points. (required)
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
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
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  * x-fapi-interaction-id - An [RFC4122](https://tools.ietf.org/html/rfc4122) UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction. <br>  </td>
     *    </tr>
     * </table>
*/
    public okhttp3.Call listDirectDebitsCall(String accountId, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {

        Object postBody = null;

        // create path and map variables
        String path = "/banking/accounts/{accountId}/direct-debits"
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId));

        LOGGER.trace("Building Call for listDirectDebits with path: {}, accountId: {}, page: {}, page-size: {}",
            path,
            accountId,
            page,
            pageSize);

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        addQueryParam(queryParams, "page", page);
        addQueryParam(queryParams, "page-size", pageSize);
        Map<String, String> headerParams = new HashMap<>();
        addCdsProtectedApiHeaders(headerParams);
        String[] authNames = new String[] {  };
        return apiClient.buildCall(path, "GET", queryParams, collectionQueryParams, postBody, headerParams, authNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listDirectDebitsValidateBeforeCall(String accountId, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling listDirectDebits(Async)");
        }


        return listDirectDebitsCall(accountId, page, pageSize, _callback);
    }

    /**
     * Get Direct Debits For Account
     * Obtain direct debit authorisations for a specific account
     * @param accountId ID of the account to get direct debit authorisations for.  Must have previously been returned by one of the account list end points. (required)
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
     * @return ResponseBankingDirectDebitAuthorisationList
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
    public ResponseBankingDirectDebitAuthorisationList listDirectDebits(String accountId, Integer page, Integer pageSize) throws ApiException {

        LOGGER.trace("listDirectDebits with accountId: {}, page: {}, page-size: {}",
            accountId,
            page,
            pageSize);

        ApiResponse<ResponseBankingDirectDebitAuthorisationList> resp = listDirectDebitsWithHttpInfo(accountId, page, pageSize);
        return resp.getBody();
    }

    /**
     * Get Direct Debits For Account
     * Obtain direct debit authorisations for a specific account
     * @param accountId ID of the account to get direct debit authorisations for.  Must have previously been returned by one of the account list end points. (required)
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
     * @return ApiResponse&lt;ResponseBankingDirectDebitAuthorisationList&gt;
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
    public ApiResponse<ResponseBankingDirectDebitAuthorisationList> listDirectDebitsWithHttpInfo(String accountId, Integer page, Integer pageSize) throws ApiException {
        okhttp3.Call call = listDirectDebitsValidateBeforeCall(accountId, page, pageSize, null);
        Type returnType = new TypeToken<ResponseBankingDirectDebitAuthorisationList>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Get Direct Debits For Account (asynchronously)
     * Obtain direct debit authorisations for a specific account
     * @param accountId ID of the account to get direct debit authorisations for.  Must have previously been returned by one of the account list end points. (required)
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
    public okhttp3.Call listDirectDebitsAsync(String accountId, Integer page, Integer pageSize, final ApiCallback<ResponseBankingDirectDebitAuthorisationList> _callback) throws ApiException {

        LOGGER.trace("Asynchronously listDirectDebits with accountId: {}, page: {}, page-size: {}",
            accountId,
            page,
            pageSize);

        okhttp3.Call call = listDirectDebitsValidateBeforeCall(accountId, page, pageSize, _callback);
        Type returnType = new TypeToken<ResponseBankingDirectDebitAuthorisationList>(){}.getType();
        apiClient.executeAsync(call, returnType, _callback);
        return call;
    }
    /**
     * Build call for listDirectDebitsBulk
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
    public okhttp3.Call listDirectDebitsBulkCall(BankingProductCategory productCategory, ParamAccountOpenStatus openStatus, Boolean isOwned, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {

        Object postBody = null;

        // create path and map variables
        String path = "/banking/accounts/direct-debits";

        LOGGER.trace("Building Call for listDirectDebitsBulk with path: {}, product-category: {}, open-status: {}, is-owned: {}, page: {}, page-size: {}",
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
    private okhttp3.Call listDirectDebitsBulkValidateBeforeCall(BankingProductCategory productCategory, ParamAccountOpenStatus openStatus, Boolean isOwned, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {


        return listDirectDebitsBulkCall(productCategory, openStatus, isOwned, page, pageSize, _callback);
    }

    /**
     * Get Bulk Direct Debits
     * Obtain direct debit authorisations for multiple, filtered accounts
     * @param productCategory Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. (optional)
     * @param openStatus Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed (optional, default to ALL)
     * @param isOwned Filters accounts based on whether they are owned by the authorised customer.  True for owned accounts, false for unowned accounts and absent for all accounts (optional)
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
     * @return ResponseBankingDirectDebitAuthorisationList
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
    public ResponseBankingDirectDebitAuthorisationList listDirectDebitsBulk(BankingProductCategory productCategory, ParamAccountOpenStatus openStatus, Boolean isOwned, Integer page, Integer pageSize) throws ApiException {

        LOGGER.trace("listDirectDebitsBulk with product-category: {}, open-status: {}, is-owned: {}, page: {}, page-size: {}",
            productCategory,
            openStatus,
            isOwned,
            page,
            pageSize);

        ApiResponse<ResponseBankingDirectDebitAuthorisationList> resp = listDirectDebitsBulkWithHttpInfo(productCategory, openStatus, isOwned, page, pageSize);
        return resp.getBody();
    }

    /**
     * Get Bulk Direct Debits
     * Obtain direct debit authorisations for multiple, filtered accounts
     * @param productCategory Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. (optional)
     * @param openStatus Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed (optional, default to ALL)
     * @param isOwned Filters accounts based on whether they are owned by the authorised customer.  True for owned accounts, false for unowned accounts and absent for all accounts (optional)
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
     * @return ApiResponse&lt;ResponseBankingDirectDebitAuthorisationList&gt;
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
    public ApiResponse<ResponseBankingDirectDebitAuthorisationList> listDirectDebitsBulkWithHttpInfo(BankingProductCategory productCategory, ParamAccountOpenStatus openStatus, Boolean isOwned, Integer page, Integer pageSize) throws ApiException {
        okhttp3.Call call = listDirectDebitsBulkValidateBeforeCall(productCategory, openStatus, isOwned, page, pageSize, null);
        Type returnType = new TypeToken<ResponseBankingDirectDebitAuthorisationList>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Get Bulk Direct Debits (asynchronously)
     * Obtain direct debit authorisations for multiple, filtered accounts
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
    public okhttp3.Call listDirectDebitsBulkAsync(BankingProductCategory productCategory, ParamAccountOpenStatus openStatus, Boolean isOwned, Integer page, Integer pageSize, final ApiCallback<ResponseBankingDirectDebitAuthorisationList> _callback) throws ApiException {

        LOGGER.trace("Asynchronously listDirectDebitsBulk with product-category: {}, open-status: {}, is-owned: {}, page: {}, page-size: {}",
            productCategory,
            openStatus,
            isOwned,
            page,
            pageSize);

        okhttp3.Call call = listDirectDebitsBulkValidateBeforeCall(productCategory, openStatus, isOwned, page, pageSize, _callback);
        Type returnType = new TypeToken<ResponseBankingDirectDebitAuthorisationList>(){}.getType();
        apiClient.executeAsync(call, returnType, _callback);
        return call;
    }
    /**
     * Build call for listDirectDebitsSpecificAccounts
     * @param accountIds Array of specific accountIds to obtain authorisations for (required)
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
    public okhttp3.Call listDirectDebitsSpecificAccountsCall(RequestAccountIds accountIds, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {

        // create path and map variables
        String path = "/banking/accounts/direct-debits";

        LOGGER.trace("Building Call for listDirectDebitsSpecificAccounts with path: {}, accountIds: {}, page: {}, page-size: {}",
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
    private okhttp3.Call listDirectDebitsSpecificAccountsValidateBeforeCall(RequestAccountIds accountIds, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'accountIds' is set
        if (accountIds == null) {
            throw new ApiException("Missing the required parameter 'accountIds' when calling listDirectDebitsSpecificAccounts(Async)");
        }


        return listDirectDebitsSpecificAccountsCall(accountIds, page, pageSize, _callback);
    }

    /**
     * Get Direct Debits For Specific Accounts
     * Obtain direct debit authorisations for a specified list of accounts
     * @param accountIds Array of specific accountIds to obtain authorisations for (required)
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
     * @return ResponseBankingDirectDebitAuthorisationList
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
    public ResponseBankingDirectDebitAuthorisationList listDirectDebitsSpecificAccounts(RequestAccountIds accountIds, Integer page, Integer pageSize) throws ApiException {

        LOGGER.trace("listDirectDebitsSpecificAccounts with accountIds: {}, page: {}, page-size: {}",
            accountIds,
            page,
            pageSize);

        ApiResponse<ResponseBankingDirectDebitAuthorisationList> resp = listDirectDebitsSpecificAccountsWithHttpInfo(accountIds, page, pageSize);
        return resp.getBody();
    }

    /**
     * Get Direct Debits For Specific Accounts
     * Obtain direct debit authorisations for a specified list of accounts
     * @param accountIds Array of specific accountIds to obtain authorisations for (required)
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
     * @return ApiResponse&lt;ResponseBankingDirectDebitAuthorisationList&gt;
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
    public ApiResponse<ResponseBankingDirectDebitAuthorisationList> listDirectDebitsSpecificAccountsWithHttpInfo(RequestAccountIds accountIds, Integer page, Integer pageSize) throws ApiException {
        okhttp3.Call call = listDirectDebitsSpecificAccountsValidateBeforeCall(accountIds, page, pageSize, null);
        Type returnType = new TypeToken<ResponseBankingDirectDebitAuthorisationList>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Get Direct Debits For Specific Accounts (asynchronously)
     * Obtain direct debit authorisations for a specified list of accounts
     * @param accountIds Array of specific accountIds to obtain authorisations for (required)
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
    public okhttp3.Call listDirectDebitsSpecificAccountsAsync(RequestAccountIds accountIds, Integer page, Integer pageSize, final ApiCallback<ResponseBankingDirectDebitAuthorisationList> _callback) throws ApiException {

        LOGGER.trace("Asynchronously listDirectDebitsSpecificAccounts with accountIds: {}, page: {}, page-size: {}",
            accountIds,
            page,
            pageSize);

        okhttp3.Call call = listDirectDebitsSpecificAccountsValidateBeforeCall(accountIds, page, pageSize, _callback);
        Type returnType = new TypeToken<ResponseBankingDirectDebitAuthorisationList>(){}.getType();
        apiClient.executeAsync(call, returnType, _callback);
        return call;
    }
}
