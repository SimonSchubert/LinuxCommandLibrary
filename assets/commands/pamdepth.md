# TAGLINE

changes image bit depth

# TLDR

**Reduce to 8-bit** (maxval 255)

```pamdepth [255] [input.pam] > [output.pam]```

**Promote to 16-bit** (maxval 65535)

```pamdepth [65535] [input.pam] > [output.pam]```

**Reduce to 1-bit** (black-and-white)

```pamdepth [1] [input.pam] > [output.pam]```

**Read from stdin via pipe**

```pnmtopam [input.ppm] | pamdepth [255] > [output.pam]```

# SYNOPSIS

**pamdepth** _maxval_ [_file_]

# PARAMETERS

_MAXVAL_
> New maxval (1–65535). Each sample is rescaled by the ratio _new\_maxval / old\_maxval_; the resulting bit depth is the smallest power of two that holds _MAXVAL_ (e.g. _255_ → 8-bit, _65535_ → 16-bit).

_FILE_
> Input PAM, PPM, PGM, or PBM image. Defaults to standard input when omitted.

# DESCRIPTION

**pamdepth** rescales the maxval (per-sample resolution) of a Netpbm/PAM image. Increasing the maxval is lossless; decreasing it loses precision but never changes the image's tuple type or width/height.

If the input already has the requested maxval, **pamdepth** copies it through unchanged. Use **pamdepth 1** to drop a grayscale image down to bilevel, or **pamdepth 65535** to widen an 8-bit image so subsequent processing avoids quantization.

# CAVEATS

Reducing maxval truncates precision. To convert between tuple types (e.g. RGB to grayscale), use **pamtopnm** or related tools, not **pamdepth**.

# HISTORY

pamdepth is part of **Netpbm** for bit depth conversion.

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

[pnmdepth](/man/pnmdepth)(1), [pamrecolor](/man/pamrecolor)(1), [netpbm](/man/netpbm)(1)

