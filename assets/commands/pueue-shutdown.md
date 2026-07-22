# TAGLINE

Stop the pueue daemon process

# TLDR

**Shutdown pueue daemon**

```pueue shutdown```

# SYNOPSIS

**pueue** **shutdown**

# DESCRIPTION

**pueue shutdown** remotely shuts down the pueue daemon. All running tasks are killed. Queued and stashed tasks remain in state and resume when the daemon restarts. This should only be used if the daemon is not started by a service manager.

# CAVEATS

Running tasks are killed immediately without completion. If the daemon was started by a service manager (e.g., systemd), use the service manager to stop it instead.

# INSTALL

```pacman: sudo pacman -S pueue```

```apk: sudo apk add pueue```

```zypper: sudo zypper install pueue```

```brew: brew install pueue```

```nix: nix profile install nixpkgs#pueue```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pueue](/man/pueue)(1), [pueue-status](/man/pueue-status)(1), [pueue-stash](/man/pueue-stash)(1)

