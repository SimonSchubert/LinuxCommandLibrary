# TLDR

**Integrate** firejail with desktop environment

```sudo firecfg```

Open a **restricted** Firefox

```firejail [firefox]```

Start restricted Apache on specific **network**

```firejail --net=[eth0] --ip=[192.168.1.244] [/etc/init.d/apache2] [start]```

**List** running sandboxes

```firejail --list```

List **network activity** from sandboxes

```firejail --netstats```

**Shutdown** a running sandbox

```firejail --shutdown=[7777]```

Run **highly restricted** Firefox session

```firejail --seccomp --private --private-dev --private-tmp --protocol=inet firefox --new-instance --no-remote --safe-mode --private-window```

Use **custom hosts** file

```firejail --hosts-file=[~/myhosts] [curl http://mysite.arpa]```

# SYNOPSIS

**firejail** [_options_] [_program_] [_arguments_]

# DESCRIPTION

**firejail** securely sandboxes processes using Linux namespaces, seccomp-bpf, and capabilities. It isolates applications from the rest of the system for security.

Provides per-application profiles for common programs like Firefox and VLC.

# PARAMETERS

**--list**
> List running sandboxes

**--netstats**
> Show network activity

**--shutdown** _pid_
> Stop sandbox by PID

**--net** _interface_
> Use network namespace

**--ip** _address_
> Assign IP address

**--seccomp**
> Enable seccomp filtering

**--private**
> Use private home directory

**--private-tmp**
> Use private /tmp

**--private-dev**
> Use private /dev

# CAVEATS

Some applications may not work correctly in sandbox. Profiles in /etc/firejail/. Use firecfg to integrate with desktop.

# SEE ALSO

[bubblewrap](/man/bubblewrap)(1), [systemd-nspawn](/man/systemd-nspawn)(1)
