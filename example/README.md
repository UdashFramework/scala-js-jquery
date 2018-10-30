The `build.sbt` file contains two configurations:
* `jquery-demo` uses global jQuery dependency.
* `jquery-bundler-demo` uses `ScalaJSBundlerPlugin` in order to manage module dependencies. 

### How to use?

Run `sbt fastOptJS` or `sbt fullOptJS` to compile this demo. You can find all generated files 
in the `generated` directory. Open `index.html` in your browser. 

### How to use? (ScalaJSBundlerPlugin)

Run `sbt compileStatics` to compile this demo. You can find all generated files 
in the `generated` directory. Open `index.html` in your browser. 