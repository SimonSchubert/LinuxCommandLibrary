# TAGLINE

MicroVM compute driver for OpenShell sandboxes

# TLDR

Let the **gateway** start the driver (usual path)

```openshell-gateway --compute-driver vm --config [.cache/gateway-vm/gateway.toml]```

Listen on a **Unix socket** for local development

```openshell-driver-vm --bind-socket [/tmp/openshell-vm/run/compute-driver.sock] --allow-same-uid-peer --grpc-endpoint [http://127.0.0.1:18081] --default-image [nvcr.io/nvidia/base/ubuntu:24.04] --state-dir [/tmp/openshell-vm]```

Listen on **plaintext TCP** for local development

```openshell-driver-vm --allow-unauthenticated-tcp --bind-address [127.0.0.1:50061] --grpc-endpoint [http://127.0.0.1:18081] --default-image [nvcr.io/nvidia/base/ubuntu:24.04]```

Boot each sandbox with a **GPU** (VFIO; needs root and IOMMU)

```openshell-driver-vm --gpu --bind-socket [/tmp/openshell-vm/run/compute-driver.sock] --allow-same-uid-peer --grpc-endpoint [http://127.0.0.1:18081] --default-image [nvcr.io/nvidia/base/ubuntu:24.04] --state-dir [/tmp/openshell-vm]```

# SYNOPSIS

**openshell-driver-vm** **--bind-socket** _PATH_ **--grpc-endpoint** _URL_ [_options_]

**openshell-driver-vm** **--allow-unauthenticated-tcp** **--bind-address** _IP:PORT_ **--grpc-endpoint** _URL_ [_options_]

# DESCRIPTION

**openshell-driver-vm** is the libkrun compute driver for NVIDIA OpenShell. **openshell-gateway** spawns it and talks to it with the ComputeDriver gRPC service, normally over a Unix socket. **openshell-supervisor** stays a native host process and owns policy, credentials, and the network relay. **openshell-sandbox** runs as capability-free PID 1 inside each microVM and isolates the workload over virtio-vsock.

Each sandbox boots from a cached immutable bootstrap ext4 root disk plus a per-sandbox writable overlay disk. When the requested sandbox image is not the bootstrap image, the driver builds a read-only image disk inside a bootstrap VM and mounts that root as the sandbox lower directory. The binary embeds libkrun, libkrunfw, the guest OCI unpacker, the portable guest sandbox, and the kernel runtime.

The crate README marks this driver experimental. Release builds ship it as its own archive beside the gateway (Linux glibc and Apple Silicon). The gateway looks for the binary in the driver-dir setting of the VM driver table, then in **~/.local/libexec/openshell**, **/usr/libexec/openshell**, **/usr/local/libexec/openshell**, **/usr/local/libexec**, then next to the gateway binary.

With no hidden internal mode set, the process is the driver server. **--grpc-endpoint** is required. It is the URL the host supervisor uses to reach the gateway (host loopback is valid) and is never sent into the guest. The server stops on SIGINT or SIGTERM. It also tries to arm a parent-death guard so a killed gateway does not leave VM launchers behind.

**--bind-socket** is the production listen path. The socket directory is created mode **0700**, must be owned by the current user, and must not be a symlink. The socket itself is mode **0600**. A stale socket is removed only when it is a real socket owned by that user. The gateway normally passes a hidden peer-pid check; **--allow-same-uid-peer** skips that check for local development.

**--allow-unauthenticated-tcp** with **--bind-address** is the other development listen mode. It has no peer authentication. **--bind-address** alone is an error.

A relative **--state-dir** is made absolute at startup. The default directory name is **target/openshell-vm-driver**. It holds overlay disks, the image cache, console logs, and, when the gateway launches the driver, **run/compute-driver.sock**.

The driver refuses to start when both **--bootstrap-image** and **--default-image** are empty. **--bootstrap-image** falls back only to **--default-image**. **--guest-tls-ca** is required when **--grpc-endpoint** uses **https**. That file is the host supervisor's gateway CA and is not copied into the guest.

Caller-supplied driver config is disabled unless **--admission-config-json** turns it on. The default value is **{}**, which disables driver config and requires labels. GPU devices are temporarily exempt from those approval labels; GPU selection checks still run. **--enable-bind-mounts** is rejected while resource admission is enabled.

# PARAMETERS

**--grpc-endpoint** _URL_

> Required for the server. Where the host supervisor reaches the gateway. Same setting as the environment variable in the configuration list below.

**--bind-socket** _PATH_

> Unix socket for the ComputeDriver service. Required unless **--allow-unauthenticated-tcp** is set. With this flag, a hidden **--expected-peer-pid** is also required unless **--allow-same-uid-peer** is set.

**--allow-same-uid-peer**

> Accept any same-user peer on the Unix socket. For local development. Default is off.

**--allow-unauthenticated-tcp**

> Allow a TCP listener with no peer check. For local development. Default is off. Requires **--bind-address**.

**--bind-address** _IP:PORT_

> TCP address. Used only with **--allow-unauthenticated-tcp**.

**--default-image** _REF_

> Sandbox image when a create request omits one. Default is an empty string, which does not start the driver unless **--bootstrap-image** is also set to a real image.

**--bootstrap-image** _REF_

> Immutable bootstrap root disk. Falls back to **--default-image**. The driver refuses to start when both are empty.

**--state-dir** _DIR_

> Overlay disks, image cache, console logs, and the private socket directory. Default **target/openshell-vm-driver**. Relative paths are resolved at startup.

**--admission-config-json** _JSON_

> Operator admission policy. Default **{}** disables caller driver config and requires labels.

**--guest-tls-ca** _PATH_

> Gateway CA for an **https** **--grpc-endpoint**. Not copied into the guest.

**--guest-tls-cert** _PATH_, **--guest-tls-key** _PATH_

> Deprecated. Client certificates and private keys are rejected.

**--vcpus** _N_, **--mem-mib** _N_, **--overlay-disk-mib** _N_

> Per sandbox. Defaults **2** vCPUs, **2048** MiB of memory, and a **4096** MiB sparse overlay disk.

**--krun-log-level** _0-5_

> libkrun verbosity. Default **1**.

**--gpu**

> Enable VFIO GPU passthrough. Needs host IOMMU support, root, and a compatible image. **--gpu-mem-mib** defaults to **8192** and **--gpu-vcpus** to **4**.

**--sandbox-uid** _UID_, **--sandbox-gid** _GID_

> Guest sandbox user and group, when set.

**--enable-bind-mounts**

> Allow per-sandbox host directory shares (libkrun virtiofs). Default is off. Rejected while resource admission is enabled. The driver writes a mount manifest into the overlay; guest init mounts each share after it fixes ownership of the sandbox directory.

**--rootfs-tar-staging-dir** _DIR_, **--rootfs-tar-max-bytes** _N_

> Where rootfs tar streams are staged, and the maximum size accepted.

**--upstream-proxy** _URL_

> Corporate forward proxy for supervisor TLS egress. **http://host:port** or **https://host:port**. Host loopback works because this control path runs on the gateway host.

**--upstream-no-proxy** _LIST_

> Comma-separated bypass list for that proxy only. OpenShell policy still applies.

**--upstream-proxy-auth-file** _PATH_

> Root-owned gateway-host file containing **user:pass**. Staged into the per-sandbox overlay and removed with the sandbox. The secret is not logged and is not put on a guest command line.

**--upstream-proxy-auth-allow-insecure**

> Required with an auth file and an **http** proxy. Acknowledges that Basic authentication is cleartext on the hop to the proxy. Default is off.

**--upstream-proxy-connect-by-hostname**

> Send hostnames instead of checked IP addresses in CONNECT. Default is off.

**--upstream-proxy-ca-bundle** _PATH_

> PEM CA bundle trusted for the corporate proxy and for certificates re-signed by a TLS-intercepting proxy. Requires the proxy URL. The driver checks the bundle and stages it at a fixed non-secret path in the protected overlay.

**--provider-spiffe-workload-api-tcp-endpoint** _tcp:IP:port_

> Guest-reachable SPIFFE Workload API for provider token exchange. A host Unix socket is never exposed to the guest by itself.

**--provider-spiffe-allow-guest-tcp**

> Required acknowledgement that the Workload API listener is reachable from VM guests. Default is off.

**--log-level** _LEVEL_

> Driver log level. Default **info**.

**--otlp-endpoint** _URL_, **--gateway-name** _NAME_

> OTLP/gRPC collector and the gateway name attached to exported traces.

**--otlp-ocsf-endpoint** _URL_, **--otlp-ocsf-schema-version** _VERSION_

> OTLP/gRPC collector for supervisor OCSF events, and the schema version those events are downgraded to. The schema flag requires the endpoint flag.

# CONFIGURATION

Select this driver from the gateway with **--compute-driver vm**, or set the compute driver field to **vm** under the gateway table. VM settings live in the VM driver table. The gateway turns that table into this process's flags. A minimal file:

```
[openshell]
version = 2

[openshell.gateway]
compute_driver = "vm"

[openshell.drivers.vm]
default_image = "nvcr.io/nvidia/base/ubuntu:24.04"
grpc_endpoint = "http://127.0.0.1:18081"
state_dir = "/tmp/openshell-vm"
```

The driver-dir key in that table overrides the directory searched for this binary. Proxy, SPIFFE, GPU, and bind-mount keys in the same table match the flags above. Every present-but-invalid proxy value is fatal at startup. These proxy settings are operator-owned: they are not accepted from a sandbox template's driver config.

Flags also read environment variables:

```
--admission-config-json     OPENSHELL_DRIVER_ADMISSION_CONFIG_JSON
--bind-address              OPENSHELL_COMPUTE_DRIVER_BIND
--bind-socket               OPENSHELL_COMPUTE_DRIVER_SOCKET
--allow-unauthenticated-tcp OPENSHELL_COMPUTE_DRIVER_ALLOW_UNAUTHENTICATED_TCP
--allow-same-uid-peer       OPENSHELL_COMPUTE_DRIVER_ALLOW_SAME_UID_PEER
--log-level                 OPENSHELL_LOG_LEVEL
--otlp-endpoint             OPENSHELL_OTLP_ENDPOINT
--otlp-ocsf-endpoint        OPENSHELL_OTLP_OCSF_ENDPOINT
--otlp-ocsf-schema-version  OPENSHELL_OTLP_OCSF_SCHEMA_VERSION
--gateway-name              OPENSHELL_GATEWAY_NAME
--grpc-endpoint             OPENSHELL_GRPC_ENDPOINT
--default-image             OPENSHELL_SANDBOX_IMAGE
--bootstrap-image           OPENSHELL_VM_BOOTSTRAP_IMAGE
--state-dir                 OPENSHELL_VM_DRIVER_STATE_DIR
--guest-tls-ca              OPENSHELL_VM_TLS_CA
--guest-tls-cert            OPENSHELL_VM_TLS_CERT
--guest-tls-key             OPENSHELL_VM_TLS_KEY
--upstream-proxy            OPENSHELL_VM_UPSTREAM_PROXY
--upstream-no-proxy         OPENSHELL_VM_UPSTREAM_NO_PROXY
--upstream-proxy-auth-file  OPENSHELL_VM_UPSTREAM_PROXY_AUTH_FILE
--upstream-proxy-auth-allow-insecure OPENSHELL_VM_UPSTREAM_PROXY_AUTH_ALLOW_INSECURE
--upstream-proxy-connect-by-hostname OPENSHELL_VM_UPSTREAM_PROXY_CONNECT_BY_HOSTNAME
--upstream-proxy-ca-bundle  OPENSHELL_VM_UPSTREAM_PROXY_CA_BUNDLE
--provider-spiffe-workload-api-tcp-endpoint OPENSHELL_PROVIDER_SPIFFE_WORKLOAD_API_TCP_ENDPOINT
--provider-spiffe-allow-guest-tcp OPENSHELL_PROVIDER_SPIFFE_ALLOW_GUEST_TCP
--krun-log-level            OPENSHELL_VM_KRUN_LOG_LEVEL
--vcpus                     OPENSHELL_VM_DRIVER_VCPUS
--mem-mib                   OPENSHELL_VM_DRIVER_MEM_MIB
--overlay-disk-mib          OPENSHELL_VM_OVERLAY_DISK_MIB
--gpu                       OPENSHELL_VM_GPU
--gpu-mem-mib               OPENSHELL_VM_GPU_MEM_MIB
--gpu-vcpus                 OPENSHELL_VM_GPU_VCPUS
--sandbox-uid               OPENSHELL_VM_SANDBOX_UID
--sandbox-gid               OPENSHELL_VM_SANDBOX_GID
--enable-bind-mounts        OPENSHELL_VM_ENABLE_BIND_MOUNTS
--rootfs-tar-staging-dir    OPENSHELL_VM_ROOTFS_TAR_STAGING_DIR
--rootfs-tar-max-bytes      OPENSHELL_VM_ROOTFS_TAR_MAX_BYTES
```

# CAVEATS

The gateway starts this binary. A hand-written command line is the development path. The hidden flags **--internal-run-vm** and **--internal-prepare-image** are re-exec workers for the launcher, not operator commands. **--expected-peer-pid** is hidden and required with **--bind-socket** unless **--allow-same-uid-peer** is set.

**--openshell-endpoint** is rejected. Use **--grpc-endpoint**.

The flags **--https-proxy**, **--no-proxy**, **--proxy-auth-file**, **--proxy-auth-allow-insecure**, **--proxy-connect-by-hostname**, and **--proxy-ca-bundle** are accepted by the parser and are not read when the server starts. The proxy settings that reach the driver are the **--upstream-** flags.

Unauthenticated TCP and same-uid socket mode have no gateway peer check. Do not expose them.

A locally built macOS binary needs the Hypervisor entitlement (the crate's entitlements file) or libkrun cannot start a VM. Linux and Apple Silicon release archives are published separately; there is no Windows build of this driver.

GPU passthrough is VFIO. It needs IOMMU, root for bind and unbind, and a compatible image.

# HISTORY

**openshell-driver-vm** ships in NVIDIA **OpenShell** (Apache License 2.0). OpenShell was first published in **March 2026**. The **0.1.x** line is the stable release cadence. The VM driver is still marked experimental in its crate README.

# SEE ALSO

[openshell](/man/openshell)(1), [openshell-gateway](/man/openshell-gateway)(1), [openshell-supervisor](/man/openshell-supervisor)(1), [openshell-sandbox](/man/openshell-sandbox)(1), [openshell-vm-init](/man/openshell-vm-init)(1), [openshell-prover](/man/openshell-prover)(1), [openshell-driver-docker](/man/openshell-driver-docker)(1), [openshell-driver-podman](/man/openshell-driver-podman)(1), [openshell-driver-kubernetes](/man/openshell-driver-kubernetes)(1)

# RESOURCES

```[Source code](https://github.com/NVIDIA/OpenShell)```

```[Homepage](https://www.nvidia.com/en-us/ai/openshell/)```

```[Documentation](https://github.com/NVIDIA/OpenShell/blob/main/crates/openshell-driver-vm/README.md)```

<!-- verified: 2026-10-28 -->
