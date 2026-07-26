# TAGLINE

Pixel-exact VNC client for the terminal (Kitty graphics)

# TLDR

**Connect** to a VNC display by host and display number

```desktui [desk:1]```

**Connect** with host and raw port

```desktui [10.0.0.5::5900]```

**Connect** and scale the desktop to fit the terminal

```desktui [10.0.0.5::5900] --scale fit```

**View-only** session (no input to the remote)

```desktui [desk:1] --view-only```

**Use a password file**

```desktui [desk:1] --password-file [~/.vnc/passwd.txt]```

**Print terminal graphics capabilities**

```desktui --print-caps```

**Draw a test pattern** without a VNC server

```desktui --test-pattern```

**Connect over an SSH tunnel** with env password

```VNC_PASSWORD=[secret] desktui [localhost::5901]```

# SYNOPSIS

**desktui** [_options_] [_target_]

# PARAMETERS

_target_

> VNC address in common client forms: **host**, **host:display**, **host::port**, IPv6, or display-style names such as **desk:1**.

**--scale** _MODE_

> Desktop fitting mode: **native** (ask the server to resize to the terminal; default when supported), **fit**, **integer**, or **1:1**. Switchable live with the local prefix then **m**.

**--view-only**

> Do not send keyboard or pointer input to the remote (toggle with prefix then **v**).

**--no-clipboard**

> Disable bidirectional clipboard sync (on by default).

**--password-file** _FILE_

> Read the VNC password from _FILE_ instead of prompting.

**--quality** _N_

> Request a Tight quality level (enables JPEG). Unset means lossless when the server allows it.

**--compression** _N_

> Compression hint for the server.

**--fps** _N_

> Cap frame rate (defaults aim at lossless ~60 fps when the link allows).

**--prefix** _KEY_

> Local command prefix (default **Ctrl+A**). Use when it collides with tmux or another multiplexer.

**--print-caps**

> Probe and print terminal graphics and input capabilities, then exit.

**--test-pattern**

> Exercise the pixel pipeline without connecting to a server.

**--log-file** _FILE_

> Write diagnostics to _FILE_ (stdout cannot be used for logs during a graphics session).

# DESCRIPTION

**desktui** is a terminal VNC (RFB) client that renders the remote desktop as real pixels via the **Kitty graphics protocol** — one remote pixel per terminal pixel, not half-block ASCII art. It targets terminals that implement Kitty graphics (notably **Ghostty**, **kitty**, and **WezTerm**). Startup probes the terminal and refuses to start with a clear error if image graphics are unavailable.

On connect, desktui prefers **native** scaling: it sends **SetDesktopSize** so the remote desktop matches the terminal’s usable pixel area and nothing is resampled. Servers that refuse (common with **x11vnc**) fall back to **fit**, **integer**, or **1:1** with panning. Input is passed through to the remote; local commands live behind a prefix (default **Ctrl+A**): quit, refresh, rescale, pan, view-only, and stats.

Authentication supports none and classic VNC password (TigerVNC, x11vnc, TightVNC, QEMU, Kasm). Password comes from **--password-file**, **$VNC_PASSWORD**, or a prompt when the server asks. Apple Remote Desktop auth, RealVNC proprietary auth, and VeNCrypt/TLS-only servers are not supported. For untrusted networks, use an SSH tunnel: VNC password auth and the session that follows are not modern TLS.

# CAVEATS

Requires a terminal with the Kitty graphics protocol; ordinary terminals without image support cannot run desktui. Shared-memory frame transport (**t=s**) is much faster on a local terminal; over SSH you pay zlib+base64 cost and full-screen motion is capped near the compression path (~48 fps in project measurements). macOS Screen Sharing and RealVNC proprietary schemes will fail with an explicit message. Prefer SSH tunnels for any non-local VNC endpoint.

# SEE ALSO

[vncviewer](/man/vncviewer)(1), [tigervnc](/man/tigervnc)(1), [x11vnc](/man/x11vnc)(1), [vncserver](/man/vncserver)(1), [kitty](/man/kitty)(1), [ghostty](/man/ghostty)(1), [wezterm](/man/wezterm)(1)

# RESOURCES

```[Source code](https://github.com/mishushakov/desktui)```

<!-- verified: 2026-07-26 -->
