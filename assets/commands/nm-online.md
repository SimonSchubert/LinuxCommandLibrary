# TLDR

Find out whether the **network is connected** and print the result

```nm-online```

**Wait n seconds** for a connection (30 by default)

```nm-online --timeout [n]```

# SYNOPSIS

**nm-online** [_options_]

# PARAMETERS

**-t, --timeout _seconds_**
> Time to wait for a connection (default: 30 seconds)

**-q, --quiet**
> Don't print anything, only set exit status

**-s, --wait-for-startup**
> Wait for NetworkManager to start if not running

**-x, --exit**
> Exit immediately if NetworkManager is not running

# DESCRIPTION

**nm-online** checks whether NetworkManager reports the network as connected. It waits for a network connection to become available, making it useful in scripts that need to ensure connectivity before proceeding.

The command blocks until either a connection is established or the timeout is reached. Exit status indicates the result: 0 means connected, non-zero means no connection within the timeout period.

This is commonly used in systemd service files or init scripts that depend on network availability, providing a reliable way to wait for NetworkManager to establish connectivity.

# CAVEATS

Depends on NetworkManager being the network management daemon. Returns success when NetworkManager reports connectivity, which may not mean full internet access (e.g., captive portals). The default 30-second timeout may be too long or short depending on the use case.

# SEE ALSO

[nmcli](/man/nmcli)(1), [nmtui](/man/nmtui)(1), [NetworkManager](/man/NetworkManager)(8)
