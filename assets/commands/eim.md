# TAGLINE

ESP-IDF Installation Manager

# TLDR

**Install a specific ESP-IDF version**

```eim install -i [v5.3.2]```

**Install interactively** (with prompts)

```eim install -i [v5.3.2] -n false```

**Run the interactive installer wizard**

```eim wizard```

**List installed ESP-IDF versions**

```eim list```

**Select a version as active** for IDE use

```eim select [version]```

**Rename an installed version**

```eim rename [old_name] [new_name]```

**Remove a specific ESP-IDF version**

```eim remove [version]```

**Run a command** in an ESP-IDF environment

```eim run "[idf.py build]" [version]```

**Open a shell** with an ESP-IDF environment activated

```eim shell [version]```

**Repair an installation**

```eim fix -p [path/to/esp-idf]```

# SYNOPSIS

**eim** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Operation: install, wizard, list, list-tools, list-features, select, rename, remove, fix, purge, import, run, shell, completions.

**install** [**-i** _versions_]
> Install one or more comma-separated ESP-IDF versions. Runs non-interactively (headless) by default.

**wizard**
> Run the interactive installer wizard. Accepts the same options as install.

**list**
> List installed ESP-IDF versions.

**select** _version_
> Set the active ESP-IDF version (updates eim_idf.json for IDE integration).

**rename** _old_ _new_
> Rename an installed ESP-IDF version.

**remove** _version_
> Remove a specific ESP-IDF version.

**run** _command_ [_version_]
> Run a command in the context of an ESP-IDF version (default: the selected one). Quote commands that contain spaces or shell characters.

**shell** [_version_]
> Start an interactive shell with the environment of an ESP-IDF version activated.

**fix** [**-p** _path_]
> Repair an existing installation by reinstalling its tools and dependencies.

**purge**
> Remove all ESP-IDF installations.

**-i**, **--idf-versions** _versions_
> ESP-IDF versions to install (comma-separated).

**-p**, **--path** _path_
> Base path for all installed files and folders.

**-t**, **--target** _targets_
> Target platforms (comma-separated).

**-c**, **--config** _file_
> Path to a configuration file.

**-m**, **--mirror** _url_
> Mirror for tool downloads instead of github.com.

**--idf-mirror** _url_
> Mirror for ESP-IDF downloads instead of github.com.

**-n**, **--non-interactive** _bool_
> Non-interactive mode (default: true). Set to false to run interactively.

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

[esptool](/man/esptool)(1), [asdf](/man/asdf)(1)

# RESOURCES

```[Source code](https://github.com/espressif/idf-im-ui)```

```[Documentation](https://docs.espressif.com/projects/idf-im-ui/en/latest/)```

<!-- verified: 2026-11-09 -->
