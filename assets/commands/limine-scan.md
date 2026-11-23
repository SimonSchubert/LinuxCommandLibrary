# TAGLINE

add existing UEFI boot entries to Limine

# TLDR

This command is an alias of **limine-entry-tool --scan**.

**Scan UEFI boot entries** and pick ones to add to Limine (e.g. Windows for dual boot)

```limine-scan```

View documentation for the original command

```tldr limine-entry-tool```

# SYNOPSIS

**limine-scan**

# DESCRIPTION

**limine-scan** reads the active UEFI boot entries from NVRAM and lets you select one to add as an entry in **limine.conf**, which is the usual way to set up dual boot with Windows or another OS. It is a small wrapper script that runs **limine-entry-tool --scan** and is shipped with the **limine-entry-tool** package (Entry Automation for Limine).

# CAVEATS

Requires root privileges; when started as a normal user it escalates through the authentication method set by **AUTH_METHOD** in **/etc/limine-entry-tool.conf** (e.g. sudo, doas, pkexec). UEFI entry scanning is not supported on legacy BIOS systems.

# SEE ALSO

[limine-entry-tool](/man/limine-entry-tool)(1), [limine](/man/limine)(8), [efibootmgr](/man/efibootmgr)(8)

# RESOURCES

```[Source code](https://gitlab.com/Zesko/limine-entry-tool)```

<!-- verified: 2026-11-23 -->
