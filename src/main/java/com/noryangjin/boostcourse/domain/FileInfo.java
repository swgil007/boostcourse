package com.noryangjin.boostcourse.domain;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Table(name="file_info")
@Entity
public class FileInfo {

    @Id
    @GeneratedValue
    private long id;

    private String file_name;

    @Column(columnDefinition = "varchar(4000)")
    private String save_file_name;

    private String content_type;

    private long delete_flag;

    private LocalDateTime create_date;

    private LocalDateTime modify_date;
}
