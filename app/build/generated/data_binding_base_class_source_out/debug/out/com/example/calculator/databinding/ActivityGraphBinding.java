// Generated by view binder compiler. Do not edit!
package com.example.calculator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.calculator.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityGraphBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button Cosecx;

  @NonNull
  public final Button Cosx;

  @NonNull
  public final Button Cotx;

  @NonNull
  public final Button Equal;

  @NonNull
  public final Button Logx;

  @NonNull
  public final Button Secx;

  @NonNull
  public final Button Sinx;

  @NonNull
  public final Button Tanx;

  @NonNull
  public final Button graphCubex;

  @NonNull
  public final Button graphSqrtx;

  @NonNull
  public final Button graphSquareX;

  @NonNull
  public final Button graphX;

  @NonNull
  public final TextView value;

  private ActivityGraphBinding(@NonNull LinearLayout rootView, @NonNull Button Cosecx,
      @NonNull Button Cosx, @NonNull Button Cotx, @NonNull Button Equal, @NonNull Button Logx,
      @NonNull Button Secx, @NonNull Button Sinx, @NonNull Button Tanx, @NonNull Button graphCubex,
      @NonNull Button graphSqrtx, @NonNull Button graphSquareX, @NonNull Button graphX,
      @NonNull TextView value) {
    this.rootView = rootView;
    this.Cosecx = Cosecx;
    this.Cosx = Cosx;
    this.Cotx = Cotx;
    this.Equal = Equal;
    this.Logx = Logx;
    this.Secx = Secx;
    this.Sinx = Sinx;
    this.Tanx = Tanx;
    this.graphCubex = graphCubex;
    this.graphSqrtx = graphSqrtx;
    this.graphSquareX = graphSquareX;
    this.graphX = graphX;
    this.value = value;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityGraphBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityGraphBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_graph, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityGraphBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Cosecx;
      Button Cosecx = ViewBindings.findChildViewById(rootView, id);
      if (Cosecx == null) {
        break missingId;
      }

      id = R.id.Cosx;
      Button Cosx = ViewBindings.findChildViewById(rootView, id);
      if (Cosx == null) {
        break missingId;
      }

      id = R.id.Cotx;
      Button Cotx = ViewBindings.findChildViewById(rootView, id);
      if (Cotx == null) {
        break missingId;
      }

      id = R.id.Equal;
      Button Equal = ViewBindings.findChildViewById(rootView, id);
      if (Equal == null) {
        break missingId;
      }

      id = R.id.Logx;
      Button Logx = ViewBindings.findChildViewById(rootView, id);
      if (Logx == null) {
        break missingId;
      }

      id = R.id.Secx;
      Button Secx = ViewBindings.findChildViewById(rootView, id);
      if (Secx == null) {
        break missingId;
      }

      id = R.id.Sinx;
      Button Sinx = ViewBindings.findChildViewById(rootView, id);
      if (Sinx == null) {
        break missingId;
      }

      id = R.id.Tanx;
      Button Tanx = ViewBindings.findChildViewById(rootView, id);
      if (Tanx == null) {
        break missingId;
      }

      id = R.id.graph_Cubex;
      Button graphCubex = ViewBindings.findChildViewById(rootView, id);
      if (graphCubex == null) {
        break missingId;
      }

      id = R.id.graph_Sqrtx;
      Button graphSqrtx = ViewBindings.findChildViewById(rootView, id);
      if (graphSqrtx == null) {
        break missingId;
      }

      id = R.id.graph_SquareX;
      Button graphSquareX = ViewBindings.findChildViewById(rootView, id);
      if (graphSquareX == null) {
        break missingId;
      }

      id = R.id.graph_x;
      Button graphX = ViewBindings.findChildViewById(rootView, id);
      if (graphX == null) {
        break missingId;
      }

      id = R.id.value;
      TextView value = ViewBindings.findChildViewById(rootView, id);
      if (value == null) {
        break missingId;
      }

      return new ActivityGraphBinding((LinearLayout) rootView, Cosecx, Cosx, Cotx, Equal, Logx,
          Secx, Sinx, Tanx, graphCubex, graphSqrtx, graphSquareX, graphX, value);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
