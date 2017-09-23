package com.example.enghaya.book_app;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by ENG.HAYA on 9/12/2017 AD.
 */

public class Book implements Parcelable {
    public static final Creator<Book> CREATOR = new Creator<Book>() {
        @Override
        public Book createFromParcel(Parcel in) {
            return new Book(in);
        }

        @Override
        public Book[] newArray(int size) {
            return new Book[size];
        }
    };
    String titleinformation;
    String author;

    public Book(String titleinformation, String author) {
        this.titleinformation = titleinformation;
        this.author = author;
    }

    protected Book(Parcel in) {
        titleinformation = in.readString();
        author = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(titleinformation);
        dest.writeString(author);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public String getTitleinformation() {
        return titleinformation;
    }

    public String getAuthor() {
        return author;
    }
}