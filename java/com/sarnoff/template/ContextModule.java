package com.sarnoff.template;

import javax.inject.Singleton;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module(
    complete = false,
    library = true
)
public class ContextModule {

  private final TemplateApplication mApplication;

  public ContextModule(TemplateApplication application) {
    this.mApplication = application;
  }

  /**
   * Allow the application context to be injected but require that it be annotated with
   * {@link ForApplication @Annotation} to explicitly differentiate it from an activity context.
   */
  @Provides
  @Singleton
  @ForApplication
  Context provideApplicationContext() {
    return mApplication;
  }

}
