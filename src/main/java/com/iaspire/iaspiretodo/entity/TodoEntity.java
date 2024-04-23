package com.iaspire.iaspiretodo.entity;

/*import jakarta.persistence.Entity;
import jakarta.persistence.Id;*/
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
/*@Entity(name = "Todo")*/
@AllArgsConstructor
public class TodoEntity {

/*    @Id*/
    private long todoId;
    private String todoName;
    private String todoDesc;
    private String todoOwner;
    private Date todoCreationDt;
    private Date todoCompletionDt;
    private boolean isTodoCompleted;




    public TodoEntity() {

    }
}
