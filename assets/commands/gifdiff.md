# TAGLINE

Check whether two GIF images display identically

# TLDR

**Compare two GIF files** (exit status 0 = same, 1 = different)

```gifdiff [file1.gif] [file2.gif]```

**Brief mode** — exit status only, no output

```gifdiff -q [file1.gif] [file2.gif]```

**Ignore frame-redraw differences** (frames that render identically but differ in redraw info)

```gifdiff -w [file1.gif] [file2.gif]```

**Use in a shell script**

```gifdiff -q [file1.gif] [file2.gif] && echo "identical"```

# SYNOPSIS

**gifdiff** [**-q** | **--brief**] [**-w** | **--ignore-redraw**] _gif1_ _gif2_

# PARAMETERS

**-q**, **--brief**
> Produce no output; only return an exit status (0 if images display identically, 1 otherwise).

**-w**, **--ignore-redraw**
> Ignore differences that only affect how frames are redrawn. Two animations that render identically but encode redraws differently are still treated as equal.

**-h**, **--help**
> Print usage information and exit.

**-v**, **--version**
> Print the gifdiff version and exit.

# DESCRIPTION

**gifdiff** compares two GIF image files and determines whether they display identically when rendered. Unlike a byte-wise comparison, it accounts for semantically irrelevant encoding differences (for example, different frame disposal methods that produce the same visible output).

gifdiff is part of the **gifsicle** toolkit and is primarily useful for regression testing of GIF generators and for confirming that two differently encoded files produce the same animation.

# CAVEATS

gifdiff does **not** produce a visual diff image. For pixel-level visualization of differences use a tool like **compare(1)** from ImageMagick.

# SEE ALSO

[gifsicle](/man/gifsicle)(1), [gifview](/man/gifview)(1), [compare](/man/compare)(1)
