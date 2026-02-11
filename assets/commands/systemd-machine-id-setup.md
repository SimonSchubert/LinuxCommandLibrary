# TAGLINE

Initialize the machine ID

# TLDR

**Print** the generated or committed machine ID

```systemd-machine-id-setup --print```

**Specify** an image policy

```systemd-machine-id-setup --image-policy [policy]```

**Display** the output as JSON

```sudo systemd-machine-id-setup --json pretty```

**Operate** on a disk image

```systemd-machine-id-setup --image /[path/to/image]```

# SYNOPSIS

**systemd-machine-id-setup** [_options_]

# PARAMETERS

**--print**
> Print the machine ID after setup

**--root _path_**
> Operate on specified root directory

**--image _path_**
> Operate on specified disk image

**--image-policy _policy_**
> Specify image mounting policy

**--commit**
> Commit a transient machine ID to disk

**--json _format_**
> Output in JSON format (pretty, short, off)

# DESCRIPTION

**systemd-machine-id-setup** initializes the machine ID stored in **/etc/machine-id**. This unique identifier is generated at install time and should remain constant throughout the machine's lifetime.

The machine ID is used by various system services to identify the local system. It is randomly generated if not provisioned during installation. The tool can also operate on disk images for pre-configuration.

# CAVEATS

Requires root privileges. Should only be run once during system installation or when **/etc/machine-id** is missing. Changing the machine ID can break services that depend on it. Part of the systemd suite.

# SEE ALSO

[systemd-id128](/man/systemd-id128)(1), [machine-id](/man/machine-id)(5), [systemd-firstboot](/man/systemd-firstboot)(1)
