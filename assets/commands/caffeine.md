# TAGLINE

Prevent idle sleep for fullscreen applications

# TLDR

Start a **caffeine server**

```caffeine```

Display **help**

```caffeine -h```

Display **version**

```caffeine -V```

# SYNOPSIS

**caffeine** [_options_]

# DESCRIPTION

**caffeine** prevents the desktop from becoming idle when running full-screen applications. It monitors for full-screen windows and automatically inhibits screensavers and suspend during that time.

Unlike manual inhibition, caffeine works automatically based on window state.

# PARAMETERS

**-h, --help**
> Display help information

**-V, --version**
> Display version information

# SEE ALSO

[caffeinate](/man/caffeinate)(1), [caffeine-indicator](/man/caffeine-indicator)(1), [xset](/man/xset)(1)
