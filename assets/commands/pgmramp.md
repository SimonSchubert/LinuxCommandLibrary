# TLDR

**Create horizontal gradient**

```pgmramp -lr [256] [256] > [gradient.pgm]```

**Create vertical gradient**

```pgmramp -tb [256] [256] > [gradient.pgm]```

**Create diagonal gradient**

```pgmramp -diagonal [256] [256] > [gradient.pgm]```

**Create circular gradient**

```pgmramp -ellipse [256] [256] > [gradient.pgm]```

# SYNOPSIS

**pgmramp** _type_ _width_ _height_

# PARAMETERS

**-lr**
> Left to right gradient.

**-tb**
> Top to bottom gradient.

**-rectangle**
> Rectangle gradient.

**-ellipse**
> Elliptical gradient.

**-diagonal**
> Diagonal gradient.

# DESCRIPTION

**pgmramp** generates grayscale gradient images. Creates various gradient patterns for testing and backgrounds. Part of Netpbm toolkit.

# SEE ALSO

[ppmpat](/man/ppmpat)(1), [pgmnoise](/man/pgmnoise)(1)

