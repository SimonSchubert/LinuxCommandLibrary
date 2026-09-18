# TAGLINE

FreeRDP 3 X11 Remote Desktop Protocol client

# TLDR

**Connect** to a host

```xfreerdp3 /u:[username] /p:[password] /v:[host]```

Connect in **fullscreen** (`Ctrl+Alt+Enter` toggles)

```xfreerdp3 /u:[username] /p:[password] /v:[host] /f```

Set a **custom window size**

```xfreerdp3 /u:[username] /p:[password] /v:[host] /w:[1366] /h:[768]```

Scale the session to **half the local screen height**

```xfreerdp3 /u:[username] /v:[host] /size:50%h```

Resize the remote desktop when the **window is resized**

```xfreerdp3 /u:[username] /p:[password] /v:[host] /dynamic-resolution```

Share the **clipboard**

```xfreerdp3 /u:[username] /p:[password] /v:[host] +clipboard```

Log in with a **Windows domain**

```xfreerdp3 /u:[username] /p:[password] /d:[DOMAIN] /v:[host]```

**Ignore** a mismatched server certificate

```xfreerdp3 /u:[username] /p:[password] /v:[host] /cert:ignore```

Redirect a **local directory** as a named drive share

```xfreerdp3 /u:[username] /p:[password] /v:[host] /drive:[home],[/home/user]```

Redirect **audio** through ALSA

```xfreerdp3 /u:[username] /p:[password] /v:[host] /sound:sys:alsa```

Reuse a saved **.rdp file** and go fullscreen

```xfreerdp3 [connection.rdp] /p:[password] /f```

Connect to a **Hyper-V console** (port 2179)

```xfreerdp3 /u:[username] /p:[password] /vmconnect:[vmid] /v:[host]```

# SYNOPSIS

**xfreerdp3** [_file_] [_options_] [**/v:**server[:port]]

# PARAMETERS

**/v:** _host_[:_port_]
> Server hostname, IPv4/IPv6 address, vsock URI, named pipe, or an existing TCP socket. Default port is **3389**.

**/u:** _username_
> Username. Domain can be prefixed with a backslash (`DOMAIN\user`) or appended after `@`.

**/p:** [_password_]
> Password. Passing `/p` with no value silences interactive prompts when the server needs no credentials. A password on the command line is visible in the process list.

**/d:** _domain_
> Windows domain.

**/port:** _number_
> Server port (alternative to `/v:host:port`).

**/f**
> Fullscreen. Toggle with Ctrl+Alt+Enter.

**/w:** _width_
> Window width in pixels (default **1024**).

**/h:** _height_
> Window height in pixels (default **768**).

**/size:** _WxH_ | _N_%w | _N_%h
> Screen size. `50%h` uses 50% of the local screen height.

**+dynamic-resolution**
> Send resolution updates when the local window is resized (default off). `/dynamic-resolution` is the same toggle.

**+clipboard**
> Enable clipboard redirection (default off). `/clipboard:` accepts sub-options for selection atom and direction.

**/drive:** _name_,_path_
> Redirect local directory _path_ as share _name_. `/drive:hotplug,*` redirects drives plugged in later.

**/sound:** [sys:_name_]
> Audio output redirection. Example: `/sound:sys:alsa`.

**/microphone:** [sys:_name_]
> Audio input (microphone) redirection.

**/cert:** deny | ignore | tofu | name:_name_ | fingerprint:_hash_
> Certificate policy. **ignore** skips all checks; **tofu** accepts the first certificate and rejects later mismatches.

**/sec:** rdp | tls | nla | ext | aad
> Force a security protocol. `/sec:nla` enables NLA and disables the others.

**/gateway:**g:_host_[:_port_]
> RD Gateway. Short form: `/gw:`.

**/admin**
> Admin (console) session. Alias: `/console`.

**/app:** program:_path_
> RemoteApp (run a single remote program instead of a full desktop).

**/smartcard:** [_filter_]
> Redirect matching smart cards.

**/printer:** [_name_[,_driver_]]
> Redirect a printer.

**/usb:** id:_vid_:_pid_
> Redirect a USB device by vendor/product id.

**/from-stdin**
> Read credentials from stdin.

**/version**
> Print version.

**/help**, **/?**
> Print help.

# DESCRIPTION

**xfreerdp3** is the X11 Remote Desktop Protocol (RDP) client from **FreeRDP 3**. It connects to Windows Remote Desktop, **xrdp**, GNOME Remote Desktop, ogon, VirtualBox VRDP, and other RDP servers.

It is the 3.x successor of **xfreerdp** (FreeRDP 2). Distros that ship both versions name this binary **xfreerdp3** so the two can be installed together. Options use FreeRDP's Windows-style syntax: `/flag` enables a flag, `/option:`_value_ sets a value, and `+toggle` / `-toggle` turn a toggle on or off (`/` is a synonym of `+`). A saved `.rdp` file can be passed as the first argument.

Graphics, clipboard, drives, printers, smart cards, USB, audio, microphone, and RemoteApp can all be redirected. Network Level Authentication (**NLA**), TLS, RDP standard security, Azure AD, RD Gateway, and Hyper-V console connections (`/vmconnect`) are supported.

# KEYBOARD SHORTCUTS

**Right Ctrl**
> Release keyboard and mouse grab so local shortcuts work again.

**Ctrl+Alt+Enter**
> Toggle fullscreen.

**Ctrl+Alt+M**
> Minimize the window.

**Ctrl+Alt+D**
> Disconnect and exit.

**Ctrl+Alt+C**
> Toggle remote control in a remote-assistance session.

# CONFIGURATION

Global certificate policy is JSON at **/etc/FreeRDP/certificates.json**. The X11 client also reads **/etc/FreeRDP/xfreerdp.json** (`isActionScriptAllowed` enables or blocks action scripts).

An optional **action script** at `~/.config/freerdp/action.sh` (or `/action-script:`_path_) receives key combinations and can mark them `key-local` so they are not forwarded to the remote session.

`FREERDP_ASKPASS` selects an askpass program, similar to `SSH_ASKPASS`. Logging uses **wLog**; `/log-level` and `/log-filters` override the environment.

# CAVEATS

A password given with **/p:** is visible to other users via `ps`. Prefer an interactive prompt, `/from-stdin`, or `FREERDP_ASKPASS`.

**/cert:ignore** disables certificate checks entirely. Do not use it on untrusted networks.

This is an **X11** client. On a pure Wayland session it typically runs through XWayland. FreeRDP 3 also ships **wlfreerdp3** (Wayland) and **sdl-freerdp3** (SDL) as separate binaries.

Keyboard grab (on by default) swallows local compositor shortcuts until **Right Ctrl** releases it.

# HISTORY

**FreeRDP** is an Apache-licensed RDP implementation that grew out of the earlier **rdesktop** client. The 3.x series (first released in **2023**) is a new ABI; Linux distributions therefore install the X11 frontend as **xfreerdp3** alongside the 2.x **xfreerdp** binary.

# INSTALL

```apt: sudo apt install freerdp3-x11```

```dnf: sudo dnf install freerdp```

```pacman: sudo pacman -S freerdp```

```apk: sudo apk add freerdp```

```zypper: sudo zypper install freerdp```

```brew: brew install freerdp```

```nix: nix profile install nixpkgs#freerdp```

<!-- packages: 2026-09-18 -->

# SEE ALSO

[xfreerdp](/man/xfreerdp)(1), [rdesktop](/man/rdesktop)(1), [remmina](/man/remmina)(1), [vinagre](/man/vinagre)(1), [vncviewer](/man/vncviewer)(1), [krdc](/man/krdc)(1)

# RESOURCES

```[Source code](https://github.com/FreeRDP/FreeRDP)```

```[Homepage](https://www.freerdp.com/)```

```[Documentation](https://github.com/FreeRDP/FreeRDP/wiki)```

<!-- verified: 2026-09-18 -->
