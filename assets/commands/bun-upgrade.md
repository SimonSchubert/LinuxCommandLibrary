# TAGLINE

Upgrade the runtime itself

# TLDR

**Upgrade Bun** to the latest version

```bun upgrade```

**Upgrade to a specific version**

```bun upgrade --version [1.0.0]```

**Upgrade to the canary channel**

```bun upgrade --canary```

# SYNOPSIS

**bun** **upgrade** [_options_]

# PARAMETERS

**--version** _version_
> Upgrade to a specific version.

**--canary**
> Upgrade to the latest canary (development) build.

# DESCRIPTION

**bun upgrade** updates the **Bun** JavaScript runtime binary in place to a newer version. By default, it fetches the latest stable release from the official GitHub release feed and replaces the running binary. **--canary** switches to the rolling canary channel that tracks the development branch, useful for trying unreleased features or reproducing bug reports. **--version** pins the upgrade (or downgrade) to a specific published release.

The command does not touch project-level packages installed under **node_modules** - those are managed by **bun install**. After upgrading, **bun --version** should report the new version. To update Bun managed by a package manager (Homebrew, npm, Scoop, ...), use that manager instead so its records stay in sync.

# CAVEATS

Canary builds may contain bugs or breaking changes; production environments should pin to stable releases. The Bun binary must be writable by the current user; system-wide installs typically require **sudo** or the use of the original installer. **bun upgrade** does not migrate the **bun.lockb** lockfile format if a release introduces a new on-disk format.

# SEE ALSO

[bun](/man/bun)(1), [bun-info](/man/bun-info)(1), [npm](/man/npm)(1), [node](/man/node)(1)
