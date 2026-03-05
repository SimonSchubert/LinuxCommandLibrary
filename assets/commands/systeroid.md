# TAGLINE

Powerful alternative to sysctl with TUI

# TLDR

**List all kernel parameters**

```systeroid -A```

**Display parameters in tree format**

```systeroid -T```

**Set a kernel parameter**

```systeroid [kernel.hostname]=[myhost]```

# SYNOPSIS

**systeroid** [_options_] [_variable_[**=**_value_] ...]

# DESCRIPTION

**systeroid** is a more powerful alternative to **sysctl** for managing kernel parameters at runtime via procfs. It provides both a CLI and TUI interface, supports tree-like display, JSON output, regex pattern matching, and can fetch official Linux kernel documentation for parameters.

# HISTORY

**systeroid** was created by **Orhun Poyraz** (orhun) and is written in **Rust**.

# SEE ALSO

[sysctl](/man/sysctl)(1), [procfs](/man/procfs)(5), [tuned](/man/tuned)(1)
