# TLDR

**Start** Waydroid with full UI

```waydroid show-full-ui```

**Initialize** Waydroid (required on first run)

```sudo waydroid init```

**Install** an Android app from APK file

```waydroid app install [path/to/file.apk]```

**Launch** an Android app by package name

```waydroid app launch [com.example.app]```

**Start** or stop the Waydroid session

```waydroid session start|stop```

**Manage** the Waydroid container

```sudo waydroid container start|stop|restart|freeze|unfreeze```

**Open** Waydroid shell

```sudo waydroid shell```

**Adjust** Waydroid window dimensions

```waydroid prop set persist.waydroid.width|height [number]```

# SYNOPSIS

**waydroid** [_command_] [_arguments_]

# PARAMETERS

**show-full-ui**
> Start Waydroid with full Android UI

**init**
> Initialize Waydroid (first run setup)

**app install _apk_**
> Install an APK file

**app launch _package_**
> Launch an app by package name

**session start|stop**
> Start or stop the session

**container start|stop|restart|freeze|unfreeze**
> Container management commands

**shell**
> Open Android shell

**prop set _key_ _value_**
> Set Android system property

**log**
> Show Waydroid logs

# DESCRIPTION

**waydroid** runs a full Android system in a container on Linux. It uses Linux namespaces to create an isolated Android environment that integrates with the host's Wayland compositor.

Waydroid provides near-native Android performance by sharing the Linux kernel with the host. It supports Android apps, Google Play Services (with additional setup), and hardware acceleration.

# CAVEATS

Requires a Wayland compositor (not X11). Needs kernel modules for binder and ashmem. Some Android apps may not work due to hardware or architecture differences. ARM translation layer needed for x86 hosts to run ARM-only apps.

# SEE ALSO

[anbox](/man/anbox)(1), [lxc](/man/lxc)(1)
