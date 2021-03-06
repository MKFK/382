package com.colin.anbet.promotion;

import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.colin.anbet.R;
import com.colin.anbet.entity.bean383.PromoteNextData;
import com.colin.anbet.util.Utils;

import java.util.List;

public class DirectAdapter
        extends BaseQuickAdapter<PromoteNextData, BaseViewHolder> {
    public DirectAdapter(@Nullable List<PromoteNextData> paramList) {
        super(R.layout.item_directly, paramList);
    }

    protected void convert(BaseViewHolder vh, PromoteNextData item) {

        int resId;
        if (vh.getLayoutPosition() % 2 == 0) {

            resId = R.color.pc_bg_gray1;
        } else {
            resId = R.color.pc_bg_gray2;
        }
        vh.itemView.setBackgroundResource(resId);
        vh.setText(R.id.tv_id, String.valueOf(item.getUserId()));
        String name = item.getUserName() == null ? "_" : item.getUserName();
        vh.setText(R.id.tv_nick_name, name);
        vh.setText(R.id.tv_flow, Utils.double2Decimal(item.getSelfPerformanceToday()));
        vh.setText(R.id.tv_total_flow, Utils.double2Decimal(item.getDamaNumber()));
        vh.setText(R.id.tv_team_count, Utils.double2Decimal(item.getTotalNumOfTeam()));
        vh.setText(R.id.tv_directly_num, Utils.double2Decimal(item.getDirectNum()));
//        ImageView imageView = vh.getView(R.id.iv_oprate);
//        imageView.setOnClickListener(null);
    }
}


