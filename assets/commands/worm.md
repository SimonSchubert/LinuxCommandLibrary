# TAGLINE

Classic terminal snake game

# TLDR

**Start the worm game**

```worm```

# SYNOPSIS

**worm**

# IN-GAME CONTROLS

**Arrow keys** or **h j k l**
> Move the worm (left, down, up, right)

**q**
> Quit the game

# DESCRIPTION

**worm** is a classic terminal-based snake game from the BSD games collection. The player controls a growing worm that moves around the screen, eating numbers to grow longer and score points.

Numbers appear randomly on screen, and the worm grows by the value of each number eaten. The goal is to eat as many numbers as possible without crashing into the walls or the worm's own body. Speed increases as the worm grows longer, making the game progressively more challenging.

The game displays in a simple ASCII terminal interface, making it playable on any text terminal. It is the original inspiration for the popular "Snake" game found on Nokia mobile phones.

# CAVEATS

Requires the **bsdgames** package to be installed. Terminal must support cursor positioning. Game speed may vary depending on terminal emulator performance.

# HISTORY

Worm is part of the **BSD games** collection, a set of classic text-based games originally distributed with BSD Unix systems in the 1970s and 1980s. These games were created during the early days of Unix when terminals were text-only, and they became a staple of Unix culture. The snake/worm game concept later became famous through Nokia's implementation on mobile phones in the late 1990s.

# SEE ALSO

[snake](/man/snake)(6), [rogue](/man/rogue)(6), [nethack](/man/nethack)(6), [tetris-bsd](/man/tetris-bsd)(6)
