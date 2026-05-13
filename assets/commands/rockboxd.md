# TAGLINE

Headless Rockbox audio engine daemon with gRPC, GraphQL, HTTP, and MPD APIs

# TLDR

**Start** the daemon in the foreground

```rockboxd```

**Start with info-level logging** to see discovered network renderers

```RUST_LOG=info rockboxd```

**Install** as a systemd user service

```rockbox service install```

**Check** the service status

```rockbox service status```

**Talk to it** as an MPD server from any MPD client

```mpc -p 6600 [play]```

# SYNOPSIS

**rockboxd**

**rockbox** **service** {**install** | **uninstall** | **status**}

# DESCRIPTION

**rockboxd** is a single-binary daemon that embeds the open-source **Rockbox** audio engine and exposes it over multiple protocols simultaneously. Out of the box it listens for **gRPC** on port **6061**, **GraphQL** plus a web UI on **6062**, an **HTTP REST** API on **6063**, and an **MPD-compatible** server on **6600**, so the same library and playback state can be controlled from web, mobile, scripts, or any existing MPD client.

Playback inherits Rockbox's capabilities: gapless transitions, replay-gain, software DSP, and decoders for 20+ codecs. Audio can be rendered locally through **CPAL** or streamed to remote sinks including **Snapcast**, **AirPlay**, **Squeezelite**, **Chromecast**, and **UPnP/DLNA** renderers, which makes it convenient as the backbone of a multi-room audio system.

The companion **rockbox** command installs and manages the daemon as a systemd user service. **rockboxd** is distinct from the original **Rockbox** firmware (which targets portable music players) and from the **rockboxdev.sh** toolchain helper.

# CONFIGURATION

Configuration is read from **~/.config/rockbox.org/settings.toml**. The file controls the music library path, enabled output sinks, and listening ports.

```
[library]
music_dir = "~/Music"

[outputs.local]
enabled = true

[outputs.snapcast]
enabled = true
host = "snapserver.lan"
port = 1704

[server]
mpd_port = 6600
grpc_port = 6061
graphql_port = 6062
http_port = 6063
```

Verbosity is controlled via the **RUST_LOG** environment variable (`error`, `warn`, `info`, `debug`, `trace`).

# CAVEATS

For **Chromecast** output the local port **7881** must be reachable from the renderer on the LAN. **rockboxd** is unrelated to the Rockbox firmware; do not flash it to a DAP. Configuration is TOML-only — there is no traditional flag-based CLI.

# HISTORY

**rockboxd** is part of the **rockbox-zig** project created by **Tsiry Sandratraina**. It is written in Rust and Zig around the upstream Rockbox audio engine and is actively maintained, with packages available for Ubuntu, Fedora, Arch, Homebrew, and Docker.

# SEE ALSO

[mpd](/man/mpd)(1), [snapserver](/man/snapserver)(1), [shairport-sync](/man/shairport-sync)(1), [squeezelite](/man/squeezelite)(1)
