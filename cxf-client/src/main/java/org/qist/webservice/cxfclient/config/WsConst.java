package org.qist.webservice.cxfclient.config;

/**
 * @author Qist
 * @date 2024/12/3
 * @apiNote
 */
public class WsConst {
	public static final String NAMESPACE_URI = "http://www.qist.org/webservice";
	public static final String SERVICE_ADDRESS = "http://127.0.0.1:30000/ws/human?wsdl";


	// wsimport 访问在线wsdl生成bean，可通过-keep参数保留wsdl文件。
	// wsimport -keep -s src/main/java -p org.qist.webservice.cxfclient.generated.cxf "http://127.0.0.1:30000/ws/human?wsdl"


}
