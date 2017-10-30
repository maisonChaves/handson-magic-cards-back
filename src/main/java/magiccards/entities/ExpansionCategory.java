package magiccards.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "magicexpansioncategory")
public class ExpansionCategory {

	@Id
	@Column(name = "ExpansionCategoryId")
	private Long expansionCategoryId;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "Type")	
	private char type;
}
