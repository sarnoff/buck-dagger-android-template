This represents a basic template for android applications that is built with Buck and uses dagger.  Other things may be added to it for convenience, but it's a good starting point for new projects.

To build this you need to:
1) install buck
2) make a local.properties that points to the android sdk

After that, you can build with:
    buck build app

Or build and install with:
    buck install app
