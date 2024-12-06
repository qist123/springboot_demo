package org.qist.webservice.cxfserver.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 作者信息实体
 * @author oKong
 *
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HumanDto {

	String name;

	List<String> hobby;

	String birthday;

	String description;

	Sex sex;
}