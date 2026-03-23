# TAGLINE

classic cribbage card game against the computer

# TLDR

**Start a game**

```cribbage```

**Explain scoring for each hand**

```cribbage -e```

**Play muggins (claim missed points)**

```cribbage -m```

# SYNOPSIS

**cribbage** [**-emqr**]

# PARAMETERS

**-e**
> Explain scoring for each hand.

**-m**
> Play muggins - claim opponent's missed points.

**-q**
> Quiet mode - print shorter messages.

**-r**
> Play regardless of terminal type.

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
