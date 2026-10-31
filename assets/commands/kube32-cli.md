# TAGLINE

Build, check, deploy, and ship WebAssembly pods for Kube32

# TLDR

**Build** a C, Rust, or AssemblyScript app directory to Wasm and check it

```kube32-cli build [path/to/app]```

**Validate** a module against the Kube32 ABI

```kube32-cli check [app.wasm]```

**Deploy** a module as a Pod (inline base64, no reflash)

```kube32-cli deploy [app.wasm] --name [echo] --dry-run```

```kube32-cli deploy [app.wasm] --name [echo] --replace```

**Embed** a checked module in `images/` for the next firmware build

```kube32-cli embed [app.wasm] --name [echo]```

Copy a module onto a node's **microSD** over the network

```kube32-cli sd-push [app.wasm] --node [esp32-node-02]```

**Upload** a directory tree into node storage

```kube32-cli push [path/to/dir] --node [esp32-node-02] --path [volumes/tessera-db]```

**Stage** firmware and roll it out one node at a time

```kube32-cli firmware push [.pio/build/esp32s3/firmware.bin]```

```kube32-cli firmware rollout```

# SYNOPSIS

**kube32-cli** [**--version**] _command_ [_options_]

**kube32-cli** **build** _dir_ [_options_]

**kube32-cli** **check** _file_ [**--memory** _qty_]

**kube32-cli** **deploy** _file_ [_options_]

**kube32-cli** **embed** _file_ [_options_]

**kube32-cli** **sd-push** _file_ (**--to** _mount_ | **--node** _node_) [_options_]

**kube32-cli** **push** _file-or-dir_ **--node** _node_ [**--path** _path_]

**kube32-cli** **firmware** **push**|**rollout**|**status**|**abort**|**info** [_options_]

# PARAMETERS

**--version**
> Print `kube32-cli` and the package version (currently 0.2.0) and exit.

**build** _dir_
> Compile a C, Rust, or AssemblyScript directory to `.wasm` and run **check**. **--lang** `c` | `c-make` | `rust` | `assemblyscript` overrides detection. **--name** sets the module name. **-o** / **--out** is the output path (default `<dir>/build/<name>.wasm`). **--memory** (default **64Ki**) is linear memory, initial = maximum, a multiple of 64Ki (ignored for Makefile projects). **--stack** (default **16Ki**) is the C/Rust shadow stack. **--target** (default `wasm32-unknown-unknown`) is the Rust target. **-v** prints compiler commands.

**check** _file_
> Validate a `.wasm` against the app ABI and this runtime's wasm3 opcode set. **--memory** _qty_ fails when the module declares more linear memory than that.

**deploy** _file_
> Create a Pod via `kubectl create`, carrying the module in the `kube32.io/wasm-base64` annotation unless **--image** is set. **--name** defaults to the file stem. **--node** pins `spec.nodeSelector`. **--namespace** defaults to **default**. **--memory** (default **64Ki**) is the resources memory request and limit. **--psram** is the `esp32.io/psram` request; the Wasm sandbox is max(memory, psram). **--hardware** is a comma list of `ipc`, `display`, `keyboard`, `speaker`, `sd`, or `none` (default: inferred from imports). **--sd-claim** is the volume claim for `sd` (default: the pod name). **--env** `K=V` is repeatable. **--image** uses a `wasm://sd/<name>` or `wasm://embedded/<name>:v1` reference instead of inline bytes. **--port** (default **7000**) is the container port. **--replace** deletes an existing pod of that name first. **--timeout** (default **60**) is how long **--replace** waits for the old pod to go away. **--dry-run** prints the manifest. **--context**, **--kubeconfig**, **--server**, **--kubectl** select the kubectl binary and cluster.

**embed** _file_
> Copy a checked module to `images/<name>.wasm` for `wasm://embedded/<name>:v1`. **--force** overwrites. **--images-dir** overrides the repo `images/` directory.

**sd-push** _file_
> Copy a checked module to `kube32/images/<name>[-<tag>].wasm` as `wasm://sd/<name>[:<tag>]`. **--to** is a local mount point; **--node** ships over the network instead. **--name** and **--tag** set the image name and tag. Accepts the same kubectl flags as **deploy**.

**push** _file-or-dir_ **--node** _node_
> Upload a file or directory tree to `<storage-root>/kube32/<path>` through `kubectl replace --raw` on the node's storage proxy. Default **--path** is `images/<filename>` for a file, or `images` for a directory. Prints one line per file, stops at the first error, and exits **1** if a directory is empty.

**firmware push** _firmware.bin_
> Check that the image's last 32 bytes are its SHA-256, then upload it into the control plane's update slot in ranges (resumes an interrupted upload). Does nothing when the image is already staged. **--chunk** (default **16Ki**) is bytes per request. **--retries** (default **5**) is consecutive failures before giving up.

**firmware rollout**
> Create the `FirmwareRollout` named `firmware` for the staged image and print progress until it completes or fails. Workers update one at a time, then the control plane. **--sha256** refuses unless it matches the staged image. **--node-timeout** (default **900**) is seconds a node has to switch and confirm. **--no-wait** starts the rollout and returns. **--timeout** (default **3600**) and **--interval** (default **5**) control the wait loop.

**firmware status**
> Print the staged image, the rollout, and a node table (version, image, slot, confirmation, target, FirmwareUpdate condition).

**firmware abort**
> Delete the rollout. Nodes that have not switched keep their running firmware.

**firmware info** _firmware.bin_
> Print the version and SHA-256 of an image file.

# DESCRIPTION

**kube32-cli** is a Python 3 (standard library only) tool that lives at `tools/kube32-cli` in the Kube32 tree. It compiles application directories to WebAssembly, checks modules against the Kube32 app ABI header and the wasm3 import table, and ships them to a cluster that **kube32-sim** or ESP32-S3 boards are running.

**check** requires known host imports (k32 app calls and esp32 peripheral calls) and one of two export styles: a request-handler set (k32 init, alloc, handle, tick, event) or an entry point (start, app main, or main). Hardware capabilities (`display`, `keyboard`, `speaker`, `ipc`, `sd`, `service-call`) are inferred from those imports unless **--hardware** is set.

**deploy**, **push**, **sd-push --node**, and **firmware** drive the API server through **kubectl** (kubeconfig credentials apply). **build** shells out to Clang, rustc/wasm-ld, or the AssemblyScript compiler depending on **--lang**.

Exit codes: **0** success, **1** input or toolchain error, **2** usage, **3** ABI check failed, **4** kubectl failed, **5** pod already exists during **deploy** (pass **--replace**) or a firmware rollout is already in progress, **6** firmware rollout failed or timed out.

# CAVEATS

The script expects to run from a Kube32 checkout: **build** and **embed** locate the repo root next to `tools/`. It is not a separately packaged binary.

**deploy** without **--replace** exits **5** when the pod name already exists. **firmware rollout** does the same when a rollout is already running.

SD images are size-capped (256Ki without PSRAM, 2Mi with PSRAM). **check** does not execute the module.

# SEE ALSO

[kube32-sim](/man/kube32-sim)(1), [kubectl](/man/kubectl)(1), [cmake](/man/cmake)(1), [pio](/man/pio)(1), [clang](/man/clang)(1), [cargo](/man/cargo)(1), [wasm-objdump](/man/wasm-objdump)(1), [esptool](/man/esptool)(1)

# RESOURCES

```[Source code](https://github.com/arterialist/kube32)```

```[Documentation](https://github.com/arterialist/kube32/blob/main/docs/cli-reference.md)```

<!-- verified: 2026-10-31 -->
