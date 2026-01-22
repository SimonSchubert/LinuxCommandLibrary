# TLDR

**List** running machines

```machinectl list```

**Start** a machine

```sudo machinectl start machine_name```

**Stop** a running machine

```sudo machinectl stop machine_name```

Open **interactive shell** in machine

```sudo machinectl shell machine_name```

**Login** to a machine

```sudo machinectl login machine_name```

Show machine **status**

```machinectl status machine_name```

**Execute** command in machine

```sudo machinectl shell machine_name /bin/command```

# SYNOPSIS

**machinectl** [_OPTIONS_] _COMMAND_ [_NAME_...]

# DESCRIPTION

**machinectl** controls the systemd machine manager. It manages local containers and virtual machines through systemd-machined, including starting, stopping, and interacting with them.

# COMMANDS

**list**
> List running machines

**status NAME**
> Show machine runtime status

**show NAME**
> Show machine properties

**start NAME**
> Start a machine as systemd service

**stop NAME**
> Stop a running machine

**poweroff NAME**
> Power off a machine

**reboot NAME**
> Reboot a machine

**terminate NAME**
> Terminate a machine immediately

**kill NAME**
> Send signal to machine processes

**login NAME**
> Open login prompt to machine

**shell [[USER@]NAME [COMMAND...]]**
> Open shell or run command in machine

**copy-to NAME PATH [PATH]**
> Copy files to machine

**copy-from NAME PATH [PATH]**
> Copy files from machine

**bind NAME PATH [PATH]**
> Bind mount directory into machine

**list-images**
> List available machine images

**image-status NAME**
> Show image status

**pull-raw URL [NAME]**
> Download raw disk image

**pull-tar URL [NAME]**
> Download tar image

**import-raw FILE [NAME]**
> Import raw disk image

**import-tar FILE [NAME]**
> Import tar archive

**remove NAME**
> Remove machine image

# PARAMETERS

**-p, --property**
> Show specific property

**-a, --all**
> Show all properties

**-q, --quiet**
> Suppress output

**--uid USER**
> User to run shell command as

**-E, --setenv VAR=VALUE**
> Set environment variable in shell

**-H, --host**
> Execute on remote host

**-M, --machine**
> Execute in container

# CAVEATS

Machines are typically started using systemd-nspawn. The shell command requires systemd-machined to be running. Container images are stored in /var/lib/machines/.

# HISTORY

**machinectl** is part of **systemd**, providing container and VM management through systemd-machined and systemd-nspawn.

# SEE ALSO

[systemd-machined](/man/systemd-machined)(8), [systemd-nspawn](/man/systemd-nspawn)(1), [systemctl](/man/systemctl)(1)
