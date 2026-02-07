# TAGLINE

Text-based solitaire card game

# TLDR

**Start a game of Canfield solitaire**

```canfield```

**View your canfield score history**

```cfscores```

**View another user's canfield scores**

```cfscores [username]```

**View all users' canfield scores**

```cfscores -a```

# SYNOPSIS

**canfield**

**cfscores** [**-a**] [_user_]

# DESCRIPTION

**canfield** is a text-based implementation of the Canfield solitaire card game (also known as Demon Solitaire) from the BSD games collection. Cards are displayed using ASCII characters in the terminal.

**Gameplay:** Build tableau piles downward in alternating colors. Entire piles must be moved as units. Top cards are available for foundation play but cannot fill empty tableau spaces, which must be filled from the stock. Cards are dealt from hand to talon in groups of three.

**Commands during play:**
- Type **ht** to deal cards to the talon
- Single-letter commands with numbers for moves

**Scoring:** Inspection costs $13, final play costs $26. Each foundation card earns $5. Each pass through the hand after the first costs $5. Playing time costs $1 per minute.

# PARAMETERS

**cfscores** options:

**-a**
> Display canfield accounts for all users

**user**
> Display scores for specified username

# CAVEATS

The game maintains a scoring database that tracks your gambling-style account balance. The scoring system simulates the casino version of the game where players would pay to play and win money for cards placed on foundations.

# HISTORY

Canfield solitaire is named after **Richard A. Canfield**, a 19th-century American casino owner who popularized this version of solitaire in his gambling houses. The BSD games implementation was originally written by Steve Levine with contributions from Steve Feldman, Kirk McKusick, Mikey Olson, and Eric Allman.

# SEE ALSO

[solitaire](/man/solitaire)(6), [mille](/man/mille)(6)
