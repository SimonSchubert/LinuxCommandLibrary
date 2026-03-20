# TAGLINE

displayed to users upon login

# TLDR

**Edit static MOTD**

```sudo nano /etc/motd```

**View MOTD**

```cat /etc/motd```

**Add dynamic MOTD script**

```sudo nano /etc/update-motd.d/[99-custom]```

**Make dynamic script executable**

```sudo chmod +x /etc/update-motd.d/[99-custom]```

**Regenerate dynamic MOTD**

```run-parts /etc/update-motd.d/```

# SYNOPSIS

**/etc/motd**

# DESCRIPTION

**motd** (Message of the Day) is displayed to users upon login. It can be a static text file or dynamically generated from scripts.

The contents of /etc/motd are displayed by login(1) after a successful login but just before executing the login shell. On systems with PAM, the pam_motd module handles display and can show files from multiple locations. Dynamic MOTD systems run scripts from /etc/update-motd.d/.

# STATIC MOTD

```
# /etc/motd
Welcome to myserver
Authorized users only
```

# DYNAMIC MOTD

```bash
#!/bin/bash
# /etc/update-motd.d/10-sysinfo
echo "System: $(uname -n)"
echo "Uptime:$(uptime -p)"
echo "Users: $(who | wc -l)"
```

# FILE LOCATIONS

```
/etc/motd              - Static message
/etc/motd.d/           - Static message directory
/run/motd              - Runtime generated message
/run/motd.d/           - Runtime message directory
/usr/lib/motd          - Distribution-provided message
/usr/lib/motd.d/       - Distribution-provided message directory
/etc/update-motd.d/    - Dynamic scripts (Ubuntu/Debian)
/run/motd.dynamic      - Generated output (Ubuntu/Debian)
```

# CAVEATS

Dynamic MOTD requires update-motd package on Ubuntu/Debian. Scripts must be executable. SSH may have a separate banner configured via the Banner directive in sshd_config. PAM configuration affects display. Each message file is limited to 64KB.

# SEE ALSO

[login](/man/login)(1), [sshd](/man/sshd)(8), [pam_motd](/man/pam_motd)(8), [wall](/man/wall)(1)
