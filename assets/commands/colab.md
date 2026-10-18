# TAGLINE

Command-line interface for Google Colab runtimes

# TLDR

Allocate a **CPU** session

```colab new```

Allocate a named **GPU** session

```colab new -s [trainer] --gpu [T4]```

List **active sessions**

```colab sessions```

Run a local script on a **fresh VM** and release it

```colab run --gpu [T4] [train.py]```

Execute a local **Python file** in an existing session

```colab exec -s [trainer] -f [train.py]```

Open a **TTY shell** on the VM

```colab console -s [trainer]```

**Download** a remote file

```colab download -s [trainer] [checkpoints/model.bin] [./model.bin]```

**Stop** a session and release the VM

```colab stop -s [trainer]```

# SYNOPSIS

**colab** [_global-options_] _command_ [_options_] [_args_...]

# PARAMETERS

**-h**, **--help**
> Show help. `colab help` [_command_] prints the same text for one subcommand.

**--auth** _oauth2_|_adc_
> How the CLI authenticates to Colab. Default is **oauth2** (copy-paste Installed App flow). **adc** uses Application Default Credentials (`GOOGLE_APPLICATION_CREDENTIALS`, `gcloud auth application-default login`, or a GCE/GKE metadata server).

**-c**, **--client-oauth-config** _PATH_
> OAuth client JSON for **--auth oauth2**. Default: `~/.colab-cli-oauth-config.json`. The wheel also ships an inlined client used when that file is missing.

**--config** _PATH_
> Session metadata file. Default: `~/.config/colab-cli/sessions.json`.

**--logtostderr**
> Send debug logs to stderr.

**new** [**-s** _NAME_] [**--gpu** _T4_|_L4_|_G4_|_H100_|_A100_] [**--tpu** _v5e1_|_v6e1_] [**--high-mem**]
> Allocate a VM. With neither **--gpu** nor **--tpu**, the runtime is CPU. **--high-mem** requests a high-RAM shape (Colab Pro or Pro+; ignored for L4 and TPU).

**sessions**
> List assignments on the backend, with local names, hardware, machine shape, and variant.

**status** [**-s** _NAME_]
> Print hardware, shape, IDLE/BUSY, and last-execution metadata for local sessions.

**restart-kernel** [**-s** _NAME_]
> Restart the Jupyter kernel on an existing session.

**stop** [**-s** _NAME_]
> Shut down the kernel, unassign the VM, and drop local state.

**url** [**-s** _NAME_] [**--host** _ORIGIN_] [**--open**]
> Print a Colab notebook URL that attaches to the existing VM. **--open** also launches a browser. Default host is `https://colab.research.google.com`.

**exec** [**-s** _NAME_] [**-f** _FILE_] [**--output-image** _PATH_] [**--timeout** _SEC_] [**--env** _KEY=VALUE_]
> Execute stdin, a `.py` file, or a `.ipynb` notebook on an existing session. See **colab-exec**(1).

**run** [**--gpu** _GPU_] [**--tpu** _TPU_] [**--high-mem**] [**--keep**] [**-s** _NAME_] [**--timeout** _SEC_] [**--env** _KEY=VALUE_] _SCRIPT_ [_ARGS_...]
> Allocate a fresh VM, run a local script, then release it unless **--keep**. See **colab-run**(1).

**repl** [**-s** _NAME_] [**--output-image** _PATH_]
> Interactive Python REPL on the VM. Piped stdin runs once and exits.

**console** [**-s** _NAME_]
> Raw TTY (tmux) on the remote VM. Needs a local TTY.

**ssh** [**-s** _NAME_] [**--proxy-mode**] [**-i** _KEY_] [**--gpu** _GPU_] [**--tpu** _TPU_] [**--high-mem**] [**--rm**]
> SSH over WebSocket into `/content`. With no sessions, auto-creates a runtime. **--proxy-mode** is an OpenSSH `ProxyCommand` bridge. **--rm** stops an auto-created runtime on exit (and, in proxy mode, the bridged session on disconnect). RSA keys are rejected; Ed25519 or ECDSA only.

**ls** [**-s** _NAME_] [_PATH_]
> List remote files. Default path is `content` (the Jupyter contents API name for `/content`).

**upload** [**-s** _NAME_] _LOCAL_ _REMOTE_
> Upload a local file to the VM.

**download** [**-s** _NAME_] _REMOTE_ _LOCAL_
> Download a remote file.

**rm** [**-s** _NAME_] _PATH_
> Delete a remote file.

**edit** [**-s** _NAME_] _PATH_
> Download a remote file, open `$EDITOR`, upload if it changed. A missing remote file starts empty.

**drivemount** [**-s** _NAME_] [_PATH_]
> Mount Google Drive. Default path: `/content/drive`. May prompt for a browser authorization URL.

**install** [**-s** _NAME_] [**-r** _FILE_] [_PKG_...]
> Install packages on the VM with `uv pip install --system`, falling back to `pip`. A **--requirement** file is uploaded first.

**auth** [**-s** _NAME_]
> Run `google.colab.auth.authenticate_user()` on the VM (hidden from `colab --help`).

**log** [**-s** _NAME_] [**-n** _N_] [**-t** _TYPE_] [**-o** _FILE_]
> Show or export local session history. **--output** suffix selects `.ipynb`, `.md`, `.txt`, or `.jsonl`.

**usage**
> Print compute-unit rate and balance.

**pay**
> Open `https://colab.research.google.com/signup`.

**version**
> Print the installed CLI version.

**update** [**--install**]
> Check PyPI for a newer `google-colab-cli`. **--install** runs `pip install -U google-colab-cli` on Linux and macOS.

# DESCRIPTION

**colab** is the official command-line client for Google Colab. The installed binary is `colab` (PyPI package `google-colab-cli`). It provisions CPU, GPU, and TPU VMs, runs local Python and notebooks on those kernels, copies files, and can open a REPL, tmux console, or SSH session, all from a Linux or macOS terminal.

A session is a named assignment stored locally in `sessions.json` and on Colab's backend. When exactly one session is active, **-s** / **--session** can be omitted. `colab exec -f` reads the file on the client and sends the source to the kernel; the working directory on the VM is `/content`. Sessions stay assigned while the kernel is active; the CLI pings the tunnel frontend keep-alive path rather than requiring a separate local daemon.

GPU values accepted by **--gpu** are **T4**, **L4**, **G4**, **H100**, and **A100**. TPU values for **--tpu** are **v5e1** and **v6e1**. Availability and high-RAM shapes depend on the Colab subscription. Allocation can fail with a 412 (too many assignments or a capacity limit) or a 400 (no entitlement for that accelerator).

# CONFIGURATION

**~/.config/colab-cli/sessions.json**
> Local session tokens, endpoints, hardware, and last-execution metadata. Override with **--config**.

**~/.config/colab-cli/settings.json**
> CLI settings, including the cached latest-version banner used by **update**.

**~/.config/colab-cli/token.json**
> Cached OAuth2 user token for **--auth oauth2**.

**~/.colab-cli-oauth-config.json**
> Optional public OAuth client JSON. If absent, the packaged `oauth_config.json` is used.

# CAVEATS

Linux and macOS only. Requires **Python 3.12** or later. A Google account and Colab's Terms of Service apply; GPU, TPU, and **--high-mem** need the matching Colab plan and quota.

**colab exec** and **colab run** default **--timeout** to **30** seconds. Long jobs must raise it. An unrecognized **--gpu** string is mapped to **A100**, not rejected. **--high-mem** is ignored for L4 and TPU shapes.

**repl** and **console** need a local TTY unless stdin is piped. **colab ssh** does not accept RSA keys. **auth** is registered but hidden from the default help listing.

Default **--auth** is **oauth2**, which prints an authorization URL and reads a pasted code (the same remote flow as `gcloud auth application-default login`). README text that names **adc** as the default does not match the Typer callback.

# HISTORY

Google announced the Colab CLI on **5 June 2026**. The first PyPI release was **0.5.4** on **22 May 2026**. **0.6.0** (16 June 2026) switched OAuth2 to the remote copy-paste flow and replaced a keep-alive RPC that 403'd for external users. **0.7.0** (3 September 2026) added **colab ssh**, **--env**, and **--high-mem**; **0.7.1** (14 September 2026) unblocked that release on PyPI. The package is Apache-2.0 and built with Typer.

# SEE ALSO

[colab-exec](/man/colab-exec)(1), [colab-run](/man/colab-run)(1), [jupyter](/man/jupyter)(1), [python3](/man/python3)(1), [pip](/man/pip)(1), [uv](/man/uv)(1), [gcloud](/man/gcloud)(1)

# RESOURCES

```[Source code](https://github.com/googlecolab/google-colab-cli)```

```[Documentation](https://github.com/googlecolab/google-colab-cli#command-index)```

<!-- verified: 2026-10-18 -->
