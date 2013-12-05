package com.sarnoff.template;

import android.content.Context;

import dagger.Module;

/**
 * A module for Android-specific dependencies which require a {@link Context} or
 * {@link android.app.Application} to create.
 */
@Module(
    includes = ContextModule.class,
    library = true
)
public class AndroidModule {

  // TODO fill out with android system libraries

}
