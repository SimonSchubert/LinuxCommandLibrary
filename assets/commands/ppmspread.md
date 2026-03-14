# TAGLINE

Randomly displace pixels for noise effect

# TLDR

**Spread pixels randomly**

```ppmspread [amount] [input.ppm] > [output.ppm]```

**Light spread effect**

```ppmspread 5 [input.ppm] > [output.ppm]```

**Heavy spread effect**

```ppmspread 20 [input.ppm] > [output.ppm]```

# SYNOPSIS

**ppmspread** _amount_ [_file_]

# PARAMETERS

_AMOUNT_
> Spread radius in pixels.

_FILE_
> Input PPM file.

# DESCRIPTION

**ppmspread** randomly displaces each pixel in a PPM image to a new position within the specified radius, creating a scattered, noise-like blur effect. Larger spread amounts produce more diffuse results while small amounts add subtle texture.

Unlike Gaussian blur which averages pixels, spread preserves individual pixel colors but randomizes their positions, producing a distinctive frosted glass or pointillist appearance. Part of the Netpbm toolkit.

# CAVEATS

Only accepts PPM format input. Use **pnmtoppm** to convert from other formats first. The amount parameter specifies the maximum displacement in any direction; actual displacement for each pixel is random within that range.

# SEE ALSO

[ppmshift](/man/ppmshift)(1), [pnmnoise](/man/pnmnoise)(1), [netpbm](/man/netpbm)(1)

