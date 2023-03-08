package ScrapWala.ScrapWala.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;

import ScrapWala.ScrapWala.Dto.ScrapDto;
import ScrapWala.ScrapWala.dao.ScrapDao;
import ScrapWala.ScrapWala.entities.Scrap;

public class ScrapServiceImpl implements ScrapService {

	@Autowired
	private ScrapDao scrapDao;
	
	@Autowired
	private ModelMapper modelMapper;
//	
	

	@Override
	public ScrapDto createScrap(ScrapDto scrapDto) {
		Scrap scrap=this.dtoToScrap(scrapDto);
		Scrap savedScrap = this.scrapDao.save(scrap);
		return this.scrapToDto(savedScrap);
	}

//	@Override
//	public ScrapDto updateScrap(ScrapDto scrapDto) {
//		// TODO Auto-generated method stub
//		Scrap scrap=this.scrapDao.save(scrapDto);
//		this.modelMapper.map(scrapDto, scrap);
//		return null;
//	}

	@Override
	public ScrapDto getScrap(Integer scrapId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ScrapDto> getAllScraps() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteScrap(Integer scrapId) {
		// TODO Auto-generated method stub
		
	}
	
	public ScrapDto scrapToDto(Scrap scrap) {
		ScrapDto scrapDto = this.modelMapper.map(scrap, ScrapDto.class);
		
//		ScrapDto scrapDto = new ScrapDto();
//		scrapDto.setId(scrap.getId());
//		scrapDto.setName(scrap.getName());
//		scrapDto.setRate(scrap.getRate());
		return scrapDto;		
	}
	
	public Scrap dtoToScrap(ScrapDto scrapDto) {
		Scrap scrap = this.modelMapper.map(scrapDto, Scrap.class);
		
//		Scrap scrap = new Scrap();
//		scrap.setId(scrapDto.getId());
//		scrap.setName(scrapDto.getName());
//		scrap.setRate(scrapDto.getRate());
		return scrap;
	}

	@Override
	public ScrapDto updateScrap(ScrapDto scrapDto) {
		// TODO Auto-generated method stub
		Scrap scrap=this.scrapDao.;
		this.modelMapper.map(scrapDto, scrap);
		return null;
	
	}

}
