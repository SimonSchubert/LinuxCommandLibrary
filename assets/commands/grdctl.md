# TAGLINE

Configure the GNOME Remote Desktop server

# TLDR

Show whether **RDP and VNC** are enabled, and which ports they use

```grdctl status```

Print the **username and password** as well

```grdctl status --show-credentials```

Point RDP at a **TLS certificate and key**. Both paths must be absolute

```grdctl rdp set-tls-cert [/home/user/.local/share/gnome-remote-desktop/tls.crt]```

```grdctl rdp set-tls-key [/home/user/.local/share/gnome-remote-desktop/tls.key]```

**Prompt** for an RDP username and password, hiding the password

```grdctl rdp set-credentials```

**Turn RDP on** for the current session. View-only stays on until you allow input

```grdctl rdp enable```

```grdctl rdp disable-view-only```

Let VNC clients in with a **password** of at most 8 characters

```grdctl vnc set-auth-method password```

```grdctl vnc set-password```

Configure the **headless** single-user server instead of screen sharing

```grdctl --headless rdp set-credentials```

```grdctl --headless rdp enable```

Configure the **system** remote-login daemon. This asks for administrator rights

```grdctl --system rdp set-credentials```

```grdctl --system rdp enable```

Allow **Kerberos** as well as a username and password. Not available for the system daemon

```grdctl rdp set-auth-methods [credentials,kerberos]```

```grdctl rdp set-kerberos-keytab [/absolute/path/to/keytab]```

# SYNOPSIS

**grdctl** [**--headless** | **--system**] _command_ [_subcommand_] [_arguments_]

# DESCRIPTION

**grdctl** configures GNOME Remote Desktop, the RDP and VNC server built into GNOME. It writes the same settings as **Settings > System > Remote Desktop** and, when a backend is enabled or disabled, enables or stops the matching systemd unit.

With no mode flag it configures **remote assistance**: sharing the desktop that is already logged in. Locking that screen closes the remote connection. **--headless** configures a single-user headless session (`gnome-remote-desktop-headless.service` on the user bus). **--system** configures the system daemon used for remote login through GDM (`gnome-remote-desktop.service` on the system bus). That mode is RDP only. The system credential unlocks the login screen; each person still signs in with their own account afterwards.

RDP listens on port **3389** by default and, unless port negotiation is turned off, tries the next 10 ports when that one is taken. VNC listens on port **5900** and does not negotiate unless asked. Both backends start **view-only**, so a client can see the screen but cannot move the pointer or type until view-only is disabled.

# OPTIONS

**--headless**

> Configure the headless user daemon instead of screen sharing.

**--system**

> Configure the system remote-login daemon. **grdctl** re-executes itself through **pkexec** as the **gnome-remote-desktop** user.

**--help**

> Print every command.

# COMMANDS

**status** [**--show-credentials**]

> Print the systemd unit state and, for each backend, whether it is enabled, its port, TLS paths, view-only flag, and credentials. Credentials are shown as `(hidden)` or `(empty)` unless **--show-credentials** is given.

**rdp enable**

> Turn the RDP backend on and enable and start its systemd unit.

**rdp disable**

> Turn the RDP backend off. The unit is stopped only when VNC is off as well.

**rdp set-tls-cert** _PATH_

> Absolute path to the RDP TLS certificate.

**rdp set-tls-key** _PATH_

> Absolute path to the RDP TLS private key. RDP will not accept clients until both this and the certificate are set.

**rdp set-credentials** [_USERNAME_ [_PASSWORD_]]

> Store the RDP username and password. Omit either argument to be prompted. The password prompt does not echo.

**rdp clear-credentials**

> Remove the stored RDP username and password.

**rdp set-auth-methods** _LIST_

> Comma-separated list of **credentials** and **kerberos**. At least one method is required. **kerberos** works in screen-share and headless modes only.

**rdp set-kerberos-keytab** _PATH_

> Absolute path to a keytab whose TERMSRV principal authenticates Kerberos clients.

**rdp set-port** _PORT_

> Port to listen on. The default is **3389**.

**rdp enable-port-negotiation**

> If the chosen port is busy, try the next 10 ports. This is the default.

**rdp disable-port-negotiation**

> Bind only the configured port.

**rdp enable-view-only**

> Refuse keyboard and pointer input from RDP clients.

**rdp disable-view-only**

> Let RDP clients control the session. View-only is the default.

**vnc enable**

> Turn the VNC backend on and enable and start its systemd unit. Not available with **--system**.

**vnc disable**

> Turn the VNC backend off. The unit is stopped only when RDP is off as well.

**vnc set-auth-method** **password** | **prompt**

> **password** checks the stored VNC password. **prompt** asks the person at the machine to approve each connection. **prompt** is the default.

**vnc set-password** [_PASSWORD_]

> Store the VNC password. Omit it to be prompted. Passwords longer than 8 characters are rejected.

**vnc clear-password**

> Remove the stored VNC password.

**vnc set-port** _PORT_

> Port to listen on. The default is **5900**.

**vnc enable-port-negotiation**

> If the chosen port is busy, try the next 10 ports.

**vnc disable-port-negotiation**

> Bind only the configured port. This is the default.

**vnc enable-view-only**

> Refuse keyboard and pointer input from VNC clients. This is the default.

**vnc disable-view-only**

> Let VNC clients control the session.

# CAVEATS

Certificate, key, and keytab paths must already be absolute when **grdctl** sees them. A shell expands **~** before the program runs; a path that still starts with **~** is rejected.

A password passed on the command line is visible to other users in the process list. Leave it off and let **grdctl** prompt.

**--system** stores credentials for the **gnome-remote-desktop** account, separate from any desktop user. Those credentials only open the remote login screen.

The system daemon has no VNC backend. Headless remote login through GDM is RDP only.

# HISTORY

**grdctl** was added to GNOME Remote Desktop in **2022**, when the Settings panel stopped exposing every backend option and a shell tool was needed to configure VNC and RDP. Later releases taught it to prompt for credentials, report the TLS fingerprint, and enable the user, headless, and system units itself.

# INSTALL

```apt: sudo apt install gnome-remote-desktop```

```dnf: sudo dnf install gnome-remote-desktop```

```pacman: sudo pacman -S gnome-remote-desktop```

```apk: sudo apk add gnome-remote-desktop```

```zypper: sudo zypper install gnome-remote-desktop```

```nix: nix profile install nixpkgs#gnome-remote-desktop```

<!-- packages: 2026-10-22 -->

# SEE ALSO

[xfreerdp](/man/xfreerdp)(1), [vncviewer](/man/vncviewer)(1), [remmina](/man/remmina)(1), [systemctl](/man/systemctl)(1)

# RESOURCES

```[Source code](https://gitlab.gnome.org/GNOME/gnome-remote-desktop)```

```[Documentation](https://gitlab.gnome.org/GNOME/gnome-remote-desktop/-/blob/main/docs/configuration.md)```

<!-- verified: 2026-10-22 -->
