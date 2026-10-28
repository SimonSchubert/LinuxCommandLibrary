# TAGLINE

Docker compute driver for OpenShell sandboxes

# TLDR

Let the **gateway** start the driver (usual path)

```openshell-gateway --compute-driver docker --config [~/.config/openshell/gateway.toml]```

Listen on a **Unix socket** with an explicit Docker API socket

```openshell-driver-docker --bind-socket [/tmp/openshell-docker/compute-driver.sock] --config [/etc/openshell/docker-driver.toml] --gateway-bind [127.0.0.1:17670]```

Export traces and name the gateway

```openshell-driver-docker --bind-socket [/tmp/openshell-docker/compute-driver.sock] --config [/etc/openshell/docker-driver.toml] --gateway-bind [10.0.0.8:17670] --otlp-endpoint [http://127.0.0.1:4317] --gateway-name [lab]```

# SYNOPSIS

**openshell-driver-docker** **--bind-socket** _PATH_ **--config** _FILE_ [_options_]

# DESCRIPTION

**openshell-driver-docker** is the Docker compute driver for NVIDIA OpenShell. **openshell-gateway** can run the same driver in-process, or it can connect to this binary over a Unix socket (**--compute-driver-socket** on the gateway). The process serves the ComputeDriver gRPC API. It stops on SIGINT or SIGTERM.

Each sandbox is two containers. **openshell-sandbox** is PID 1 in the workload container: process tree, seccomp notification broker, Landlock baseline, and loopback forwarding. **openshell-supervisor** is a companion container: gateway session, policy, credentials, and approved egress. The workload network mode is **none**. The supervisor network mode defaults to **host**; **bridge** puts the supervisor on Docker's bridge network, and **auto** also selects host. Both containers are non-root, request no capabilities, and set no-new-privileges.

The driver talks to Docker through **bollard**. When the config file leaves the Docker socket unset, an explicitly selected Docker driver falls back to **/var/run/docker.sock** after probing the usual local sockets. Trusted **openshell-sandbox** and **openshell-supervisor** bytes are copied from the configured images through the Docker archive API, so the same path works for a local, remote, or VM-backed daemon.

**--bind-socket** is required. The socket is private to the current user (directory mode **0700**, socket mode **0600**) and accepts only a same-user peer. **--config** is required. It is a TOML file of the driver table. After that file is read, **--admission-config-json** replaces the admission fields, and **--sandbox-runtime-image** and **--supervisor-image** replace those image fields when they are set. OpenTelemetry and the gateway name from the command line are applied on top of the file; the file cannot set them.

Caller driver config is off unless admission policy turns it on. Existing volumes need administrator approval labels. Raw bind mounts have no label resolver and are denied while admission is enforced. GPU devices are temporarily exempt. Host bind mounts also need the config file's bind-mount opt-in.

# PARAMETERS

**--bind-socket** _PATH_

> Required. Unix socket for the ComputeDriver service. The directory must be owned by the current user and must not be a symlink.

**--config** _FILE_

> Required. TOML file for this driver (a serialized Docker compute config). Unknown fields are rejected.

**--admission-config-json** _JSON_

> Operator admission policy. When set, replaces the allow-driver-config and resource-admission fields from **--config**.

**--sandbox-runtime-image** _REF_

> OCI image that contains the **openshell-sandbox** binary. Overrides the file.

**--supervisor-image** _REF_

> OCI image that contains the **openshell-supervisor** binary. Overrides the file.

**--gateway-bind** _IP:PORT_

> Gateway listener used to derive the supervisor endpoint. Default **127.0.0.1:50051**. Port **0** is rejected.

**--log-level** _LEVEL_

> Driver log level. Default **info**.

**--otlp-endpoint** _URL_, **--gateway-name** _NAME_

> OTLP/gRPC collector and the gateway name attached to exported traces. Also forwarded to supervisors.

**--otlp-ocsf-endpoint** _URL_, **--otlp-ocsf-schema-version** _VERSION_

> OTLP/gRPC collector for supervisor OCSF events, and the schema version those events are downgraded to. The schema flag requires the endpoint flag.

# CONFIGURATION

Select this driver from the gateway with **--compute-driver docker**, or set the compute driver field to **docker**. Docker settings live in the Docker driver table. A minimal file for **--config**:

```
default_image = "nvcr.io/nvidia/base/ubuntu:24.04"
image_pull_policy = "if_not_present"
supervisor_network_mode = "host"
sandbox_label = "default"
```

When the socket path is omitted, the driver probes local Docker sockets and otherwise uses **/var/run/docker.sock**. The default sandbox image is **nvcr.io/nvidia/base/ubuntu:24.04**. The pull policy default is if not present (**newer** is not valid for Docker). The sandbox PID limit defaults to **2048**; explicit zero is invalid. Bind mounts default to off. Supervisor network mode defaults to **host**.

Corporate proxy keys in that file are operator-owned. Sandbox environment and per-sandbox driver config cannot override them. A CA bundle requires a proxy URL. The driver copies credential and CA bytes into the supervisor-only volume; it does not bind-mount the gateway-host files.

```
https_proxy
no_proxy
proxy_auth_file
proxy_auth_allow_insecure
proxy_connect_by_hostname
proxy_ca_bundle
```

Client certificate fields in the file are deprecated and must not be set. Supervisors authenticate with a bearer token and, for HTTPS, the gateway CA only.

Flags also read environment variables:

```
--admission-config-json   OPENSHELL_DRIVER_ADMISSION_CONFIG_JSON
--bind-socket             OPENSHELL_COMPUTE_DRIVER_SOCKET
--config                  OPENSHELL_DOCKER_DRIVER_CONFIG
--sandbox-runtime-image   OPENSHELL_SANDBOX_RUNTIME_IMAGE
--supervisor-image        OPENSHELL_SUPERVISOR_IMAGE
--gateway-bind            OPENSHELL_GATEWAY_BIND
--log-level               OPENSHELL_LOG_LEVEL
--otlp-endpoint           OPENSHELL_OTLP_ENDPOINT
--otlp-ocsf-endpoint      OPENSHELL_OTLP_OCSF_ENDPOINT
--otlp-ocsf-schema-version OPENSHELL_OTLP_OCSF_SCHEMA_VERSION
--gateway-name            OPENSHELL_GATEWAY_NAME
```

# CAVEATS

The gateway starts this binary for an external driver. A hand-written command line is the development path. The Unix socket has no TCP listen mode.

**--gateway-bind** defaults to **127.0.0.1:50051**, which is not the gateway's own default port **17670**. Set it to the address the supervisor can reach.

Host networking on Docker Desktop has to be enabled in Docker settings. Bridge mode cannot use a loopback or unspecified gateway endpoint. A native Linux gateway that listens only on loopback cannot serve a bridge supervisor.

The workload image must resolve to one exact non-root uid and gid. Root and unresolved names are rejected. Image volumes and mounts must not cover the workspace or the **/.openshell** control tree.

# HISTORY

**openshell-driver-docker** ships in NVIDIA **OpenShell** (Apache License 2.0). OpenShell was first published in **March 2026**. The **0.1.x** line is the stable release cadence.

# SEE ALSO

[openshell](/man/openshell)(1), [openshell-gateway](/man/openshell-gateway)(1), [openshell-supervisor](/man/openshell-supervisor)(1), [openshell-sandbox](/man/openshell-sandbox)(1), [openshell-driver-podman](/man/openshell-driver-podman)(1), [openshell-driver-kubernetes](/man/openshell-driver-kubernetes)(1), [openshell-driver-vm](/man/openshell-driver-vm)(1), [docker](/man/docker)(1)

# RESOURCES

```[Source code](https://github.com/NVIDIA/OpenShell)```

```[Homepage](https://www.nvidia.com/en-us/ai/openshell/)```

```[Documentation](https://github.com/NVIDIA/OpenShell/blob/main/crates/openshell-driver-docker/README.md)```

<!-- verified: 2026-10-28 -->
