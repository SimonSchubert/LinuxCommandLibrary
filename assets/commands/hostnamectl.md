# TAGLINE

queries and changes the system hostname and related machine metadata

# TLDR

Show current **hostname** information

```hostnamectl```

Set the **hostname**

```sudo hostnamectl set-hostname "hostname"```

Set **static and pretty** hostnames

```sudo hostnamectl set-hostname --static "hostname.example.com" && sudo hostnamectl set-hostname --pretty "My Computer"```

Reset **pretty hostname** to default

```sudo hostnamectl set-hostname --pretty ""```

Set **chassis type**

```sudo hostnamectl set-chassis desktop```

Set **deployment environment**

```sudo hostnamectl set-deployment production```

# SYNOPSIS

**hostnamectl** [_OPTIONS_] [_COMMAND_]

# DESCRIPTION

**hostnamectl** queries and changes the system hostname and related machine metadata. It manages three hostname types: static (persistent), pretty (human-readable), and transient (temporary).

# COMMANDS

**status**
> Show current hostname and machine information

**hostname [NAME]**
> Get or set the system hostname

**set-hostname NAME**
> Set the system hostname

**set-chassis TYPE**
> Set the chassis type (desktop, laptop, server, vm, container, etc.)

**set-deployment ENV**
> Set deployment environment (development, production, etc.)

**set-location LOC**
> Set physical location of the machine

**set-icon-name NAME**
> Set icon name for graphical UIs

# PARAMETERS

**--static**
> Operate on static hostname only

**--transient**
> Operate on transient hostname only

**--pretty**
> Operate on pretty hostname only

**--no-ask-password**
> Do not prompt for password

**-H, --host**
> Execute operation on remote host

**-M, --machine**
> Execute operation on container

**-j, --json**
> Output in JSON format

# HOSTNAME TYPES

**Static**: Stored in /etc/hostname, survives reboots
**Transient**: Temporary, set by DHCP or mDNS
**Pretty**: Free-form UTF-8 name for display purposes

# CAVEATS

The static hostname should be a single valid DNS label (no spaces, only alphanumeric and hyphens). The pretty hostname can contain any characters and is for display only.

# HISTORY

**hostnamectl** is part of **systemd**, providing unified hostname management through systemd-hostnamed.

# SEE ALSO

[hostname](/man/hostname)(1), [systemd-hostnamed](/man/systemd-hostnamed)(8), [machine-info](/man/machine-info)(5)
