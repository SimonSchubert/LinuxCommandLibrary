# TAGLINE

Reticulum mesh networking daemon

# TLDR

Start the daemon with the **first config directory** it finds

```rs-rnsd```

Use one **config directory**

```rs-rnsd --config-dir [/path/to/config]```

Turn a **Python Reticulum** config file into TOML

```rs-rnsd convert-config [/path/to/config]```

# SYNOPSIS

**rs-rnsd** [**-c** | **--config-dir** _directory_] [**convert-config** _file_]

# PARAMETERS

**-c**, **--config-dir** _directory_
> Directory that holds **config.toml** or a legacy **config** file. Without this flag the daemon searches, in order, **~/.config/reticulum**, **~/.reticulum**, and **/etc/reticulum**.

**convert-config** _file_
> Read a Python Reticulum config file and write TOML. This subcommand does not start the daemon.

**--version**
> Print the version and exit.

# DESCRIPTION

**rs-rnsd** is the daemon for Reticulum-rs, a Rust implementation of the Reticulum mesh stack. It loads a TOML config, brings up the configured interfaces, and stays up as a transport node. The binary name is **rs-rnsd** (Cargo package **reticulum-daemon**). It is not the Python **rnsd** program from the original Reticulum project.

On startup it looks for **config.toml**, then a file named **config**, in the chosen directory. If no directory already has either file, it creates **~/.config/reticulum/config.toml** from the built-in defaults and asks you to edit it.

A **config** file that is still in the Python Reticulum format is not valid TOML. The daemon prints that and tells you to run **convert-config**. That subcommand rewrites the file and keeps a backup.

The same repository installs a second binary, **rn**, for identity, path, status, and file-transfer tools. That name is also the traditional Usenet newsreader, so it is not documented under this page.

# CONFIGURATION

Config directories, first match wins:

**~/.config/reticulum/**
> Default directory. A missing setup is created here.

**~/.reticulum/**
> Older path, checked second.

**/etc/reticulum/**
> System-wide directory, checked last.

Each directory is used only when it contains **config.toml** or **config**. Unknown keys in TOML produce a warning and do not stop the daemon. An interface **ifac** size above **512** bits is an error.

# CAVEATS

The long flag is **--config-dir**, not **--config**. A README example that passes **--config** does not match the binary.

**convert-config** and a normal start are separate. Passing the subcommand does not also boot the daemon.

# SEE ALSO

The companion binary **rn** shares this repository and is not listed here, because that page name belongs to the Usenet reader of the same name.

# RESOURCES

```[Source code](https://github.com/aljazceru/Reticulum-rs)```

<!-- verified: 2026-11-21 -->
