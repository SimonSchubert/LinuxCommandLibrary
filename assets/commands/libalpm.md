# TLDR

**Library - typically used via pacman**

```pacman -S [package]```

**Query local database**

```pacman -Q [package]```

**Sync databases**

```pacman -Sy```

**Search packages**

```pacman -Ss [pattern]```

# SYNOPSIS

**libalpm** - Arch Linux Package Management library

# DESCRIPTION

**libalpm** is the Arch Linux Package Management library. It provides the backend functionality for pacman and other package management tools in Arch Linux and derivatives.

The library handles package database management, dependency resolution, package installation/removal, and transaction handling.

# KEY FEATURES

```
- Package database management
- Dependency resolution
- Delta/incremental updates
- Signature verification
- Transaction support
- Hook system
```

# API USAGE

```c
#include <alpm.h>

alpm_handle_t *handle;
handle = alpm_initialize("/", "/var/lib/pacman/", &err);
```

# CAVEATS

Library API, not directly executable. Used by pacman, yay, paru. API may change between major versions. Arch-specific.

# HISTORY

libalpm was developed as part of **pacman** by the Arch Linux team, with the library interface introduced to allow third-party frontends.

# SEE ALSO

[pacman](/man/pacman)(8), [makepkg](/man/makepkg)(8), [yay](/man/yay)(8), [paru](/man/paru)(1)
