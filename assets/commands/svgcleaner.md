# TAGLINE

Lossless SVG file optimizer

# TLDR

**Clean SVG**

```svgcleaner [input.svg] [output.svg]```

**Maximum compression**

```svgcleaner --preset=maximum [input.svg] [output.svg]```

**Preserve specific attributes**

```svgcleaner --keep-named-ids [input.svg] [output.svg]```

**Indent output**

```svgcleaner --indent [2] [input.svg] [output.svg]```

**Quiet mode**

```svgcleaner -q [input.svg] [output.svg]```

# SYNOPSIS

**svgcleaner** [_--preset preset_] [_options_] _input_ _output_

# PARAMETERS

**--preset** _NAME_
> Optimization preset.

**--keep-named-ids**
> Preserve IDs.

**--indent** _N_
> Indentation spaces.

**-q**
> Quiet mode.

**--multipass**
> Multiple optimization passes.

# DESCRIPTION

**svgcleaner** performs lossless optimization of SVG files, reducing file size without altering their visual appearance. It removes unnecessary metadata, editor artifacts, unused definitions, and redundant attributes that bloat SVG files exported from graphic editors.

The tool simplifies path data, optimizes geometry, merges compatible elements, and removes empty groups and containers. Multiple optimization passes can be applied for maximum size reduction. Optimization presets allow choosing between conservative and aggressive cleaning levels.

Written in Rust for performance, svgcleaner is particularly effective at cleaning SVGs produced by editors like Inkscape, Adobe Illustrator, and Sketch, which often embed substantial editor-specific metadata and redundant styling information.

# CAVEATS

May break complex SVGs. Test output. Rust written.

# HISTORY

**svgcleaner** was created as a lossless SVG optimizer, reducing file size without affecting visual appearance.

# SEE ALSO

[svgo](/man/svgo)(1), [inkscape](/man/inkscape)(1), [scour](/man/scour)(1)
