# TAGLINE

generate shaded relief image from a PAM height map

# TLDR

**Create shaded relief** from a height map

```pamshadedrelief [heightmap.pam] > [relief.pam]```

**Apply gamma correction** to the rendered relief

```pamshadedrelief -gamma [2.0] [heightmap.pam] > [relief.pam]```

**Pipe to pamtopnm** to view as PPM

```pamshadedrelief [heightmap.pam] | pamtopnm > [relief.ppm]```

**Render and encode** as PNG

```pamshadedrelief [heightmap.pam] | pnmtopng > [relief.png]```

# SYNOPSIS

**pamshadedrelief** [**-gamma** _value_] [_pamfile_]

# DESCRIPTION

**pamshadedrelief** reads a Netpbm PAM file containing a grayscale height map and produces a PAM image rendered as a shaded relief, simulating illumination of a 3D terrain by a virtual light source. Each output pixel encodes the brightness derived from the local slope of the height field, giving a hill-shading effect similar to topographic maps.

The input must be a one-channel (grayscale) PAM image; sample values are interpreted as elevations. The illumination angle is fixed by the program. Output samples are gamma-corrected with **-gamma** so the contrast of the relief can be tuned without re-rendering the source data.

# PARAMETERS

_PAMFILE_
> Input grayscale PAM height map. If omitted, read from standard input.

**-gamma** _VALUE_
> Apply gamma correction to the output. Values greater than 1 increase contrast in dark areas; values less than 1 reduce it. Default is 1.0.

# CAVEATS

Part of **Netpbm**. The input must be a single-plane (grayscale) PAM image; PGM inputs should be promoted to PAM first. The light direction is hard-coded and cannot be changed from the command line. Output is a PAM image; convert to PPM or PNG for display with **pamtopnm** or **pnmtopng**.

# HISTORY

**pamshadedrelief** was added to **Netpbm** to support cartographic and terrain visualization tasks. Netpbm provides a long-lived family of small, composable image utilities operating on the PNM/PAM family of formats.

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

[pamtopnm](/man/pamtopnm)(1), [pnmtopng](/man/pnmtopng)(1), [pamflip](/man/pamflip)(1)
