# TLDR

**Generate** a new random identifier

```systemd-id128 new```

**Print** the identifier of the current machine

```systemd-id128 machine-id```

**Print** the identifier of the current boot

```systemd-id128 boot-id```

**Print** the identifier of the current service invocation

```systemd-id128 invocation-id```

**Generate** a new identifier and print it as a UUID

```systemd-id128 new -u```

# SYNOPSIS

**systemd-id128** [_options_] [_command_]

# PARAMETERS

**new**
> Generate a new random identifier

**machine-id**
> Print the machine ID from /etc/machine-id

**boot-id**
> Print the current boot ID

**invocation-id**
> Print the service invocation ID (systemd services only)

**-u, --uuid**
> Print as UUID format (hyphen-separated groups)

**-p, --pretty**
> Print in human-readable format

**-a, --app-specific _app-id_**
> Generate application-specific ID

# DESCRIPTION

**systemd-id128** generates and prints sd-128 identifiers used by systemd. These 128-bit identifiers uniquely identify machines, boots, and service invocations.

The machine ID is persistent across reboots and stored in **/etc/machine-id**. The boot ID changes each boot and identifies the current system session. The invocation ID is unique per service start.

# CAVEATS

The invocation-id subcommand only works within systemd service contexts. Machine IDs should not be changed after initial setup. UUIDs are compatible with RFC 4122. Part of the systemd suite.

# SEE ALSO

[systemd-machine-id-setup](/man/systemd-machine-id-setup)(1), [machine-id](/man/machine-id)(5), [systemd](/man/systemd)(1)
