# TAGLINE

CLI for ASUS ROG and TUF laptop hardware on Linux

# TLDR

Show **supported features** for this laptop

```asusctl info --show-supported```

Show the **active performance profile**

```asusctl profile get```

**List** available profiles

```asusctl profile list```

Set the **active profile**

```asusctl profile set [performance]```

Cycle to the **next profile** (bind this to Fn+F5)

```asusctl profile next```

Set a **battery charge limit** (20–100)

```asusctl battery limit [80]```

Show the current **charge limit**

```asusctl battery info```

Set **keyboard LED brightness**

```asusctl leds set [off|low|med|high]```

Show **enabled fan-curve** profiles

```asusctl fan-curve --get-enabled```

Cycle to the **next Aura LED mode**

```asusctl aura effect --next-mode```

# SYNOPSIS

**asusctl** _command_ [_subcommand_] [_options_]

# DESCRIPTION

**asusctl** is the command-line client for **asusd**, a system daemon that exposes ASUS laptop hardware over D-Bus. It controls performance profiles, keyboard RGB (Aura), battery charge limits, fan curves, AniMe Matrix lid displays, Slash LED bars, firmware attributes via asus-armoury, and related BIOS/efivar settings.

The CLI queries the daemon for the laptop's support level and only shows commands the hardware can use. **asusd** is started by udev and systemd when a supported device is present. A companion GUI, **rog-control-center**, talks to the same daemon.

Many features track Linux kernel work on `asus-wmi` and `asus-armoury`. A current kernel is recommended; missing options often mean the running kernel lacks the matching driver support.

# COMMANDS

**profile**
> Manage platform power profiles (Quiet, Balanced, Performance). Subcommands: **next**, **list**, **get**, **set**. **set** takes a profile name; **-a** applies it on AC power and **-b** on battery.

**leds**
> Keyboard brightness. Subcommands: **set** (_off_, _low_, _med_, _high_), **get**, **next**, **prev**.

**battery**
> Charge control. **limit** _percent_ sets a persistent 20–100 charge cap. **info** prints the current limit. **oneshot** [_percent_] allows one full charge (default 100) then returns to the limit.

**fan-curve**
> Custom fan curves on laptops that expose them. **--get-enabled** lists enabled profiles. **--mod-profile** selects which profile to edit. **--data** supplies temperature:percentage points. **--fan** selects _cpu_, _gpu_, or _mid_. **--default** restores the EC defaults for the active profile.

**aura**
> Built-in Aura LED modes and power. **effect --next-mode** / **--prev-mode** cycle factory effects. Further subcommands set power state and individual modes on supported keyboards.

**anime**
> AniMe Matrix lid display sequences (models that include the panel).

**slash**
> Slash LED-bar control on supported chassis.

**scsi**
> SCSI LED control.

**armoury**
> Read and write asus-armoury firmware attributes. Subcommands: **list**, **get** _property_, **set** _property_ _value_.

**backlight**
> Screenpad brightness, gamma, and sync with the primary display.

**info**
> Print version and product information. **--show-supported** lists which functions this laptop implements.

# CONFIGURATION

**/etc/asusd/asusd.conf**
> System daemon settings, including the persistent battery charge limit.

**/etc/asusd/anime.conf**
> System AniMe sequences for boot, wake, and shutdown, plus global brightness.

**/etc/asusd/profile.conf**
> Fan-curve and profile data. First run fills it from EC defaults.

**/usr/share/asusd/aura_support.ron**
> Per-model Aura keyboard layout and supported LED modes.

**~/.config/rog/rog-user.cfg**
> User-daemon (**asusd-user**) config for custom Aura effects and AniMe sequences.

# CAVEATS

Requires **asusd** running and a kernel with the matching ASUS drivers. Commands and LED modes vary by model; unsupported hardware returns errors or hides options. Profile switching often needs **power-profiles-daemon**. Fan curves need both hardware support and a recent enough kernel. Do not treat unofficial GitHub mirrors as upstream; the project lives on GitLab.

# HISTORY

**asusctl** is part of the ASUS Linux suite started by **Luke Jones** to give ASUS ROG and TUF laptops a safe D-Bus layer over keyboard LEDs, charge limits, platform profiles, and related firmware. Version **6.3** rebuilt the CLI around nested subcommands (`profile set`, `battery limit`, `leds set`) in place of the older short flags.

# INSTALL

```pacman: sudo pacman -S asusctl```

```nix: nix profile install nixpkgs#asusctl```

<!-- packages: 2026-09-21 -->

# SEE ALSO

[tlp](/man/tlp)(8), [powertop](/man/powertop)(8), [auto-cpufreq](/man/auto-cpufreq)(8)

# RESOURCES

```[Source code](https://gitlab.com/asus-linux/asusctl)```

```[Homepage](https://asus-linux.org)```

```[Documentation](https://asus-linux.org/manual)```

<!-- verified: 2026-09-21 -->
