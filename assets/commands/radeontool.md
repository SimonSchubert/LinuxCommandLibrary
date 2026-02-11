# TAGLINE

Control ATI Radeon hardware settings

# TLDR

**Turn off the laptop backlight**

```radeontool light off```

**Turn on the laptop backlight**

```radeontool light on```

**Disable external video output** (DAC)

```radeontool dac off```

**Enable external video output** (DAC)

```radeontool dac on```

**Display a sampling of register values**

```radeontool regs```

**Show registers matching a pattern**

```radeontool regmatch [pattern]```

**Set registers matching a pattern** to a specific value

```radeontool regset [pattern] [value]```

# SYNOPSIS

**radeontool** [_options_] [_command_]

# PARAMETERS

**light** [**on**|**off**]
> Control the laptop panel backlight power state

**dac** [**on**|**off**]
> Control external video output (VGA/DVI) power state

**stretch** [**on**|**off**|**vert**|**horiz**|**auto**|**manual**]
> Control LCD stretching when running non-native resolutions

**regs**
> Display a sampling of important register values

**regmatch** _pattern_
> Show registers whose names match the wildcard pattern

**regset** _pattern_ _value_
> Set registers matching the wildcard pattern to value

**--debug**
> Enable verbose debugging output

**--skip=**_n_
> Skip the first n Radeon cards and operate on card n+1

# DESCRIPTION

**radeontool** is a utility for controlling hardware features on ATI Radeon-based graphics cards, primarily used on laptops. It provides direct access to backlight control, external display output, and low-level register manipulation.

The tool communicates directly with the graphics hardware through memory-mapped I/O, allowing control over features not exposed through standard display drivers. Common uses include scripted backlight control for power management and debugging display issues.

# CAVEATS

**Root privileges required** for most operations due to direct hardware access via /dev/mem.

**Register manipulation is dangerous**: Using regset incorrectly can cause system instability or permanent hardware damage. Only modify registers if you understand the consequences.

**Not all features work on all cards**: Compatibility varies between Radeon generations. Test commands carefully on your specific hardware.

# HISTORY

radeontool was created by **David Airlie** as part of the Linux open-source graphics effort. It emerged in the early 2000s when ATI Radeon cards required userspace tools to control features not yet supported by the kernel drivers.

# SEE ALSO

[xrandr](/man/xrandr)(1), [xbacklight](/man/xbacklight)(1), [aticonfig](/man/aticonfig)(1)
