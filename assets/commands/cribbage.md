# TAGLINE

classic cribbage card game against the computer

# TLDR

**Start a game**

```cribbage```

**Explain scoring mistakes**

```cribbage -e```

**Use shorter (quiet) prompts**

```cribbage -q```

**Let the computer cut the deck** (skip the cut prompt)

```cribbage -r```

# SYNOPSIS

**cribbage** [**-eqr**]

# PARAMETERS

**-e**
> Explain the correct score whenever the player makes a scoring mistake for a hand or crib.

**-q**
> Quiet mode: print shorter prompts and messages.

**-r**
> Have the program randomly cut the deck instead of prompting the player.

# PREVIEW

```
 Your hand:
 [5h] [5d] [Jc] [Kd]
 Starter: [5s]
 Points: 12
```

# DESCRIPTION

**cribbage** is a text-based implementation of the classic cribbage card game from the **bsdgames** collection. The player competes against the computer, scoring points by forming combinations during play and in hand.

Cards are selected for the crib, then played alternately trying to make pairs, runs, and reach 15 or 31. The first player to reach 121 points wins.

# CAVEATS

Part of the bsdgames package. Knowledge of cribbage rules is helpful. Use **-e** to learn scoring.

# HISTORY

Cribbage was invented by **Sir John Suckling** in the early **17th century**. The BSD implementation was written by **Bill Joy** and has been part of BSD games since the **1980s**.

# SEE ALSO

[canfield](/man/canfield)(6), [mille](/man/mille)(6), [backgammon](/man/backgammon)(6)
