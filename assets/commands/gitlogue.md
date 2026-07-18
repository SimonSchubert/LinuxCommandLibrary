# TAGLINE

Cinematic animated replay of Git commit history

# TLDR

**Replay** the current repository's history

```gitlogue```

**Replay** a commit range

```gitlogue --commit [HEAD~10..HEAD]```

**Replay** a specific commit

```gitlogue --commit [abc123]```

# SYNOPSIS

**gitlogue** [*options*]

# DESCRIPTION

**gitlogue** turns Git history into an animated terminal story—typing effects, syntax highlighting, and file-tree transitions as commits are replayed. Fun for demos, onboarding, and visualizing how a codebase evolved. Install via install script, Homebrew, Cargo, or Nix.

# PARAMETERS

**--commit** *rev*|*range*

> Start at a commit or animate a range.

Other flags control speed and theme—**gitlogue --help**.

# CAVEATS

Large histories can take a long time to animate. Needs a git repository and a capable terminal.

# SEE ALSO

[git-log](/man/git-log)(1), [gource](/man/gource)(1), [git-blame](/man/git-blame)(1)

# RESOURCES

```[Source code](https://github.com/unhappychoice/gitlogue)```

<!-- verified: 2026-07-19 -->
