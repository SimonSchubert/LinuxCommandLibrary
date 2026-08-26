# TAGLINE

rootless, daemonless OCI container and resource-slicing runtime

# TLDR

Start an **interactive** Alpine shell

```kern box dev --image alpine -it -- sh```

Cap a **host process** (no sandbox)

```kern run --memory 256M --cpus 0.5 -- [./crunch]```

Run a service with **port publish** and restart

```kern box svc --image nginx:alpine -d -p 8080:80 --restart -- nginx -g 'daemon off;'```

List running **boxes**

```kern ps```

**Exec** into a box

```kern exec [svc] -it -- sh```

Live **TUI** of CPU, memory, and volumes

```kern top```

Bring up a **Compose** file (kern or Docker format)

```kern compose [stack.toml] up```

Check whether this kernel can run boxes

```kern doctor```

# SYNOPSIS

**kern** _command_ [_options_] [_args_]

# COMMANDS

**box** _name_ [_options_] **--** _cmd_
> Create/run an isolated box from an OCI image (`--image`, `-it`, `-d`, `-p`, `-v`, `--restart`, `--security-profile untrusted`, resource tokens like `vcpu:heavy`).

**run** [_limits_] **--** _cmd_
> Apply CPU/memory (and optional Landlock) to a process **without** a sandbox.

**ps** / **logs** / **exec** / **stop** / **inspect** / **stats** / **wait**
> Lifecycle and inspection. Most list verbs also take **--json**.

**top**
> Live TUI.

**compose** _file_ **up|down**
> Run `kern-compose.toml` or a `docker-compose.yml` as one pod.

**doctor** / **validate**
> Host capability check and config validation.

**volume**, **images**, **pull**, **build**, **commit**, **push**, **save**, **load**
> OCI and volume operations (see project docs for the full matrix).

# DESCRIPTION

**kern** is a static ~1.5 MB Linux runtime: real OCI images, always-rootless namespaces (user, pid, mount, net, uts, ipc), seccomp, and cgroup v2, with **no daemon**. Cold start of a box from an image is a few milliseconds. Resource profiles in `~/.config/kern/kern.toml` (`vcpu:`, `vdisk:`, `vgpio:`) attach by name to either a box or **kern run**.

`--security-profile untrusted` is the hardened bundle (seccomp allowlist, `--cap-drop ALL`, `--read-only`). It is not a hypervisor: a kernel LPE is an escape, same class as Docker/Podman.

Python/Node **kern-sandbox** and **kern-mcp** wrap the same binary for agent-generated code.

# CAVEATS

Linux only (WSL2 is fine; no native Windows). Needs unprivileged user namespaces and cgroup v2. Image pull wants **curl** and **tar** on PATH (and often **pasta** / **uidmap** for non-root images). Bind-mounting `$HOME` is a trust decision, not a boundary. Not a CRI runtime and not a Docker Engine API clone.

# HISTORY

Apache-2.0 project by Alex / getkern. First published release v0.7.0. Install: `curl -fsSL https://raw.githubusercontent.com/getkern/kern/main/install.sh | sh` or `cargo install --git https://github.com/getkern/kern getkern --locked`.

# SEE ALSO

[podman](/man/podman)(1), [docker](/man/docker)(1), [bwrap](/man/bwrap)(1), [unshare](/man/unshare)(1)

# RESOURCES

```[Source code](https://github.com/getkern/kern)```

```[Documentation](https://github.com/getkern/kern/blob/main/docs/INSTALL.md)```

<!-- verified: 2026-08-26 -->
