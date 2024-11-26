package org.example.movieticketbooking;

import java.util.Date;

public class Booking {

    private int id;
    private int userId;
    private int movieId;
    private String showtime;
    private int seatCount;
    private Date bookingDate; // Added for additional tracking

    public Booking() {
    }

    public Booking(int id, int userId, int movieId, String showtime, int seatCount, Date bookingDate) {
        this.id = id;
        this.userId = userId;
        this.movieId = movieId;
        this.showtime = showtime;
        this.seatCount = seatCount;
        this.bookingDate = bookingDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getShowtime() {
        return showtime;
    }

    public void setShowtime(String showtime) {
        this.showtime = showtime;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", userId=" + userId +
                ", movieId=" + movieId +
                ", showtime='" + showtime + '\'' +
                ", seatCount=" + seatCount +
                ", bookingDate=" + bookingDate +
                '}';
    }
}

