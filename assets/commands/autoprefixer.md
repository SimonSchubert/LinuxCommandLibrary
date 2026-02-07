# TAGLINE

Add vendor prefixes to CSS automatically

# TLDR

**Process a CSS file and add vendor prefixes**

```autoprefixer [input.css] -o [output.css]```

**Process CSS from stdin**

```cat [input.css] | autoprefixer > [output.css]```

**Specify browser targets**

```autoprefixer [input.css] -o [output.css] --browsers "[last 2 versions, > 1%]"```

**Process multiple files in place**

```autoprefixer [file1.css] [file2.css]```

**Generate source maps**

```autoprefixer [input.css] -o [output.css] --map```

**Show which prefixes would be added**

```autoprefixer --info```

# SYNOPSIS

**autoprefixer** [_options_] [_files_]

# PARAMETERS

**-o**, **--output** _file_
> Write output to the specified file.

**-d**, **--dir** _directory_
> Output to a directory (for multiple files).

**--map**
> Generate source maps.

**--no-map**
> Disable source map generation.

**-b**, **--browsers** _list_
> Browser targets (Browserslist query).

**--ignore** _pattern_
> Glob patterns for files to ignore.

**--replace**
> Modify files in place (default for multiple files).

**--info**
> Display browser list and prefixes information.

**--no-inline**
> Do not inline source maps.

**--env** _environment_
> Specify Browserslist environment.

# DESCRIPTION

**Autoprefixer** is a PostCSS plugin that automatically adds vendor prefixes to CSS properties based on current browser usage data. It parses CSS and adds prefixes like **-webkit-**, **-moz-**, and **-ms-** where needed for cross-browser compatibility.

The tool uses Browserslist to determine which prefixes are needed based on target browser specifications. It not only adds required prefixes but also removes outdated ones that are no longer necessary, keeping CSS clean and efficient.

Autoprefixer handles CSS properties, values, at-rules, and selectors. It understands which browsers support which features and adds only the necessary prefixes based on the specified browser targets, typically configured in a **browserslist** file or **package.json**.

# CONFIGURATION

**.browserslistrc**
> Defines target browsers for prefix generation using Browserslist query syntax.

**postcss.config.js**
> PostCSS configuration file where Autoprefixer can be loaded as a plugin with options.

# CAVEATS

Browser support data depends on Can I Use database updates. Very new CSS features may not be recognized immediately. The tool cannot fix non-standard browser behaviors, only add standard prefixes. Some prefixes have behavioral differences that prefixing cannot resolve.

# HISTORY

Autoprefixer was created by **Andrey Sitnik** in **2013** as a solution to the tedious manual process of adding vendor prefixes. It became one of the most widely used PostCSS plugins and is integrated into most modern build tools including webpack, Vite, and Parcel. The tool revolutionized CSS workflow by eliminating manual prefix management using real browser usage data from **caniuse.com**.

# SEE ALSO

[postcss](/man/postcss)(1), [cssnano](/man/cssnano)(1), [browserslist](/man/browserslist)(5)
