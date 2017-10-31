package magiccards.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@Table(name = "magicexpansion")
public class MagicExpansion {

    @Id
    @Column(name = "ExpansionId")
    private Integer expansionId;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "PtBRName")
    private String ptBrName;

    @Column(name = "LinkName", nullable = false)
    private String linkName;

    @Column(name = "Code", nullable = false)
    private String code;

    @Column(name = "LaunchDate", nullable = false)
    private Date launchDate;

    @Column(name = "ExpansionCategoryId", nullable = false)
    private Integer expansionCategoryId;

    @Column(name = "IsPromo")
    private boolean promo;

    @Column(name = "IsLegal")
    private boolean legal;

}
