# TAGLINE

produces a negative of a PAM or PNM image by inverting all pixel values

# TLDR

**Invert image colors**

```paminvert [input.pam] > [output.pam]```

**Invert from pipe**

```cat [image.ppm] | paminvert > [inverted.ppm]```

# SYNOPSIS

**paminvert** [_pamfile_]

# DESCRIPTION

**paminvert** produces a negative of a PAM or PNM image by inverting all pixel values. Each sample value is replaced with maxval minus the sample value.

For grayscale, black becomes white and vice versa. For color, each channel is inverted independently.

# EXAMPLE

```bash
# Create negative
paminvert photo.ppm > negative.ppm

# Invert and convert to PNG
paminvert photo.ppm | pnmtopng > negative.png
```

# FORMULA

```
output = maxval - input

For 8-bit (maxval=255):
Black (0)   -> White (255)
White (255) -> Black (0)
Gray (128)  -> Gray (127)
```

# CAVEATS

Simple inversion; not perceptual negative. Alpha channel also inverted if present.

# HISTORY

paminvert is part of **Netpbm**, providing simple image inversion as a fundamental operation.

# SEE ALSO

[pnminvert](/man/pnminvert)(1), [pamarith](/man/pamarith)(1), [netpbm](/man/netpbm)(1)
