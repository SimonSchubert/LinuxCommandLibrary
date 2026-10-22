# TAGLINE

Omnara machine daemon for running agent processes

# TLDR

**Install** the daemon (prompts for a machine token)

```curl -fsSL https://api.omnara.com/install/omnarad.sh | sh```

Create a machine **and install** the daemon on this computer (via the Omnara CLI)

```omnara machines create-local --display-name [build-server-1] --project-ids [proj_id]```

Show whether the daemon is **running**

```omnarad status```

**Start** the user service (or run in the foreground if none is available)

```omnarad start```

**Stop** the daemon

```omnarad stop```

**Restart** the daemon

```omnarad restart```

Print the daemon **version**

```omnarad --version```

**Uninstall** (type `uninstall` at the prompt, or pass **--yes**)

```omnarad uninstall```

# SYNOPSIS

**omnarad** [_command_] [_options_]

**omnarad** **start** [**--no-service**]

**omnarad** **install** [**--release-manifest-url** _url_] [**--no-start**]

**omnarad** **uninstall** [**--yes**]

# DESCRIPTION

**omnarad** is the Omnara machine daemon. It runs on each laptop, VM, or container that agents should use as a computer: it dials out to the Omnara API, so no inbound port or SSH key is required, and it runs commands that survive daemon restarts. The Go program is `cmd/daemon`; go-arg describes it as "Omnara machine daemon for running agent processes." Official installs live under **~/.omnarad** (or **OMNARA_HOME**).

With no subcommand, **omnarad** starts the daemon (same as **omnarad start**). On Linux it registers a systemd user service; on macOS it uses launchd. When no user service manager is available, it warns and runs in the foreground with restart supervision; press Ctrl-C to stop it and run **omnarad start** again. The daemon updates itself in the background from the installer-recorded release manifest unless updates are disabled.

The usual install path is the hosted script `https://api.omnara.com/install/omnarad.sh`, which supports macOS and Linux on amd64 and arm64. **omnara machines create-local** creates the machine record, mints a one-time machine token, and runs that installer on the current computer.

# COMMANDS

**(default)** / **start**
> Start the daemon. With a systemd or launchd user service, prints `omnarad daemon is running` and returns. **--no-service** stops any managed service and runs in the foreground instead.

**stop**
> Stop the daemon. Prints `omnarad is stopped`.

**restart**
> Restart the managed service, or run in the foreground when no service manager is available.

**status**
> Print running or stopped state, including the service manager and pid when running. Exit status **1** when stopped.

**install**
> Copy this executable into the daemon home and write `daemon.json`. A new install requires **--release-manifest-url**. Prompts for **OMNARA_MACHINE_TOKEN** unless that variable is already set. Restarts the daemon unless **--no-start** is given.

**uninstall**
> Stop the daemon, attempt to stop agent processes, remove the user service, and delete the entire daemon home. Without **--yes**, type `uninstall` at the prompt. Non-interactive uninstall requires **--yes**.

# PARAMETERS

**--version**
> Print the daemon version and exit.

**--no-service**
> With **start**, run in the foreground instead of a user service.

**--release-manifest-url** _url_
> With **install**, URL of the release manifest for a new installation.

**--no-start**
> With **install**, install without starting or restarting the daemon.

**--yes**
> With **uninstall**, skip the confirmation prompt.

# CONFIGURATION

**~/.omnarad/** or **$OMNARA_HOME**
> Daemon home. **OMNARA_HOME** must be an absolute, already-clean path. Default is `~/.omnarad`.

**~/.omnarad/daemon.json**
> Runtime config, mode `0600`. Default API root is `https://api.omnara.com/v1`.

```
{
  "schema_version": 1,
  "api_url": "https://api.omnara.com/v1",
  "machine_token": "",
  "installation_id": "",
  "machine_id": "",
  "no_update": false,
  "runner_path": "",
  "git_credentials_disabled": false
}
```

**~/.omnarad/install.json**
> Install receipt used for repairs and background updates: schema version, install method `omnarad.sh`, and the release manifest URL.

**omnara machines create-local** refuses to run when this home already holds a daemon install. Run **omnarad uninstall** first to connect the computer as a new machine.

# ENVIRONMENT

**OMNARA_HOME**
> Daemon home directory. Must be an absolute clean path.

**OMNARA_API_URL**
> Control-plane API root written into `daemon.json`. Default `https://api.omnara.com/v1`.

**OMNARA_MACHINE_TOKEN**
> One-time machine token (omnara daemon v1 prefix). Required at install if not prompted interactively. A rejected token is reported against the configured API URL.

**OMNARA_NO_UPDATE**
> `1` disables background updates; `0` enables them. Other values are an error.

**OMNARA_GIT_CREDENTIALS**
> `0` disables git credential helper injection; `1` enables it. Other values are an error.

**OMNARA_RUNNER_PATH**
> `PATH` used when the daemon starts agent processes. Defaults to the installer's `PATH`.

# CAVEATS

Installer coverage is macOS and Linux on amd64 and arm64. macOS binaries require macOS 13 or later. **uninstall** permanently deletes the daemon home and everything beneath it, including files you added and files on filesystems mounted inside that directory.

**status** exits **1** when the daemon is stopped, so it is not a success-only health check in scripts. Hidden internal subcommands (`run-service`, process runner, file transfer, git credential helper) are used by the service manager and agent runtime; they are not user commands.

The daemon connects outbound only. Grant the machine to a project with **omnara grant machines add** (or pass **--project-ids** at create) before agent configs can target it by machine name.

# HISTORY

**omnarad** is the machine daemon from the Apache-2.0 Omnara project (**omnara-ai/omnara**). GitHub releases publish tagged `omnarad-v*` binaries separately from the npm CLI. The registered daemon semantic version is the compatibility boundary with the control plane.

# SEE ALSO

[omnara](/man/omnara)(1), [curl](/man/curl)(1), [systemctl](/man/systemctl)(1), [launchctl](/man/launchctl)(1)

# RESOURCES

```[Source code](https://github.com/omnara-ai/omnara)```

```[Homepage](https://www.omnara.com)```

```[Documentation](https://docs.omnara.com/machines/connect)```

<!-- verified: 2026-10-22 -->
