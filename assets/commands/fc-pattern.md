# TAGLINE

parse and display fontconfig patterns

# TLDR

**Parse font pattern**

```fc-pattern "[pattern]"```

**Show default pattern**

```fc-pattern --default [pattern]```

**Configure pattern**

```fc-pattern --config [pattern]```

**Custom format output**

```fc-pattern --format "%{family}" [pattern]```

# SYNOPSIS

**fc-pattern** [_options_] [_pattern_]

# PARAMETERS

**-d**, **--default**
> Apply default substitutions.

**-c**, **--config**
> Apply config substitutions.

**-f**, **--format** _format_
> Custom output format.

# DESCRIPTION

**fc-pattern** parses and displays fontconfig patterns, showing how fontconfig interprets font matching requests. The tool is useful for debugging font configuration and understanding pattern syntax.

Fontconfig patterns specify desired font properties like family, style, weight, and size. fc-pattern reveals how these patterns are normalized and what substitutions are applied by the configuration.

# CAVEATS

Pattern syntax can be complex. Output format requires understanding fontconfig internals. Primarily useful for debugging rather than regular font management.

# INSTALL

```apt: sudo apt install fontconfig```

```dnf: sudo dnf install fontconfig```

```pacman: sudo pacman -S fontconfig```

```apk: sudo apk add fontconfig```

```zypper: sudo zypper install fontconfig```

```brew: brew install fontconfig```

```nix: nix profile install nixpkgs#fontconfig```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[fc-match](/man/fc-match)(1), [fc-list](/man/fc-list)(1), [fc-query](/man/fc-query)(1)

# RESOURCES

```[Source code](https://gitlab.freedesktop.org/fontconfig/fontconfig)```

```[Homepage](https://www.freedesktop.org/wiki/Software/fontconfig/)```

<!-- verified: 2026-07-15 -->
