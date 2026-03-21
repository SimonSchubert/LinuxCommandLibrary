# TAGLINE

Generate and print 128-bit identifiers

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

```systemd-id128 new --uuid```

**Generate** an application-specific ID derived from the machine ID

```systemd-id128 machine-id --app-specific [app-id]```

**Show well-known identifiers**

```systemd-id128 show```

# SYNOPSIS

**systemd-id128** [_options_] _command_

# PARAMETERS

**new**
> Generate a new random identifier.

**machine-id**
> Print the machine ID from /etc/machine-id.

**boot-id**
> Print the current boot ID.

**invocation-id**
> Print the service invocation ID (systemd services only).

**show** [_NAME_|_UUID_...]
> Display well-known systemd identifiers.

**-u, --uuid**
> Print in UUID format with hyphen-separated groups.

**-p, --pretty**
> Generate output as programming language snippets.

**-P, --value**
> Only print the identifier value.

**-a, --app-specific** _APP-ID_
> Generate an application-specific ID by hashing the machine or boot ID with the given application ID.

**--json=**_MODE_
> Output in JSON format. MODE is short, pretty, or off.

**--no-pager**
> Disable pager output.

**--no-legend**
> Omit column headers and footer with show command.

# DESCRIPTION

**systemd-id128** generates and prints sd-id128 identifiers used by systemd. These 128-bit identifiers uniquely identify machines, boots, and service invocations.

The machine ID is persistent across reboots and stored in **/etc/machine-id**. The boot ID changes each boot and identifies the current system session. The invocation ID is unique per service start.

# CAVEATS

The invocation-id subcommand only works within systemd service contexts. Machine IDs should not be changed after initial setup. UUIDs are compatible with RFC 4122. Part of the systemd suite.

# SEE ALSO

[systemd-machine-id-setup](/man/systemd-machine-id-setup)(1), [machine-id](/man/machine-id)(5), [systemctl](/man/systemctl)(1), [uuidgen](/man/uuidgen)(1)
