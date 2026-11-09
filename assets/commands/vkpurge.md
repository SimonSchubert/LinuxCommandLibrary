# TAGLINE

Remove old kernels on Void Linux

# TLDR

**List** removable kernels

```vkpurge list```

**List** removable kernels matching a glob

```vkpurge list "[6.1*]"```

Remove **all** unused kernels

```vkpurge rm all```

Remove **specific** versions

```vkpurge rm [version ...]```

# SYNOPSIS

**vkpurge** **list** [_VERSION_...]

**vkpurge** **rm** **all**|_VERSION_...

# COMMANDS

**list** [_VERSION_...]
> List removable kernel versions (default: **all**)

**rm** **all**|_VERSION_...
> Remove kernel versions, running pre-remove and post-remove hooks from /etc/kernel.d

# DESCRIPTION

**vkpurge** lists or removes old kernel versions left behind by the xbps package manager on Void Linux. Version arguments support shell globs for flexible matching; quote them so the shell does not expand them.

The tool helps clean up disk space by removing unused kernel installations while preserving the currently running kernel and any kernel still owned by an installed package.

# CAVEATS

Void Linux specific. Cannot remove the currently running kernel. **rm** requires root privileges. Use with caution to avoid removing needed kernels.

# SEE ALSO

[xbps-remove](/man/xbps-remove)(1), [xbps-install](/man/xbps-install)(1)

# RESOURCES

```[Source code](https://github.com/void-linux/void-packages/blob/master/srcpkgs/base-files/files/vkpurge)```

```[Documentation](https://docs.voidlinux.org/config/kernel.html)```

<!-- verified: 2026-11-09 -->
