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

On systems with PAM, /etc/motd is displayed after successful authentication. Dynamic MOTD systems run scripts from /etc/update-motd.d/.

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
/etc/update-motd.d/    - Dynamic scripts
/run/motd.dynamic      - Generated output
```

# CAVEATS

Dynamic MOTD requires update-motd package. Scripts must be executable. SSH may have separate banner. PAM configuration affects display.

# SEE ALSO

[login](/man/login)(1), [sshd](/man/sshd)(8), [pam](/man/pam)(8), [wall](/man/wall)(1)
