# TAGLINE

dynamic firewall daemon for Linux

# TLDR

**Start firewalld** daemon

```sudo systemctl start firewalld```

**Enable firewalld** at boot

```sudo systemctl enable firewalld```

**Check firewalld status**

```sudo systemctl status firewalld```

**Run firewalld** in debug mode (foreground)

```sudo firewalld --debug```

**Run firewalld** without forking

```sudo firewalld --nofork```

**Run firewalld** without loading modules

```sudo firewalld --nopid```

# SYNOPSIS

**firewalld** [**--debug**] [**--debug-gc**] [**--nofork**] [**--nopid**] [**--system-config** _DIR_] [**--default-config** _DIR_]

# PARAMETERS

**--debug**
> Set log level to debug and run in foreground.

**--debug-gc**
> Enable garbage collector leak information.

**--nofork**
> Do not fork into background (stay in foreground).

**--nopid**
> Disable writing PID file.

**--system-config** _DIR_
> Path to system configuration directory.

**--default-config** _DIR_
> Path to default configuration directory.

**-h**, **--help**
> Display help message.

# CONFIGURATION

**/etc/firewalld/firewalld.conf**
> Main daemon configuration including default zone, cleanup settings, and backend selection.

**/etc/firewalld/zones/*.xml**
> Zone definitions controlling network trust levels.

**/etc/firewalld/services/*.xml**
> Service definitions for port and protocol mappings.

# DESCRIPTION

**firewalld** is a dynamic firewall daemon providing a frontend for nftables (or iptables as a legacy backend). It manages firewall rules dynamically, allowing changes without disrupting existing connections or requiring a full restart.

Firewalld uses the concept of **zones** to define trust levels for network connections (public, home, work, trusted, etc.). Each zone has predefined rules for allowed services and ports. **Services** define ports and protocols for common applications (ssh, http, https).

Users interact with firewalld primarily through **firewall-cmd**, the command-line client. Changes can be made at runtime (temporary) or permanently (persist across reboots). The daemon handles rule translation and manages the underlying packet filtering.

# CAVEATS

firewalld should not be used simultaneously with other firewall management tools like ufw or direct iptables manipulation. Running firewalld in debug mode generates verbose output and is intended for troubleshooting. The daemon requires root privileges and is typically managed via systemd.

# HISTORY

firewalld was developed by Red Hat and introduced in **Fedora 15** (2011) as a replacement for the static system-config-firewall tool. It provides dynamic management without requiring service restarts. In **2018**, firewalld switched from iptables to nftables as its default backend, though iptables support remains for compatibility.

# SEE ALSO

[firewall-cmd](/man/firewall-cmd)(1), [firewall-offline-cmd](/man/firewall-offline-cmd)(1), [nft](/man/nft)(8), [iptables](/man/iptables)(8)
