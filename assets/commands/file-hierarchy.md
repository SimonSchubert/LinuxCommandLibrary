# TAGLINE

systemd filesystem hierarchy documentation

# TLDR

**View file hierarchy documentation**

```man file-hierarchy```

# DESCRIPTION

**file-hierarchy** is a systemd documentation page (man page) describing the file system hierarchy used by systemd-based Linux systems. It documents the purpose of directories under /, /etc, /usr, /var, and other key locations.

This is not an executable command but a reference document explaining where files should be placed and why.

# KEY DIRECTORIES

```
/               Root filesystem
/boot           Boot loader files
/etc            Host-specific configuration
/home           User home directories
/root           Root user's home
/run            Runtime variable data
/srv            Service data
/tmp            Temporary files
/usr            Vendor-supplied OS resources
/usr/bin        Executables
/usr/lib        Libraries
/usr/share      Architecture-independent data
/var            Variable data
/var/cache      Application caches
/var/lib        State information
/var/log        Log files
/var/tmp        Persistent temporary files
```

# SYSTEMD SPECIFICS

- /run replaces /var/run
- /usr/lib/systemd for unit files
- /etc/systemd for local overrides
- Merged /usr (bin, sbin, lib merged)

# SEE ALSO

[hier](/man/hier)(7), [systemd](/man/systemd)(1), [file-hierarchy](/man/file-hierarchy)(7)
