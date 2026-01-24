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

**svgcleaner** optimizes SVG files. It removes unnecessary data.

Removes metadata. Smaller files.

Simplifies paths. Optimizes geometry.

Merges elements. Reduce complexity.

Lossless optimization. Same visual output.

# CAVEATS

May break complex SVGs. Test output. Rust written.

# HISTORY

**svgcleaner** was created as a lossless SVG optimizer, reducing file size without affecting visual appearance.

# SEE ALSO

[svgo](/man/svgo)(1), [inkscape](/man/inkscape)(1), [scour](/man/scour)(1)
