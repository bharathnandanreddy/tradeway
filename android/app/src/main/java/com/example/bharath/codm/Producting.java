package com.example.bharath.codm;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.DynamicArray;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple2;
import org.web3j.tuples.generated.Tuple4;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 3.5.0.
 */
public class Producting extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b5060008054600160a060020a03191633179055610ea3806100326000396000f3006080604052600436106100825763ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166342796b6a811461008757806348a9653b146101265780639b3a95721461014d5780639d88a19214610229578063bd8ce22c14610250578063d5ef5765146103a9578063fa5441611461041a575b600080fd5b34801561009357600080fd5b506040805160206004803580820135601f810184900484028501840190955284845261012494369492936024939284019190819084018382808284375050604080516020601f818a01358b0180359182018390048302840183018552818452989b8a359b909a9099940197509195509182019350915081908401838280828437509497506105199650505050505050565b005b34801561013257600080fd5b50610124600160a060020a0360043581169060243516610581565b60408051602060046024803582810135601f8101859004850286018501909652858552610124958335600160a060020a031695369560449491939091019190819084018382808284375050604080516020601f89358b018035918201839004830284018301909452808352979a99988101979196509182019450925082915084018382808284375050604080516020601f818a01358b0180359182018390048302840183018552818452989b8a359b909a9099940197509195509182019350915081908401838280828437509497506106699650505050505050565b34801561023557600080fd5b50610124600160a060020a0360043581169060243516610778565b34801561025c57600080fd5b50610271600160a060020a0360043516610986565b6040518085600160a060020a0316600160a060020a03168152602001806020018060200180602001848103845287818151815260200191508051906020019080838360005b838110156102ce5781810151838201526020016102b6565b50505050905090810190601f1680156102fb5780820380516001836020036101000a031916815260200191505b50848103835286518152865160209182019188019080838360005b8381101561032e578181015183820152602001610316565b50505050905090810190601f16801561035b5780820380516001836020036101000a031916815260200191505b508481038252855181528551602091820191808801910280838360005b83811015610390578181015183820152602001610378565b5050505090500197505050505050505060405180910390f35b3480156103b557600080fd5b506103ca600160a060020a0360043516610b6b565b60408051602080825283518183015283519192839290830191858101910280838360005b838110156104065781810151838201526020016103ee565b505050509050019250505060405180910390f35b34801561042657600080fd5b5061043b600160a060020a0360043516610be1565b604051808060200180602001838103835285818151815260200191508051906020019080838360005b8381101561047c578181015183820152602001610464565b50505050905090810190601f1680156104a95780820380516001836020036101000a031916815260200191505b50838103825284518152845160209182019186019080838360005b838110156104dc5781810151838201526020016104c4565b50505050905090810190601f1680156105095780820380516001836020036101000a031916815260200191505b5094505050505060405180910390f35b3360008181526003602090815260409091208054600160a060020a0319169092178255845161054e9260010191860190610db3565b50336000908152600360208181526040909220908101849055825161057b92600290920191840190610db3565b50505050565b600160a060020a03808316600081815260036020526040812054909216146105a857600080fd5b50600160a060020a038082166000908152600260205260409020600381018054919285169160001981019081106105db57fe5b600091825260209091200154600160a060020a031614156105fb57600080fd5b600381018054339190600019810190811061061257fe5b600091825260209091200154600160a060020a03161461063157600080fd5b600301805460018101825560009182526020909120018054600160a060020a031916600160a060020a03939093169290921790915550565b600160a060020a03851660008181526002602090815260409091208054600160a060020a031916909217825585516106a79260010191870190610db3565b50600160a060020a038516600090815260026020818152604090922085516106d793919092019190860190610db3565b50600160a060020a0385166000908152600260209081526040808320600390810180546001808201835591865284862001805433600160a060020a0319918216811790925581875292855292909420805490911690911781558551610743939190910191860190610db3565b50336000908152600360208181526040909220908101849055825161077092600290920191840190610db3565b505050505050565b600160a060020a03808316600081815260036020526040812054909283928392909116146107a557600080fd5b600160a060020a038085166000908152600260205260409020600381018054919550918716919060001981019081106107da57fe5b600091825260209091200154600160a060020a031614156107fa57600080fd5b600383018054339190600019810190811061081157fe5b600091825260209091200154600160a060020a03161461083057600080fd5b505060038101805460018082018355600092835260208084209092018054600160a060020a031916600160a060020a0388161790553383529052604081205b80548210156109465783600160a060020a0316818381548110151561089057fe5b600091825260209091200154600160a060020a0316141561093b575b8054600019018210156109255780826001018154811015156108ca57fe5b6000918252602090912001548154600160a060020a03909116908290849081106108f057fe5b60009182526020909120018054600160a060020a031916600160a060020a0392909216919091179055600191909101906108ac565b8054610935826000198301610e31565b50610946565b60019091019061086f565b505050600160a060020a0391821660009081526001602081815260408320805492830181558352909120018054600160a060020a03191691909216179055565b600160a060020a0380821660008181526002602052604081205490926060928392839286929116146109b757600080fd5b50600160a060020a03858116600090815260026020818152604092839020805460018083018054875161010093821615939093026000190116869004601f810186900486028301860190975286825292969190911694919386019260038701928591830182828015610a6a5780601f10610a3f57610100808354040283529160200191610a6a565b820191906000526020600020905b815481529060010190602001808311610a4d57829003601f168201915b5050855460408051602060026001851615610100026000190190941693909304601f810184900484028201840190925281815295985087945092508401905082828015610af85780601f10610acd57610100808354040283529160200191610af8565b820191906000526020600020905b815481529060010190602001808311610adb57829003601f168201915b5050505050915080805480602002602001604051908101604052809291908181526020018280548015610b5457602002820191906000526020600020905b8154600160a060020a03168152600190910190602001808311610b36575b505050505090509450945094509450509193509193565b600160a060020a038116600090815260016020908152604091829020805483518184028101840190945280845260609392830182828015610bd557602002820191906000526020600020905b8154600160a060020a03168152600190910190602001808311610bb7575b50505050509050919050565b600160a060020a038082166000818152600360205260409020546060928392911614610c6e57604080517f08c379a000000000000000000000000000000000000000000000000000000000815260206004820152600a60248201527f7265737472696374656400000000000000000000000000000000000000000000604482015290519081900360640190fd5b600160a060020a0383166000908152600360209081526040918290206001808201805485516002938216156101000260001901909116839004601f810186900486028201860190965285815290949190920192849190830182828015610d155780601f10610cea57610100808354040283529160200191610d15565b820191906000526020600020905b815481529060010190602001808311610cf857829003601f168201915b5050845460408051602060026001851615610100026000190190941693909304601f810184900484028201840190925281815295975086945092508401905082828015610da35780601f10610d7857610100808354040283529160200191610da3565b820191906000526020600020905b815481529060010190602001808311610d8657829003601f168201915b5050505050905091509150915091565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f10610df457805160ff1916838001178555610e21565b82800160010185558215610e21579182015b82811115610e21578251825591602001919060010190610e06565b50610e2d929150610e5a565b5090565b815481835581811115610e5557600083815260209020610e55918101908301610e5a565b505050565b610e7491905b80821115610e2d5760008155600101610e60565b905600a165627a7a72305820077001a75bc3a43b364be5338142c3e6d612e9a8bad5212115818bbe214bd58e0029";

    public static final String FUNC_SETOWNER = "setOwner";

    public static final String FUNC_ADDBUYER = "addBuyer";

    public static final String FUNC_SETPRODUCT = "setProduct";

    public static final String FUNC_ADDCUSTOMER = "addCustomer";

    public static final String FUNC_GETPRODUCTDETAILS = "getProductDetails";

    public static final String FUNC_GETCUSTOMERPRODUCTS = "getCustomerProducts";

    public static final String FUNC_GETOWNER = "getOwner";

    protected Producting(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Producting(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public RemoteCall<TransactionReceipt> setOwner(String _name, BigInteger _mobile, String _mail) {
        final Function function = new Function(
                FUNC_SETOWNER, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_name), 
                new org.web3j.abi.datatypes.generated.Uint256(_mobile), 
                new org.web3j.abi.datatypes.Utf8String(_mail)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> addBuyer(String adds, String _id) {
        final Function function = new Function(
                FUNC_ADDBUYER, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(adds), 
                new org.web3j.abi.datatypes.Address(_id)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setProduct(String _id, String _productName, String _company, BigInteger _mobile, String _mail, BigInteger weiValue) {
        final Function function = new Function(
                FUNC_SETPRODUCT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_id), 
                new org.web3j.abi.datatypes.Utf8String(_productName), 
                new org.web3j.abi.datatypes.Utf8String(_company), 
                new org.web3j.abi.datatypes.generated.Uint256(_mobile), 
                new org.web3j.abi.datatypes.Utf8String(_mail)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, weiValue);
    }

    public RemoteCall<TransactionReceipt> addCustomer(String adds, String _id) {
        final Function function = new Function(
                FUNC_ADDCUSTOMER, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(adds), 
                new org.web3j.abi.datatypes.Address(_id)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<Tuple4<String, String, String, List<Address>>> getProductDetails(String _id) {
        final Function function = new Function(FUNC_GETPRODUCTDETAILS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_id)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<DynamicArray<Address>>() {}));
        return new RemoteCall<Tuple4<String, String, String, List<Address>>>(
                new Callable<Tuple4<String, String, String, List<Address>>>() {
                    @Override
                    public Tuple4<String, String, String, List<Address>> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple4<String, String, String, List<Address>>(
                                (String) results.get(0).getValue(), 
                                (String) results.get(1).getValue(), 
                                (String) results.get(2).getValue(), 
                                ((List<Address>) results.get(3).getValue()));
                    }
                });
    }

    public RemoteCall<List> getCustomerProducts(String adds) {
        final Function function = new Function(FUNC_GETCUSTOMERPRODUCTS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(adds)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Address>>() {}));
        return new RemoteCall<List>(
                new Callable<List>() {
                    @Override
                    @SuppressWarnings("unchecked")
                    public List call() throws Exception {
                        List<Type> result = (List<Type>) executeCallSingleValueReturn(function, List.class);
                        return convertToNative(result);
                    }
                });
    }

    public RemoteCall<Tuple2<String, String>> getOwner(String adds) {
        final Function function = new Function(FUNC_GETOWNER, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(adds)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}));
        return new RemoteCall<Tuple2<String, String>>(
                new Callable<Tuple2<String, String>>() {
                    @Override
                    public Tuple2<String, String> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<String, String>(
                                (String) results.get(0).getValue(), 
                                (String) results.get(1).getValue());
                    }
                });
    }

    public static RemoteCall<Producting> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Producting.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<Producting> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Producting.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    public static Producting load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Producting(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static Producting load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Producting(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
