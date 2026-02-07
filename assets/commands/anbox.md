# TAGLINE

Run Android applications on Linux

# TLDR

Launch Anbox into the **app manager**

```anbox launch --package=org.anbox.appmgr --component=org.anbox.appmgr.AppViewActivity```

# SYNOPSIS

**anbox** [_command_] [_options_]

# DESCRIPTION

**anbox** runs Android applications on any Linux operating system. It puts the Android operating system into a container, abstracts hardware access, and integrates core system services into a Linux environment.

# PARAMETERS

**launch**
> Launch an Android application

**--package**
> Specify the Android package name to launch

**--component**
> Specify the component/activity to launch

# CAVEATS

Anbox requires kernel modules and a properly configured container environment. Not all Android applications are compatible due to the lack of Google Play Services.

# HISTORY

Anbox (Android in a Box) is an open-source compatibility layer that allows Android apps to run on Linux. Development began around **2017** as an alternative to Android emulators.

# SEE ALSO

[waydroid](/man/waydroid)(1), [lxc](/man/lxc)(1)
