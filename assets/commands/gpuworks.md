# TAGLINE

Install and run the GPUWorks control plane

# TLDR

Run the control plane in the foreground

```gpuworks serve --addr [:8800]```

Install it as a service (default directory `/opt/gpuworks/server`)

```gpuworks install```

Apply edits to `server.yaml`

```gpuworks restart```

Upgrade the installation, rolling back if health does not return

```gpuworks upgrade```

Stop the service and leave it enabled for the next boot

```gpuworks stop```

Reset the admin password in the database

```gpuworks reset-password --password [new-password]```

Collect a diagnostics archive

```gpuworks support-bundle --since [1h]```

# SYNOPSIS

**gpuworks** _command_ [_options_]

# PARAMETERS

**serve**

> Web UI, management API, and OpenAI-compatible gateway. **--config** reads `server.yaml` (flags override the file). **--addr** defaults to `:8800` and replaces the listen section. **--data** defaults to `./data`. **--db** defaults to `gpuworks.db` inside that directory. **--supervise** restarts the server 3 seconds after it exits

**install**

> Copy this binary into **--dir** (default `/opt/gpuworks/server`, or `~/gpuworks/server` on macOS), write `server.yaml`, start the service, and check health. **--password** sets the admin password. **--quiet** skips prompts and generates a password if you did not pass one. **--no-systemd** starts under nohup instead of systemd or launchd. **--autostart** defaults to true on Linux and false on macOS

**upgrade**

> Replace the installation from the release channel, **--base-url**, or a local **--archive**. Waits up to 60 seconds for health, then rolls back. **--channel** is `release` or `nightly`. **--keep** defaults to 3 backup sets

**restart** [**--dir** _dir_]

> Stop and start the installation in its current mode (systemd, launchd, or nohup) and wait until `/healthz` reports this binary's version

**stop** [**--dir** _dir_]

> Stop the service. The unit stays installed, so a reboot starts it again. Use **restart** to start it immediately

**uninstall** [**--dir** _dir_] [**--purge**] [**--yes**] [**--dry-run**] [**--json**]

> Remove the service. Data is kept unless **--purge**. Scripts must pass **--yes** or **--dry-run**. **--json** with a real uninstall also requires **--yes**

**expose** **up** | **status** | **down** | **rm** | **logs**

> Publish a public console address. **up** defaults to the `cloudflare-quick` provider. Every subcommand takes **--data**

**migrate**

> Run database migrations, seed the built-in catalog, and exit. **--data** defaults to `./data`

**reset-password** **--password** _password_

> Set a user's password by editing the database. **--user** defaults to `admin`. The database file must already exist

**support-bundle**

> Write a diagnostics archive. **--since** defaults to `1h`. **--from** and **--to** are RFC 3339 and must be given together. **--out** defaults to a `gpuworks-diagnostics` archive in the current directory

**version**

> Print the version

# DESCRIPTION

**gpuworks** is the control-plane binary for GPUWorks. It serves the web UI, the management API, and an OpenAI-compatible gateway, and it installs or upgrades that process as a systemd, launchd, or nohup service. GPU nodes do not run this binary. They run **gpuworks-agent**, which dials out to the server.

With no subcommand, or with an unknown one, **gpuworks** prints usage and exits 2. **--help** exits 0. Flags belong after the subcommand.

The default listen port is 8800. **install** wants root or sudo for systemd, at least 2 GiB free on the target filesystem, and a free port. The first admin password is **--password**, or the GPUWORKS ADMIN PASSWORD environment variable, or a prompt, or a random value in quiet mode. It is written to `initial-credentials` in the data directory, not into the unit file. If the database already exists, **install** does not change the password. Use **reset-password**.

**restart** is the command to run on the control-plane host after editing `server.yaml`. It refuses to run when the supervisor is PID 1 inside a container, because stopping that process stops the container.

A shell installer at `https://dl.gpuworks.ai/get.sh` downloads this binary and runs **install**. The command you type after that is **gpuworks**.

# CONFIGURATION

**server.yaml**

> Control-plane configuration beside the binary. **serve --config** reads it. Command flags override matching keys. **restart** loads the file the installation already uses

**data directory**

> SQLite database, logs, credentials, and expose state. Defaults to `./data` for **serve**, or to the data directory chosen at **install**

# CAVEATS

**uninstall --purge** deletes the database, `master.key`, backups, and logs. It does not delete remote agents, model services, or cloud resources.

**expose up** with the quick provider gives a temporary address and does not support server-sent events. **reset-password** and **install --password** put a secret on the command line.

**support-bundle** cannot include live node data when the server is down. The archive is built next to **--out**, so it can still be written when the data disk is full only if **--out** is on another disk.

Other binaries in the same repository (`gpuworks-dist`, `gpuworks-image-manifest`, `template-probe`, `gpuworks-catalog-model-config`) are catalog and release tools, not the control plane.

# HISTORY

GPUWorks is the flitai-io control plane for serving models on NVIDIA, AMD, Ascend, PPU, Hygon, and Apple Silicon nodes. **gpuworks** is the server binary. **gpuworks-agent** is the per-node binary. The CLI reference in the repository is the source for the flags above.

# SEE ALSO

[docker](/man/docker)(1), [curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/flitai-io/gpuworks)```

```[Documentation](https://gpuworks.readthedocs.io/)```

<!-- verified: 2026-11-07 -->
