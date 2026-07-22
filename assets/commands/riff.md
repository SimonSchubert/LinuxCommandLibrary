# TAGLINE

Syntax highlighter for diff output

# TLDR

**Highlight changed portions of a diff**

```git diff | riff```

**Set riff as the default git diff pager**

```git config --global pager.diff riff```

**Highlight differences between two files**

```diff [file1.txt] [file2.txt] | riff```

# SYNOPSIS

_diff-command_ | **riff** [_options_]

# DESCRIPTION

**riff** is a wrapper around diff that highlights which parts of lines have changed, showing unchanged portions in a distinct color. It hyperlinks file names and hunk headers to source code lines and also highlights merge conflicts. It integrates with git as a pager for enhanced diff viewing.

# HISTORY

**riff** was created by **Johan Walles** (walles) and is written in **Rust**.

# INSTALL

```pacman: sudo pacman -S riff```

```apk: sudo apk add riff```

```zypper: sudo zypper install riff```

```brew: brew install riff```

```nix: nix profile install nixpkgs#riff```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[delta](/man/delta)(1), [diff-so-fancy](/man/diff-so-fancy)(1), [colordiff](/man/colordiff)(1)
