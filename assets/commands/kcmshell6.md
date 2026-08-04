# TAGLINE

Open a single KDE Plasma 6 system settings module

# TLDR

**List** all available KCM modules

```kcmshell6 --list```

Open the **display / screen** settings module

```kcmshell6 kcm_kscreen```

Open **network** settings

```kcmshell6 kcm_networkmanagement```

Open several modules in one dialog

```kcmshell6 kcm_fonts kcm_style```

Open a module with a custom **window title** and **icon**

```kcmshell6 kcm_keyboard --caption "[Keyboard]" --icon preferences-desktop-keyboard```

Show **indicators** for settings that differ from defaults

```kcmshell6 kcm_fonts --highlight```

Pass **arguments** through to a module

```kcmshell6 kcm_kwinrules --args "[window-class]"```

# SYNOPSIS

**kcmshell6** [**--list**] [**--args** _arguments_] [**--icon** _icon_] [**--caption** _caption_] [**--highlight**] _module_...

# PARAMETERS

**--list**
> List all discoverable KCM (KDE Control Module) plugin IDs with short descriptions, then exit.

_module_
> One or more configuration modules to open. IDs may be given as the full plugin id (for example **kcm_fonts**), or as a short name that **kcmshell6** expands by trying **kcm_**_name_ and **kcm**_name_. Multiple modules open in a list-style dialog.

**--args** _arguments_
> Space-separated arguments forwarded to the module (parsed like a shell command line).

**--icon** _icon_
> Theme icon name for the dialog window. Defaults to the module's own icon.

**--caption** _caption_
> Custom window title. For a single module without this option, the module name is used.

**--highlight**
> Show visual indicators when a setting has been changed from its default value.

**--help**
> Show command-line help (via KAboutData / QCommandLineParser).

**--version**
> Show version information.

# DESCRIPTION

**kcmshell6** launches one or more **KDE Control Modules (KCMs)** in a standalone dialog, without opening the full **systemsettings** application. It is the Plasma 6 successor to **kcmshell5**, and ships as part of the **KCMUtils** framework.

Modules are discovered as plugins under the usual Plasma KCM namespaces (**plasma/kcms**, **plasma/kcms/systemsettings**, **plasma/kcms/systemsettings_qwidgets**, and **plasma/kcms/kinfocenter**). Each module presents a focused settings panel (fonts, display, network, power, and so on). When several module IDs are given, they appear together in a multi-page list dialog.

Scripts, desktop files, and documentation often invoke **kcmshell6** to deep-link into a single settings page. Interactive users typically use **systemsettings** for browsing and **kcmshell6** when they already know the module id.

# CAVEATS

Requires a running graphical session with Qt/KDE libraries available (normally a Plasma desktop). Module IDs differ between Plasma releases; use **kcmshell6 --list** on the target machine rather than hard-coding outdated names. Some modules need elevated privileges or PolicyKit for system-wide changes. Unknown module IDs may still open a dialog that only shows an error.

# HISTORY

**kcmshell** originated in KDE as a way to start individual control modules outside the full control center. Plasma 5 used **kcmshell5**; Plasma 6 renames the binary to **kcmshell6** and loads Qt 6 / KF6 KCM plugins (including QML-based modules) through KCMUtils.

# INSTALL

```apt: sudo apt install libkf6kcmutils-bin```

```pacman: sudo pacman -S kcmutils```

```apk: sudo apk add kcmutils```

<!-- packages: 2026-08-04 -->

# SEE ALSO

[systemsettings](/man/systemsettings)(1), [plasmashell](/man/plasmashell)(1), [kwriteconfig5](/man/kwriteconfig5)(1)

# RESOURCES

```[Source code](https://invent.kde.org/frameworks/kcmutils)```

```[Homepage](https://develop.kde.org/docs/features/configuration/kcm/)```

<!-- verified: 2026-08-04 -->
