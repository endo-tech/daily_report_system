package models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "reactiontype")
public class Reactiontype {
    @Id
    @Column
    @JoinColumn(name = "employee_id" , nullable = false)
    private Employee employee;

    @Column(name = "reaction_type" , nullable = false)
    private String reaction_type;

    Reactiontype reactiontype = new Reactiontype();

    public enum reactiontype {
        good,
        bad
        }
    //グッドとバッドをゲットラベルのメソッドで作成。
        public String getlabel() {
            //リターン文で値を返す
            return this.getlabel();
        }
  }



