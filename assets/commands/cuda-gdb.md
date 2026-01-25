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

# SYNOPSIS

**cuda-gdb** [_options_] [_executable_] [_core_|_pid_]

# PARAMETERS

**--args**
> Pass arguments to the debugged program.

**-p** _pid_
> Attach to running process.

**-x** _file_
> Execute GDB commands from file.

**-tui**
> Enable text user interface mode.

**-q**, **--quiet**
> Suppress startup messages.

**--cuda-use-lockfile=0**
> Disable GPU lockfile (for multi-instance debugging).

# CUDA-SPECIFIC COMMANDS

**cuda kernel**
> Switch to specified kernel.

**cuda block**
> Switch to specified block.

**cuda thread**
> Switch to specified thread within block.

**info cuda kernels**
> List active CUDA kernels.

**info cuda threads**
> List CUDA threads.

**info cuda devices**
> List CUDA devices.

**set cuda break_on_launch**
> Break when kernel launches.

**set cuda memcheck on**
> Enable memory checking.

# DESCRIPTION

**cuda-gdb** is NVIDIA's extension of GNU GDB for debugging CUDA applications. It enables debugging both CPU and GPU code simultaneously, supporting breakpoints, single-stepping, and variable inspection in CUDA kernels.

The debugger can stop execution at specific threads or blocks within a kernel, inspect device memory, and catch memory errors. It integrates CUDA's parallel execution model into GDB's interface, allowing navigation between thousands of concurrent threads.

Focus modes let developers examine specific blocks and threads. Memory checking catches out-of-bounds accesses and other errors. Integration with NVIDIA Nsight systems provides IDE-based debugging.

# CAVEATS

Requires NVIDIA GPU with compute capability 2.0+. Debugging mode disables some GPU optimizations. Only one debugging session per GPU unless using lockfile workarounds. Some GDB features may not work with GPU code. Kernel must be compiled with **-g -G** flags.

# HISTORY

cuda-gdb was introduced by **NVIDIA** alongside CUDA 2.2 in **2009** to provide kernel debugging capabilities. It extended the familiar GDB interface to handle GPU parallelism, addressing a major need for CUDA developers who previously had limited debugging options. The tool has evolved with each CUDA toolkit release, adding features like memory checking and improved multi-GPU support.

# SEE ALSO

[gdb](/man/gdb)(1), [nvcc](/man/nvcc)(1), [nvidia-smi](/man/nvidia-smi)(1), [cuda-memcheck](/man/cuda-memcheck)(1)
