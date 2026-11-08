# TAGLINE

controls Particle IoT devices

# TLDR

**Login to Particle**

```particle login```

**List devices**

```particle list```

**Flash a project over the air**

```particle flash [device_name] [project_dir]```

**Compile the current directory and flash over USB**

```particle flash --local```

**Compile in the cloud**

```particle compile [p2] [project_dir] --saveTo [firmware.bin]```

**Monitor serial output**

```particle serial monitor```

**Call device function**

```particle call [device_name] [function] [arg]```

**Get device variable**

```particle get [device_name] [variable]```

**Claim a new device**

```particle device add [device_id]```

# SYNOPSIS

**particle** [_options_] _command_ [_args_]

# PARAMETERS

**login**, **logout**
> Save or revoke the access token for the CLI session.

**list**
> List your devices with their functions and variables.

**flash**
> Flash firmware to a device, over the air or with **--local** over USB.

**compile**
> Compile a project in the cloud, or locally with **--compiler local** (CLI 3.52.0+).

**serial**
> Serial port commands, such as **monitor** and **identify**.

**usb**
> USB commands, such as **list**, **dfu**, **listen**, **reset** and **safe-mode**.

**update**
> Update Device OS on a connected device.

**call**
> Call device function.

**get**
> Get device variable.

**device**
> Add, rename or remove devices with **add**, **rename** and **remove**.

**identify**
> Show the device ID and system firmware version over USB.

**subscribe**
> Subscribe to events.

**publish**
> Publish event.

**webhook**
> Manage webhooks.

**keys doctor**
> Repair out-of-sync device keys.

# DESCRIPTION

**particle** controls Particle IoT devices. It manages device firmware, cloud functions, and variables.

Supported device types include **p2** (Photon 2), **argon**, **boron**, **bsom**, **b5som**, **tracker**, and the older **photon**, **p1** and **electron**.

Compilation happens in Particle Cloud by default and can run locally. Flashing sends firmware over-the-air or via USB.

Functions and variables expose device capabilities. Events enable pub/sub messaging between devices.

Serial monitoring shows device debug output. Useful during development and troubleshooting.

# CAVEATS

Requires Particle Cloud account. Some features need device to be online. OTA flash requires stable connection.

**particle setup** is no longer available: use the web-based setup at setup.particle.io. **particle serial flash** was removed in CLI 3.21.0. Removing a cellular device with **particle device remove** does not stop billing unless the SIM is also released.

# HISTORY

**Particle** began as **Spark**, founded by **Zach Supalla** around **2012**, and raised funds for the Spark Core through a **2013** Kickstarter campaign. The company was renamed Particle in **May 2015**. The CLI provides developer tools for its IoT platform and device ecosystem.

# SEE ALSO

[arduino-cli](/man/arduino-cli)(1), [platformio](/man/platformio)(1), [esptool](/man/esptool)(1)

# RESOURCES

```[Source code](https://github.com/particle-iot/particle-cli)```

```[Homepage](https://www.particle.io/)```

```[Documentation](https://docs.particle.io/reference/developer-tools/cli/)```

<!-- verified: 2026-11-08 -->
