# TAGLINE

Map gamepad inputs to keyboard and mouse

# TLDR

**Launch the graphical interface**

```antimicrox```

**Start with a specific profile**

```antimicrox --profile [path/to/profile.gamecontroller.amgp]```

**Start minimized to system tray**

```antimicrox --tray```

**Start hidden** (no window or tray icon)

```antimicrox --hidden```

**List connected controllers**

```antimicrox --list```

**Start in daemon mode**

```antimicrox --daemon```

# SYNOPSIS

**antimicrox** [_options_] [_profile_]

# PARAMETERS

**--profile** _file_
> Use the specified profile as the default for the selected controllers.

**--profile-controller** _value_
> Apply the profile only to the controller with the given number or identifier.

**--tray**
> Launch in the system tray only.

**--hidden**
> Launch without the main window.

**--no-tray**
> Launch with the tray menu disabled.

**-d**, **--daemon**
> Launch as a daemon (background operation).

**-l**, **--list**
> Print information about controllers detected by SDL.

**--map** _value_
> Open the game controller mapping window for the given controller.

**--unload** [_value_]
> Unload the currently enabled profile(s).

**--startSet** _number_ [_value_]
> Start controllers on the specified set.

**--next**
> Advance to the next profile loading set option.

**--log-level** {_debug_,_info_,_warn_}
> Enable logging at the given level (default: warn).

**--eventgen** {_xtest_,_uinput_}
> Select the event generation backend (default: xtest).

# DESCRIPTION

**AntiMicroX** is a graphical program for mapping gamepad buttons and joystick axes to keyboard keys, mouse movements, and mouse buttons. It enables using game controllers with applications that lack native controller support, including games, productivity software, and media players.

The application provides a visual editor for creating profiles that define how each controller input translates to keyboard/mouse actions. Profiles can include complex mappings with modifiers, turbo modes, macros, and set switching for different control schemes within a single profile.

AntiMicroX supports multiple simultaneous controllers, each with independent profiles. It runs on Linux using uinput or XTest for input injection, working with both X11 and Wayland (with limitations).

# CONFIGURATION

**~/.local/share/antimicrox/**
> Default directory for controller profiles and application data.

# CAVEATS

Wayland support is limited; some features require XWayland. The user must have access to **/dev/uinput** for virtual device creation; this typically requires adding the user to the **input** group. Some games with anti-cheat software may block synthetic input. Profile format changed from the original AntiMicro project.

# HISTORY

AntiMicroX is a fork of **AntiMicro**, which was itself inspired by **QJoyPad**. The original AntiMicro was created by **Travis Nickles** around **2013**. When development stalled, the AntiMicroX fork was created in **2019** to continue maintenance and add new features. It is now the actively maintained successor, supporting modern Linux distributions and additional controller types.

# SEE ALSO

[jstest](/man/jstest)(1), [xdotool](/man/xdotool)(1), [qjoypad](/man/qjoypad)(1), [evtest](/man/evtest)(1)

# RESOURCES

```[Source code](https://github.com/AntiMicroX/antimicrox)```

```[Documentation](https://antimicrox.github.io/)```

<!-- verified: 2026-06-11 -->
