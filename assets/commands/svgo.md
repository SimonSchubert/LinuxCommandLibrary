# TAGLINE

Node.js-based SVG optimization tool

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

**svgo** (SVG Optimizer) is a Node.js-based tool for optimizing SVG files through a plugin architecture. Each plugin handles a specific optimization such as removing metadata, simplifying path data, merging redundant elements, cleaning up attributes, or removing empty containers.

Plugins can be individually enabled or disabled through a configuration file or command-line flags, allowing fine-grained control over which optimizations are applied. The multipass option runs optimizations repeatedly until no further improvements are found. Folder mode batch-processes entire directories of SVG files.

SVGO is widely used in front-end build pipelines and icon library workflows to minimize SVG file sizes before deployment. Pretty-print mode reformats output for readability when human-editable SVGs are needed.

# CONFIGURATION

**svgo.config.js**
> Project configuration file defining enabled/disabled plugins and their options.

# CAVEATS

Some optimizations may affect rendering. Test output visually. Complex SVGs need care.

# HISTORY

**SVGO** (SVG Optimizer) is a Node.js tool for SVG optimization. It's widely used in build processes and icon libraries.

# SEE ALSO

[imagemin](/man/imagemin)(1), [inkscape](/man/inkscape)(1)
