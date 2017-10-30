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
	@Column(name = "ExpansionId")
	private Long expansionId;
	
	@Column(name = "Name")
	private String name;

	@Column(name = "PtBRName", columnDefinition = "text")
	private String ptBRName;

	@Column(name = "LinkName", columnDefinition = "text")
	private String linkName;

	@Column(name = "Code")
	private String code;
	
	@Column(name = "LaunchDate")
	private Date launchDate;
	
	@ManyToOne
	@JoinColumn(name = "ExpansionCategoryId")
	private ExpansionCategory expansionCategory;
	
	@Column(name = "IsPromo")
	private Boolean isPromo;
	
	@Column(name = "IsLegal")	
	private Boolean isLegal; 
}
