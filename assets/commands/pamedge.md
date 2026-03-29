# TAGLINE

Edge-detect a PNM/PAM image

# TLDR

**Detect edges** in an image

```pamedge [input.pam] > [output.pam]```

**Detect edges from pipe**

```cat [image.pam] | pamedge > [edges.pam]```

**Detect edges and threshold** to black and white

```pamedge [input.pam] | pamditherbw -threshold > [edges.pbm]```

# SYNOPSIS

**pamedge** [_imagefile_]

# PARAMETERS

_imagefile_
> Input PAM or PNM image file. Reads from standard input if omitted.

# DESCRIPTION

**pamedge** reads a Netpbm image (PNM or PAM) and produces an output image that outlines the edges. It uses the Pythagorean sum of two **Sobel gradient operators** at 90 degrees to each other for edge detection.

The output format matches the input, except the minimum maxval is 255. PBM input is converted to PGM output. For sharper bilevel edge images, pipe the output through **pamditherbw -threshold**.

Part of the **Netpbm** toolkit. Supersedes **pgmedge**, which only handled PGM and PBM formats.

# CAVEATS

Has no command-line options beyond standard libnetpbm options. For better results with low maxval images, increase the maxval with **pamdepth** before processing.

# HISTORY

**pamedge** was added to Netpbm in **2003** as a replacement for **pgmedge**, extending support to all PAM and PNM image formats.

# SEE ALSO

[pgmedge](/man/pgmedge)(1), [pgmenhance](/man/pgmenhance)(1), [pamditherbw](/man/pamditherbw)(1), [pamdepth](/man/pamdepth)(1), [pnmconvol](/man/pnmconvol)(1), [netpbm](/man/netpbm)(1)

