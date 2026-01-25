# TLDR

**Minify a CSS file**

```cssnano [input.css] [output.css]```

**Minify with default preset**

```npx cssnano [input.css] > [output.min.css]```

**Use as PostCSS plugin**

```postcss [input.css] -o [output.css] --use cssnano```

**Minify with source maps**

```cssnano [input.css] [output.css] --map```

**Use lite preset** (faster, less aggressive)

```cssnano [input.css] [output.css] --preset lite```

# SYNOPSIS

**cssnano** [_options_] _input.css_ [_output.css_]

# PARAMETERS

**--preset** _name_
> Optimization preset: default, lite, advanced.

**--map**
> Generate source maps.

**--no-map**
> Disable source maps.

**-o**, **--output** _file_
> Output file.

**--config** _file_
> PostCSS configuration file.

# PRESETS

**default**
> Safe optimizations suitable for most use cases.

**lite**
> Minimal optimizations, fastest processing.

**advanced**
> Aggressive optimizations (may change behavior).

# DESCRIPTION

**cssnano** is a modular CSS minifier built on PostCSS that reduces CSS file size through various optimizations: removing whitespace and comments, merging rules, optimizing values, and eliminating redundant code.

Optimizations include: normalizing values (colors, lengths), merging duplicate rules, removing unused prefixes, optimizing font weights and z-indices, discarding duplicate declarations, and minimizing calc() expressions.

As a PostCSS plugin, cssnano integrates with existing build pipelines (webpack, Vite, gulp, etc.) and can be combined with other PostCSS plugins like autoprefixer.

# CONFIGURATION

In **postcss.config.js**:
```javascript
module.exports = {
  plugins: [
    require('cssnano')({
      preset: ['default', {
        discardComments: { removeAll: true }
      }]
    })
  ]
}
```

# CAVEATS

Aggressive minification may cause issues with CSS that relies on specific formatting. The advanced preset can change behavior in edge cases. Source maps are essential for debugging minified CSS. Some optimizations remove vendor prefixes that may still be needed.

# HISTORY

cssnano was created by **Ben Briggs** and first released in **2015**. Built on PostCSS, it took a modular approach where each optimization is a separate plugin. This design allows users to customize exactly which optimizations apply. cssnano became one of the most popular CSS minifiers, integrated into many build tools and frameworks.

# SEE ALSO

[postcss](/man/postcss)(1), [autoprefixer](/man/autoprefixer)(1), [clean-css](/man/clean-css)(1)
