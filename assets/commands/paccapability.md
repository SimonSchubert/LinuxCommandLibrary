# TLDR

List all **available capabilities**

```paccapability```

Check for a **specified capability**

```paccapability nls```

Check for **downloader** capability

```paccapability downloader```

Check for **signatures** capability

```paccapability signatures```

Display **help**

```paccapability --help```

# SYNOPSIS

**paccapability** [_options_] [_capability_...]

# PARAMETERS

**--help**
> Display help message

**--version**
> Display version information

# DESCRIPTION

**paccapability** queries and displays the capabilities supported by libalpm (Arch Linux Package Management library). It can list all available capabilities or check if specific capabilities are supported.

Common capabilities include nls (native language support), downloader (built-in download support), and signatures (package signature verification).

# CAVEATS

Available capabilities depend on how libalpm was compiled. Some capabilities may not be available on all systems.

# HISTORY

Part of **pacutils**, a collection of utilities for Arch Linux package management built on top of libalpm.

# SEE ALSO

[pacman](/man/pacman)(8), [libalpm](/man/libalpm)(3)
