# TLDR

**Apply gamma correction**

```pnmgamma [gamma] [input.pnm] > [output.pnm]```

**Brighten image**

```pnmgamma 2.2 [input.pnm] > [output.pnm]```

**Darken image**

```pnmgamma 0.5 [input.pnm] > [output.pnm]```

**Per-channel gamma**

```pnmgamma [r_gamma] [g_gamma] [b_gamma] [input.pnm] > [output.pnm]```

# SYNOPSIS

**pnmgamma** [_options_] _gamma_ [_file_]

# PARAMETERS

_GAMMA_
> Gamma correction value.

_FILE_
> Input PNM file.

**-ungamma**
> Remove gamma correction.

**-cieramp**
> Use CIE luminance ramp.

# DESCRIPTION

**pnmgamma** applies gamma correction to PNM images. Adjusts brightness curve.

The tool modifies tonal response. Used for display calibration.

pnmgamma corrects gamma.

# CAVEATS

Values >1 brighten, <1 darken. Part of Netpbm suite.

# HISTORY

pnmgamma was created as part of **Netpbm** for gamma correction operations.

# SEE ALSO

[pamgamma](/man/pamgamma)(1), [pnmnorm](/man/pnmnorm)(1), [ppmchange](/man/ppmchange)(1)

