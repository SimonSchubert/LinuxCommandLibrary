# TAGLINE

queries which features libalpm was built with

# TLDR

**List all enabled** capabilities

```paccapability```

**Check** a specific capability

```paccapability [nls]```

**Check several** capabilities at once

```paccapability [downloader] [signatures]```

**Use in a script** to test for signature support

```paccapability signatures >/dev/null && echo "signatures supported"```

# SYNOPSIS

**paccapability** [_options_] [_capability_...]

**paccapability** (**--help**|**--version**)

# PARAMETERS

_capability_
> Capability to check: **nls**, **downloader** or **signatures**. Case-insensitive; the **ALPM_CAPABILITY_** prefix may be omitted.

**--help**
> Display usage information and exit.

**--version**
> Display version information and exit.

# DESCRIPTION

**paccapability** queries which features libalpm, the Arch Linux package management library, was built with. Recognized capabilities are **ALPM_CAPABILITY_NLS** (native language support), **ALPM_CAPABILITY_DOWNLOADER** (built-in downloader) and **ALPM_CAPABILITY_SIGNATURES** (package signature verification).

Without arguments, all enabled capabilities are printed one per line. With arguments, each capability is printed followed by **1** (enabled) or **0** (disabled), and the exit status is non-zero if any of them is disabled.

# HISTORY

Part of **pacutils**, a collection of helper tools for libalpm and pacman written by **Andrew Gregory**.

# INSTALL

```pacman: sudo pacman -S pacutils```

<!-- packages: 2026-11-07 -->

# SEE ALSO

[pacman](/man/pacman)(8), [libalpm](/man/libalpm)(3), [paccheck](/man/paccheck)(1), [pacconf](/man/pacconf)(8)

# RESOURCES

```[Source code](https://github.com/andrewgregory/pacutils)```

<!-- verified: 2026-11-07 -->
