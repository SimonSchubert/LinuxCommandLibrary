# TAGLINE

Paste one PNM image onto another

# TLDR

**Paste image onto another**

```pnmpaste [small.pnm] [x] [y] [background.pnm] > [output.pnm]```

**Paste at top-left**

```pnmpaste [overlay.pnm] 0 0 [base.pnm] > [output.pnm]```

**Replace operation**

```pnmpaste -replace [patch.pnm] [100] [50] [image.pnm] > [output.pnm]```

**OR operation**

```pnmpaste -or [mask.pbm] [x] [y] [image.pnm] > [output.pnm]```

# SYNOPSIS

**pnmpaste** [_options_] _from_ _x_ _y_ _to_

# PARAMETERS

**from**
> Image to paste.

**x**, **y**
> Position in target image.

**to**
> Background image.

**-replace**
> Simple replacement (default).

**-or**
> Bitwise OR.

**-and**
> Bitwise AND.

**-xor**
> Bitwise XOR.

# DESCRIPTION

**pnmpaste** pastes one PNM image onto another at a specified position. Multiple paste operations (replace, or, and, xor) allow for different compositing effects.

Part of Netpbm for image compositing.

# EXAMPLES

```bash
# Paste logo at position 10,10
pnmpaste logo.ppm 10 10 background.ppm > result.ppm

# Paste at bottom-right (compute position)
pnmpaste small.ppm 300 200 large.ppm > result.ppm

# Combine with masks
pnmpaste -or mask.pbm 0 0 image.pbm > masked.pbm

# Multiple pastes
pnmpaste img1.ppm 0 0 base.ppm | pnmpaste img2.ppm 100 0 - > result.ppm
```

# CAVEATS

Pasted image must fit within background. Use negative coordinates for offset. Part of Netpbm.

# HISTORY

pnmpaste is part of **Netpbm** by **Jef Poskanzer**, providing basic image compositing.

# SEE ALSO

[pnmcomp](/man/pnmcomp)(1), [pnmcut](/man/pnmcut)(1), [pnmcat](/man/pnmcat)(1), [netpbm](/man/netpbm)(1)
