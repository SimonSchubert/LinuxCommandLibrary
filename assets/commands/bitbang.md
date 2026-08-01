# TAGLINE

peer-to-peer remote shell, files, and proxy without accounts

# TLDR

**Serve** shell, files, and proxy (prints URL, QR, pairing code)

```bitbang serve```

**Serve shell only**

```bitbang serve shell```

**Serve a files share** (add **-upload** to allow uploads)

```bitbang serve files [~/share]```

**Serve HTTP proxy** to a fixed local target

```bitbang serve proxy [localhost:8080]```

**Connect** an interactive shell from another machine

```bitbang connect [url-or-code-or-name]```

**Run a remote command** non-interactively

```bitbang connect [url] -- [tail -f /var/log/syslog]```

**Copy a file** scp-style

```bitbang cp [url]:[/var/log/app.log] [./app.log]```

**Pair once** and save a short device name

```bitbang connect [482731] -name [nas1]```

# SYNOPSIS

**bitbang** _command_ [_options_] [_args_...]

# PARAMETERS

**serve** [_mode_] [_args_]
> Start a listener. Modes: bare **serve** (shell + files + proxy), **shell**, **files** [_PATH_], **proxy** [_HOST:PORT_].

**connect** _target_ [**--** _command_...]
> Connect as client. _target_ may be a URL, 6-digit pair code, or saved device name. With **--** _command_, run that command and exit.

**cp** _src_ _dst_
> Copy files; exactly one side is remote as `url:/path`. **-** means stdin/stdout.

**version**
> Print version (also **--version**).

**help**
> Usage (also **-h**, **--help**).

**-server** _HOST_
> Signaling server hostname (default **bitba.ng**).

**-pin** _PIN_
> Require (serve) or send (connect/cp) a PIN.

**-ephemeral**
> Throwaway identity: fresh URL each serve run.

**-nocode**
> Disable spoken 6-digit pairing on the listener (URL still works).

**-name** _NAME_
> Save a newly paired/connected host under _NAME_ (first time only).

**-relay**
> Prefer TURN relay up front (ICE still tries direct paths).

**-timeout** _DUR_
> Dial timeout (default **30s**).

**-v**
> Verbose logging.

# DESCRIPTION

**bitbang** is a single static Go binary for remote access over WebRTC: open a shell, browse/transfer files, and reverse-proxy HTTP to the remote machine's network—without port forwarding, VPN setup, or an account.

On the machine you want to reach, run **bitbang serve**. It prints a URL (and QR/pairing code). Anyone who opens the URL in a browser gets the capabilities you enabled; another **bitbang** client can **connect** or **cp** with the same credential.

The public **bitba.ng** host only brokers signaling. Data is end-to-end encrypted (DTLS). After ICE succeeds, traffic is peer-to-peer when possible; otherwise a TURN relay carries ciphertext only. Device identity is an RSA key under **~/.bitbang/**; successful connects are remembered in **~/.bitbang/devices.json** for short names.

# CAVEATS

The serve URL is a **bearer credential**—anyone with it gets the served capabilities (including a full shell). Prefer short-lived/ephemeral listeners and **-pin** for standing hosts. Official install targets Linux (`amd64`/`arm64`/`armv7`) via GitHub releases; macOS/Windows builds may lag. Requires outbound connectivity to the signaling (and possibly TURN) server unless you self-host BitBang signaling.

# CONFIGURATION

Identity and known hosts live under **~/.bitbang/** (mode-restricted files). Keypair path is **~/.bitbang/**_program_**/identity.pem** (default program name **bitbang**). Saved devices: **~/.bitbang/devices.json**.

# HISTORY

**bitbang** is part of the open-source **BitBang** project by **richlegrand**, MIT-licensed. The CLI maps roughly to **sshd**/**ssh**/**scp** with WebRTC instead of TCP, emphasizing zero-config reach through NAT and browser clients without installing software on the connector.

# SEE ALSO

[ssh](/man/ssh)(1), [scp](/man/scp)(1), [ngrok](/man/ngrok)(1), [tailscale](/man/tailscale)(1)

# RESOURCES

```[Source code](https://github.com/richlegrand/bitbang-cli)```

```[Homepage](https://bitba.ng)```

```[Documentation](https://github.com/richlegrand/bitbang-cli#readme)```

<!-- verified: 2026-08-01 -->
