# TLDR

**Start the game**

```typespeed```

**Start with specific word list**

```typespeed -w [wordlist]```

**Start network game as server**

```typespeed -n s```

**Connect to network game**

```typespeed -n c -o [hostname]```

**Play in training mode**

```typespeed -r training```

# SYNOPSIS

**typespeed** [_options_]

# PARAMETERS

**-w** _wordlist_
> Use specified word list file.

**-n** _mode_
> Network mode: s for server, c for client.

**-o** _host_
> Connect to specified host in client mode.

**-r** _rules_
> Game rules: default, classic, or training.

**-h**
> Display help.

**-v**
> Display version.

# GAMEPLAY

Words fly across the screen from left to right. Type them correctly before they reach the right edge. Missing 10 words ends the game. Faster typing earns more points.

# DESCRIPTION

**typespeed** is a terminal typing game that tests and improves typing speed. Words scroll across the screen and must be typed before disappearing. The game measures characters per second (CPS), accuracy, and calculates a score.

The game includes multiple word lists and three gameplay modes. Default mode increases word speed as you progress, classic maintains constant speed, and training allows practice at a fixed pace.

Network mode enables two-player competition over a network where both players receive identical words simultaneously. One player hosts as server while the other connects as client.

Statistics track total characters, correct characters, typo ratio, and points. A log maintains history of previous sessions for tracking improvement over time.

# CAVEATS

Requires terminal size of at least 80x24. Network mode requires port access between systems. Word lists are plain text files with one word per line. High scores are stored locally.

# HISTORY

**typespeed** was inspired by ztspeed, a DOS typing game by Zorlim. It was created to provide a fun way to improve typing speed on Unix systems. The game became popular in the Linux community as a terminal-based alternative to GUI typing tutors.

# SEE ALSO

[ttyper](/man/ttyper)(1), [gtypist](/man/gtypist)(1), [wpm](/man/wpm)(1)
