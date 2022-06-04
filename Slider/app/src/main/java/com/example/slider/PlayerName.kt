package com.example.slider

import android.os.Parcel
import android.os.Parcelable

class PlayerName(var player1: String? ="", var player2:String?="") :Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(player1)
        parcel.writeString(player2)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PlayerName> {
        override fun createFromParcel(parcel: Parcel): PlayerName {
            return PlayerName(parcel)
        }

        override fun newArray(size: Int): Array<PlayerName?> {
            return arrayOfNulls(size)
        }
    }
}