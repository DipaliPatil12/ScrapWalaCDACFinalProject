package ScrapWala.ScrapWala.services;

import java.util.List;

import ScrapWala.ScrapWala.Dto.ScrapDto;

public interface ScrapService {
	

	ScrapDto createScrap(ScrapDto scrapDto);
	
	ScrapDto updateScrap(ScrapDto scrap);
	
	ScrapDto getScrap(Integer scrapId);
	
	List<ScrapDto> getAllScraps();
	
	void deleteScrap(Integer scrapId);
}
