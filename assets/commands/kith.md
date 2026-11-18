# TAGLINE

WireGuard mesh VPN with a signed membership ledger and no coordination server

# TLDR

**Create** a network, with this device as its admin

```kith create [home]```

**Print an invite** that one device may use for one hour

```kith invite [home] --expires 1h --uses 1```

**Join** with that link

```kith join [kith://join/...]```

See **who is online**, and whether each path is direct or relayed

```kith status```

Give a mesh address a **DNS name**

```kith dns set [home] [nas] A [100.64.0.2]```

Send internet traffic **through another device**

```kith exit allow [home] [vps]```

```kith exit use [home] [vps]```

```kith exit off```

**Turn the daemon off** until the next **kith up**

```kith down```

# SYNOPSIS

**kith** [**--socket** _PATH_] _COMMAND_ [_ARGS_]

# DESCRIPTION

**kith** is one static binary that is both the daemon and the command line. Devices in a network share a ledger of signed operations: membership, policy, DNS names, and exits. Any member that holds a valid invite can admit a new device. No account service has to stay up for the mesh to work.

Addresses come from the carrier-grade NAT range **100.64.0.0/10**. Devices find each other with STUN and hole punching, and fall back to relays that members run. The control channel is TCP with TLS 1.3 and raw public keys, on port **41641** by default. Packet traffic is WireGuard.

On macOS and Linux the upstream install script places the binary in **/usr/local/bin/kith**, installs a launchd or systemd service, and turns it on. **kith up** enables it now and at boot. **kith down** stops it and leaves it stopped across restarts. On other systems, run **kith daemon** under the service manager. From source the binary is crate **kith-cli**: **cargo build --release -p kith-cli**.

A network can hold several of these meshes at once, each with its own addresses, policy, and DNS. Phones join through **kith wg export**, which prints WireGuard configs as QR codes for the stock WireGuard app. DNS names live under **<network>.kith.internal**, next to a name for each device.

The daemon keeps a device identity (mode **0600**), one ledger per network, and an optional **config.toml** in its state directory. IPC allows the daemon's user and root to change state. Anyone who can reach the socket may read status.

The license is AGPL-3.0-only, with a separate commercial license from the author. The project describes itself as alpha: the CLI, wire formats, and on-disk state can still break.

# COMMANDS

**up**
> Turn kith on, now and at every boot.

**down**
> Turn kith off, and keep it off after a restart.

**status** [**--json**]
> Networks, this device, and peers.

**create** [**--device-name** _NAME_] _NETWORK_
> Create a network. This device is the first member and its admin. The device name defaults to the hostname.

**invite** [**--expires** _DURATION_] [**--uses** _N_] _NETWORK_
> Print a **kith://join/...** link. Duration examples: **30m**, **24h**, **7d**. Default expiry is **24h**. Default uses is **1**. **--uses unlimited** does not cap how many devices may join.

**join** [**--device-name** _NAME_] _LINK_
> Join with an invite link.

**remove** _NETWORK_ _DEVICE_
> Remove another device. Admins only. _DEVICE_ is a name or an id.

**leave** _NETWORK_
> Leave a network.

**peers** [**--json**] [_NETWORK_]
> List peers. The network argument is required only when this device is in more than one.

**dns list** [**--json**] [_NETWORK_]
> Every name: each device's, then records set with **dns set**.

**dns set** _NETWORK_ _NAME_ _TYPE_ _VALUE_
> Create or replace a record. Types include A, AAAA, CNAME, and TXT.

**dns rm** _NETWORK_ _NAME_
> Delete a record.

**exit use** _NETWORK_ _NODE_
> Send this device's internet traffic through _NODE_.

**exit off** [_NETWORK_]
> Stop using an exit. The network is needed only when this device is in several.

**exit allow** _NETWORK_ _NODE_, **exit deny** _NETWORK_ _NODE_
> Let a node be an exit, or stop it. Admins only.

**relay advertise** [**--node** _NODE_] _NETWORK_ _NAME_ _HOST:PORT_
> Advertise a relay. The node defaults to this device. Admins only.

**relay remove** _NETWORK_ _NAME_
> Stop advertising a relay. Admins only.

**server** [**--exit**] [**--relay**]
> Offer this device as an exit node, a relay, or both.

**wg import** _NAME_ _FILE_
> Import a wg-quick file as a network.

**wg export** [**--tag** _TAG_] [**--text**] _NETWORK_ _DEVICE-NAME_
> Add a device that runs the WireGuard app and show QR codes. **--tag** may be repeated. **--text** prints the config files instead of QR codes.

**watch**
> Print the current state, then each change.

**doctor**
> Say what is wrong and how to fix it.

**config check** [_PATH_], **config show** [_PATH_]
> Validate a configuration file, or print the effective configuration.

**daemon** [**--config** _PATH_] [**--foreground**] [**-v** | **-vv**]
> Run the background daemon. **--foreground** is accepted for service managers. **-v** is debug, **-vv** is trace.

# PARAMETERS

**--socket** _PATH_
> Daemon socket. Default: the path from the config file. The same value can be passed in the environment as **KITH** then **SOCKET**, joined with an underscore.

# CONFIGURATION

**config.toml**
> Optional file in the state directory. **kith config show** prints the effective settings. **kith config check** validates a file. Every field has a default, so a missing file is a working configuration.

**State directory**
> Holds **identity/@device** (mode **0600**), **networks/@<network-id>** (ledger operations), and the optional config file.

# CAVEATS

**kith** and Tailscale both use **100.64.0.0/10**. The install script warns when Tailscale is running and tells you to quit it while kith is on.

**kith up** and **kith down** are implemented for macOS and Linux. Elsewhere, supervise **kith daemon** yourself.

A phone added with **wg export** sometimes has no internet until its tunnel is toggled off and on. There is no kith app for iOS or Android yet, so the phone uses the stock WireGuard app and does not appear in the system VPN settings as kith.

Release builds cover macOS and Linux on x86-64, arm64, and armv7. Most OpenWrt MIPS routers need a build from source. The macOS binary is not signed by Apple. A browser download is blocked by Gatekeeper until it is allowed. The install script is unaffected.

One admin per network. Adding more from the CLI is not implemented. Endpoint gossip is unsigned: a malicious member can advertise a false address, and the failed handshake is the damage WireGuard's authentication allows.

There has been no outside security audit. The project documents the threat model in its repository.

# SEE ALSO

[wg](/man/wg)(1), [wg-quick](/man/wg-quick)(1), [tailscale](/man/tailscale)(1), [headscale](/man/headscale)(1)

# RESOURCES

```[Source code](https://github.com/CLoaKY233/kith)```

```[Documentation](https://github.com/CLoaKY233/kith/blob/main/docs/architecture.md)```

<!-- verified: 2026-11-18 -->
