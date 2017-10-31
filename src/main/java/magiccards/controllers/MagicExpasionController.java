package magiccards.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import magiccards.entities.MagicExpansion;
import magiccards.repositories.MagicExpansionRepository;

@RestController
@RequestMapping("magicexpansion")
public class MagicExpasionController {

	@Autowired
	private MagicExpansionRepository magicExpansionRepository;
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET, produces = "application/json")
	public MagicExpansion getMagicExpasionById(@PathVariable("id") Integer expansionID) {
		return magicExpansionRepository.findOne(expansionID);
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
	public Page<MagicExpansion> getMagicExpasion(@RequestParam(value="page")int pageNumber, @RequestParam int size) {
		Pageable page = new PageRequest(pageNumber, size);
		return magicExpansionRepository.findAll(page);
	}

	@RequestMapping(value = "", method = RequestMethod.POST, consumes = "application/json")
	public void create(@RequestBody MagicExpansion magicExpansion) {
		magicExpansionRepository.save(magicExpansion);
	}

	@RequestMapping(value = "", method = RequestMethod.PUT, consumes = "application/json")
	public void update(@RequestBody MagicExpansion magicExpansion) {
		magicExpansionRepository.save(magicExpansion);
	}

	@RequestMapping(value = "{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id")Integer id) {
		magicExpansionRepository.delete(id);
	}
}
