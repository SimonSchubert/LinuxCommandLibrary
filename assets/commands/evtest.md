# TAGLINE

Input device event monitor and query tool

# TLDR

**List** all detected input devices

```sudo evtest```

Display **events** from a specific device

```sudo evtest /dev/input/event[number]```

**Grab** device exclusively (prevent other apps from receiving events)

```sudo evtest --grab /dev/input/event[number]```

**Query** state of a specific key or button

```sudo evtest --query /dev/input/event[number] EV_KEY [KEY_A]```

# SYNOPSIS

**evtest** [**--grab**] _/dev/input/eventX_

**evtest** **--query** _/dev/input/eventX_ _event_type_ _event_code_

# PARAMETERS

**--grab**
> Grab device exclusively using EVIOCGRAB, preventing other processes from receiving events.

**--query** _device_ _type_ _code_
> Query state of a specific key/button/switch. Type can be EV_KEY, EV_SW, EV_SND, EV_LED or a numeric value. Returns exit code 0 if unset, 10 if set.

# DESCRIPTION

**evtest** displays information from input device drivers using the Linux input subsystem. In capture mode, it shows all events supported by the device and then monitors it to display all generated events like key presses, mouse movements, and touch events.

In query mode, it performs a one-shot query of the state of a specific key, switch, sound, or LED value.

# CAVEATS

Requires root privileges to read from /dev/input/ devices. Grabbing a device prevents other applications from receiving events until evtest quits.

# SEE ALSO

[xinput](/man/xinput)(1), [libinput](/man/libinput)(1)
