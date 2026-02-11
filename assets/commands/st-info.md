# TLDR

**Show device info**

```st-info --probe```

**Show flash size**

```st-info --flash```

**Show SRAM size**

```st-info --sram```

**Show chip ID**

```st-info --chipid```

**Show description**

```st-info --descr```

**Show serial number**

```st-info --serial```

# SYNOPSIS

**st-info** [_--probe_] [_--flash_] [_--sram_] [_options_]

# PARAMETERS

**--probe**
> Probe connected device.

**--flash**
> Flash memory size.

**--sram**
> SRAM size.

**--chipid**
> Chip identifier.

**--descr**
> Device description.

**--serial**
> Programmer serial.

# DESCRIPTION

**st-info** queries information from STM32 microcontrollers connected via an ST-Link programmer/debugger. It reports device identification details including chip ID, device description, flash memory size, SRAM size, and the programmer's serial number.

The tool is useful for verifying hardware connections, identifying unknown STM32 variants, and confirming memory sizes before programming. The **--probe** option provides a comprehensive summary of all connected devices. It is part of the open-source stlink toolset.

# CAVEATS

ST-Link required. Device must be connected. STM32 only.

# HISTORY

**st-info** is part of **stlink**, providing device information for STM32 microcontrollers connected via ST-Link.

# SEE ALSO

[st-flash](/man/st-flash)(1), [st-util](/man/st-util)(1), [openocd](/man/openocd)(1)
