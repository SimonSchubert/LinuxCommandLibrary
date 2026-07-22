# TAGLINE

pipes two commands and returns the exit status of the first command

# TLDR

**Run pipeline returning first command exit status**

```mispipe "[command1]" "[command2]"```

**Use in shell pipeline**

```mispipe "cat /nonexistent" "head -n 5"; echo $?```

# SYNOPSIS

**mispipe** _command1_ _command2_

# PARAMETERS

_command1_
> First command (source).

_command2_
> Second command (sink).

# DESCRIPTION

**mispipe** pipes two commands but returns the exit status of the first command instead of the last. Unlike regular shell pipes that return the final command's exit status. Part of moreutils collection.

# INSTALL

```apt: sudo apt install moreutils```

```dnf: sudo dnf install moreutils```

```pacman: sudo pacman -S moreutils```

```apk: sudo apk add moreutils```

```zypper: sudo zypper install moreutils```

```brew: brew install moreutils```

```nix: nix profile install nixpkgs#moreutils```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pee](/man/pee)(1), [sponge](/man/sponge)(1)

