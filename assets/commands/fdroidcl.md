# TLDR

**Search for apps**

```fdroidcl search [query]```

**Install app**

```fdroidcl install [app.id]```

**Update all apps**

```fdroidcl upgrade```

**List installed apps**

```fdroidcl list installed```

**Show app details**

```fdroidcl show [app.id]```

# SYNOPSIS

**fdroidcl** _command_ [_options_] [_arguments_]

# PARAMETERS

_COMMAND_
> Operation: search, install, upgrade, list, show.

**search** _QUERY_
> Search for apps.

**install** _APP_
> Install application.

**upgrade**
> Update all installed apps.

**uninstall** _APP_
> Remove application.

**list** _TYPE_
> List apps (installed, upgradable, all).

**show** _APP_
> Show app details.

**update**
> Refresh repository index.

**--help**
> Display help information.

# DESCRIPTION

**fdroidcl** is a command-line client for F-Droid, the free software Android app repository. It allows searching, installing, and managing apps from F-Droid repositories without using the graphical client.

The tool connects to F-Droid repositories and uses ADB to install apps on connected Android devices. It can manage multiple devices and provides scripting-friendly output for automation.

fdroidcl enables command-line management of F-Droid apps for power users and automated deployment scenarios.

# CAVEATS

Requires ADB and connected device. Device must allow installation from unknown sources. Some apps require specific Android versions.

# HISTORY

fdroidcl was created as a command-line alternative to the F-Droid graphical client, enabling scriptable management of open source Android applications from F-Droid repositories.

# SEE ALSO

[fdroid](/man/fdroid)(1), [adb](/man/adb)(1)
