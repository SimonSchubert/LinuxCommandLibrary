# TLDR

**Login** to Balena Cloud

```balena login```

**List** devices

```balena devices```

**Push** code to device

```balena push [myApp]```

**SSH** into device

```balena ssh [device-uuid]```

**View** logs

```balena logs [device-uuid]```

Create **new application**

```balena app create [myApp]```

# SYNOPSIS

**balena** _command_ [_options_]

# DESCRIPTION

**balena** is the command-line interface for Balena (formerly Resin.io), a platform for deploying and managing IoT device fleets. It enables building, deploying, and monitoring containerized applications on edge devices.

The CLI provides tools for device provisioning, application deployment, remote access, and fleet management.

# PARAMETERS

**login**
> Authenticate with Balena Cloud

**push** _application_
> Deploy code to application

**devices**
> List devices

**ssh** _device_
> SSH into device

**logs** _device_
> View device logs

**scan**
> Scan for local Balena devices

**os**
> OS image management commands

**env**
> Environment variable management

**--application**, **-a** _name_
> Application name

**--device**, **-d** _uuid_
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

# Create app
balena app create myApp

# Push code
cd my-project
balena push myApp

# Monitor
balena logs <device>
```

# CAVEATS

Requires Balena account. Device must run BalenaOS. Internet connectivity needed for cloud features. Some operations require payment plan. Local mode available for offline development.

# HISTORY

**Balena CLI** was developed by Balena (formerly Resin.io) starting around **2013** as a platform for IoT fleet management and edge computing.

# SEE ALSO

[docker](/man/docker)(1), [kubectl](/man/kubectl)(1), [etcher](/man/etcher)(1)
