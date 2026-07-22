# TAGLINE

Clean up whitespace in Git messages

# TLDR

**Strip trailing whitespace**

```git stripspace < [file]```

**Strip comments**

```git stripspace -s < [file]```

**Comment out lines**

```git stripspace -c < [file]```

# SYNOPSIS

**git** **stripspace** [_options_]

# PARAMETERS

**-s**, **--strip-comments**
> Strip comment lines.

**-c**, **--comment-lines**
> Comment out lines.

# DESCRIPTION

**git stripspace** filters text from stdin, stripping trailing whitespace and collapsing multiple consecutive blank lines. It is used internally by Git for commit message cleanup.

The command can also strip or add comment lines, making it useful for processing Git-formatted messages and templates.

# INSTALL

```apt: sudo apt install git```

```dnf: sudo dnf install git```

```pacman: sudo pacman -S git```

```apk: sudo apk add git```

```zypper: sudo zypper install git```

```brew: brew install git```

```nix: nix profile install nixpkgs#git```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[git-commit](/man/git-commit)(1)

# RESOURCES

```[Source code](https://github.com/git/git)```

```[Homepage](https://git-scm.com/)```

```[Documentation](https://git-scm.com/docs/git-stripspace)```

<!-- verified: 2026-07-17 -->
