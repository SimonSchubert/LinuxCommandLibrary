# TAGLINE

Powerful alternative to sysctl with TUI

# TLDR

**List all kernel parameters**

```systeroid -A```

**Display parameters in tree format**

```systeroid -T```

**Set a kernel parameter**

```systeroid [kernel.hostname]=[myhost]```

**Search parameters matching a pattern**

```systeroid -r [net.ipv4]```

**Display parameter values with documentation**

```systeroid -E [kernel.hostname]```

**Output parameters as JSON**

```systeroid -A --output json```

**Launch the TUI**

```systeroid-tui```

# SYNOPSIS

**systeroid** [_options_] [_variable_[**=**_value_] ...]

# DESCRIPTION

**systeroid** is a more powerful alternative to **sysctl** for managing kernel parameters at runtime via procfs. It provides both a CLI and TUI interface, supports tree-like display, JSON output, regex pattern matching, and can fetch official Linux kernel documentation for parameters.

# OPTIONS

**-A**, **--all**
> List all kernel parameters.

**-T**, **--tree**
> Display parameters in a tree hierarchy.

**-r**, **--pattern** _REGEX_
> Filter parameters matching a regex pattern.

**-E**, **--explain**
> Show the kernel documentation for a parameter.

**--output** _FORMAT_
> Output format (default or json).

**-p**, **--load** _FILE_
> Load parameter values from a configuration file.

**-q**, **--quiet**
> Suppress normal output.

**-N**, **--names**
> Print only parameter names, not values.

# HISTORY

**systeroid** was created by **Orhun Poyraz** (orhun) and is written in **Rust**.

# SEE ALSO

[sysctl](/man/sysctl)(1), [proc](/man/proc)(5), [tuned](/man/tuned)(1)
