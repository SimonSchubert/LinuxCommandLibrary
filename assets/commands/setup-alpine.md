# TAGLINE

Interactive Alpine Linux system installer

# TLDR

**Run the full interactive installer**

```setup-alpine```

**Quick mode** with sensible defaults (DHCP, no SSH, no disk install)

```setup-alpine -q```

**Replay** answers from a previously captured file

```setup-alpine -f [/path/to/answers]```

**Generate a template** answer file with default values

```setup-alpine -c [/path/to/answers.new]```

**Print** the embedded help text

```setup-alpine -h```

# SYNOPSIS

**setup-alpine** [**-ahq**] [**-c** _file_ | **-f** _file_]

# PARAMETERS

**-a**
> Run in **diskless** ("alpine") mode: configure a running system without installing to disk.

**-c** _FILE_
> **Create** an answer file at _FILE_ pre-filled with the current default answers, then exit.

**-f** _FILE_
> **Read** answers from _FILE_ instead of prompting interactively (allows unattended installs).

**-q**
> **Quick** mode: configure only keymap, hostname, DHCP networking, /etc/hosts and the default repositories.

**-h**
> Show usage and exit.

# DESCRIPTION

**setup-alpine** is the canonical first-boot installer shipped on every official Alpine Linux ISO. It runs from the live environment and guides the operator through the steps required to bring up a working Alpine system: keyboard layout, hostname, network interfaces, DNS servers, root password, timezone, HTTP proxy, NTP daemon, package mirrors, SSH server, and disk layout.

Internally **setup-alpine** is a small POSIX shell script that orchestrates a number of dedicated **setup-***_step_ helpers (such as **setup-keymap**, **setup-hostname**, **setup-interfaces**, **setup-disk**, **setup-sshd**, **setup-ntp**, **setup-apkrepos**, **setup-lbu** and **setup-apkcache**). Each helper can also be invoked stand-alone after installation to reconfigure that aspect of the system.

Three install targets are offered when the disk step runs: **sys** for a traditional persistent installation, **data** for a diskless system whose state is backed up via **lbu**, and **none** to skip disk setup entirely. The result is a small, repeatable, and scriptable Alpine deployment.

# ANSWER FILE

Use **setup-alpine -c answers.new** to dump a template, then edit the variables and replay it with **setup-alpine -f answers**. Common keys are **KEYMAPOPTS**, **HOSTNAMEOPTS**, **INTERFACESOPTS**, **DNSOPTS**, **TIMEZONEOPTS**, **PROXYOPTS**, **APKREPOSOPTS**, **SSHDOPTS**, **NTPOPTS**, **DISKOPTS**, **LBUOPTS** and **APKCACHEOPTS**. Setting a key to **none** skips that step.

# CAVEATS

Quick mode (**-q**) configures only DHCP — Wi-Fi must be set up manually with **setup-interfaces** or **wpa_supplicant**. Running **setup-alpine** on an already-installed system will reconfigure it in place, including overwriting **/etc/network/interfaces** and **/etc/hostname**. Disk mode **sys** wipes the selected disks. The script must be run as **root** and assumes the standard Alpine BusyBox userspace.

# HISTORY

**setup-alpine** has shipped with **Alpine Linux** since the project introduced its installer-on-rails approach in the late 2000s, replacing the earlier manual install process. It is part of the **alpine-conf** package, written in POSIX shell, and is also reused by **setup-bootable**, **setup-acf** and the LXC/Docker minirootfs build pipeline.

# SEE ALSO

[setup-disk](/man/setup-disk)(8), [setup-interfaces](/man/setup-interfaces)(8), [setup-sshd](/man/setup-sshd)(8), [setup-keymap](/man/setup-keymap)(8), [lbu](/man/lbu)(8), [apk](/man/apk)(8)
