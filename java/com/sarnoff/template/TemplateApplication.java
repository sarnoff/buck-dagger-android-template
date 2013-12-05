package com.sarnoff.template;

import android.app.Application;
import dagger.ObjectGraph;
import java.util.Arrays;
import java.util.List;

public class TemplateApplication extends Application {
  private ObjectGraph mGraph;

  @Override
  public void onCreate() {
    super.onCreate();

    mGraph = ObjectGraph.create(getModules().toArray());
  }

  protected List<Object> getModules() {
    return Arrays.asList(
        new ContextModule(this),
        new TemplateApplicationModule()
    );
  }

  public void inject(Object object) {
    mGraph.inject(object);
  }
}
