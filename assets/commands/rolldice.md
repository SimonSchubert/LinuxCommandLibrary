# TAGLINE

Roll virtual dice from the command line

# TLDR

Roll a single **20 sided** dice

```rolldice d20```

Roll two six sided dice and **drop the lowest**

```rolldice 2d6s1```

Roll with a **modifier**

```rolldice 2d20+5```

Roll a dice **multiple times**

```rolldice 2xd20```

# SYNOPSIS

**rolldice** _dice_specification_

# PARAMETERS

Dice are specified in **NdS** format where:
> N = number of dice, d = dice indicator, S = number of sides

**s**_N_
> Drop lowest N rolls

**+**_N_ or **-**_N_
> Add or subtract modifier

**x**
> Repeat roll multiple times

# DESCRIPTION

**rolldice** simulates rolling dice with various configurations. It supports standard dice notation used in tabletop gaming, including modifiers, dropping dice, and multiple rolls.

The tool is useful for tabletop RPG players, game developers, or anyone needing random dice results.

# CAVEATS

Uses system random number generator. Results are pseudorandom, not cryptographically secure.

# HISTORY

Created as a utility for tabletop gaming and random number generation using standard dice notation.

# SEE ALSO

[shuf](/man/shuf)(1), [random](/man/random)(4)
