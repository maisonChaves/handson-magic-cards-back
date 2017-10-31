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

import magiccards.entities.Card;
import magiccards.repositories.CardRepository;

@RestController
@RequestMapping("magicExpasion")
public class MagicExpasion {

	@Autowired
	//FIXME alterar repositorio apos criacao.
	private CardRepository magicExpasionRepository;
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET, produces = "application/json")
	public Card getMagicExpasionById(@PathVariable("id") String expansionID) {
		return magicExpasionRepository.findOne(expansionID);
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
	public Page<Card> getMagicExpasion(@RequestParam(value="page")int pageNumber, @RequestParam int size) {
		Pageable page = new PageRequest(pageNumber, size);
		return magicExpasionRepository.findAll(page);
	}

	@RequestMapping(value = "", method = RequestMethod.POST, consumes = "application/json")
	public void create(@RequestBody Card card) {
		magicExpasionRepository.save(card);
	}

	@RequestMapping(value = "", method = RequestMethod.PUT, consumes = "application/json")
	public void update(@RequestBody Card card) {
		magicExpasionRepository.save(card);
	}

	@RequestMapping(value = "{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id")String id) {
		magicExpasionRepository.delete(id);
	}
}
