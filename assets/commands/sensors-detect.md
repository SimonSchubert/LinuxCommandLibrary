# TAGLINE

Detect hardware monitoring sensor chips

# TLDR

**Run interactively** to detect hardware monitoring chips

```sudo sensors-detect```

**Run in automatic mode** with default answers

```sudo sensors-detect --auto```

**Display I2C address statistics**

```sudo sensors-detect --stat```

# SYNOPSIS

**sensors-detect** [**--auto**] [**--stat**]

# PARAMETERS

**--auto**
> Run in automatic, non-interactive mode. Assumes default answers to all questions. Use with caution as this may lead to potentially dangerous hardware probes.

**--stat**
> Display I2C address statistics.

# DESCRIPTION

**sensors-detect** is an interactive program that scans your system for hardware monitoring chips (sensors) supported by libsensors and the lm_sensors tool suite. It systematically searches for:

1. Sensors embedded in CPUs, south bridges, and memory controllers
2. Sensors embedded in Super I/O chips
3. Hardware monitoring chips accessed through ISA I/O ports
4. Hardware monitoring chips reachable over SMBus or I2C buses

After detection, sensors-detect recommends which kernel modules need to be loaded and can optionally add them to **/etc/modules** for automatic loading at boot. The detected sensors can then be read using the **sensors** command.

The program typically skips the last two detection steps if a Super I/O chip with complete hardware monitoring features is found, though users can request full detection if desired.

# CAVEATS

sensors-detect must access hardware directly during detection, which could potentially cause problems ranging from SMBus lockup to permanent hardware damage in rare cases. The authors have made detection as safe as possible, but it cannot be guaranteed safe for all systems. Avoid running on production systems without understanding the risks. The **--auto** mode may trigger potentially dangerous probes and should be used with caution.

# HISTORY

**sensors-detect** is part of the **lm_sensors** (Linux monitoring sensors) project, which was started in **1998** to provide tools and kernel drivers for hardware monitoring on Linux. The project was originally hosted on lm-sensors.org and later moved to GitHub. It has become the standard tool for detecting and configuring hardware sensors on Linux systems, supporting a wide range of motherboard chipsets, CPU thermal sensors, and dedicated monitoring chips.

# SEE ALSO

[sensors](/man/sensors)(1), [sensord](/man/sensord)(8), [fancontrol](/man/fancontrol)(8), [pwmconfig](/man/pwmconfig)(8)
