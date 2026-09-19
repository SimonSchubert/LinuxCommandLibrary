# TAGLINE

CLI for macOS and Linux VMs on Apple Silicon

# TLDR

Print the **installed version**

```lume --version```

Create an empty **Linux VM**

```lume create [ubuntu-vm] --os linux --cpu [4] --memory [8GB] --disk-size [50GB]```

First boot: attach an **ARM64 installer ISO**

```lume run [ubuntu-vm] --mount [path/to/ubuntu-24.04-live-server-arm64.iso]```

Run the Linux VM **after install**

```lume run [ubuntu-vm]```

Create a **macOS Tahoe** VM from a local restore image

```lume create [macos-tahoe] --ipsw [path/to/macos-tahoe.ipsw] --unattended tahoe```

Print the latest **macOS IPSW URL**

```lume ipsw```

**List** virtual machines

```lume ls```

Show **details** (state, IP, SSH) for one VM

```lume get [name]```

Open an **SSH session** or run a remote command

```lume ssh [name] [command]```

**Shut down** a guest over SSH

```lume shutdown [name]```

**Stop** the VM process immediately

```lume stop [name]```

**Delete** a VM and its disk

```lume delete [name] --force```

**Pull** a prebuilt image from GHCR

```lume pull [macos-tahoe-vanilla:latest]```

Start the local **HTTP API** (default port 7777)

```lume serve```

# SYNOPSIS

**lume** _command_ [_options_]

# PARAMETERS

**create** _name_
> Create a VM. **--os** is `macOS` (default) or `linux`. **--cpu**, **--memory**, **--disk-size**, and **--display** set resources. macOS guests take **--ipsw** (path or `latest`) and **--unattended** (`tahoe` or `sequoia`).

**run** _name_
> Start a VM. **--mount** attaches a read-only installer ISO (Linux). **--shared-dir** _path_[:ro|:rw] shares a host directory. **--display** is `native`, `vnc`, or `none`. **--detach** returns immediately. **--vnc disabled** starts with no VNC listener.

**attach** _name_
> Open a viewer for a running VM (`--display native` or `vnc`).

**shutdown** / **restart** _name_
> Graceful guest shutdown or reboot over SSH (default user and password `lume`).

**stop** _name_
> Immediate process-level stop.

**delete** _name_
> Remove the VM and its disk. **--force** skips confirmation.

**clone** _name_ _new-name_
> Copy a VM, optionally across **--source-storage** and **--dest-storage**.

**ls**
> List VMs. **-f**, **--format** is `text` or `json`.

**get** _name_
> Print state, IP, display, resources, and SSH availability.

**set** _name_
> Change CPU, memory, disk size (increase only), or display of a stopped VM.

**images** / **pull** / **push** / **prune**
> List cached images, pull or push OCI images (default registry `ghcr.io`, organization `trycua`), or drop the cache.

**ipsw**
> Print the current macOS restore-image URL.

**ssh** _name_ [_command_...]
> Interactive SSH or a one-shot remote command.

**setup** _name_
> Run unattended macOS setup on an existing VM.

**sip** _on|off_ _name_
> Enable or disable System Integrity Protection from paired Recovery.

**config**
> Get or set storage locations, image cache, and telemetry (`lume config telemetry disable`).

**serve**
> Start the local VM HTTP API. **--port** defaults to 7777.

**update** / **check-update** / **channel**
> Check or apply updates; persist `stable` or `nightly`.

**--help** / **--version**
> Help or version, available on every command.

# DESCRIPTION

**lume** creates, runs, and manages local macOS and Linux virtual machines on Apple Silicon using Apple's Virtualization.framework. It is a single CLI (and optional local API server) aimed at near-native guests without a separate hypervisor stack.

Linux guests boot from ARM64 ISO images: create the VM with `--os linux`, run it once with `--mount` pointing at the installer, then run it again without the ISO. macOS guests are created from an IPSW restore image. The `tahoe` unattended preset creates the `lume` user, enables SSH, configures autologin, and disables sleep and screen locking.

VMs are stored under `~/.lume` by default. Additional storage locations can be registered with `lume config storage`. Shared host directories appear in the guest at `/Volumes/My Shared Files`. `lume serve` exposes the same operations over HTTP for scripts and tools.

Lume is part of the Cua computer-use platform and can back local macOS sandboxes, but the CLI is usable on its own.

# CONFIGURATION

**~/.lume**
> Default VM store. `sudo lume` uses root's home and will not see VMs created as a regular user.

**lume config storage**
> Named extra disk locations (`add`, `list`, `remove`, `default`). Commands also accept **--storage** _name_.

**lume config cache** / **lume config telemetry**
> Image-layer cache (off by default) and pseudonymous telemetry (on by default). `LUME_TELEMETRY_ENABLED` overrides the persisted telemetry preference for the current process.

**~/Library/Logs/lume/**
> Logs for `lume run --detach`.

# CAVEATS

Requires an Apple Silicon Mac running macOS 13 or later. It does not run on Linux or Intel Macs. Linux installer ISOs must be ARM64 (aarch64), not x86_64.

Apple's framework allows at most two concurrent macOS guests. Linux guests have no such cap beyond host RAM, CPU, and disk. Nested virtualization of macOS inside a macOS VM is not supported.

Default unattended SSH credentials are `lume` / `lume`. Change the password before using the VM for anything sensitive.

Only one `lume run` process can hold a VM's auxiliary storage. A second start reports that auxiliary storage is locked until the first process is stopped.

Telemetry is enabled by default (install, release, command, and API-event metadata; not VM names, paths, or guest contents). Disable it with `lume config telemetry disable`.

# HISTORY

Lume was open-sourced by **trycua** (Cua AI, Inc.) in **2025** as a lightweight CLI for macOS and Linux VMs on Apple Silicon. It now lives in the Cua monorepo (`libs/lume`) and is installed with the official script from `https://cua.ai/lume/install.sh`.

# INSTALL

```brew: brew install lume```

<!-- packages: 2026-09-19 -->

# SEE ALSO

[lima](/man/lima)(1), [colima](/man/colima)(1), [qemu](/man/qemu)(1), [virsh](/man/virsh)(1), [ssh](/man/ssh)(1), [multipass](/man/multipass)(1)

# RESOURCES

```[Source code](https://github.com/trycua/cua)```

```[Homepage](https://cua.ai)```

```[Documentation](https://cua.ai/docs/reference/lume/cli-reference)```

<!-- verified: 2026-09-19 -->
