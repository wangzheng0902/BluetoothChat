// Generated code from Butter Knife. Do not modify!
package com.usr.usrsimplebleassistent.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MessagesAdapter$MessageViewHolderLeft$$ViewBinder<T extends com.usr.usrsimplebleassistent.adapter.MessagesAdapter.MessageViewHolderLeft> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558563, "field 'tvMsgContent'");
    target.tvMsgContent = finder.castView(view, 2131558563, "field 'tvMsgContent'");
  }

  @Override public void unbind(T target) {
    target.tvMsgContent = null;
  }
}
