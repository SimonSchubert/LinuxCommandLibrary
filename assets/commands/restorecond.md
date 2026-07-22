# TAGLINE

Daemon to restore SELinux contexts on file creation

# TLDR

Start the **restorecond** daemon

```sudo restorecond```

Run in **verbose** mode to see restoration events

```sudo restorecond -v```

Run in **debug** mode

```sudo restorecond -d```

Use **alternative** configuration file

```sudo restorecond -f [restorecond_file]```

Check the **status** of the restorecond service

```sudo systemctl status restorecond```

**Enable** restorecond to start at boot

```sudo systemctl enable restorecond --now```

# SYNOPSIS

**restorecond** [**-d**] [**-f** _restorecond_file_] [**-u**] [**-v**]

# PARAMETERS

**-d**
> Debug mode; run in foreground with verbose output

**-f** _file_
> Use alternate configuration file instead of /etc/selinux/restorecond.conf

**-u**
> Watch user home directory (~) for file creation

**-v**
> Verbose mode; show restoration events

**-F**
> Force mode; do not check device numbers

# DESCRIPTION

**restorecond** is an SELinux daemon that monitors file creation events using inotify and automatically restores proper SELinux security contexts to newly created files. This is useful for directories where files are frequently created with incorrect contexts by applications that don't set contexts properly.

The daemon reads its configuration from /etc/selinux/restorecond.conf, which lists files and directories to watch. When a file matching the configuration is created or modified, restorecond applies the correct context based on SELinux policy.

# CONFIGURATION

**/etc/selinux/restorecond.conf**
> Lists file paths and directories to watch for creation events. One path per line; created files matching these paths have their SELinux contexts automatically restored.

**/etc/selinux/restorecond_user.conf**
> Per-user watch list used when restorecond runs with the **-u** flag to monitor the user's home directory.

# CAVEATS

Requires SELinux to be enabled in enforcing or permissive mode. Must be run as root for the system-wide configuration. Only watches paths explicitly listed in the configuration file (no glob expansion). On modern systemd-based distros **restorecond** is largely deprecated in favor of **systemd file restore** rules and **restorecon -R** during package installation; check whether your distro still ships it before relying on the daemon.

# HISTORY

Part of **policycoreutils**, the SELinux policy core utilities package developed by Red Hat. Created to address the issue of applications creating files with incorrect security contexts, which could cause access denials under SELinux.

# INSTALL

```apt: sudo apt install restorecond```

```zypper: sudo zypper install restorecond```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[restorecon](/man/restorecon)(8), [semanage-fcontext](/man/semanage-fcontext)(8), [semanage](/man/semanage)(8)
