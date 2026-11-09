# TAGLINE

NVIDIA CUDA kernel debugger

# TLDR

**Debug a CUDA application**

```cuda-gdb [./program]```

**Debug with arguments**

```cuda-gdb --args [./program] [arg1] [arg2]```

**Attach to running process**

```cuda-gdb -p [pid]```

**Debug core dump**

```cuda-gdb [./program] [core]```

**Run with specific GPU**

```CUDA_VISIBLE_DEVICES=[0] cuda-gdb [./program]```

**Compile a program for debugging**

```nvcc -g -G [program.cu] -o [program]```

# SYNOPSIS

**cuda-gdb** [_options_] [_executable_] [_core_|_pid_]

# PARAMETERS

**--args**
> Pass arguments to the debugged program.

**-p** _pid_, **--pid** _pid_
> Attach to running process.

**-x** _file_
> Execute GDB commands from file.

**-tui**
> Enable text user interface mode.

**-q**, **--quiet**
> Suppress startup messages.

**--cuda-use-lockfile=** _0|1_
> Use a GPU lockfile to prevent concurrent debug sessions. Defaults to 0 since CUDA-GDB 12.0.

**--disable-python**
> Do not load the embedded Python interpreter.

# CUDA-SPECIFIC COMMANDS

**cuda kernel** _n_
> Switch to specified kernel.

**cuda block** _x,y,z_
> Switch to specified block.

**cuda thread** _x,y,z_
> Switch to specified thread within block.

**cuda device** _n_
> Switch to specified device. Also accepts **sm**, **warp** and **lane** coordinates.

**info cuda devices**
> List CUDA devices.

**info cuda sms**
> List CUDA streaming multiprocessors.

**info cuda warps**
> List CUDA warps.

**info cuda lanes**
> List CUDA lanes.

**info cuda kernels**
> List active CUDA kernels.

**info cuda blocks**
> List CUDA blocks.

**info cuda threads**
> List CUDA threads.

**info cuda barriers**
> Display CUDA barriers.

**info cuda launch trace**
> Show kernel launch trace.

**set cuda break_on_launch** _none|application|all_
> Break when a kernel launches. The **system** value also exists but is deprecated.

# DESCRIPTION

**cuda-gdb** is NVIDIA's extension of GNU GDB for debugging CUDA applications. It enables debugging both CPU and GPU code simultaneously, supporting breakpoints, single-stepping, and variable inspection in CUDA kernels.

The debugger can stop execution at specific threads or blocks within a kernel and inspect device memory. It integrates CUDA's parallel execution model into GDB's interface, allowing navigation between thousands of concurrent threads through a focus on a device, kernel, block, or thread.

It works with GDB front ends through the MI interface (for example **cuda-gdb -i=mi** in Emacs, or **ddd --debugger cuda-gdb**), and **cuda-gdbserver** provides remote debugging.

# CAVEATS

CUDA kernels should be compiled with **nvcc -g -G**, which disables optimizations; **-lineinfo** gives line-number information only and can be used with optimized code. Older GPU architectures have been progressively deprecated and dropped; check the release notes for your toolkit. Simultaneous debugging sessions on one GPU require compute capability 6.0 or higher; on older devices use **CUDA_VISIBLE_DEVICES** to give each session its own GPU. Memory checking via cuda-memcheck was removed in CUDA 12.0 in favor of Compute Sanitizer. Debugging on macOS is no longer supported and the macOS host client was removed in 12.5.

# HISTORY

cuda-gdb first shipped in beta alongside the **CUDA 2.1** toolkit in **late 2008**, initially on 32-bit Linux only. Support for 64-bit Linux followed with 2.2. NVIDIA tracks upstream GDB, updating the base version over time, and publishes the source as open source.

# SEE ALSO

[gdb](/man/gdb)(1), [nvcc](/man/nvcc)(1), [nvidia-smi](/man/nvidia-smi)(1)

# RESOURCES

```[Source code](https://github.com/NVIDIA/cuda-gdb)```

```[Homepage](https://developer.nvidia.com/cuda-gdb)```

```[Documentation](https://docs.nvidia.com/cuda/cuda-gdb/index.html)```

<!-- verified: 2026-11-09 -->
