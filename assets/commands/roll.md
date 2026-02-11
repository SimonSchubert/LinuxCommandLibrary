# TAGLINE

Simulate dice rolls with RPG notation

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

**roll** is a command-line dice roller that parses standard RPG dice notation in the **NdS** format, where N is the number of dice and S is the number of sides. It supports modifiers (**+** or **-**) for adding or subtracting fixed values, and the **TxNdS** format for rolling the same expression multiple times.

Multiple dice expressions can be specified on a single command line. The **-v** flag shows individual die results in addition to the total sum, while **-s** outputs only the final sum. Common RPG dice like d4, d6, d8, d10, d12, d20, and d100 (percentile) are all supported through the flexible notation.

# CAVEATS

Random source varies. Not cryptographically secure. Fun utility only.

# HISTORY

**roll** is a simple command-line dice roller implementing standard RPG dice notation for tabletop gaming.

# SEE ALSO

[random](/man/random)(1), [shuf](/man/shuf)(1)
