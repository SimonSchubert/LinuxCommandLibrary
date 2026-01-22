# TLDR

**Update** the binary repository as final release step

```pkgctl db update```

# SYNOPSIS

**pkgctl db update** [_options_]

# DESCRIPTION

**pkgctl db update** updates the pacman database as the final release step for packages that have been transferred and staged on repos.archlinux.org. This command triggers the repository synchronization process.

It is typically used after uploading built packages to make them available to users through the official Arch Linux repositories.

# CAVEATS

Requires proper authentication and maintainer permissions. Only use after packages have been properly staged and verified.

# HISTORY

Part of **pkgctl**, the Arch Linux package control tool for official repository maintainers. Streamlines the package release workflow.

# SEE ALSO

[pkgctl](/man/pkgctl)(1), [pkgctl-release](/man/pkgctl-release)(1), [pkgctl-auth](/man/pkgctl-auth)(1)
