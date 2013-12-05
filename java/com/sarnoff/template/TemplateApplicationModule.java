package com.sarnoff.template;

import dagger.Module;

@Module(
    injects = HomeActivity.class,
    includes = {
        AndroidModule.class,
        ContextModule.class
    },
    complete = true
)
public class TemplateApplicationModule {

}
