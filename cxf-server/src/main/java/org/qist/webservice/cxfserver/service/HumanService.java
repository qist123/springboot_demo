package org.qist.webservice.cxfserver.service;


import org.qist.webservice.cxfserver.dto.HumanDto;
import org.qist.webservice.cxfserver.dto.WsConst;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

/**
 * 创建服务接口
 */
@WebService(targetNamespace = WsConst.NAMESPACE_URI ,name = "humanPortType")
public interface HumanService {

	/**
	 * 根据名称获取作者信息
	 */
	@WebMethod(operationName="getHumanInfoByName")
	HumanDto getHumanInfoByName(@WebParam(name = "name") String name);

	/**
	 * 获取作者列表信息
	 * @return
	 */
	@WebMethod
	List<HumanDto> getHumanList();

	/**
	 * 返回字符串测试
	 *  @return
	 */
	String getHumanString(@WebParam(name = "name")String name);
}
