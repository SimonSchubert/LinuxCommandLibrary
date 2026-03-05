# TAGLINE

Colorize your kubectl output

# TLDR

**Run a kubectl command** with colorized output

```kubecolor get pods```

**Get resources with light background** theme

```kubecolor get pods --light-background```

**Describe a resource** with colors

```kubecolor describe pod [pod_name]```

# SYNOPSIS

**kubecolor** [_kubectl_arguments_...]

# PARAMETERS

**--light-background**
> Use color preset optimized for light terminal backgrounds.

**--force-colors**
> Force colorized output even when not writing to a terminal.

**--kubecolor-theme** _THEME_
> Select a color theme. Includes colorblind-adjusted themes for deuteranopia and tritanopia.

# DESCRIPTION

**kubecolor** is a kubectl wrapper that adds colors to kubectl output. It internally calls kubectl and colorizes the response, making it usable as a drop-in replacement by aliasing `kubectl` to `kubecolor`.

Colorization is automatically disabled when output is piped or redirected to a file, ensuring compatibility with scripts and other commands. Only READ commands (get, describe, etc.) are colorized; WRITE commands (apply, edit, exec) pass through without modification.

# CONFIGURATION

**Alias setup**
> Add `alias kubectl="kubecolor"` to your shell profile for seamless integration.

# CAVEATS

Requires kubectl to be installed and configured. Only colorizes output from read operations. Some custom output formats may not be colorized correctly.

# HISTORY

**kubecolor** was originally created by **Hidetatsu Yaginuma** (hidetatz) and is written in **Go**. The project is now maintained by the **kubecolor** organization on GitHub.

# SEE ALSO

[kubectl](/man/kubectl)(1), [k9s](/man/k9s)(1)
