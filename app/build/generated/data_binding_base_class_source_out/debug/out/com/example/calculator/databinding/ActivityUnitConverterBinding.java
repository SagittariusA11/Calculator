// Generated by view binder compiler. Do not edit!
package com.example.calculator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.calculator.R;
import com.google.android.material.navigation.NavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityUnitConverterBinding implements ViewBinding {
  @NonNull
  private final DrawerLayout rootView;

  @NonNull
  public final Button btn0;

  @NonNull
  public final Button btn00;

  @NonNull
  public final Button btn1;

  @NonNull
  public final Button btn2;

  @NonNull
  public final Button btn3;

  @NonNull
  public final Button btn4;

  @NonNull
  public final Button btn5;

  @NonNull
  public final Button btn6;

  @NonNull
  public final Button btn7;

  @NonNull
  public final Button btn8;

  @NonNull
  public final Button btn9;

  @NonNull
  public final Button btnBack;

  @NonNull
  public final Button btnClear;

  @NonNull
  public final Button btnDecimal;

  @NonNull
  public final Button btnMatrix;

  @NonNull
  public final Button btnThemeConverter;

  @NonNull
  public final DrawerLayout drawerLayout;

  @NonNull
  public final NavigationView navView;

  @NonNull
  public final EditText unitInput;

  @NonNull
  public final TextView unitOutput;

  private ActivityUnitConverterBinding(@NonNull DrawerLayout rootView, @NonNull Button btn0,
      @NonNull Button btn00, @NonNull Button btn1, @NonNull Button btn2, @NonNull Button btn3,
      @NonNull Button btn4, @NonNull Button btn5, @NonNull Button btn6, @NonNull Button btn7,
      @NonNull Button btn8, @NonNull Button btn9, @NonNull Button btnBack, @NonNull Button btnClear,
      @NonNull Button btnDecimal, @NonNull Button btnMatrix, @NonNull Button btnThemeConverter,
      @NonNull DrawerLayout drawerLayout, @NonNull NavigationView navView,
      @NonNull EditText unitInput, @NonNull TextView unitOutput) {
    this.rootView = rootView;
    this.btn0 = btn0;
    this.btn00 = btn00;
    this.btn1 = btn1;
    this.btn2 = btn2;
    this.btn3 = btn3;
    this.btn4 = btn4;
    this.btn5 = btn5;
    this.btn6 = btn6;
    this.btn7 = btn7;
    this.btn8 = btn8;
    this.btn9 = btn9;
    this.btnBack = btnBack;
    this.btnClear = btnClear;
    this.btnDecimal = btnDecimal;
    this.btnMatrix = btnMatrix;
    this.btnThemeConverter = btnThemeConverter;
    this.drawerLayout = drawerLayout;
    this.navView = navView;
    this.unitInput = unitInput;
    this.unitOutput = unitOutput;
  }

  @Override
  @NonNull
  public DrawerLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityUnitConverterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityUnitConverterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_unit_converter, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityUnitConverterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn0;
      Button btn0 = ViewBindings.findChildViewById(rootView, id);
      if (btn0 == null) {
        break missingId;
      }

      id = R.id.btn00;
      Button btn00 = ViewBindings.findChildViewById(rootView, id);
      if (btn00 == null) {
        break missingId;
      }

      id = R.id.btn1;
      Button btn1 = ViewBindings.findChildViewById(rootView, id);
      if (btn1 == null) {
        break missingId;
      }

      id = R.id.btn2;
      Button btn2 = ViewBindings.findChildViewById(rootView, id);
      if (btn2 == null) {
        break missingId;
      }

      id = R.id.btn3;
      Button btn3 = ViewBindings.findChildViewById(rootView, id);
      if (btn3 == null) {
        break missingId;
      }

      id = R.id.btn4;
      Button btn4 = ViewBindings.findChildViewById(rootView, id);
      if (btn4 == null) {
        break missingId;
      }

      id = R.id.btn5;
      Button btn5 = ViewBindings.findChildViewById(rootView, id);
      if (btn5 == null) {
        break missingId;
      }

      id = R.id.btn6;
      Button btn6 = ViewBindings.findChildViewById(rootView, id);
      if (btn6 == null) {
        break missingId;
      }

      id = R.id.btn7;
      Button btn7 = ViewBindings.findChildViewById(rootView, id);
      if (btn7 == null) {
        break missingId;
      }

      id = R.id.btn8;
      Button btn8 = ViewBindings.findChildViewById(rootView, id);
      if (btn8 == null) {
        break missingId;
      }

      id = R.id.btn9;
      Button btn9 = ViewBindings.findChildViewById(rootView, id);
      if (btn9 == null) {
        break missingId;
      }

      id = R.id.btnBack;
      Button btnBack = ViewBindings.findChildViewById(rootView, id);
      if (btnBack == null) {
        break missingId;
      }

      id = R.id.btnClear;
      Button btnClear = ViewBindings.findChildViewById(rootView, id);
      if (btnClear == null) {
        break missingId;
      }

      id = R.id.btnDecimal;
      Button btnDecimal = ViewBindings.findChildViewById(rootView, id);
      if (btnDecimal == null) {
        break missingId;
      }

      id = R.id.btnMatrix;
      Button btnMatrix = ViewBindings.findChildViewById(rootView, id);
      if (btnMatrix == null) {
        break missingId;
      }

      id = R.id.btnThemeConverter;
      Button btnThemeConverter = ViewBindings.findChildViewById(rootView, id);
      if (btnThemeConverter == null) {
        break missingId;
      }

      DrawerLayout drawerLayout = (DrawerLayout) rootView;

      id = R.id.nav_view;
      NavigationView navView = ViewBindings.findChildViewById(rootView, id);
      if (navView == null) {
        break missingId;
      }

      id = R.id.unit_input;
      EditText unitInput = ViewBindings.findChildViewById(rootView, id);
      if (unitInput == null) {
        break missingId;
      }

      id = R.id.unit_output;
      TextView unitOutput = ViewBindings.findChildViewById(rootView, id);
      if (unitOutput == null) {
        break missingId;
      }

      return new ActivityUnitConverterBinding((DrawerLayout) rootView, btn0, btn00, btn1, btn2,
          btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnBack, btnClear, btnDecimal, btnMatrix,
          btnThemeConverter, drawerLayout, navView, unitInput, unitOutput);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
