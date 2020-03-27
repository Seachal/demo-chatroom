package cn.rongcloud.chatroomdemo.messageview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import cn.rongcloud.chatroomdemo.R;
import cn.rongcloud.chatroomdemo.utils.DataInterface;
import io.rong.imlib.model.MessageContent;
import io.rong.message.ChatroomUserUnBlock;

/**
 * Created by duanliuyi on 2018/6/20.
 */

public class UserUnBlockView extends BaseMsgView {

    private TextView tvInfo;

    public UserUnBlockView(Context context) {
        super(context);
        View view = LayoutInflater.from(getContext()).inflate(R.layout.msg_system_view, this);
        tvInfo = (TextView) view.findViewById(R.id.tv_system_info);
    }

    @Override
    protected void onBindContent(MessageContent msgContent, String senderUserId) {
        if (msgContent instanceof ChatroomUserUnBlock) {
            String id = ((ChatroomUserUnBlock) msgContent).getId();
            String name = getSendUserName();
            tvInfo.setText("系统通知  " + name + "已被解除禁封");
        }

    }
}
