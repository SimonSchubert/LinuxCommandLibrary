# TAGLINE

Display an animated ASCII art aquarium

# TLDR

**Run** the aquarium

```asciiquarium```

Run in **classic** mode (only the original 1.0 creatures)

```asciiquarium -c```

# SYNOPSIS

**asciiquarium** [_-c_]

# PREVIEW

```
   ><(((°>     .
  __         ><>
 (__)   ~  ___
 ||||  ~   |#|
```

# DESCRIPTION

**asciiquarium** displays an animated ASCII art aquarium in your terminal. It features swimming fish, a castle, seaweed, bubbles, and the occasional shark or sea monster, providing a relaxing screensaver-like animation.

The program runs until interrupted and adapts to terminal size.

# PARAMETERS

**-c**
> Classic mode: show only the species present in version 1.0.

# CONTROLS

Press **q** to quit, **r** to redraw all entities, or **p** to toggle pause.

# CAVEATS

Requires Term::Animation Perl module. Works best with 256-color terminal support. High CPU usage on some systems.

# HISTORY

**asciiquarium** was written by Kirk Baucom as a Perl script providing terminal entertainment through animated ASCII art.

# INSTALL

```dnf: sudo dnf install asciiquarium```

```pacman: sudo pacman -S asciiquarium```

```apk: sudo apk add asciiquarium```

```brew: brew install asciiquarium```

```nix: nix profile install nixpkgs#asciiquarium```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[cmatrix](/man/cmatrix)(1), [sl](/man/sl)(6), [cowsay](/man/cowsay)(1)

# RESOURCES

```[Source code](https://github.com/cmatsuoka/asciiquarium)```

```[Homepage](https://robobunny.com/projects/asciiquarium/html/)```

<!-- verified: 2026-06-17 -->
