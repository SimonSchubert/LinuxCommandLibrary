# TAGLINE

single-binary homelab CLI that reports what changed on a server

# TLDR

**Interactive setup** (writes `~/.config/homebutler/config.yaml`)

```homebutler init```

Current **CPU, memory, disk, and uptime**

```homebutler status```

Butler-style **health report** plus what changed since the last snapshot

```homebutler report```

Read-only **doctor** check (resources, stopped containers, public ports, backups, Proxmox)

```homebutler doctor --strict```

Map **containers, ports, and topology**

```homebutler inventory scan```

Show only **ports bound on all interfaces**

```homebutler inventory scan --filter exposed```

**List** Docker containers

```homebutler docker list```

Deploy a **self-hosted app** via generated Compose

```homebutler install [uptime-kuma]```

Verify a **backup actually boots** in an isolated container

```homebutler backup drill [uptime-kuma]```

Terminal **dashboard** for every configured server

```homebutler watch tui```

Embedded **web dashboard** (default `127.0.0.1:8080`)

```homebutler serve --token [secret]```

MCP server on **stdio** for AI agents

```homebutler mcp```

Same commands as **JSON** for scripts

```homebutler report --json```

# SYNOPSIS

**homebutler** [**--json**] [**-v**] [**--config** _path_] [**--server** _name_ | **--all**] _command_ [_options_]

# PARAMETERS

**--json**
> Force machine-readable JSON instead of terminal text. Persistent; accepted on most commands. Colour is dropped automatically when output is piped, redirected, or run from cron.

**-v**, **--verbose**
> Show detailed error information.

**--config** _path_
> Config file. Resolution order is this flag, then **$HOMEBUTLER_CONFIG**, then **~/.config/homebutler/config.yaml**, then **./homebutler.yaml**. If none exist, built-in defaults are used. A **--config** path that does not exist also falls back to defaults rather than failing (except **config validate**).

**--server** _name_
> Run the command on a named remote server from the config over SSH (skipped when that server is marked **local**). Not supported by **proxmox** (use **--endpoint** instead). **deploy** and **upgrade** handle remotes themselves.

**--all**
> Run the command on every configured server in parallel. Same **proxmox** restriction as **--server**.

# COMMANDS

**init**
> Interactive wizard that creates or updates the configuration file.

**status**
> CPU, memory, disk, and uptime.

**report**
> Snapshot current system, container, and port state, compare it to the previous snapshot, and print a butler-style summary. Snapshots live under **~/.homebutler/reports/snapshots/** and are pruned to **--keep** entries (default **30**). **--no-save** prints without writing a snapshot. Change kinds in the report (and in **--json**) are **gone**, **new**, **replaced**, **image**, **state**, **port**, **disk**, and **skipped**.

**doctor**
> Read-only preflight: resource pressure, stopped containers, public bind ports, backup hygiene, notification and watch readiness, report baseline, config-file permissions, Docker-socket mounts, Proxmox TLS/reachability, and incident-history limits. **--strict** exits non-zero on warnings or failures. **--backup-max-age** (default **168h**) warns when the latest backup is older than that. Unlike other commands, **doctor** will still run against a config that **Load** refuses for world-readable secrets, so it can name that failure.

**config validate**
> Check the config without starting anything. Reports which file was used, which resolution rule picked it, what each section became, and keys that do not match the schema (otherwise dropped silently). **--strict** also fails on warnings. No remote routing.

**inventory scan** / **inventory show**
> Tree of system health, Docker containers, and ports. **--filter exposed** keeps only ports listening on all interfaces (`0.0.0.0`, `::`, `*`). **--filter** cannot be combined with **--json**.

**inventory export**
> Export the inventory. **--format mermaid** (default).

**docker** **list** | **restart** _c_ | **stop** _c_ | **logs** _c_ [_lines_] | **stats** | **top** _c_ | **inspect** _c_
> Container operations. **list** aliases **ls**. **logs** defaults to **50** lines. **inspect** never prints environment-variable values. **top** is read-only (`docker top`).

**install** _app_
> Generate Compose and deploy a catalogued self-hosted app (Uptime Kuma, Jellyfin, Pi-hole, Gitea, Portainer, and others). **--port**, **--media** (Jellyfin/Plex), **--dry-run**. Subcommands: **list**, **status** _app_, **uninstall** _app_ (keep data), **purge** _app_ (delete data).

**backup**
> Tar Docker service volumes. **--service** _name_, **--to** _dir_. **backup list** lists archives. **backup drill** _service_ boots the latest (or **--archive**) backup in isolation; **--all** drills every supported app in the archive.

**restore** _archive_
> Restore volumes from an archive. **--service** _name_. Bind-mount host paths in the archive are refused unless named with repeatable **--allow-bind** _path_.

**watch**
> Restart tracker. Records under **~/.homebutler/watch/**. Subcommands: **tui**, **add** [_name_] [**--kind** docker|systemd|pm2], **list**, **remove** _name_, **check**, **start** [**--interval**] (minimum **5s**), **history** (alias **incidents**), **show**, **install** / **uninstall** (supervisor service), **status**. Docker targets use `docker events`; systemd and PM2 poll. Watch notifications are **off** until **watch.notify.enabled** is set.

**serve**
> Embedded web dashboard. **--host** (default **127.0.0.1**), **--port** (default **8080**), **--token** (bearer auth), **--demo** (no real system calls). Release binaries and **install.sh** embed the frontend; `go install` / a plain `go build` do not.

**mcp**
> Model Context Protocol server on **stdio**. **--demo** uses fake data.

**ports** / **processes** / **network**
> Open ports with owning processes (try **sudo** if names are missing), process list, and network scan.

**wake** _mac-or-name_ [_broadcast_]
> Wake-on-LAN magic packet. Names resolve from the **wake** config section. Default broadcast **255.255.255.255**.

**notify test**
> Send a test message through configured Telegram, Slack, Discord, or webhook providers. Legacy alias: **alerts test-notify**.

**alerts**
> One-shot CPU/memory/disk threshold check. **--watch** loops (prefer **watch start** unless you want thresholds only). **--interval** (default **30s**). **alerts init**, **alerts history**.

**proxmox**
> Inspect configured Proxmox VE endpoints (**status**, **guests**, **node**, **tasks**, **task**, **guest** start/shutdown/reboot, **script**). Use **--endpoint**, not **--server**. Guest power actions need a separate action token and **--confirm** with explicit **--node**, **--type**, and **--vmid**.

**deploy** / **upgrade** / **trust** / **version**
> Copy the binary to remotes, upgrade it, manage host-key trust, and print the version.

# DESCRIPTION

**homebutler** is a single Go binary for homelab operations. It remembers what a server looked like last time and reports **what changed**, rather than another graph of the current moment. There is no required daemon, database, or always-on web service: the same binary is the CLI, an optional dashboard, and an MCP server.

The design is CLI-first and JSON-friendly so the same commands work from a terminal, cron, SSH, CI, or an agent that should not be given a full shell. **report** compares full container, process, and port lists (not just counts), so a container recreated under the same name shows as **replaced** rather than "no change". When a comparison cannot be made (for example Docker was down), the kind is **skipped** instead of an all-clear.

Remote servers in the config are reached over SSH. Prefer key auth. Colour in terminal reports is dropped when stdout is not a TTY.

# CONFIGURATION

**~/.config/homebutler/config.yaml**
> Preferred config (XDG). Created by **init**. Example sections: **servers**, **proxmox**, **wake**, **alerts**, **notify**, **watch**, **backup_dir**. Output format is a flag (**--json**), not a config key.

**$HOMEBUTLER_CONFIG**
> Overrides the default path when **--config** is omitted.

**./homebutler.yaml**
> Last-resort path in the current directory.

**~/.homebutler/reports/snapshots/**
> **report** baselines. Pruned with **--keep**.

**~/.homebutler/watch/**
> Watch list, incident history, and watch-local config. A running **watch** service reads the list at startup; **watch add** / **remove** print the restart command if a supervisor is installed.

**~/.homebutler/alerts.yaml**
> Deprecated fallback for notify/rules. Move them into **config.yaml**.

A config that holds plaintext secrets must not be group/world-readable; **Load** refuses it (mode check on **perm & 0o077**). Unrecognised keys are ignored unless you run **config validate**. Check a file with **homebutler config validate**.

# CAVEATS

`go install github.com/Higangssh/homebutler@latest` builds without the embedded dashboard: **serve** then cannot serve `/`. Use a release binary, **install.sh**, or **make build-all** from a checkout.

**watch.notify.enabled** defaults to false, and **notify_on: flapping** means a single restart is not sent. Configuring Telegram and passing **notify test** is not enough for incidents to be delivered.

**doctor --strict** makes outbound calls to each configured Proxmox endpoint. An unreachable or rebooting host fails the run.

Proxmox guest start/reboot/shutdown do not fall back to the read token. They fail until **action_token_id** and **action_token** (or **action_token_file**) are set, and they require **--confirm**.

**install portainer** mounts the Docker socket (host root from inside the container). **doctor** reports that class of mount.

# HISTORY

**HomeButler** is an MIT-licensed Go project by **Higangssh**. The public repository was created on **23 February 2026** with **v0.1.0** the same day (core commands, network scan, alerts, Wake-on-LAN). **v0.2.0** added SSH multi-server support, XDG config discovery, and **deploy**. Later 2026 releases added the MCP server, **report** identity-aware diffs (**replaced** vs count comparison, **0.26.0**), Proxmox, backup drills, and the embedded dashboard. Current mainline at documentation time is **0.29.0**.

# SEE ALSO

[docker](/man/docker)(1), [docker-compose](/man/docker-compose)(1), [lazydocker](/man/lazydocker)(1), [ctop](/man/ctop)(1), [glances](/man/glances)(1), [wakeonlan](/man/wakeonlan)(1)

# RESOURCES

```[Source code](https://github.com/Higangssh/homebutler)```

```[Homepage](https://homebutler.dev)```

```[Documentation](https://github.com/Higangssh/homebutler#readme)```

<!-- verified: 2026-09-08 -->
