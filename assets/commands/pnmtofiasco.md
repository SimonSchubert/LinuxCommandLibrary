# TAGLINE

Convert PNM to FIASCO wavelet format

# TLDR

**Convert PNM to FIASCO format**

```pnmtofiasco [input.pnm] -o [output.fco]```

**Specify quality** (1=worst, 100=best, default 20)

```pnmtofiasco -q [50] [input.pnm] -o [output.fco]```

**Set optimization level** (0=fastest, 3=slowest)

```pnmtofiasco -z [2] [input.pnm] -o [output.fco]```

**Verbose** compression statistics

```pnmtofiasco -V [2] [input.pnm] -o [output.fco]```

# SYNOPSIS

**pnmtofiasco** [_options_] [_file_]

# PARAMETERS

**-o, --output-name=**_file_
> Write FIASCO output to named file. Default is Standard Output.

**-q, --quality=**_N_
> Quality of compression (1=worst, 100=best). Default is 20.

**-z, --optimize=**_N_
> Optimization level (0=fastest, 3=slowest). Default is 0.

**-b, --basis-name=**_name_
> Preload compression basis (e.g., small.fco, medium.fco, large.fco).

**-V, --verbose=**_N_
> Verbosity level: 0 (no output), 1 (progress meter), 2 (detailed statistics). Default is 1.

**-v, --version**
> Print version number and exit.

**-h, --info**
> Print brief help.

**-P, --prediction**
> Enable predictive coding for video sequences.

# DESCRIPTION

**pnmtofiasco** compresses PBM, PGM, or PPM images, or Standard Input if no file is named, and produces a FIASCO (Fractal Image And Sequence COdec) file on Standard Output. FIASCO uses fractal and wavelet-based compression. Part of the Netpbm toolkit.

# SEE ALSO

[fiascotopnm](/man/fiascotopnm)(1), [pnmtojpeg](/man/pnmtojpeg)(1)

