package org.zerock.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.ProductVo;

@Controller
public class SampleController5 {
	
	@RequestMapping("/doJSON")
	public @ResponseBody ProductVo doJSON(){
		
		ProductVo vo = new ProductVo("»ùÇÃ»óÇ°", 300000);
		
		return vo;
				
	}

}
