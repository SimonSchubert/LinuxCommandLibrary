# TAGLINE

Headless game streaming server for Moonlight clients

# TLDR

**Install** from the Arch User Repository

```yay -S moonshine```

**Enable** the user service (start now and on boot)

```sudo systemctl enable --now moonshine@$USER```

**Allow** the service to run when you are not logged in

```sudo loginctl enable-linger $USER```

**Run** the server directly with a config file (builds from source)

```moonshine [/path/to/config.toml]```

**Pair** a Moonlight client by submitting its PIN

```curl -X POST "http://localhost:47989/submit-pin" -d "uniqueid=0123456789ABCDEF&pin=[PIN]"```

# SYNOPSIS

**moonshine** _config.toml_

# DESCRIPTION

**moonshine** is a Linux-only headless streaming host compatible with [Moonlight](https://moonlight-stream.org/) clients. It streams games (or any application) from your PC to phones, tablets, and other devices, and sends keyboard, mouse, and controller input back to the host.

Unlike desktop-sharing hosts, each stream runs in its own isolated Wayland compositor session, separate from your local desktop. The host remains usable while streaming, and no physical monitor or HDMI dummy plug is required.

Video is hardware-encoded (H.264, H.265, and experimental AV1) via Vulkan on NVIDIA RTX, AMD RDNA2+, or Intel Arc GPUs. Audio uses low-latency Opus (stereo or 5.1/7.1). HDR (10-bit) is supported when the game and client allow it. Clients need Moonlight v6.0.0 or newer. systemd is required to launch and manage application processes.

# PARAMETERS

_config.toml_

> Path to the TOML configuration file. Created automatically with defaults if it does not exist. The AUR package defaults to **$XDG_CONFIG_HOME/moonshine/config.toml**.

**-V**, **--version**

> Print version and exit.

# CONFIGURATION

**$XDG_CONFIG_HOME/moonshine/config.toml** (typically **~/.config/moonshine/config.toml**)

> Main configuration. Define applications and optional scanners.

Example application entry:

```
[[application]]
title = "Steam"
boxart = "/path/to/steam.png"
command = ["/usr/bin/steam", "steam://open/bigpicture"]
pre_command = [
    ["/usr/bin/systemctl", "stop", "conflicting.service"],
]
post_command = [
    ["/usr/bin/nvidia-smi", "pstate", "performance"],
]
```

Steam library scanner (auto-discovers installed games):

```
[[application_scanner]]
type = "steam"
library = "$HOME/.local/share/Steam"
command = ["/usr/bin/steam", "-bigpicture", "steam://rungameid/{game_id}"]
```

Desktop scanner (from .desktop files):

```
[[application_scanner]]
type = "desktop"
directories = [
  "$HOME/.local/share/applications",
  "/usr/share/applications",
]
include_terminal = false
resolve_icons = true
```

**MOONSHINE_LOG**

> Environment filter for tracing (default level: **error**). Passed to the Rust tracing EnvFilter.

First-time pairing: connect with Moonlight, then open **http://localhost:47989/pin** on the host (or use the curl example above) to submit the PIN.

# CAVEATS

Linux and systemd only. Requires a GPU with Vulkan video encoding. AV1 encoding is experimental and can grow frame sizes over time on some NVIDIA drivers; prefer H.264 or H.265 until fixed. Not safe on public networks: the GameStream protocol is not fully encrypted at the application layer — use a VPN (**tailscale**, **wg**/WireGuard) for remote access and never expose ports to the internet.

# HISTORY

**Moonshine** is a Rust reimplementation of a Moonlight-compatible host focused on isolated headless sessions on Linux. It builds on ideas from Sunshine (GameStream host API), Inputtino (input devices), and magic-mirror (Vulkan/Wayland compositor streaming).

# INSTALL

```aur: yay -S moonshine```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[systemctl](/man/systemctl)(1), [loginctl](/man/loginctl)(1), [steam](/man/steam)(1), [tailscale](/man/tailscale)(1), [wg](/man/wg)(8), [yay](/man/yay)(8)

# RESOURCES

```[Source code](https://github.com/hgaiser/moonshine)```

```[Homepage](https://github.com/hgaiser/moonshine)```

```[Documentation](https://github.com/hgaiser/moonshine#readme)```

<!-- verified: 2026-07-20 -->
