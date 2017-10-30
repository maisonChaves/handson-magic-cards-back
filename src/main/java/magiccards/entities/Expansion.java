package magiccards.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "magicexpansion")
public class Expansion {

	@Id
	@Column(name = "expansionid")
	private Integer expansionId;

	@Column(name = "name")
	private String name;

	@Column(name = "ptbrName", columnDefinition = "text")
	private String ptBRName;

	@Column(name = "linkname", columnDefinition = "text")
	private String linkName;

	@Column(name = "code")
	private String code;

	@Column(name = "launchdate")
	private Date launchDate;

	@ManyToOne
	@JoinColumn(name = "expansioncategoryid")
	private ExpansionCategory expansionCategory;

	@Column(name = "ispromo")
	private Boolean isPromo;

	@Column(name = "islegal")
	private Boolean isLegal;
}
