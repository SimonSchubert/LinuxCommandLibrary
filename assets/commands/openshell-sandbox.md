# TAGLINE

In-workload isolation boundary for an OpenShell sandbox

# TLDR

Run as **PID 1** with a one-use bootstrap file (usual production path)

```openshell-sandbox --bootstrap [/.openshell/state/bootstrap]```

Raise the **log level** for one run

```openshell-sandbox --bootstrap [/.openshell/state/bootstrap] --log-level debug```

Copy this binary onto a **shared volume** (init containers)

```openshell-sandbox copy-self [/var/lib/openshell/runtime/openshell-sandbox]```

Stage Kubernetes **bootstrap secrets** into private writable volumes

```openshell-sandbox bootstrap```

Seed the **persistent workspace** from the agent image

```openshell-sandbox seed-workspace```

Print a JSON **kernel-qualification** report

```openshell-sandbox capability-probe```

Print the **version**

```openshell-sandbox --version```

# SYNOPSIS

**openshell-sandbox** **--bootstrap** _PATH_ [**--log-level** _LEVEL_]

**openshell-sandbox** **copy-self** _DEST_

**openshell-sandbox** **bootstrap**

**openshell-sandbox** **seed-workspace**

**openshell-sandbox** **capability-probe**

# DESCRIPTION

**openshell-sandbox** is the capability-free isolation boundary that NVIDIA OpenShell places inside each sandbox. Compute drivers start it as PID 1 in the workload container or microVM. It is not the **openshell** CLI. **openshell-supervisor** stays on the host (or in a companion container), holds gateway credentials, and evaluates policy. This process never receives a gateway JWT.

The default invocation is Linux-only. It reads a protected one-use bootstrap file (**--bootstrap**), actively qualifies the kernel primitives the boundary needs (zero capabilities, no-new-privileges, Landlock, seccomp notifications, loopback socket confinement, DNS relay bind), then runs the workload behind that boundary. The sandbox consumes and unlinks the bootstrap material before workload code starts.

Init containers invoke the named helpers instead of `sh` or `cp`. **copy-self** writes this executable to a destination path. **bootstrap** stages a Kubernetes projected Secret into private tmpfs. **seed-workspace** copies the agent image workspace once. **capability-probe** prints the same qualification report the default path requires, as JSON, and does not start a workload.

# COMMANDS

**copy-self** _DEST_

> Copy the running executable to _DEST_ and set mode **0755** on Unix. If _DEST_ is a directory, the source file name is used inside it. Parent directories are created as needed. Init containers use this so they do not depend on `cp`.

**bootstrap**

> Kubernetes init helper. Linux only. No extra arguments. Must run as a non-root UID and GID. Copies this binary to **/.openshell/runtime/openshell-sandbox** (mode **0500**) and copies **boundary.json**, **tls.crt**, and **tls.key** from **/.openshell/bootstrap-input** into **/.openshell/state/bootstrap** (directory mode **0700**, files **0600**). The projected Secret stays mounted only in the init container. Extra arguments are an error.

**seed-workspace**

> Kubernetes init helper. Linux only. No extra arguments. Copies **/sandbox** into **/mnt/openshell-workspace** unless **.openshell-initialized** already exists there. Directories are created mode **0700**. Regular files keep an execute bit when the source had one, otherwise **0600**. Symlinks are preserved. Extra arguments are an error.

**capability-probe**

> Linux only. Qualify the current process as a capability-free sandbox and print one JSON object (`qualified`, UID/GID, Landlock ABI, seccomp and socket probes). Requires a non-root UID and GID, all capability sets zero, **no_new_privs=1**, and **net.ipv4.ip_unprivileged_port_start=0**. Does not start a workload.

# PARAMETERS

These flags apply to the default boundary path. Named helpers above parse argv themselves and reject clap flags.

**--bootstrap** _PATH_

> Required. Protected one-use bootstrap configuration staged by the compute driver.

**--log-level** _LEVEL_

> Console filter: **trace**, **debug**, **info**, **warn** (default), or **error**. Also read from **OPENSHELL_LOG_LEVEL**. Ignored when a tracing default filter is already set in the environment.

**-V**, **--version**

> Print the crate version and exit.

# CONFIGURATION

**/.openshell/bootstrap-input**
> Kubernetes projected Secret for **bootstrap**. Expected files: **boundary.json**, **tls.crt**, **tls.key**.

**/.openshell/runtime/openshell-sandbox**
> Destination of the staged sandbox binary after **bootstrap** (mode **0500**).

**/.openshell/state/bootstrap**
> Private bootstrap bundle after **bootstrap**. The long-lived sandbox consumes and unlinks it.

**/sandbox**
> Agent-image workspace copied by **seed-workspace**.

**/mnt/openshell-workspace**
> Persistent workspace volume. **seed-workspace** writes **.openshell-initialized** here after a successful copy.

**OPENSHELL_LOG_LEVEL**
> Default for **--log-level** on the boundary path.

# CAVEATS

The default path, **bootstrap**, **seed-workspace**, and **capability-probe** require Linux. On other platforms the binary reports that **openshell-sandbox** requires Linux, except **copy-self**, which still copies the executable.

Do not run **bootstrap** or **capability-probe** as root. Both abort when the effective UID or GID is 0.

The compute driver normally starts this process. Operators copy trusted bytes from the sandbox-runtime image rather than from an untrusted workload image.

Internal probe helpers (**capability-probe-launch**, **capability-socket-child**, **capability-landlock-child**, **launch-capability-free**) exist for conformance tests. They are not operator commands.

# INSTALL

```aur: yay -S openshell```

```brew: brew install openshell```

```nix: nix profile install nixpkgs#openshell```

<!-- packages: 2026-10-28 -->

# SEE ALSO

[openshell](/man/openshell)(1), [openshell-gateway](/man/openshell-gateway)(1), [openshell-supervisor](/man/openshell-supervisor)(1), [openshell-prover](/man/openshell-prover)(1), [openshell-driver-docker](/man/openshell-driver-docker)(1), [openshell-driver-podman](/man/openshell-driver-podman)(1), [openshell-driver-kubernetes](/man/openshell-driver-kubernetes)(1), [openshell-driver-vm](/man/openshell-driver-vm)(1)

# RESOURCES

```[Source code](https://github.com/NVIDIA/OpenShell)```

```[Homepage](https://www.nvidia.com/en-us/ai/openshell/)```

```[Documentation](https://docs.nvidia.com/openshell/latest/index.html)```

<!-- verified: 2026-10-28 -->
