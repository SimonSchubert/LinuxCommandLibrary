# TLDR

**Optimize SVG**

```svgo [input.svg] -o [output.svg]```

**Optimize in place**

```svgo [file.svg]```

**Optimize directory**

```svgo -f [./icons] -o [./optimized]```

**Show file info**

```svgo [file.svg] --show-plugins```

**Use config file**

```svgo --config [svgo.config.js] [file.svg]```

**Disable plugin**

```svgo --disable=[removeViewBox] [file.svg]```

**Enable plugin**

```svgo --enable=[removeDimensions] [file.svg]```

**Pretty print output**

```svgo --pretty [file.svg]```

# SYNOPSIS

**svgo** [_-o output_] [_-f folder_] [_--config file_] [_options_] _files_

# PARAMETERS

**-o**, **--output** _FILE_
> Output file.

**-f**, **--folder** _DIR_
> Input folder.

**--config** _FILE_
> Config file.

**--disable** _PLUGIN_
> Disable plugin.

**--enable** _PLUGIN_
> Enable plugin.

**--pretty**
> Pretty print.

**--multipass**
> Multiple passes.

**-q**, **--quiet**
> Quiet output.

# DESCRIPTION

**svgo** optimizes SVG files. It reduces file size while preserving appearance.

Multiple plugins handle different optimizations. Remove metadata, simplify paths, merge elements.

Configuration customizes behavior. Enable or disable specific optimizations.

Folder mode batch processes SVGs. Entire icon sets optimized.

Pretty output formats for readability. Human-friendly indentation.

# CAVEATS

Some optimizations may affect rendering. Test output visually. Complex SVGs need care.

# HISTORY

**SVGO** (SVG Optimizer) is a Node.js tool for SVG optimization. It's widely used in build processes and icon libraries.

# SEE ALSO

[imagemin](/man/imagemin)(1), [inkscape](/man/inkscape)(1)
