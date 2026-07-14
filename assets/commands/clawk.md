# TAGLINE

disposable, network-restricted Linux VMs for AI coding agents

# TLDR

**Boot** a sandbox for the current project and attach Claude

```clawk```

**Attach** a shell or another agent in the same sandbox

```clawk run shell
clawk run codex```

**Stop** the VM (repo and agent state persist)

```clawk down```

**Reattach** later (boots if stopped)

```clawk attach```

**Destroy** the disposable VM (host-side conversations kept)

```clawk destroy```

**Allow** outbound hosts or **forward** a guest port

```clawk network allow [sandbox] [api.example.com]
clawk forward add [sandbox] [3000]```

# SYNOPSIS

**clawk** [_command_] [_options_] [_args_]

# DESCRIPTION

**clawk** runs coding agents (Claude Code, Codex, OpenCode, or a plain shell) inside a disposable Linux microVM instead of on the host. The project directory is mounted into the guest; outbound network access is allow-listed; host secrets and the rest of the filesystem stay outside the VM.

On macOS (Apple silicon, macOS 14+) it uses Virtualization.framework; Linux support via Firecracker is experimental. First boot builds a rootfs from an OCI image; later boots are fast copy-on-write clones. Idle VMs can release memory and suspend.

Optional **clawk.mod** project config sets CPU, memory, image, network allows, port forwards, env, and hooks. Ticket mode (**clawk work**) can create multi-repo worktrees and open coordinated PRs with **clawk pr**.

# PARAMETERS

**run** _agent_
> Start or reuse the sandbox and attach **claude**, **codex**, **opencode**, or **shell**

**attach** / **down** / **up** / **destroy**
> Lifecycle: reattach, stop, boot, or remove the VM

**network** **allow**|**denials** ...
> Manage the per-sandbox egress allow-list and inspect blocked destinations

**forward** **add** ...
> Publish a guest port on localhost

**list** / **status**
> List sandboxes or show status (**--json** for scripts)

**--safe**
> Attach without agent permission-bypass flags

# CAVEATS

Pre-1.0 software; expect breaking changes. Primary support is macOS Apple silicon. Anything mounted or allow-listed is exposed to the agent (including git push via forwarded ssh-agent). Hypervisor escapes are out of scope.

# SEE ALSO

[docker](/man/docker)(1), [lima](/man/lima)(1)

# RESOURCES

```[Source code](https://github.com/clawkwork/clawk)```

```[Documentation](https://github.com/clawkwork/clawk/tree/main/docs)```

<!-- verified: 2026-07-14 -->
