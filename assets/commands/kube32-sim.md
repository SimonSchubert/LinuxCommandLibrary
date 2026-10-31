# TAGLINE

Host simulator for a Kubernetes-compatible ESP32-S3 cluster

# TLDR

Build the **host simulator**

```cmake -S . -B build && cmake --build build -j8```

Run a **standalone** cluster (control plane plus one in-process worker)

```kube32-sim --ingress-port [8080] --pod-port [17000]```

Point **kubectl** at the simulated API

```export KUBECONFIG=[path/to/build/kubeconfig]```

```kubectl config set-cluster kube32-sim --server=http://127.0.0.1:6443```

Start a **control-plane** process with no in-process workers

```kube32-sim --role control-plane --workers "" --ingress-port [8080]```

Start a **worker** that joins over mDNS (or a URL)

```kube32-sim --role worker --join auto --node-name [esp32-node-02]```

Serve the API with **TLS** next to plain HTTP

```kube32-sim --tls --token [secret]```

Model a board **without PSRAM** (Cardputer-sized heap)

```kube32-sim --psram 0 --heap-budget 51Ki```

# SYNOPSIS

**kube32-sim** [_options_]

**kube32-sim** **-h** | **--help**

# PARAMETERS

**--role** **standalone**|**control-plane**|**worker**
> Process role. Default **standalone**: one process runs the API server, its kubelet, and one in-process worker.

**--port** _port_
> API server port. Default **6443**.

**--join** _url_
> Worker: API URL to register with. **auto** (and an omitted URL) uses mDNS.

**--token** _token_
> API bearer token. Also read from the **KUBE32-API-TOKEN** environment variable.

**--tls**
> Serve HTTPS on **--port** next to plain HTTP. Key and certificate are stored under `<data-dir>/kube32/tls/`.

**--egress-ca** _file_
> Extra PEM roots that pods' `https://` calls trust, besides the host store. Control-plane and standalone roles.

**--data-dir** _dir_
> Object store and node-storage root. Default `/tmp/kube32_<node>_data`. Firmware slots are files under this directory.

**--enable-flash**
> Persist the object-store journal as `<data-dir>/kube32/store/journal.img`.

**--node-name** _name_
> Control-plane or standalone node name. Default **esp32-master**.

**--kubelet-name** _name_
> Kubelet name in **standalone** mode. Default **esp32-node-01**.

**--workers** _a,b,..._
> In-process worker names in **standalone** mode. Default **esp32-node-02**. Pass an empty string for none.

**--board** _board_
> `kube32.io/board` label of this process's kubelet. Default **generic**.

**--worker-board** _board_
> Board label of in-process workers. Default **cardputer**.

**--node-ip** _ip_
> Pod IP advertised to other nodes. Default **127.0.0.1**. Use a LAN address so physical boards can reach simulator pods.

**--psram** _size_
> PSRAM pool to model (`8Mi`, `1284Ki`, …). **0** models a board without PSRAM. Default **1284Ki** for control-plane/standalone, none for workers.

**--heap-budget** _size_
> General heap for pods and the system when **--psram 0**. Default **51Ki**.

**--ingress-port** _port_
> Ingress HTTP port. Default off (`0`).

**--pod-port** _port_
> Pod HTTP server port on every node. Default **7000**.

**--node-id** _id_
> Node id for UDP IPC. Default **0**.

**--ipc-port** _port_
> UDP port for IPC. Default **7400** plus **--node-id**.

**--peer** _name:id:port_
> Static UDP IPC peer. Repeatable.

**--lease-interval** _ms_
> Node heartbeat interval. Default **5000**.

**--not-ready-timeout** _ms_
> Mark a node NotReady after this many milliseconds without a heartbeat. Default **15000**.

**--eviction-timeout** _ms_
> Taint the node `unreachable:NoExecute` after this many milliseconds without a heartbeat. Default **30000**.

**--reconcile-interval** _ms_
> Controller and scheduler loop interval. Default **1000**.

**-h**, **--help**
> Print options with defaults and exit 0.

# DESCRIPTION

**kube32-sim** is the Linux/macOS host build of **Kube32**, a Kubernetes-compatible control plane and WebAssembly pod runtime aimed at ESP32-S3 boards. The same sources flash to hardware; this binary runs nodes as ordinary host processes so **kubectl** and **k9s** can drive a cluster without a board.

With no flags, one process is a standalone cluster: the API server on port 6443, a kubelet named **esp32-node-01**, and one in-process worker named **esp32-node-02**. Pods are wasm3 modules. Request-handler pods export k32 handle; entry-point pods export start, app main, or main. Pods whose k32 tick export returns greater than zero are ticked every 10 ms; others at 1 Hz, matching the boards.

**--role control-plane** and **--role worker** split that into several processes (or a process plus a physical board). Workers join with **--join** or mDNS. Optional **--tls** serves HTTPS beside HTTP. **--ingress-port** turns on the Ingress controller.

CMake builds the binary as `build/kube32-sim` from the host main source. OpenSSL 3 enables simulator TLS; without it **--tls** is unavailable.

# CONFIGURATION

**KUBE32-API-TOKEN**
> Bearer token used when **--token** is omitted.

**KUBE32-SD-ROOT**
> When set, the simulated microSD (node storage) is this directory. Otherwise **--data-dir** stands in for internal flash and card storage.

The generated kubeconfig for the in-tree build lives at `build/kubeconfig`.

# CAVEATS

Unknown flags, or a flag missing its value, print usage on stderr and exit **2**.

The simulator is a 64-bit host build. wasm3 runtime structures are about 2.3 times larger than on the 32-bit ESP32-S3. A pod set that fits with **--psram 0** fits on the board; the reverse is not guaranteed.

This is not an instruction-level ESP32 emulator. Firmware still has to be built and flashed with PlatformIO / **esptool**. Use **esp32sim** for that kind of board model, and **kube32-cli** to compile, check, and ship Wasm pods.

# SEE ALSO

[kube32-cli](/man/kube32-cli)(1), [kubectl](/man/kubectl)(1), [k9s](/man/k9s)(1), [cmake](/man/cmake)(1), [pio](/man/pio)(1), [esptool](/man/esptool)(1), [esp32sim](/man/esp32sim)(1)

# RESOURCES

```[Source code](https://github.com/arterialist/kube32)```

```[Documentation](https://arterialist.github.io/kube32/)```

<!-- verified: 2026-10-31 -->
