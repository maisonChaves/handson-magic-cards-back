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
    @Column(name = "expansionid", columnDefinition = "int")
    private Integer expansionId;

    @Column(name = "name", nullable = false, columnDefinition = "text")
    private String name;

    @Column(name = "ptbrname", columnDefinition = "text")
    private String ptBrName;

    @Column(name = "linkname", nullable = false, columnDefinition = "text")
    private String linkName;

    @Column(name = "code", nullable = false, columnDefinition = "varchar")
    private String code;

    @Column(name = "launchdate", nullable = false, columnDefinition = "date")
    private Date launchDate;

    @Column(name = "expansioncategoryid", nullable = false, columnDefinition = "smallint")
    private Short expansionCategoryId;

    @Column(name = "ispromo", columnDefinition = "bit")
    private boolean promo;

    @Column(name = "islegal", columnDefinition = "bit")
    private boolean legal;

}
