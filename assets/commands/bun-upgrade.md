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

**bun upgrade** updates the Bun runtime itself to a newer version. By default, it upgrades to the latest stable release. Use **--canary** to get the latest development features (may be unstable).

# CAVEATS

Canary builds may contain bugs or breaking changes. Production environments should use stable releases.

# SEE ALSO

[bun](/man/bun)(1), [bun-info](/man/bun-info)(1)
