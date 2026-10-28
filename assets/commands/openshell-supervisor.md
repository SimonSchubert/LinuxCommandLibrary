# TAGLINE

Supervise one OpenShell sandbox, or a pool of them

# TLDR

Probe a supervisor **readiness socket**

```openshell-supervisor health --socket [/run/openshell/supervisor.sock]```

Run a **shared** pool member (Unix only)

```openshell-supervisor --mode shared --gateway-endpoint [https://gw.example:17670] --address [0.0.0.0:17771] --token-file [/var/lib/openshell/supervisor.token] --runtime-listen [0.0.0.0:17772] --session-root [/var/lib/openshell/sessions] --pool-member-id [member-a] --pool-advertise-ip [10.0.0.8]```

Run only the **HTTP and CONNECT proxy**

```openshell-supervisor --role network-proxy --listen [127.0.0.1:8080] --tls-dir [/var/lib/openshell/proxy-tls] --policy-rules [rules.yaml] --policy-data [data.yaml]```

Ask the sandbox for its **config** (inside a running sandbox)

```openshell-supervisor debug-rpc get-sandbox-config --sandbox [my-sandbox]```

# SYNOPSIS

**openshell-supervisor** [**--mode** _dedicated_|_shared_] [**--role** _isolation-backend_|_network-proxy_] [_options_] [_command_...]

**openshell-supervisor** **health** **--socket** _PATH_

**openshell-supervisor** **debug-rpc** _command_

# DESCRIPTION

**openshell-supervisor** is the OpenShell process that admits policy, holds provider credentials, and drives the isolation backend for a sandbox. **openshell-gateway** places work on it. Enforcement of the workload runs through the backend the supervisor attaches, not in the **openshell** CLI.

**--mode dedicated** (the default) supervises one sandbox generation. The compute driver normally starts this process and passes the backend name, launch files, and the workload. With no command on the argv, the workload comes from the main-process spec in the environment, or from a built-in scratch command.

**--mode shared** hosts many sandbox instances in one Unix process. It is one member of the gateway's supervisor pool: it dials the gateway over HTTPS with a token file, accepts a health probe on **--address**, and listens for runtime Sandbox Protocol connections on **--runtime-listen**. Each instance gets its own runtime and a private directory under **--session-root**. This mode is refused on non-Unix platforms.

**--role isolation-backend** (the default) attaches a backend and starts the workload. **--role network-proxy** does not start a workload. It serves a loopback HTTP and CONNECT proxy from **--listen**, with a generated CA under **--tls-dir**, and requires both policy files.

**health** checks the private readiness socket and does not start supervision. **debug-rpc** is a one-shot gRPC probe meant to be run inside a sandbox (its help text labels the entry openshell-sandbox). It does not start a supervisor.

Logs go to the standard error. The process also tries to open **/var/log** for rotation and keeps going on stderr if that directory is not writable.

# PARAMETERS

**--mode** _dedicated_|_shared_

> **dedicated** (default): one sandbox generation. **shared**: a pool member on Unix. Shared mode requires **--gateway-endpoint** (an **https** URL), **--address**, **--token-file**, **--runtime-listen**, **--session-root**, **--pool-member-id**, and **--pool-advertise-ip**. Those shared flags are an error in dedicated mode.

**--role** _isolation-backend_|_network-proxy_

> **isolation-backend** (default) needs **--backend-descriptor-file** and **--auth-bundle-file**, and the driver must name the admitted backend in the environment. **network-proxy** needs **--policy-rules** and **--policy-data**. It rejects workload flags (**--workdir**, **-i**, **--timeout**, and a command) and sandbox identity, gateway, runtime, and process-control flags.

**--gateway-endpoint** _URL_

> Gateway the shared supervisor dials. Must start with **https://**.

**--address** _IP:PORT_

> TCP health listener for shared mode. It accepts a connection and closes it. It carries no control traffic.

**--token-file** _PATH_

> File with the supervisor token for the shared assignment stream. Re-read on every connection, so a renewed token needs no restart.

**--runtime-listen** _IP:PORT_

> Where this member accepts Sandbox Protocol connections from runtimes.

**--session-root** _DIR_

> Private directory for shared-mode instance files.

**--pool-member-id** _ID_

> Stable id of this process in the gateway's supervisor pool. One process serves one member.

**--pool-advertise-ip** _IP_

> Address other members use to reach this member's runtimes. The **--runtime-listen** port is appended.

**--backend-descriptor-file** _PATH_

> Backend descriptor payload for **isolation-backend**.

**--isolation-backends-file** _PATH_

> Operator endpoint registrations (JSON), outside the workload mount.

**--boundary-launch-file** _PATH_

> Driver launch identity and generation-pinned TLS (JSON). Required for a registered external backend. Larger than **1 MiB** is rejected.

**--auth-bundle-file** _PATH_

> Gateway credentials for this sandbox launch (JSON). Required for **isolation-backend**.

**--listen** _IP:PORT_

> Loopback HTTP and CONNECT listener for **network-proxy** only.

**--tls-dir** _DIR_

> Directory for the proxy CA and trust bundle. **network-proxy** only.

**--policy-rules** _FILE_, **--policy-data** _FILE_

> Policy inputs. Both are required for **network-proxy**.

_command_...

> Workload argv (everything after the options). Omitted: use the main-process spec in the environment, or the scratch command.

**-w**, **--workdir** _DIR_

> Workload working directory.

**-t**, **--timeout** _SECONDS_

> Workload timeout in seconds (default **0**).

**-i**, **--interactive**

> Request a TTY for the workload command. Ignored when the command comes from the main-process spec; that spec has its own TTY bit.

**--sandbox-id** _ID_, **--sandbox** _NAME_

> Sandbox identity for telemetry and gateway calls.

**--openshell-endpoint** _URL_

> Gateway endpoint for this sandbox.

**--ssh-socket-path** _PATH_

> SSH socket for the sandbox.

**--log-level** _LEVEL_

> Console filter when no tracing default filter is already set (default **warn**).

**--otlp-endpoint** _URL_

> OTLP/gRPC collector for traces. Export is skipped, with a warning, if it cannot start.

**--otlp-ocsf-endpoint** _URL_

> OTLP/gRPC collector for OCSF events.

**--otlp-ocsf-schema-version** _VERSION_

> Schema version exported events are downgraded to.

**--gateway-name** _NAME_

> Gateway name recorded on telemetry.

**--health-socket-path** _PATH_

> Private readiness socket, created after the boundary and the gateway are attached. Not valid for **network-proxy**.

**--health-port** _PORT_

> TCP port that accepts connections only while the supervisor is ready.

**--upstream-proxy** _URL_

> Upstream HTTPS proxy.

**--upstream-proxy-dial-ip** _IP_

> Address to dial for that proxy, pinned by the driver.

**--upstream-no-proxy** _LIST_

> Hosts that skip the proxy.

**--upstream-proxy-auth-file** _PATH_

> Proxy credentials file.

**--upstream-proxy-auth-allow-insecure**

> Allow insecure proxy authentication.

**--upstream-proxy-connect-by-hostname**

> Send the hostname, not the dial IP, in CONNECT.

**--upstream-proxy-ca-bundle** _PATH_

> PEM CA bundle for the corporate proxy.

**--additional-ca-bundle** _PATH_

> PEM CA bundle for direct (not proxied) inspected HTTPS. Independent of the proxy bundle.

**health** **--socket** _PATH_

> Check the readiness socket and exit. Does not parse supervisor flags.

**debug-rpc** **get-sandbox-config** **--sandbox** _NAME_

> Call GetSandboxConfig. Prints version, policy hash, and config revision.

**debug-rpc** **refresh**

> Renew the gateway JWT.

**debug-rpc** **show-token**

> Print a token fingerprint and expiry, not the bearer token.

**debug-rpc** **show-principal**

> Print decoded JWT claims. The signature is not checked here.

**--main-exit-marker** _PATH_

> Hidden. Absolute path the driver uses to observe workload exit. A relative path is an error.

**--parent-liveness-stdin**

> Hidden. On Unix, stdin is a driver liveness pipe: EOF exits the process. Refused on other platforms.

# CONFIGURATION

Many flags also read an environment variable. A tracing default filter already set in the environment replaces **--log-level**. Dedicated **isolation-backend** refuses to start unless the admitted backend name is set. Shared mode refuses to start unless the TLS CA variable is set.

```
--log-level                 OPENSHELL_LOG_LEVEL
--sandbox-id                OPENSHELL_SANDBOX_ID
--sandbox                   OPENSHELL_SANDBOX
--openshell-endpoint        OPENSHELL_ENDPOINT
--policy-rules              OPENSHELL_POLICY_RULES
--policy-data               OPENSHELL_POLICY_DATA
--ssh-socket-path           OPENSHELL_SSH_SOCKET_PATH
--otlp-endpoint             OPENSHELL_OTLP_ENDPOINT
--otlp-ocsf-endpoint        OPENSHELL_OTLP_OCSF_ENDPOINT
--otlp-ocsf-schema-version  OPENSHELL_OTLP_OCSF_SCHEMA_VERSION
--gateway-name              OPENSHELL_GATEWAY_NAME
--health-socket-path        OPENSHELL_HEALTH_SOCKET_PATH
health --socket             OPENSHELL_HEALTH_SOCKET_PATH
--pool-member-id            OPENSHELL_SUPERVISOR_POOL_MEMBER_ID
--pool-advertise-ip         OPENSHELL_SUPERVISOR_POOL_ADVERTISE_IP
admitted backend (required) OPENSHELL_ADMITTED_ISOLATION_BACKEND
shared-mode TLS CA          OPENSHELL_TLS_CA
workload if argv is empty   OPENSHELL_MAIN_PROCESS_SPEC
container image (optional)  OPENSHELL_CONTAINER_IMAGE
```

**debug-rpc** needs the endpoint variable, plus a sandbox token, a token file, or a Kubernetes service-account token file, so the usual token path can build a JWT.

```
OPENSHELL_ENDPOINT
OPENSHELL_SANDBOX_TOKEN
OPENSHELL_SANDBOX_TOKEN_FILE
OPENSHELL_K8S_SA_TOKEN_FILE
```

# CAVEATS

This binary is started by the gateway or the compute driver more often than by hand. A dedicated **isolation-backend** command line without the launch files and the admitted-backend variable exits with an error.

**network-proxy** does not launch or manage a workload. **shared** mode does not run on Windows or macOS.

**debug-rpc show-principal** does not verify the JWT signature. **show-token** does not print the bearer. The help text calls this entry openshell-sandbox even when the executable name is **openshell-supervisor**.

# HISTORY

**openshell-supervisor** ships in NVIDIA **OpenShell** (Apache License 2.0), first published in **March 2026**. It is the policy and workload supervisor beside **openshell-gateway**; the **openshell** CLI does not replace it.

# INSTALL

```aur: yay -S openshell```

```brew: brew install openshell```

```nix: nix profile install nixpkgs#openshell```

<!-- packages: 2026-10-27 -->

# SEE ALSO

[openshell](/man/openshell)(1), [openshell-gateway](/man/openshell-gateway)(1), [openshell-prover](/man/openshell-prover)(1), [openshell-driver-docker](/man/openshell-driver-docker)(1), [openshell-driver-podman](/man/openshell-driver-podman)(1), [openshell-driver-kubernetes](/man/openshell-driver-kubernetes)(1), [openshell-driver-vm](/man/openshell-driver-vm)(1), [docker](/man/docker)(1), [podman](/man/podman)(1)

# RESOURCES

```[Source code](https://github.com/NVIDIA/OpenShell)```

```[Homepage](https://www.nvidia.com/en-us/ai/openshell/)```

```[Documentation](https://github.com/NVIDIA/OpenShell/blob/main/crates/openshell-supervisor/README.md)```

<!-- verified: 2026-10-27 -->
