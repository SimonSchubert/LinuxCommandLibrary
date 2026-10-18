# TAGLINE

Run a local Python script on a fresh Google Colab VM and release it

# TLDR

Run a script on a **CPU** VM, then release it

```colab run [script.py]```

Run on a **GPU**

```colab run --gpu [T4] [script.py]```

Run on a **TPU**

```colab run --tpu [v5e1] [script.py]```

Forward **arguments** to the script

```colab run [script.py] [--epochs] [3]```

Keep the session **after** the script finishes

```colab run --gpu [T4] --keep [script.py]```

Name the session and raise the **timeout**

```colab run -s [job] --timeout [600] [script.py]```

# SYNOPSIS

**colab run** [**-s** _NAME_] [**--gpu** _GPU_] [**--tpu** _TPU_] [**--high-mem**] [**--keep**] [**--timeout** _SEC_] [**--env** _KEY=VALUE_]... _SCRIPT_ [_ARGS_...]

# PARAMETERS

_SCRIPT_
> Local Python file. Must exist before a VM is allocated. A leading `#!` shebang line is stripped before the body is sent to the kernel.

_ARGS_...
> Extra arguments become `sys.argv[1:]` on the VM. Unknown options after the script path are forwarded, so `colab run train.py --epochs 3` works.

**-s**, **--session** _NAME_
> Name for the ephemeral session. Default is `run-` plus six hex characters. Useful with **--keep** so a later `colab exec -s` can attach.

**--gpu** _T4_|_L4_|_G4_|_H100_|_A100_
> GPU accelerator. Combined with **--tpu**, **--tpu** wins. With neither flag, the runtime is CPU.

**--tpu** _v5e1_|_v6e1_
> TPU accelerator.

**--high-mem**
> Request a high-RAM machine shape (Colab Pro or Pro+). Ignored for L4 and TPU.

**--keep**
> Leave the session assigned after the script exits. Without this flag the VM is unassigned even if the script fails.

**--timeout** _SEC_
> Kernel execution timeout in seconds. Default is **30.0**.

**--env** _KEY=VALUE_
> Set `os.environ[KEY]` in the remote kernel. Repeatable. Also accepted after the script path (`colab run script.py --env KEY=VALUE`).

# DESCRIPTION

**colab run** is a subcommand of **colab**, not a separate binary. It is `colab new` plus `colab exec` plus `colab stop` in one invocation: allocate a VM, run a local `.py` file as `__main__` with a reconstructed `sys.argv`, then release the assignment unless **--keep**.

The payload sets `sys.argv` to the script basename plus forwarded args, forces `__name__ = '__main__'`, applies **--env**, and filters the IPython "To exit: use 'exit'..." warning so `sys.exit` behaves like `python script.py`. Working directory on the VM is `/content`. Stdout, stderr, and display data stream back to the terminal. `SystemExit` is mapped to a CPython-style process exit code (`None`/0 → 0, an integer → that integer, anything else → 1); other kernel errors exit 1.

A typical shebang is `#!/usr/bin/env -S colab run --gpu T4`. `chmod +x` and `./script.py` then rents a runtime, runs the file, and tears it down.

# CAVEATS

Default **--timeout** is 30 seconds; a training script that needs minutes must pass a larger value or it is killed while the VM is still billed until teardown.

An unrecognized **--gpu** string is mapped to **A100**, not rejected. **--tpu** and **--gpu** together use the TPU. **--high-mem** is ignored for accelerators that have only one shape.

The script is validated locally first so a bad path does not allocate compute. Allocation can still fail with 412 (too many sessions or a capacity limit) or 400 (no quota for that accelerator). Artifacts stay on the VM; copy them with **colab download** and **--keep**, or write them to stdout.

# HISTORY

Designed as a shebang-friendly one-shot runner in the Colab CLI (PyPI `google-colab-cli`) in **2026**. **--env** and **--high-mem** arrived in **0.7.0** (3 September 2026). Google announced the CLI on **5 June 2026**.

# SEE ALSO

[colab](/man/colab)(1), [colab-exec](/man/colab-exec)(1), [python3](/man/python3)(1), [uv](/man/uv)(1)

# RESOURCES

```[Source code](https://github.com/googlecolab/google-colab-cli)```

```[Documentation](https://github.com/googlecolab/google-colab-cli/blob/main/docs/05_run_command.md)```

<!-- verified: 2026-10-18 -->
