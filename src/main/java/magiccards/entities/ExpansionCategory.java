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
	@Column(name = "expansioncategoryid")
	private Integer expansionCategoryId;

	@Column(name = "name")
	private String name;

	@Column(name = "type")
	private char type;
}
