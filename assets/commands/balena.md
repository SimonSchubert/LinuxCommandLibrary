# TAGLINE

Manage IoT device fleets

# TLDR

**Login** to balenaCloud

```balena login```

**List** devices, optionally filtered by fleet

```balena device list --fleet [myorg/myfleet]```

**Create** a new fleet for a device type

```balena fleet create [MyFleet] --type [raspberrypi4-64]```

**Push** source code to be built and deployed to a fleet

```balena push [myorg/myfleet]```

**Push** to a local mode device on the network

```balena push [192.168.1.10]```

**SSH** into a device's host OS or a service container

```balena device ssh [device-uuid] [service]```

**Stream** device logs

```balena device logs [device-uuid] --tail```

**Set** a fleet-wide environment variable

```balena env set [NAME] [value] --fleet [myorg/myfleet]```

**Detect** balenaOS devices on the local network

```balena device detect```

# SYNOPSIS

**balena** _command_ [_subcommand_] [_arguments_] [_options_]

# DESCRIPTION

**balena** is the command-line interface for balenaCloud and openBalena (formerly Resin.io), a platform for deploying and managing fleets of IoT devices running **balenaOS**. It builds, deploys, and monitors containerized applications on edge devices.

The CLI provides tools for device provisioning, OS image configuration and flashing, release deployment, remote access, and fleet management. Commands are grouped as _noun verb_ (for example **device list**, **fleet create**, **env set**).

# PARAMETERS

**login**
> Authenticate with balenaCloud (web, token, credentials or API key)

**push** _fleet_|_device-ip_
> Build releases on balenaCloud builders, or on a local mode device

**build** / **deploy**
> Build images locally with Docker and deploy them as a release

**device list**
> List devices (filter with **--fleet**)

**device ssh** _fleet_|_uuid_|_ip_ [_service_]
> Open a shell on the host OS or in a service container

**device logs** _uuid_|_ip_
> Show device logs (**--tail** to stream, **--service**, **--system** to filter)

**device detect**
> Scan the local network for balenaOS devices

**device tunnel** _uuid_ **-p** _remote:local_
> Tunnel local TCP ports to a device

**fleet create** _name_
> Create a fleet (**--type**, **--organization**)

**os download** / **os configure**
> Download and configure balenaOS images

**local flash** _image_
> Flash an image to a local drive

**env list** / **env set** / **env rm**
> Manage environment and configuration variables

**-f**, **--fleet** _name|slug_
> Fleet name or slug (slug **org/fleet** preferred)

**-d**, **--device** _uuid_
> Device UUID

# FEATURES

- Container-based deployments
- Over-the-air updates
- Remote device access
- Environment variable management
- Multi-architecture support
- Device fleet management

# WORKFLOW

```bash
# Login
balena login

# Create fleet
balena fleet create myFleet --type raspberrypi4-64

# Push code
cd my-project
balena push myorg/myfleet

# Monitor
balena device logs <device-uuid> --tail
```

# CAVEATS

Requires a balenaCloud account (or an openBalena server). Devices must run balenaOS. Internet connectivity needed for cloud features. Some operations require payment plan. Local mode available for offline development. Command names changed across major versions: **app** became **fleet** in v13, and older top-level commands such as **devices**, **ssh**, **logs** and **scan** were replaced by **device list**, **device ssh**, **device logs** and **device detect**.

# HISTORY

**Balena CLI** was developed by Balena (formerly Resin.io, renamed in **2018**) as the command-line client for its IoT fleet management and edge computing platform, which started around **2013**. It is written in TypeScript on Node.js.

# SEE ALSO

[docker](/man/docker)(1), [kubectl](/man/kubectl)(1)

# RESOURCES

```[Source code](https://github.com/balena-io/balena-cli)```

```[Homepage](https://www.balena.io/)```

```[Documentation](https://docs.balena.io/reference/balena-cli/latest/)```

<!-- verified: 2026-11-23 -->
