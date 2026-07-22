# TAGLINE

applies mathematical functions

# TLDR

**Multiply pixel values**

```pamfunc -multiplier=[1.5] [input.pam] > [output.pam]```

**Add to pixel values**

```pamfunc -adder=[50] [input.pam] > [output.pam]```

**Apply power function**

```pamfunc -power=[2.2] [input.pam] > [output.pam]```

# SYNOPSIS

**pamfunc** [_options_] [_file_]

# PARAMETERS

_FILE_
> Input PAM/PNM file.

**-multiplier** _FACTOR_
> Multiply values.

**-adder** _VALUE_
> Add to values.

**-power** _EXPONENT_
> Apply power function.

**-divisor** _VALUE_
> Divide values.

# DESCRIPTION

**pamfunc** applies mathematical functions. Transforms pixel values.

The tool performs arithmetic on images. Part of Netpbm.

# CAVEATS

Part of Netpbm. Values clamped to valid range.

# HISTORY

pamfunc is part of **Netpbm** for mathematical image transformations.

# INSTALL

```apt: sudo apt install netpbm```

```dnf: sudo dnf install netpbm```

```pacman: sudo pacman -S netpbm```

```apk: sudo apk add netpbm```

```zypper: sudo zypper install netpbm```

```brew: brew install netpbm```

```nix: nix profile install nixpkgs#netpbm```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pamarith](/man/pamarith)(1), [pnmgamma](/man/pnmgamma)(1), [netpbm](/man/netpbm)(1)

