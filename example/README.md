The `build.sbt` file contains two configurations:
* `jquery-global-demo` uses global jQuery dependency.
* `jquery-bundler-demo` uses `ScalaJSBundlerPlugin` in order to manage module dependencies. 

### How to use?

Run `sbt jquery-global-demo/fastOptJS` or `sbt jquery-global-demo/fullOptJS` to compile this demo. You can find all generated files 
in the `generated/global` directory. Open `index.html` in your browser. 

### How to use? (ScalaJSBundlerPlugin)

Run `sbt jquery-bundler-demo/compileStatics` to compile this demo. You can find all generated files 
in the `generated/bundler` directory. Open `index.html` in your browser. 