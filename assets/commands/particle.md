# TAGLINE

controls Particle IoT devices

# TLDR

**Login to Particle**

```particle login```

**List devices**

```particle list```

**Flash device**

```particle flash [device_name] [firmware.bin]```

**Compile locally**

```particle compile [photon] [project_dir]```

**Monitor serial output**

```particle serial monitor```

**Call device function**

```particle call [device_name] [function] [arg]```

**Get device variable**

```particle get [device_name] [variable]```

**Setup new device**

```particle setup```

# SYNOPSIS

**particle** [_options_] _command_ [_args_]

# PARAMETERS

**login**
> Authenticate with Particle Cloud.

**list**
> List claimed devices.

**flash**
> Flash firmware to device.

**compile**
> Compile project.

**serial**
> Serial port commands.

**call**
> Call device function.

**get**
> Get device variable.

**setup**
> Setup new device.

**subscribe**
> Subscribe to events.

**publish**
> Publish event.

**webhook**
> Manage webhooks.

# DESCRIPTION

**particle** controls Particle IoT devices. It manages device firmware, cloud functions, and variables.

Devices include Photon, Argon, Boron, and Electron boards. Cloud connectivity enables remote management.

Compilation can happen locally or in Particle Cloud. Flashing sends firmware over-the-air or via USB.

Functions and variables expose device capabilities. Events enable pub/sub messaging between devices.

Serial monitoring shows device debug output. Useful during development and troubleshooting.

# CAVEATS

Requires Particle Cloud account. Some features need device to be online. OTA flash requires stable connection.

# HISTORY

**Particle** (formerly Spark) was founded in **2012** through a Kickstarter campaign. The CLI provides developer tools for their IoT platform and device ecosystem.

# SEE ALSO

[arduino-cli](/man/arduino-cli)(1), [platformio](/man/platformio)(1), [esptool](/man/esptool)(1)
