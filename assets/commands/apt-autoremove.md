# TAGLINE

Remove Debian packages that are no longer needed

# TLDR

Remove **unused** automatic dependencies

```sudo apt autoremove```

Also delete their **configuration files**

```sudo apt autoremove --purge```

Remove a package and then **unused dependencies**

```sudo apt autoremove [package]```

**Preview** what would be removed

```apt autoremove --simulate```

Answer **yes** to every prompt

```sudo apt autoremove --yes```

# SYNOPSIS

**apt autoremove** [_options_] [_package_...]

# PARAMETERS

**--purge**
> Delete system configuration files of the packages that are removed. Files in home directories are kept.

**-s**, **--simulate**
> Show the removal plan and change nothing.

**-y**, **--yes**
> Assume yes to prompts.

_package_
> When package names are given, apt removes those packages first, then removes automatic dependencies that nothing still needs.

# DESCRIPTION

**apt autoremove** removes packages that apt installed automatically to satisfy dependencies, once nothing you asked to install still needs them. It is a subcommand of **apt**, not a separate program. Packages you installed by name are kept.

Running it after **apt remove** or **apt install** clears dependencies that the last change left behind. The same cleanup is part of **apt full-upgrade** only when that operation itself decides packages must go.

# CAVEATS

A package marked automatic is eligible even if you use it directly. **apt-mark manual** keeps a package you want to retain. Read the list before confirming. **--yes** skips that prompt.

# INSTALL

```apt: sudo apt install apt```

```dnf: sudo dnf install apt```

```pacman: sudo pacman -S apt```

```apk: sudo apk add apt```

```brew: brew install apt```

```nix: nix profile install nixpkgs#apt```

<!-- packages: 2026-11-26 -->

# SEE ALSO

[apt](/man/apt)(8), [apt-get](/man/apt-get)(8), [apt-remove](/man/apt-remove)(8), [apt-mark](/man/apt-mark)(8)

# RESOURCES

```[Source code](https://salsa.debian.org/apt-team/apt)```

```[Documentation](https://manpages.debian.org/apt.8)```

<!-- verified: 2026-11-26 -->
