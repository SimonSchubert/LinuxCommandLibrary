# TAGLINE

Remove installed Debian packages

# TLDR

**Remove** one or more packages

```sudo apt remove [package]```

Remove a package and its **configuration files**

```sudo apt remove --purge [package]```

Remove a package and **unused dependencies**

```sudo apt remove --autoremove [package]```

**Preview** a removal without changing the system

```apt remove --simulate [package]```

Answer **yes** to every prompt

```sudo apt remove --yes [package]```

# SYNOPSIS

**apt remove** [_options_] _package_...

# PARAMETERS

**--purge**
> Also delete the package's system configuration files. User files under the home directory are left in place. **apt purge** is the same operation.

**--autoremove**
> After the named packages are removed, also remove packages that were installed automatically and are no longer required.

**-s**, **--simulate**
> Print the actions apt would take and change nothing. No root privileges are required.

**-y**, **--yes**
> Assume yes to prompts.

# DESCRIPTION

**apt remove** uninstalls one or more packages on Debian and distributions that use apt. It is a subcommand of **apt**, not a separate program. Packages that other installed software still depends on are not removed unless a full upgrade (or an explicit removal of those dependents) allows it.

Removed packages can be installed again later with **apt install**. Configuration that **--purge** deletes is not restored by a later install.

# CAVEATS

Removing a package can remove, or refuse to remove, other packages that depend on it. Read the confirmation summary before accepting it. **--yes** skips that prompt.

# INSTALL

```apt: sudo apt install apt```

```dnf: sudo dnf install apt```

```pacman: sudo pacman -S apt```

```apk: sudo apk add apt```

```brew: brew install apt```

```nix: nix profile install nixpkgs#apt```

<!-- packages: 2026-11-26 -->

# SEE ALSO

[apt](/man/apt)(8), [apt-get](/man/apt-get)(8), [apt-autoremove](/man/apt-autoremove)(8)

# RESOURCES

```[Source code](https://salsa.debian.org/apt-team/apt)```

```[Documentation](https://manpages.debian.org/apt.8)```

<!-- verified: 2026-11-26 -->
