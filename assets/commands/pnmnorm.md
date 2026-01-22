# TLDR

**Normalize image contrast**

```pnmnorm [input.pnm] > [output.pnm]```

**Specify brightness range**

```pnmnorm -bpercent [5] -wpercent [5] [input.pnm] > [output.pnm]```

**Preserve midpoint**

```pnmnorm -midvalue [127] [input.pnm] > [output.pnm]```

# SYNOPSIS

**pnmnorm** [_options_] [_file_]

# PARAMETERS

_FILE_
> Input PNM file.

**-bpercent** _N_
> Black point percentage.

**-wpercent** _N_
> White point percentage.

**-bvalue** _N_
> Black cutoff value.

**-wvalue** _N_
> White cutoff value.

**-midvalue** _N_
> Middle gray value to preserve.

# DESCRIPTION

**pnmnorm** normalizes contrast in PNM images. Stretches histogram.

The tool maximizes dynamic range. Auto-adjusts brightness levels.

pnmnorm enhances contrast.

# CAVEATS

May clip extreme values. Part of Netpbm suite.

# HISTORY

pnmnorm was created as part of **Netpbm** for automatic contrast enhancement.

# SEE ALSO

[pnmhisteq](/man/pnmhisteq)(1), [pnmgamma](/man/pnmgamma)(1), [ppmnorm](/man/ppmnorm)(1)

