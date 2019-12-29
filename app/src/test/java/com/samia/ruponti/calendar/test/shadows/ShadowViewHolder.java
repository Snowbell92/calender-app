package com.samia.ruponti.calendar.test.shadows;

import androidx.recyclerview.widget.RecyclerView;

import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;

@Implements(RecyclerView.ViewHolder.class)
public class ShadowViewHolder {
    public int adapterPosition;

    @Implementation
    public int getAdapterPosition() {
        return adapterPosition;
    }
}
