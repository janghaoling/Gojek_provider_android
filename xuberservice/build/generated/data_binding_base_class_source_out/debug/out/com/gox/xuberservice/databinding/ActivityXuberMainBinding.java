// Generated by data binding compiler. Do not edit!
package com.gox.xuberservice.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.gox.xuberservice.R;
import com.gox.xuberservice.xuberMainActivity.XUberDashboardViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityXuberMainBinding extends ViewDataBinding {
  @NonNull
  public final BottomServiceStatusSheetBinding llBottomService;

  @NonNull
  public final CardView statusCardView;

  @NonNull
  public final LinearLayout statusFlowHeader;

  @NonNull
  public final TextView tvXuberLabellocation;

  @NonNull
  public final TextView tvXuberPickupLocation;

  @Bindable
  protected XUberDashboardViewModel mXuberViewModel;

  protected ActivityXuberMainBinding(Object _bindingComponent, View _root, int _localFieldCount,
      BottomServiceStatusSheetBinding llBottomService, CardView statusCardView,
      LinearLayout statusFlowHeader, TextView tvXuberLabellocation,
      TextView tvXuberPickupLocation) {
    super(_bindingComponent, _root, _localFieldCount);
    this.llBottomService = llBottomService;
    setContainedBinding(this.llBottomService);
    this.statusCardView = statusCardView;
    this.statusFlowHeader = statusFlowHeader;
    this.tvXuberLabellocation = tvXuberLabellocation;
    this.tvXuberPickupLocation = tvXuberPickupLocation;
  }

  public abstract void setXuberViewModel(@Nullable XUberDashboardViewModel xuberViewModel);

  @Nullable
  public XUberDashboardViewModel getXuberViewModel() {
    return mXuberViewModel;
  }

  @NonNull
  public static ActivityXuberMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_xuber_main, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityXuberMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityXuberMainBinding>inflateInternal(inflater, R.layout.activity_xuber_main, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityXuberMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_xuber_main, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityXuberMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityXuberMainBinding>inflateInternal(inflater, R.layout.activity_xuber_main, null, false, component);
  }

  public static ActivityXuberMainBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityXuberMainBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityXuberMainBinding)bind(component, view, R.layout.activity_xuber_main);
  }
}
