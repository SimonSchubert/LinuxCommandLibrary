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

**st-info** shows STM32 info. It queries via ST-Link.

Device identification. Chip type and variant.

Memory information. Flash and SRAM sizes.

Programmer details. Serial number.

Debugging connection. Verify setup.

# CAVEATS

ST-Link required. Device must be connected. STM32 only.

# HISTORY

**st-info** is part of **stlink**, providing device information for STM32 microcontrollers connected via ST-Link.

# SEE ALSO

[st-flash](/man/st-flash)(1), [st-util](/man/st-util)(1), [openocd](/man/openocd)(1)
