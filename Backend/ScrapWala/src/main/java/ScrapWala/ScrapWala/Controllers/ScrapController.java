package ScrapWala.ScrapWala.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ScrapWala.ScrapWala.Dto.ScrapDto;
import ScrapWala.ScrapWala.services.ScrapService;

@RestController
@RequestMapping("/api/scraps")
@CrossOrigin("*")
public class ScrapController {

	@Autowired
	private ScrapService scrapService;
	
	@PostMapping("/addscrap")
	public ResponseEntity<ScrapDto> createScrap(@RequestBody ScrapDto scrapDto){
		ScrapDto createScrapDto = this.scrapService.createScrap(scrapDto);
		return new ResponseEntity<>(createScrapDto,HttpStatus.CREATED);
	}
	
}
