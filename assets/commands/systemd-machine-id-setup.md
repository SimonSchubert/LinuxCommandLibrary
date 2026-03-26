# TAGLINE

Initialize the machine ID

# TLDR

**Initialize** the machine ID in /etc/machine-id

```sudo systemd-machine-id-setup```

**Print** the generated or committed machine ID after setup

```sudo systemd-machine-id-setup --print```

**Commit** a transient machine ID to persistent storage on disk

```sudo systemd-machine-id-setup --commit```

**Operate** on a specific root directory

```sudo systemd-machine-id-setup --root /[path/to/root]```

**Operate** on a disk image

```sudo systemd-machine-id-setup --image /[path/to/image]```

# SYNOPSIS

**systemd-machine-id-setup** [_options_]

# PARAMETERS

**--print**
> Print the machine ID after the setup operation completes

**--commit**
> Commit a transient machine ID to persistent disk storage. Has no effect if /etc/machine-id is not mounted from memory or if /etc/ is read-only. Primarily used by systemd-machine-id-commit.service

**--root _path_**
> Operate on the specified root directory instead of the real root. All paths including /etc/machine-id are prefixed with the given path

**--image _path_**
> Operate on the specified disk image (device node or regular file) instead of a directory tree

**--image-policy _policy_**
> Specify an image mounting policy string when using --image. Defaults to the "*" policy (all recognized file systems are used)

**-h**, **--help**
> Show brief help and exit

**--version**
> Show version information and exit

# DESCRIPTION

**systemd-machine-id-setup** initializes the machine ID stored in **/etc/machine-id**. It is intended for use by system installer tools at install time, or when /etc/machine-id is empty or missing.

When invoked without **--commit**, the tool initializes the machine ID using the first available source in this order:

1. A valid ID from /run/machine-id
2. An existing D-Bus machine ID
3. A machine ID from the system.machine_id credential
4. A UUID from the KVM virtual machine configuration
5. A UUID from the container environment configuration
6. A newly generated random ID as a fallback

The **--commit** option is used to convert a transient machine ID (mounted into memory during early boot) into a persistent one written to disk.

# CAVEATS

Requires root privileges. Should only be run once during system installation or when **/etc/machine-id** is missing or empty. Changing the machine ID can break services that depend on it for stable identification. Part of the systemd suite.

# SEE ALSO

[systemd-id128](/man/systemd-id128)(1), [machine-id](/man/machine-id)(5), [systemd-firstboot](/man/systemd-firstboot)(1)
