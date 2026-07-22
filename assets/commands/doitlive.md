# TAGLINE

Replay shell commands live for terminal demos

# TLDR

**Play** a session file

```doitlive play [session.sh]```

**Record** a demo session

```doitlive record```

**Use** a specific shell / prompt theme

```doitlive play -p [powerline] [session.sh]```

# SYNOPSIS

**doitlive** *command* [*options*]

# DESCRIPTION

**doitlive** reads a file of shell commands and “types” them live in the terminal for talks and screencasts, waiting for keypresses between commands so the presenter controls pacing. Written in Python; install with **pip install doitlive** or Homebrew.

# PARAMETERS

**play** *file*

> Replay commands from *file*.

**record**

> Capture a session to a file.

**-p**, **--prompt** *theme*

> Prompt style for the demo.

**-q**, **--quiet** / speed-related flags

> Control echo and timing (see **doitlive play --help**).

# CAVEATS

Demo files can run destructive commands—review before playing. Not a secure automation tool; it is for presentation UX.

# INSTALL

```brew: brew install doitlive```

```nix: nix profile install nixpkgs#doitlive```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[script](/man/script)(1), [asciinema](/man/asciinema)(1), [vhs](/man/vhs)(1)

# RESOURCES

```[Source code](https://github.com/sloria/doitlive)```

<!-- verified: 2026-07-19 -->
