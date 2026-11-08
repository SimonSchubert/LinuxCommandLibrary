# TAGLINE

not a Netpbm program; image negatives are made with pnminvert

# TLDR

**Invert an image** with the real tool

```pnminvert [input.ppm] > [output.ppm]```

**Invert from a pipe**

```cat [image.ppm] | pnminvert > [inverted.ppm]```

**Invert and convert to PNG**

```pnminvert [photo.ppm] | pnmtopng > [negative.png]```

# SYNOPSIS

**pnminvert** [_pnmfile_]

# DESCRIPTION

There is no **paminvert** program in Netpbm: it does not appear in the Netpbm program directory, source tree, or distribution man pages. Image negatives are produced by **pnminvert**, which reads a PNM image and inverts it black for white.

Each gray value or RGB component is replaced with maxval minus that value. See [pnminvert](/man/pnminvert)(1) for details.

# FORMULA

```
output = maxval - input

For 8-bit (maxval=255):
Black (0)   -> White (255)
White (255) -> Black (0)
Gray (128)  -> Gray (127)
```

# CAVEATS

Commands named **paminvert** in scripts or tutorials fail with "command not found". **pnminvert** works on PNM images, so the operation is applied to gamma-adjusted values rather than linear light.

# HISTORY

The page exists for readers searching this name. **pnminvert** is a long-standing part of **Netpbm**.

# SEE ALSO

[pnminvert](/man/pnminvert)(1), [pamfunc](/man/pamfunc)(1), [netpbm](/man/netpbm)(1)

# RESOURCES

```[Homepage](https://netpbm.sourceforge.net/)```

```[Documentation](https://netpbm.sourceforge.net/doc/pnminvert.html)```

<!-- verified: 2026-11-08 -->
