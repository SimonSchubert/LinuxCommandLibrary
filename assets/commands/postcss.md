# TAGLINE

Transform CSS with JavaScript plugins

# TLDR

**Process CSS file**

```postcss [input.css] -o [output.css]```

**Use config file**

```postcss [input.css] -o [output.css] -c [postcss.config.js]```

**Watch for changes**

```postcss [input.css] -o [output.css] --watch```

**Process directory**

```postcss [src/] -d [dist/]```

**Use specific plugins**

```postcss [input.css] -o [output.css] -u [autoprefixer]```

**Replace file in place**

```postcss [style.css] --replace```

**With source maps**

```postcss [input.css] -o [output.css] --map```

# SYNOPSIS

**postcss** [_-o output_] [_-d dir_] [_-c config_] [_-u plugins_] [_options_] _files_

# PARAMETERS

**-o**, **--output** _FILE_
> Output file.

**-d**, **--dir** _DIR_
> Output directory.

**-c**, **--config** _FILE_
> Config file path.

**-u**, **--use** _PLUGINS_
> Plugins to use.

**-w**, **--watch**
> Watch mode.

**--map**
> Generate source maps.

**--replace**
> Replace input files.

**--no-map**
> Disable source maps.

**-v**, **--verbose**
> Verbose output.

# DESCRIPTION

**postcss** is a tool for transforming CSS with JavaScript plugins. Rather than being a preprocessor itself, it provides a framework where plugins perform specific transformations on the CSS abstract syntax tree. Popular plugins include Autoprefixer for adding vendor prefixes, cssnano for minification, and postcss-preset-env for using future CSS syntax today.

Plugins are chained together in a configuration file (postcss.config.js) or specified on the command line. Each plugin receives the parsed CSS, applies its transformation, and passes the result to the next plugin. This modular approach allows teams to compose exactly the processing pipeline they need.

Watch mode reprocesses files automatically when changes are detected, integrating into development workflows. Source maps preserve the mapping between transformed and original CSS for debugging in browser developer tools.

# CONFIGURATION

**postcss.config.js** (or **.postcssrc**, **postcss.config.mjs**)
> Plugin configuration file defining the processing pipeline. Lists plugins in order with their options. Searched upward from the input file directory.

**package.json** `"postcss"` field
> Alternative location for PostCSS configuration within the project manifest.

# CAVEATS

Requires plugins for functionality. Node.js environment. Config complexity can grow.

# HISTORY

**PostCSS** was created by **Andrey Sitnik** in **2013**. It pioneered CSS-as-AST transformation and hosts a rich plugin ecosystem.

# SEE ALSO

[sass](/man/sass)(1), [less](/man/less)(1), [autoprefixer](/man/autoprefixer)(1), [cssnano](/man/cssnano)(1)
