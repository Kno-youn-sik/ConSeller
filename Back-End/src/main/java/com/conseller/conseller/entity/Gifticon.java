package com.conseller.conseller.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@EqualsAndHashCode(of = "gifticonIdx")
public class Gifticon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long gifticonIdx;

    @Column(name = "gifticon_barcode", nullable = false)
    private String gifticonBarcode;

    @Column(name = "gifticon_name", nullable = false)
    private String gifticonName;

    /*
    생성 시에 초 단위는 어떻게 할껀지?
     */
    @CreatedDate
    private LocalDateTime gifticonStartDate;

    @Column(name = "gifticon_end_date")
    private LocalDateTime gifticonEndDate;

    @LastModifiedDate
    private LocalDateTime gifticonRegistedDate;

    @Column(name = "gifticon_all_image_name")
    private String gifticonAllImageName;

    @Column(name = "gifticon_data_image_name")
    private String gifticonDateImageName;

//    @Enumerated
//    private Enum gifticonStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_idx")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sub_category_idx")
    private SubCategory subCategory;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "main_category_idx")
    private MainCategory mainCategory;

}
