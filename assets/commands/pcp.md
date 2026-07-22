# TAGLINE

Peer-to-peer file copy over the local network

# TLDR

**Copy** a file/directory to another machine running pcp

```pcp [path]```

**Receive** / wait for incoming copy (peer mode)

```pcp```

**Specify** a peer explicitly if auto-discovery fails

```pcp --peer [host] [path]```

# SYNOPSIS

**pcp** [*options*] [*path*]

# DESCRIPTION

**pcp** (peer copy) transfers files between machines on a LAN using peer discovery instead of scp hostnames and keys for casual copies. One side advertises/receives; the other pushes a path. Implemented in Go; install via **go install**, Homebrew, or releases from **dennis-tra/pcp**.

Not related to the Performance Co-Pilot toolkit (also abbreviated PCP).

# PARAMETERS

*path*

> File or directory to send.

**--peer** *address*

> Target peer when mDNS/discovery is unavailable.

**-h**, **--help**

> Full option set (ports, codes, UI).

# CAVEATS

Designed for trusted local networks—do not expose on untrusted links without understanding the threat model. Firewall/mDNS restrictions can block discovery. Name clash with Performance Co-Pilot commands on some systems.

# INSTALL

```apt: sudo apt install pcp```

```dnf: sudo dnf install pcp```

```pacman: sudo pacman -S pcp```

```zypper: sudo zypper install pcp```

```brew: brew install pcp```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[scp](/man/scp)(1), [rsync](/man/rsync)(1), [croc](/man/croc)(1), [magic-wormhole](/man/magic-wormhole)(1)

# RESOURCES

```[Source code](https://github.com/dennis-tra/pcp)```

<!-- verified: 2026-07-19 -->
