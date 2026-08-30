# TAGLINE

kernel CEC device control tool

# TLDR

List the **CEC adapters** the kernel knows about

```cec-ctl --list-devices```

Show the **topology** of the HDMI bus

```cec-ctl --show-topology```

Register this machine as a **playback device** under a chosen name

```sudo cec-ctl --playback --osd-name [MyPC]```

Set the **physical address** by hand

```sudo cec-ctl --phys-addr [1.0.0.0]```

**Wake the TV** and have it switch to this input

```cec-ctl --to 0 --image-view-on```

Announce this device as the **active source**

```cec-ctl --active-source phys-addr=[1.0.0.0]```

Put the TV into **standby**

```cec-ctl --to 0 --standby```

Ask the TV for its **power state**

```cec-ctl --to 0 --give-device-power-status```

**Watch the traffic** addressed to this adapter

```sudo cec-ctl --monitor```

Watch **every message** on the bus, addressed to us or not

```sudo cec-ctl --monitor-all```

Work with a **specific adapter**

```cec-ctl -d [/dev/cec1] --show-topology```

**Clear** the adapter's configuration

```sudo cec-ctl --clear```

# SYNOPSIS

**cec-ctl** [_options_]

# DESCRIPTION

**cec-ctl** controls kernel CEC (Consumer Electronics Control) devices through the Linux kernel's native CEC framework. It provides low-level access to the CEC subsystem for monitoring traffic, configuring adapters, and sending commands directly via the kernel driver.

Unlike cec-client which relies on the userspace libCEC library and requires a USB CEC adapter, cec-ctl works with CEC hardware integrated into graphics cards and SoCs that expose `/dev/cecN` device nodes. This makes it the preferred tool on platforms with built-in CEC support, such as many ARM-based media players and modern Intel GPUs.

The monitor mode (`-m`) is particularly useful for debugging CEC communication issues, as it displays all CEC traffic on the bus in real time.

# PARAMETERS

**--list-devices**
> List available CEC devices

**-m, --monitor**
> Monitor CEC traffic on the bus

**-S, --show-topology**
> Display the CEC device topology

**-d** _device_
> Use specific CEC device

**-p** _addr_
> Set physical address

**-o** _addr_
> Set logical address

# CAVEATS

Requires kernel CEC support (CONFIG_CEC). Monitor mode requires root privileges. Not all HDMI ports support CEC.

# INSTALL

```apt: sudo apt install v4l-utils```

```dnf: sudo dnf install v4l-utils```

```pacman: sudo pacman -S v4l-utils```

```apk: sudo apk add v4l-utils```

```zypper: sudo zypper install v4l-utils```

```nix: nix profile install nixpkgs#v4l-utils```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[cec-client](/man/cec-client)(1)

# RESOURCES

```[Source code](https://git.linuxtv.org/v4l-utils.git)```

<!-- verified: 2026-06-22 -->
