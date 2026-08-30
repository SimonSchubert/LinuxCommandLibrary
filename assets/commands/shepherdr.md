# TAGLINE

phone-friendly web UI for a local Herdr session

# TLDR

Print the **version**

```shepherdr --version```

**First start** with a private HTTPS origin and a Web Push contact (start **herdr** first)

```shepherdr -public-origin [https://machine.tailnet.ts.net] -vapid-contact [mailto:you@example.com]```

**Later starts** (origin already saved)

```shepherdr```

Print a ten-minute **trust-this-device** link and QR (Shepherdr must be stopped)

```shepherdr access invite```

**List** trusted sign-ins

```shepherdr access devices```

**Revoke** one trusted sign-in

```shepherdr access revoke [trust-id]```

Wipe passkeys, sessions, invitations, and notification subscriptions (keeps the saved origin)

```shepherdr access reset```

Start **without passkey protection** for this process only (not saved; do not combine with **-public-origin**)

```shepherdr -no-sign-in```

Clear Web Push state, then exit (Shepherdr must be stopped)

```shepherdr -reset-notifications```

# SYNOPSIS

**shepherdr** [**-listen** _addr_] [**-herdr-socket** _path_] [**-public-origin** _url_] [**-vapid-contact** _uri_] [**-session-lifetime** _duration_] [**-no-sign-in**] [**-upload-parent** _dir_] [**-upload-limit** _size_] [**-reset-notifications**] [**-version**]

**shepherdr access** **invite** | **devices** | **revoke** _trust-id_ | **reset**

# PARAMETERS

**-listen** _addr_
> Loopback TCP address for the HTTP server. Default **127.0.0.1:8787**. Match this port with **tailscale serve --bg**. The listen address is not a public origin.

**-public-origin** _url_
> Canonical private HTTPS origin used for passkey protection: **https://** plus a lowercase DNS name and an optional non-default port. No path, no trailing slash, no **:443**. Required on the first protected start; saved in **~/.config/shepherdr/access.json** and cannot be changed later.

**-vapid-contact** _uri_
> Operator contact for Web Push. Accepts a **mailto:** address or an absolute HTTPS URI. Saved once; each browser then chooses its own events in Settings.

**-session-lifetime** _duration_
> Protected session length: **1d** through **365d**, or **none**. Default **30d**. Saved. Using Shepherdr does not extend a session.

**-herdr-socket** _path_
> Absolute path to the Unix socket of the one local Herdr session. Default **~/.config/herdr/herdr.sock**.

**-upload-parent** _dir_
> Parent directory for files staged from the phone. Default is the system temp directory. Shepherdr creates a per-workspace subdirectory and sends absolute paths to the agent.

**-upload-limit** _size_
> Decoded bytes allowed per send: a byte count, **KiB** / **MiB** / **GiB**, or **none**. Default **50MiB**.

**-no-sign-in**
> Run this process without passkey protection. Not saved. Anyone who can reach the listen address has operator authority. Cannot be combined with **-public-origin** or **-session-lifetime**.

**-reset-notifications**
> Delete notification subscriptions, VAPID keys, and the saved contact, then exit. Stop Shepherdr first.

**-version**
> Print **shepherdr** and the build version, then exit.

**-h**, **-help**
> Print flag defaults and exit (Go **flag** package).

**access invite**
> Print a ten-minute setup link and QR code. First start already prints one; this reprints after you miss it. Stop Shepherdr first. Access commands cannot be combined with server flags.

**access devices**
> List trusted sign-ins (label, trust ID, created/last-used, backup eligibility). Stop Shepherdr first.

**access revoke** _trust-id_
> Remove one trusted sign-in. Refuses to remove the last remaining passkey. Stop Shepherdr first.

**access reset**
> Wipe passkeys, sign-ins, invitations, and notification subscriptions. Keeps the private origin and notification contact. The next protected start prints a new invitation. Stop Shepherdr first.

# DESCRIPTION

**shepherdr** is a locally installed Go process that serves a mobile-friendly HTTPS web UI for a running **herdr** session on the same machine and OS account. From a phone you can see every Herdr terminal marked **working**, **blocked**, **idle**, **done**, or **unknown**; open that exact pane (never a substitute); read output; send text or shortcuts; attach files while a recognized agent is present; and create, close, or delete clean Herdr workspaces and worktrees. Herdr still does the agent work.

The binary embeds the browser app. It listens on loopback only, talks to Herdr over the owner-only Unix socket, and looks up the **herdr** executable on **PATH** for terminal access. A stable private HTTPS hostname in front of the loopback port is required for passkey sign-in; **tailscale serve --bg 8787** is the documented way to get one. Open only that exact origin. Passkeys are an extra lock on a trusted network, not permission to publish Shepherdr. Do not use Tailscale Funnel or any public exposure.

On the first protected start, Shepherdr prints a setup link and QR code (they expire in ten minutes and are not reprinted on restart). Open the link, name the device, and choose **Trust this device**. Later visits sign in with that passkey. A new browser cannot trust itself. When sign-in is on, do not open Shepherdr by loopback, IP, **localhost**, another name, or another port.

**Settings → Devices** lists trusted sign-ins, invites another device, revokes one while another remains, or signs this browser out. A passkey that syncs across copies shares one entry and is revoked together.

Web Push is best-effort: no history and no delivery guarantee. Events **blocked**, **done**, and trusted sign-in added/removed are on by default; **working**, **idle**, **unknown**, and workspace opened/closed are off until enabled per browser. On iPhone or iPad, add Shepherdr to the Home Screen and open it from there before enabling notifications.

Phone **Message → Add files** appears only while that exact terminal has a recognized agent. Photos and Files use the browser pickers. Shepherdr stores the files on this machine and injects their absolute paths into the terminal as **User uploaded files:** so the agent can open them locally; the bytes are not sent to a model. Files stay with the workspace across agent changes and restarts. After the workspace is gone, Shepherdr tries to delete only the folder it created. Cleanup can fail. This is not file history.

# CONFIGURATION

State lives under the user config directory (**$XDG_CONFIG_HOME/shepherdr** on Linux, typically **~/.config/shepherdr**). The directory must be owner-only mode **0700**.

**~/.config/shepherdr/access.json**
> Protected origin, relying-party ID, session lifetime, passkey credentials, sessions, and invitations. Created on the first protected start. Mode **0600**. **access.lock** in the same directory is the service lock; access subcommands fail with **Stop Shepherdr first** while the server holds it.

**~/.config/shepherdr/notifications.json**
> VAPID keys, contact, and per-browser Web Push subscriptions.

**~/.config/shepherdr/uploads.json**
> Per-workspace mapping from Herdr workspace IDs to staged upload directories.

**~/.config/herdr/herdr.sock**
> Default Herdr Unix socket. Override with **-herdr-socket**.

Saved values from **-public-origin** and **-session-lifetime** persist across restarts. **-no-sign-in** does not.

# CAVEATS

Requires **herdr** 0.8.0 through 0.8.2 already running as the same OS user, with **herdr** on **PATH**. Older Herdr versions refuse to start; newer versions start with a compatibility warning until they are officially supported.

**-public-origin** is immutable after the first protected start. A mismatch exits with an error rather than rewriting the origin.

Keep Shepherdr on a trusted private network. Reaching the process is not the same as being a trusted device, but **-no-sign-in** grants operator authority to anyone who can connect.

Run Shepherdr, Herdr, and Herdr agents as the same account so the socket and staged upload paths remain usable.

macOS release archives are unsigned and not notarized; the OS may warn on first run.

Access commands and **-reset-notifications** require Shepherdr to be stopped. Access commands cannot be combined with server configuration flags.

**-terminal-lab** is a development-only flag for a terminal comparison lab and is not part of the supported operator workflow.

# HISTORY

**Shepherdr** is an independent companion to **herdr**, written in Go by **Luis Cleto** (**luiscleto**) and released under the Apache License 2.0. **v0.1.0** was an unpublished release candidate. **v0.1.1** (2026-08-25) is the first published release, with downloadable Linux amd64/arm64 and macOS amd64/arm64 archives.

# SEE ALSO

[herdr](/man/herdr)(1), [tmux](/man/tmux)(1), [zellij](/man/zellij)(1), [tailscale](/man/tailscale)(1)

# RESOURCES

```[Source code](https://github.com/luiscleto/shepherdr)```

<!-- verified: 2026-08-30 -->
