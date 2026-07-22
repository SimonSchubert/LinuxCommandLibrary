# TAGLINE

system C compiler

# TLDR

This command is an alias of **gcc**.

# SYNOPSIS

**cc** [_options_] _files_...

# DESCRIPTION

**cc** is traditionally the system C compiler command. On most Linux systems, it is a symbolic link or alias to **gcc** (GNU Compiler Collection).

Using **cc** in build scripts provides portability across systems where different compilers may be the default.

# INSTALL

```dnf: sudo dnf install gcc```

```pacman: sudo pacman -S gcc```

```apk: sudo apk add gcc```

```zypper: sudo zypper install gcc```

```brew: brew install gcc```

```nix: nix profile install nixpkgs#gcc```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[gcc](/man/gcc)(1), [clang](/man/clang)(1), [make](/man/make)(1)

# RESOURCES

```[Documentation](https://gcc.gnu.org/onlinedocs/)```

<!-- verified: 2026-06-22 -->
