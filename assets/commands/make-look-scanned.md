# TAGLINE

Make PDFs look like physical scans

# TLDR

**Process** a PDF to create a scanned-looking copy

```make-look-scanned [input.pdf]```

**Specify** an output file path

```make-look-scanned [input.pdf] -o [output.pdf]```

**Apply heavy degradation** for a more distressed appearance

```make-look-scanned [input.pdf] --noise 0.4 --skew 2.5 --jpeg-quality 30```

**Use a preset** from the configuration file

```make-look-scanned [input.pdf] --preset [preset_name]```

**Set a fixed seed** for reproducible output

```make-look-scanned [input.pdf] --seed [42]```

# SYNOPSIS

**make-look-scanned** [_flags_] _input.pdf_

# PARAMETERS

**-o** _file_
> Output file path (default: `<input>.scanned.pdf`)

**--preset** _name_
> Use a named preset defined in `config.toml`

**--seed** _n_
> Random seed for reproducibility (default: content hash of the input PDF)

**--force**
> Overwrite existing output files without prompting

**--dpi** _n_
> Render resolution in DPI (default: 150)

**--skew** _degrees_
> Maximum page rotation in degrees (default: 0.6; 0 disables)

**--grayscale**
> Desaturate colors to simulate a greyscale scanner (default: true)

**--paper-tone** _n_
> Warm paper tint strength, 0-1 (default: 0.6)

**--noise** _n_
> Scanner grain effect intensity, 0-1 (default: 0.08)

**--blur** _sigma_
> Defocus Gaussian sigma (default: 0.4)

**--edge-shadow** _n_
> Border vignette strength, 0-1 (default: 0.15)

**--jpeg-quality** _n_
> JPEG compression quality, 1-100 (default: 70; lower = more artifacts)

# DESCRIPTION

**make-look-scanned** renders each page of a PDF at a chosen DPI, then applies a configurable pipeline of visual degradation effects to make it appear physically scanned: subtle page skew, greyscale conversion, warm paper toning, scanner grain, Gaussian defocus, edge shadow vignetting, and JPEG compression artifacts.

Output is deterministic by default: the random seed is derived from the content hash of the input file, so the same PDF always produces identical output. A custom seed can be specified with `--seed` to produce variations.

Named presets can be stored in a `config.toml` file and selected with `--preset`, allowing multiple degradation profiles (light scan, heavy scan, old document, etc.) to be defined and reused. Setting any numeric effect parameter to 0 disables that effect entirely.

A browser-based WebAssembly version of the tool is also available for one-off use without installation.

# CAVEATS

Requires a Go toolchain and a C compiler to build from source. Processing large PDFs at high DPI values significantly increases memory usage and processing time. The tool produces a new PDF file and does not modify the original.

# SEE ALSO

[gs](/man/gs)(1), [pdftk](/man/pdftk)(1), [convert](/man/convert)(1)

# RESOURCES

```[Source code](https://github.com/overflowy/make-look-scanned)```

<!-- verified: 2026-06-20 -->
