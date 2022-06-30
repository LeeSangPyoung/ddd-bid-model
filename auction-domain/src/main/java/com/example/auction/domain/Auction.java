package com.example.auction.domain;

import org.springframework.beans.BeanUtils;

import com.example.auction.domain.AuctionStatus
;import com.example.auction.AuctionApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import javax.persistence.*;

@Entity

public abstract class Auction {     // Entity. Domain Class.


    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    Long id;    
        public Long getId() {
            return id;
        }

    Long lectureId;    

    public Long getLectureId() {
        return lectureId;
    }
    public void setLectureId(Long lectureId) {
        this.lectureId = lectureId;
    }

    Date startAuctionDate;

        public Date getStartAuctionDate() {
            return startAuctionDate;
        }
        public void setStartAuctionDate(Date startAuctionDate) {
            this.startAuctionDate = startAuctionDate;
        }

    Date endAuctionDate;
        public Date getEndAuctionDate() {
            return endAuctionDate;
        }
        public void setEndAuctionDate(Date endAuctionDate) {
            this.endAuctionDate = endAuctionDate;
        }

    String auctionStatus;
        public String getAuctionStatus() {
            return auctionStatus;
        }
        public void setAuctionStatus(String auctionStatus) {
            this.auctionStatus = auctionStatus;
        }


    public String cancel() {
        //answer must be obtained by UI
        setAuctionStatus("CANCEL"); //취소
        return "경매가 취소되었읍니다.";
    }

    


    @Override
    public String toString() {
        
        return "<a href='./"+this.getClass().getSimpleName().toLowerCase()+"'" + ">" + this.getClass().getSimpleName() + "</a>";
    }
    
}
