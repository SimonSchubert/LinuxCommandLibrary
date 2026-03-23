# TAGLINE

drug trading strategy game set in New York City

# TLDR

**Start a game in text mode**

```dopewars -t```

**Start with a specific player name**

```dopewars -t -n [name]```

# SYNOPSIS

**dopewars** [_options_]

# PARAMETERS

**-t**
> Text-mode (curses) interface.

**-n** _NAME_
> Set player name.

**-s**
> Run as server for multiplayer.

**-c**
> Connect to a multiplayer server.

**-h**
> Display help.

# PREVIEW

```
 Bronx -> Manhattan
 Cocaine:  $15000
 Heroin:    $6300
 Cash: $2000  Debt: $5500
 Day 1 of 30
```

# DESCRIPTION

**dopewars** is a strategy game where the player buys and sells goods across New York City locations over 30 days. The goal is to pay off the loan shark and make as much money as possible by exploiting price differences between neighborhoods.

Random events like police encounters and market fluctuations add unpredictability. The game features a multiplayer mode for competing against other players over a network.

# CAVEATS

Use **-t** flag for terminal mode. Multiplayer requires a running server. The game theme may be considered controversial.

# HISTORY

**dopewars** is based on **Drug Wars**, a game originally written by **John E. Dell** in **1984** for the TI-83 calculator. The Unix version was created by **Ben Webb** and has been actively maintained since the late **1990s**.

# SEE ALSO

[trek](/man/trek)(6), [adventure](/man/adventure)(6)
