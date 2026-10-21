# TAGLINE

Hold the openTPU device lock while running another command

# TLDR

Run a command **while holding** the card lock

```otpu-lock -- [python3 tools/validate.py --model qwen3 --backend board]```

Wait up to **ten minutes** for the lock

```otpu-lock --wait [600] -- [otpu-selftest]```

Lock a **named device**

```otpu-lock --dev [/dev/xdma1] -- [otpu-diag]```

**Quantize** 4-bit weights into the image cache before waiting for the lock

```otpu-lock --prebuild [qwen3:fp4:int8] -- [otpu-chat --backend board --model qwen3 --wformat fp4]```

# SYNOPSIS

**otpu-lock** [**--dev** _path_] [**--wait** _SEC_] [**--prebuild** _MODEL:WF:HF_]... [**--prebuild-cfg** _cfg_] **--** _command_ [_args_...]

# DESCRIPTION

**otpu-lock** runs a command while holding the **openTPU** device lock. Use it for steps that are not openTPU tools but must not overlap a run (a JTAG reload, a driver reload, a PCIe rescan), or for a sequence of runs that must not be interleaved with others. After `pip install -e .` in the FeSens/openTPU tree it is installed as a console script (`opentpu.host.runstate:hold_main`).

While the lock is held, **OTPU_LOCK_HELD** is the device name and **OTPU_LOCK_PID** is **otpu-lock**'s pid. OpenTPU tools inside the command see those variables and run under this lock instead of waiting for it. Signals delivered to **otpu-lock** are forwarded to the child; **otpu-lock** exits with the child's status.

**--prebuild** first quantizes the named runs' 4-bit weights into the image cache at nice 19, before waiting for the lock, so the tools inside the command do not quantize while they hold the card. A failed prebuild is printed to stderr and the command still runs (it will quantize under the lock).

# PARAMETERS

**--dev** _path_
> XDMA device prefix (default `/dev/xdma0`).

**--wait** _SEC_
> Seconds to wait for the lock (default **3600**).

**--prebuild** _MODEL:WF:HF_
> Quantize into the image cache first, outside the lock. Repeatable. _MODEL_ is a short name or checkpoint; _WF_ and _HF_ are layer and head weight formats.

**--prebuild-cfg** _cfg_
> Card configuration for **--prebuild**.

**--** _command_ [_args_...]
> Command to run. Required. The `--` separator is optional when the command does not look like an option; the parser takes the remainder as the command.

# CAVEATS

With no command, the tool errors (`no command`). Nested **otpu-lock** on the same device keeps the outer holder named. The child is placed in its own process group when not in the foreground so signals can be forwarded. **--prebuild** needs the openTPU tree on **PYTHONPATH**. The lock is a host-side advisory lock around the XDMA device; it does not replace **flock** for unrelated files. The command is installed only via `pip install -e .` in the openTPU tree.

# HISTORY

**otpu-lock** is part of the **openTPU** host tools (Apache-2.0, FeSens). Host runners such as **otpu-chat** and **otpu-serve** take the same device lock through `busy_exits`; **otpu-lock** exposes that lock so validation scripts, JTAG reloads, and **otpu-setup --rescan** can be serialized with those runners.

# SEE ALSO

[otpu-chat](/man/otpu-chat)(1), [otpu-serve](/man/otpu-serve)(1), [otpu-selftest](/man/otpu-selftest)(1), [otpu-setup](/man/otpu-setup)(1), [flock](/man/flock)(1)

# RESOURCES

```[Source code](https://github.com/FeSens/openTPU)```

```[Documentation](https://github.com/FeSens/openTPU/blob/main/README.md)```

<!-- verified: 2026-10-21 -->
