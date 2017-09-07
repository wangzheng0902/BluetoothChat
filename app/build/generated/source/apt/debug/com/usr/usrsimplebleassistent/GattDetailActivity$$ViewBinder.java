// Generated code from Butter Knife. Do not modify!
package com.usr.usrsimplebleassistent;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class GattDetailActivity$$ViewBinder<T extends com.usr.usrsimplebleassistent.GattDetailActivity> extends com.usr.usrsimplebleassistent.MyBaseActivity$$ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    super.bind(finder, target, source);

    View view;
    view = finder.findRequiredView(source, 2131558510, "field 'btnOptions' and method 'onOptionsClick'");
    target.btnOptions = finder.castView(view, 2131558510, "field 'btnOptions'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onOptionsClick();
        }
      });
    view = finder.findRequiredView(source, 2131558511, "field 'btnOption' and method 'onOptionClick'");
    target.btnOption = finder.castView(view, 2131558511, "field 'btnOption'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onOptionClick();
        }
      });
    view = finder.findRequiredView(source, 2131558515, "field 'rvMsg'");
    target.rvMsg = finder.castView(view, 2131558515, "field 'rvMsg'");
    view = finder.findRequiredView(source, 2131558508, "field 'tvProperties'");
    target.tvProperties = finder.castView(view, 2131558508, "field 'tvProperties'");
    view = finder.findRequiredView(source, 2131558514, "field 'etWrite'");
    target.etWrite = finder.castView(view, 2131558514, "field 'etWrite'");
    view = finder.findRequiredView(source, 2131558513, "field 'btnSend' and method 'onSendClick'");
    target.btnSend = finder.castView(view, 2131558513, "field 'btnSend'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onSendClick();
        }
      });
    view = finder.findRequiredView(source, 2131558512, "field 'rlWrite'");
    target.rlWrite = finder.castView(view, 2131558512, "field 'rlWrite'");
    view = finder.findRequiredView(source, 2131558507, "field 'rlContent'");
    target.rlContent = finder.castView(view, 2131558507, "field 'rlContent'");
    view = finder.findRequiredView(source, 2131558509, "field 'rlBottom'");
    target.rlBottom = finder.castView(view, 2131558509, "field 'rlBottom'");
    view = finder.findRequiredView(source, 2131558517, "field 'bottomShadow'");
    target.bottomShadow = view;
    view = finder.findRequiredView(source, 2131558516, "field 'topShadow'");
    target.topShadow = view;
    view = finder.findRequiredView(source, 2131558505, "field 'filterView'");
    target.filterView = view;
  }

  @Override public void unbind(T target) {
    super.unbind(target);

    target.btnOptions = null;
    target.btnOption = null;
    target.rvMsg = null;
    target.tvProperties = null;
    target.etWrite = null;
    target.btnSend = null;
    target.rlWrite = null;
    target.rlContent = null;
    target.rlBottom = null;
    target.bottomShadow = null;
    target.topShadow = null;
    target.filterView = null;
  }
}
