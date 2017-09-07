// Generated code from Butter Knife. Do not modify!
package com.usr.usrsimplebleassistent;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class MainActivity$$ViewBinder<T extends com.usr.usrsimplebleassistent.MainActivity> extends com.usr.usrsimplebleassistent.MyBaseActivity$$ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    super.bind(finder, target, source);

    View view;
    view = finder.findRequiredView(source, 2131558520, "field 'collapsingToolbarLayout'");
    target.collapsingToolbarLayout = finder.castView(view, 2131558520, "field 'collapsingToolbarLayout'");
  }

  @Override public void unbind(T target) {
    super.unbind(target);

    target.collapsingToolbarLayout = null;
  }
}
