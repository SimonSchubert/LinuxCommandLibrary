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

**postcss** transforms CSS with JavaScript plugins. It enables modern CSS features and optimization.

Plugins perform specific transformations. Autoprefixer adds vendor prefixes, cssnano minifies, and others.

Configuration files define plugin chains. Standard postcss.config.js or package.json settings.

Watch mode enables development workflow. Files are reprocessed on changes.

Source maps track transformations. Original CSS locations are preserved for debugging.

# CAVEATS

Requires plugins for functionality. Node.js environment. Config complexity can grow.

# HISTORY

**PostCSS** was created by **Andrey Sitnik** in **2013**. It pioneered CSS-as-AST transformation and hosts a rich plugin ecosystem.

# SEE ALSO

[sass](/man/sass)(1), [less](/man/less)(1), [autoprefixer](/man/autoprefixer)(1), [cssnano](/man/cssnano)(1)
