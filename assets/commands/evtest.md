# TLDR

**List** all detected input devices

```sudo evtest```

Display **events** from a specific device

```sudo evtest /dev/input/event[number]```

**Grab** device exclusively

```sudo evtest --grab /dev/input/event[number]```

**Query** state of a key or button

```sudo evtest --query /dev/input/event[number] [event_type] [event_code]```

# SYNOPSIS

**evtest** [_options_] [_device_]

# DESCRIPTION

**evtest** displays information from input device drivers using the Linux input subsystem. It reads and displays input events like key presses, mouse movements, and touch events.

Useful for debugging input devices and testing driver functionality.

# PARAMETERS

**--grab**
> Grab device exclusively

**--query** _device_ _type_ _code_
> Query state of specific input

# CAVEATS

Requires root privileges. Device paths are in /dev/input/. Grabbing a device prevents other applications from receiving events.

# SEE ALSO

[xinput](/man/xinput)(1), [libinput](/man/libinput)(1)
