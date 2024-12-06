package org.qist.webservice.cxfserver.service;

import org.qist.webservice.cxfserver.dto.HumanDto;
import org.qist.webservice.cxfserver.dto.Sex;
import org.qist.webservice.cxfserver.dto.WsConst;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * @author qist
 *  指定发布webservcie的接口类，此类也需要接入@WebService注解
 */
@Service
@WebService(
		targetNamespace = WsConst.NAMESPACE_URI,    //wsdl命名空间
		serviceName = "humanService"               //服务name名称
		// name = "authorPortType",                 //portType名称 客户端生成代码时 为接口名称
		// portName = "authorPortName",             //port名称 AuthorServiceImplPort
		// endpointInterface = "org.qist.webservice.cxfserver.service.AuthorService"
)
public class HumanServiceImpl implements HumanService{

	@Override
	public HumanDto getHumanInfoByName(String name) {
		HumanDto author = new HumanDto();
		author.setBirthday("1990-10-24");
		author.setName("姓名：" + name);
		author.setSex(Sex.MALE);
		author.setHobby(Arrays.asList("电影","旅游"));
		author.setDescription("描述现在时间：" + System.currentTimeMillis());
		return author;
	}

	@Override
	public List<HumanDto> getHumanList() {
		List<HumanDto> resultList = new ArrayList<>();
		HumanDto author = new HumanDto();
		author.setBirthday("1990-10-24");
		author.setName("姓名：qist");
		author.setSex(Sex.MALE);
		author.setHobby(Arrays.asList("电影","旅游"));
		author.setDescription("描述现在时间：" + System.currentTimeMillis());
		resultList.add(author);
		resultList.add(author);
		return resultList;
	}

	@Override
	public String getHumanString(String name) {
		HumanDto author = getHumanInfoByName(name);
		return author.toString();
	}
}