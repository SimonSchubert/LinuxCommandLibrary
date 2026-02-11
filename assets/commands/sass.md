# TAGLINE

Compile Sass and SCSS stylesheets to CSS

# TLDR

**Compile SCSS to CSS**

```sass [input.scss] [output.css]```

**Watch for changes**

```sass --watch [input.scss]:[output.css]```

**Watch directory**

```sass --watch [src/scss]:[dist/css]```

**Compile with source maps**

```sass --source-map [input.scss] [output.css]```

**Compile compressed** (minified)

```sass --style=compressed [input.scss] [output.css]```

**Check syntax without output**

```sass --check [input.scss]```

**Use specific load path**

```sass --load-path=[node_modules] [input.scss] [output.css]```

# SYNOPSIS

**sass** [_--watch_] [_--style format_] [_--source-map_] [_--load-path path_] [_input_] [_output_]

# PARAMETERS

**--watch**
> Watch for changes and recompile.

**--style** _STYLE_
> Output style: expanded, compressed.

**--source-map**
> Generate source map.

**--no-source-map**
> Disable source maps.

**--load-path** _PATH_
> Path to find imports.

**--charset**
> Emit @charset for non-ASCII.

**--no-charset**
> Don't emit @charset.

**--error-css**
> Emit error in CSS output.

**--update**
> Only compile changed files.

**--check**, **--stop-on-error**
> Stop after first error.

**--color** / **--no-color**
> Color output control.

**--quiet**
> Suppress warnings.

**--trace**
> Show full stack trace on error.

**--stdin**
> Read from stdin.

**--indented**
> Parse stdin as indented syntax.

# DESCRIPTION

**Sass** (Syntactically Awesome Style Sheets) is a CSS preprocessor adding variables, nesting, mixins, and other features. It compiles to standard CSS for browser use.

Two syntaxes exist: SCSS (Sassy CSS, .scss) uses CSS-like braces and semicolons; Sass (.sass) uses indentation. SCSS is more popular for its CSS compatibility.

Variables ($color: #333) enable reusable values. Nesting reflects HTML structure in styles. Mixins (@mixin, @include) share reusable style patterns. Functions perform calculations and transformations.

Imports (@use, @import) compose styles from multiple files. The @use rule provides namespaced access and better encapsulation than legacy @import.

Watch mode monitors files for changes, automatically recompiling. This enables rapid development with live reload tools. Source maps connect compiled CSS to original Sass for debugging.

Output styles control formatting: expanded for development, compressed for production.

# CAVEATS

Node Sass deprecated in favor of Dart Sass (sass package). @import is being phased out for @use. Large projects can have slow compilation. Source maps add file size. Some CSS hacks may not compile correctly.

# HISTORY

**Sass** was created by **Hampton Catlin** and **Natalie Weizenbaum** around **2006**. Originally Ruby-based, it pioneered CSS preprocessing. LibSass (C/C++) improved performance. **Dart Sass** became the primary implementation in **2018**, with the sass npm package replacing node-sass. The SCSS syntax, introduced in **2010**, became the dominant style.

# SEE ALSO

[less](/man/less)(1), [postcss](/man/postcss)(1), [stylus](/man/stylus)(1), [tailwindcss](/man/tailwindcss)(1)
