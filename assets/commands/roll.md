# TLDR

**Roll dice**

```roll [2d6]```

**Roll with modifier**

```roll [1d20+5]```

**Roll multiple times**

```roll [3x4d6]```

**Verbose output**

```roll -v [2d6]```

**Roll percentile**

```roll [1d100]```

**Multiple dice expressions**

```roll [1d20] [2d6+3]```

# SYNOPSIS

**roll** [_-v_] _dice-expression_ ...

# PARAMETERS

**-v**
> Verbose, show each die.

**-s**
> Sum only output.

_NdS_
> N dice with S sides.

_NdS+M_
> Add modifier M.

_TxNdS_
> Roll T times.

# DESCRIPTION

**roll** simulates dice rolls. It parses dice notation.

Standard RPG notation. NdS format.

Modifiers supported. Add or subtract.

Multiple expressions. Roll different dice.

Verbose shows each. Individual die results.

# CAVEATS

Random source varies. Not cryptographically secure. Fun utility only.

# HISTORY

**roll** is a simple command-line dice roller implementing standard RPG dice notation for tabletop gaming.

# SEE ALSO

[random](/man/random)(1), [shuf](/man/shuf)(1)
