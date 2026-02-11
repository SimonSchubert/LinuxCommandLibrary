# TAGLINE

Remove old kernels on Void Linux

# TLDR

**List** removable kernels

```vkpurge list [version]```

Remove **all** unused kernels

```vkpurge rm all```

Remove **specific** versions

```vkpurge rm [version]```

# SYNOPSIS

**vkpurge** _COMMAND_ [_VERSION_]

# COMMANDS

**list** [_VERSION_]
> List removable kernel versions

**rm** _VERSION_|all
> Remove kernel versions

# DESCRIPTION

**vkpurge** lists or removes old kernel versions left behind by the xbps package manager on Void Linux. Version arguments support shell globs for flexible matching.

The tool helps clean up disk space by removing unused kernel installations while preserving the currently running kernel.

# CAVEATS

Void Linux specific. Cannot remove the currently running kernel. Requires root privileges. Use with caution to avoid removing needed kernels.

# SEE ALSO

[xbps-remove](/man/xbps-remove)(1), [xbps-install](/man/xbps-install)(1)
