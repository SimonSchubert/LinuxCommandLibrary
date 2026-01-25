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
> Load a specific controller profile at startup.

**--profile-dir** _directory_
> Set the directory for profile storage.

**--tray**
> Start minimized to the system tray.

**--hidden**
> Start without any visible window or tray icon.

**--daemon**
> Run in daemon mode for background operation.

**--list**
> List all connected game controllers.

**--map** _device:profile_
> Map a specific device to a profile.

**--no-tray**
> Disable system tray icon entirely.

**--log-level** _level_
> Set logging verbosity: debug, info, warn, error.

**--eventgen** _backend_
> Select event generation backend (uinput, xtest).

# DESCRIPTION

**AntiMicroX** is a graphical program for mapping gamepad buttons and joystick axes to keyboard keys, mouse movements, and mouse buttons. It enables using game controllers with applications that lack native controller support, including games, productivity software, and media players.

The application provides a visual editor for creating profiles that define how each controller input translates to keyboard/mouse actions. Profiles can include complex mappings with modifiers, turbo modes, macros, and set switching for different control schemes within a single profile.

AntiMicroX supports multiple simultaneous controllers, each with independent profiles. It runs on Linux using uinput or XTest for input injection, working with both X11 and Wayland (with limitations).

# CAVEATS

Wayland support is limited; some features require XWayland. The user must have access to **/dev/uinput** for virtual device creation; this typically requires adding the user to the **input** group. Some games with anti-cheat software may block synthetic input. Profile format changed from the original AntiMicro project.

# HISTORY

AntiMicroX is a fork of **AntiMicro**, which was itself inspired by **QJoyPad**. The original AntiMicro was created by **Travis Nickles** around **2013**. When development stalled, the AntiMicroX fork was created in **2019** to continue maintenance and add new features. It is now the actively maintained successor, supporting modern Linux distributions and additional controller types.

# SEE ALSO

[jstest](/man/jstest)(1), [xdotool](/man/xdotool)(1), [qjoypad](/man/qjoypad)(1)
