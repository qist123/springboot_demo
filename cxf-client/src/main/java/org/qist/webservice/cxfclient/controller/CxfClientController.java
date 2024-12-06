package org.qist.webservice.cxfclient.controller;

import org.apache.cxf.endpoint.Client;
import org.qist.webservice.cxfclient.generated.cxf.HumanDto;
import org.qist.webservice.cxfclient.generated.cxf.HumanPortType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/client")
public class CxfClientController {

	@Autowired
	Client client;

	@Autowired
	@Qualifier("cxfProxy")
	HumanPortType humanPortType;

	@GetMapping("/gethumanstring")
	public String getAuthorString(String name) {
		return humanPortType.getHumanString(name);
	}

	@GetMapping("/gethuman")
	public HumanDto getAuthor(String name) {
		return humanPortType.getHumanInfoByName(name);
	}

	@GetMapping("/getauthorlist")
	public List<HumanDto> getAuthorList() {
		return humanPortType.getHumanList();
	}

	@GetMapping("/dynamic/{operation}")
	public Object getAuthorStringByDynamic(@PathVariable("operation")String operationName, String humanName) throws Exception {
		//这里就简单的判断了
		Object[] objects;
		if ("getHumanList".equalsIgnoreCase(operationName)) {
			objects = client.invoke(operationName);
		} else if ("getHumanString".equalsIgnoreCase(operationName)) {
			objects = client.invoke(operationName, humanName);
		} else if ("getHumanInfoByName".equalsIgnoreCase(operationName)) {
			objects = client.invoke(operationName, humanName);
		} else {
			throw new RuntimeException("无效的调用方法");
		}
		return objects != null && objects.length > 0 ? objects[0] : "返回异常";
	}

}
