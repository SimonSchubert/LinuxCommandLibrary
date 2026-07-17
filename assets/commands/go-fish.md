# TAGLINE

play the classic Go Fish card game against the computer

# TLDR

**Start a game**

```go-fish```

**Play in "professional" mode** (randomly decide who asks first)

```go-fish -p```

# SYNOPSIS

**go-fish** [**-p**]

# PARAMETERS

**-p**
> Professional mode: randomly determine who asks first, instead of always letting the player start.

# PREVIEW

```
Your hand: 3 3 7 9 K
Got any 7s? y
I had a 7? Here!
Books won: 1
```

# DESCRIPTION

**go-fish** is a text-interface version of the traditional children's card game, part of the **bsd-games** collection. The player and the computer are each dealt seven cards, and take turns asking each other for cards of a given rank in order to collect "books" (all four cards of that rank).

You may only ask for a rank you already hold at least one card of. If the opponent has none, you're told to "Go Fish!" and must draw from the remaining deck; drawing the requested rank lets you go again. Completed books are set aside and that rank becomes unavailable. The game ends when either player is out of cards, and whoever has collected the most books wins.

# CAVEATS

Part of the bsd-games package, so availability depends on your distribution installing it. The computer opponent rarely bluffs and mostly plays honestly.

# HISTORY

**go-fish** originates from the **BSD Games** collection first assembled in the 1980s-90s and later packaged for Linux distributions as **bsd-games**/**bsdgames**.

# SEE ALSO

[hangman](/man/hangman)(6), [cribbage](/man/cribbage)(6)

# RESOURCES

```[Source code](https://github.com/jsm28/bsd-games)```

```[Documentation](https://packages.debian.org/stable/bsdgames)```

<!-- verified: 2026-07-17 -->
