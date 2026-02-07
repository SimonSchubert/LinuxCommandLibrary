# TAGLINE

Transpile modern JavaScript into backward-compatible versions.

# TLDR

**Transpile** JavaScript file

```babel [input.js] -o [output.js]```

Transpile **directory**

```babel [src] -d [dist]```

**Watch** mode

```babel [src] -d [dist] --watch```

Use **specific preset**

```babel [input.js] -o [output.js] --presets=@babel/preset-env```

**Inline** source maps

```babel [input.js] -o [output.js] --source-maps inline```

# SYNOPSIS

**babel** [_options_] _files_

# DESCRIPTION

**babel** is a JavaScript compiler that transforms modern JavaScript (ES6+) into backward-compatible versions for older browsers and environments. It supports JSX, TypeScript, and experimental JavaScript features through plugins and presets.

The tool is essential for modern JavaScript development, enabling use of latest language features while maintaining broad compatibility.

# PARAMETERS

**-o**, **--out-file** _file_
> Output file

**-d**, **--out-dir** _dir_
> Output directory

**-w**, **--watch**
> Watch files for changes

**-s**, **--source-maps**
> Generate source maps

**--presets** _presets_
> Transformation presets

**--plugins** _plugins_
> Transformation plugins

**--config-file** _path_
> Configuration file path

**--no-babelrc**
> Ignore .babelrc files

**--minified**
> Minify output

**--compact** _mode_
> Compact output (true/false/auto)

# COMMON PRESETS

**@babel/preset-env**
> Transform modern JavaScript for target environments

**@babel/preset-react**
> Transform JSX for React

**@babel/preset-typescript**
> Transform TypeScript

# CONFIGURATION

**babel.config.json**
> Project-wide Babel configuration for presets, plugins, and transformation options.

**.babelrc**
> Directory-specific Babel configuration, applies to files within the containing directory.

# CAVEATS

Requires Node.js. Configuration can be complex. Build times increase with file count. Some features need polyfills (not just transpilation). Plugin order matters.

# HISTORY

**Babel** was created by Sebastian McKenzie in **2014** (originally as 6to5) to enable developers to use ES6 features before widespread browser support.

# SEE ALSO

[node](/man/node)(1), [webpack](/man/webpack)(1), [tsc](/man/tsc)(1)
