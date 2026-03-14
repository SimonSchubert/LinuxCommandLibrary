# TAGLINE

ESP-IDF Installation Manager

# TLDR

**Install a specific ESP-IDF version**

```eim install -i [v5.3.2]```

**Install interactively** (with prompts)

```eim install -i [v5.3.2] -n false```

**List installed ESP-IDF versions**

```eim list```

**Select a version as active** for IDE use

```eim select [version]```

**Rename an installed version**

```eim rename [old_name] [new_name]```

**Remove a specific ESP-IDF version**

```eim remove [version]```

# SYNOPSIS

**eim** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Operation: install, list, select, rename, remove, run, purge.

**install** [**-i** _version_]
> Install an ESP-IDF version. Runs non-interactively (headless) by default.

**list**
> List installed ESP-IDF versions.

**select** _version_
> Set the active ESP-IDF version (updates eim_idf.json for IDE integration).

**rename** _old_ _new_
> Rename an installed ESP-IDF version.

**remove** _version_
> Remove a specific ESP-IDF version.

**run** _version_ _command_
> Run a command in the context of a specific ESP-IDF version.

**purge**
> Remove all ESP-IDF installations.

**-n** _bool_
> Set interactive mode (true/false, default: true for headless install).

**--help**
> Display help information.

# DESCRIPTION

**eim** (ESP-IDF Installation Manager) is a cross-platform tool by Espressif for managing ESP-IDF (Espressif IoT Development Framework) installations. It handles downloading, installing, and switching between multiple ESP-IDF versions for ESP32 development.

The tool supports both interactive and non-interactive (headless) installation modes, making it suitable for both manual setup and CI/CD automation. It integrates with IDEs through the eim_idf.json configuration file.

# CAVEATS

Requires build dependencies for the ESP-IDF toolchain. Installation may take significant time and disk space. The **purge** command removes all installed versions irreversibly.

# HISTORY

**eim** was developed by **Espressif Systems** as a streamlined installer for the ESP-IDF development framework, replacing manual setup procedures.

# SEE ALSO

[asdf](/man/asdf)(1)
