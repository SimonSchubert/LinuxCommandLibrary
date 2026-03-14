# TAGLINE

Switch between installed Java environments on Arch Linux

# TLDR

**List** installed Java environments

```archlinux-java status```

**Get** current default Java environment

```archlinux-java get```

**Set** default Java environment

```archlinux-java set java-17-openjdk```

**Unset** default Java environment

```archlinux-java unset```

**Fix** an invalid or broken default Java configuration

```archlinux-java fix```

# SYNOPSIS

**archlinux-java** _command_ [_arguments_]

# DESCRIPTION

**archlinux-java** is an Arch Linux utility for switching between installed Java environments. It manages symbolic links at /usr/lib/jvm/default and /usr/lib/jvm/default-runtime to set the default Java version system-wide. It is provided by the **java-runtime-common** package.

# PARAMETERS

**status**
> List all installed Java environments and show which is default

**get**
> Return the short name of the current default Java environment

**set JAVA_ENV**
> Set the specified Java environment as default

**unset**
> Remove the default Java environment setting

**fix**
> Fix an invalid or broken default Java environment configuration. If no default is set, looks for valid environments and sets one automatically, preferring OpenJDK.

# CAVEATS

Requires root privileges for **set**, **unset**, and **fix** commands. Java environments are installed in /usr/lib/jvm/. Changes take effect for new shell sessions. The JAVA_ENV argument for **set** must match the directory name under /usr/lib/jvm/ (e.g., java-17-openjdk, java-21-openjdk).

# HISTORY

**archlinux-java** is an Arch Linux-specific tool for managing multiple Java installations, similar to update-alternatives on Debian-based systems.

# SEE ALSO

[java](/man/java)(1), [update-alternatives](/man/update-alternatives)(1)
