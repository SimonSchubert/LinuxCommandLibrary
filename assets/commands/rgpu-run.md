# TAGLINE

Run a local command against a remote GPU over SSH

# TLDR

Open an **SSH tunnel** and run a Python script on the remote GPU

```rgpu-run --host [user@gpu-host] python [train.py]```

Use a **specific SSH port and key**

```rgpu-run --host [user@gpu-host] --ssh-port [2222] -i [~/.ssh/gpu_key] python [train.py]```

Talk to a server that is **already reachable** (no tunnel)

```rgpu-run --server [127.0.0.1:9720] python [train.py]```

Change the **remote opserver port** and tunnel wait

```rgpu-run --host [user@gpu-host] --remote-port [9720] --timeout [30] python [train.py]```

# SYNOPSIS

**rgpu-run** **--host** _DEST_ [_--ssh-port_ _N_] [**-i** _KEY_] [_--remote-port_ _N_] [_--timeout_ _SECS_] [--] _command_ ...

**rgpu-run** **--server** _HOST:PORT_ [--] _command_ ...

# PARAMETERS

**--host** _DEST_
> SSH destination of the GPU host, for example `user@gpuhost`. Mutually exclusive with **--server**. Opens `ssh -N` with `ExitOnForwardFailure=yes` and forwards a free local port to `127.0.0.1:_remote-port_` on the host

**--server** _HOST:PORT_
> Address of an already-reachable **rgpu-opserver**. No tunnel is opened. Mutually exclusive with **--host**

**--ssh-port** _N_
> SSH port on the GPU host (passed as `ssh -p`)

**-i**, **--identity** _KEY_
> SSH private key (passed as `ssh -i`)

**--remote-port** _N_
> Port **rgpu-opserver** listens on. Default **9720**

**--timeout** _SECS_
> Seconds to wait for the tunnel to accept connections. Default **30**

_command_ ...
> Command to run after the tunnel is up (or immediately with **--server**). A leading `--` is stripped. The child inherits the environment with **RGPU_OPSERVER** set to `127.0.0.1:_local-port_` (tunnel) or the **--server** address. Missing command: argparse error. Missing executable: exit **127**. KeyboardInterrupt: exit **130**

# DESCRIPTION

**rgpu-run** is the launcher from the **rgpu** Python package: a PyTorch device whose tensors live on a remote NVIDIA GPU. The application stays on the client; GPU work runs on the host. The script still has to `import rgpu` and select `device="rgpu"`; this command only opens the connection plumbing.

Install with **pip install rgpu** (Python **3.10+**, **torch>=2.14**). Console scripts are **rgpu-run** (`rgpu_run:main`) and **rgpu-opserver** (`rgpu.server.__main__:main`). Package version **0.1.1**. The GPU host needs its own PyTorch of the same major.minor as the client.

With **--host**, **rgpu-run** binds a free local port, starts `ssh -N -L local:127.0.0.1:remote`, waits until something accepts on the local end, runs the command with **RGPU_OPSERVER** pointing at that address, then terminates the tunnel (SIGTERM, then SIGKILL after 5s). Both ends of the forward are **127.0.0.1** on purpose: **rgpu-opserver** has no authentication.

A second path, a CUDA shim (`libcuda` and related libraries), covers existing Linux CUDA binaries; that is built with `./scripts/build_client.sh` in the repository, not by this launcher.

# CAVEATS

Neither protocol authenticates or encrypts connections. Keep **rgpu-opserver** on its default localhost bind and reach it through SSH. The CUDA server listens on all IPv4 interfaces: restrict port **9713** with host or cloud firewall rules before starting it. The server PyTorch version must match the client's major.minor.

# HISTORY

**rGPU** is an Apache-2.0 project by **Yan Michalevsky**. The Python package is **rgpu**. Documentation lives at **rgpu.dev**.

# SEE ALSO

[python](/man/python)(1), [pip](/man/pip)(1), [ssh](/man/ssh)(1), [pytorch](/man/pytorch)(1)

# RESOURCES

```[Source code](https://github.com/ymcrcat/rgpu)```

```[Homepage](https://rgpu.dev)```

```[Documentation](https://rgpu.dev/docs/)```

<!-- verified: 2026-10-07 -->
