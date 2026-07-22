# TAGLINE

provides configuration information for building against LLVM

# TLDR

**Show LLVM version**

```llvm-config --version```

**Show compiler flags**

```llvm-config --cxxflags```

**Show linker flags**

```llvm-config --ldflags```

**Show library names**

```llvm-config --libs```

**Show flags for specific components**

```llvm-config --cxxflags --ldflags --libs core```

**Show installation prefix**

```llvm-config --prefix```

# SYNOPSIS

**llvm-config** [_options_] [_components_...]

# PARAMETERS

**--version**
> Print LLVM version.

**--prefix**
> Print installation prefix.

**--cxxflags**
> Print C++ compiler flags.

**--ldflags**
> Print linker flags.

**--libs**
> Print library names.

**--system-libs**
> Print system library names.

**--components**
> Print available components.

**--targets-built**
> Print available targets.

# DESCRIPTION

**llvm-config** provides configuration information for building against LLVM. Outputs compiler flags, linker flags, and library names needed to compile and link programs using LLVM libraries.

# INSTALL

```apt: sudo apt install llvm```

```dnf: sudo dnf install llvm```

```pacman: sudo pacman -S llvm```

```apk: sudo apk add llvm-dev```

```zypper: sudo zypper install llvm```

```brew: brew install llvm```

```nix: nix profile install nixpkgs#llvm```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[clang](/man/clang)(1), [llc](/man/llc)(1)

