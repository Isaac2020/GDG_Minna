package com.gdgminna.android.gdgminna;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.List;
/**
 * Created by MAGANI on 29/12/2016.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MemberViewHolder> {

    private List<Member> members;
    private Context context;

    public RecyclerViewAdapter(List<Member> members, Context context) {
        this.members = members;
        this.context = context;
    }

public class MemberViewHolder extends RecyclerView.ViewHolder {

    private CardView cardView;
    private TextView name_tv;
    private TextView office_tv;
    private TextView email_tv;
    private ImageView pic_iv;

    public MemberViewHolder(View itemView) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.cardview);
        name_tv = (TextView) itemView.findViewById(R.id.member_name);
        office_tv = (TextView) itemView.findViewById(R.id.member_office);
        email_tv = (TextView) itemView.findViewById(R.id.member_email);
        pic_iv = (ImageView) itemView.findViewById(R.id.profile_pic);
    }
    }
    @Override
    public void onBindViewHolder(MemberViewHolder memberViewHolder, int i) {
        memberViewHolder.name_tv.setText(members.get(i).getName());
        memberViewHolder.office_tv.setText(members.get(i).getOffice());
        memberViewHolder.email_tv.setText(members.get(i).getEmail());
        memberViewHolder.pic_iv.setImageResource(members.get(i).getPhotoID());
    }

    @Override
    public MemberViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_organisers, viewGroup, false);
        MemberViewHolder memberViewHolder = new MemberViewHolder(view);
        return memberViewHolder;
    }

    @Override
    public int getItemCount() {
        return members.size();
    }
}
