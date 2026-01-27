# TLDR

**Compile Stylus file to CSS**

```stylus [style.styl]```

**Compile to specific output file**

```stylus [style.styl] -o [style.css]```

**Watch for changes and compile**

```stylus -w [style.styl] -o [style.css]```

**Compile with compression**

```stylus -c [style.styl]```

**Compile all files in directory**

```stylus [src/] -o [dist/]```

**Convert CSS to Stylus**

```stylus --css [style.css] [style.styl]```

**Generate source maps**

```stylus --sourcemap [style.styl]```

# SYNOPSIS

**stylus** [_options_] [_file_|_dir_...]

# PARAMETERS

**-o**, **--out** _dir_
> Output to specified directory or file.

**-w**, **--watch**
> Watch files for changes and recompile.

**-c**, **--compress**
> Compress CSS output.

**--css** _input_ _output_
> Convert CSS to Stylus format.

**-m**, **--sourcemap**
> Generate source map files.

**-l**, **--line-numbers**
> Add line number comments to output.

**-i**, **--interactive**
> Start interactive REPL.

**-U**, **--inline**
> Inline images as data URIs.

**-u**, **--use** _plugin_
> Use specified plugin.

**-I**, **--include** _path_
> Add path to import lookup.

**--import** _file_
> Import file before compiling.

**-p**, **--print**
> Print compiled CSS to stdout.

**--prefix** _prefix_
> Add vendor prefixes.

**-V**, **--version**
> Display version.

**-h**, **--help**
> Display help.

# DESCRIPTION

**stylus** is a command-line compiler for the Stylus CSS preprocessor. Stylus is an expressive, dynamic CSS language built for Node.js that features flexible syntax, powerful functions, and robust feature set.

The compiler transforms Stylus source files (.styl) into standard CSS. Stylus syntax is flexible, allowing optional colons, semicolons, and braces, making stylesheets more readable. It supports variables, mixins, functions, iteration, and many other features that extend CSS capabilities.

The watch mode enables automatic recompilation during development. Source maps aid debugging by mapping compiled CSS back to original Stylus sources. The CSS conversion feature helps migrate existing stylesheets to Stylus.

# CAVEATS

Requires Node.js and npm for installation. The flexible syntax can be confusing for teams without consistent conventions. Performance may be slower than other preprocessors for large projects. Stylus has less community adoption compared to Sass/SCSS.

# HISTORY

**Stylus** was created by TJ Holowaychuk (creator of Express.js) and released in 2010. It was designed to be more expressive and flexible than existing CSS preprocessors. While it gained significant adoption, Sass/SCSS eventually became more dominant in the CSS preprocessor ecosystem.

# SEE ALSO

[sass](/man/sass)(1), [less](/man/less)(1), [postcss](/man/postcss)(1), [npm](/man/npm)(1)
