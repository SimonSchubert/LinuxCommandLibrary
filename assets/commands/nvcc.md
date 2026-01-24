# TLDR

**Compile CUDA program**

```nvcc [program.cu] -o [program]```

**Compile to object file**

```nvcc -c [kernel.cu] -o [kernel.o]```

**Compile with specific GPU architecture**

```nvcc -arch=sm_[75] [program.cu] -o [program]```

**Generate PTX code**

```nvcc -ptx [kernel.cu]```

**Compile with optimization**

```nvcc -O3 [program.cu] -o [program]```

**Compile with debug symbols**

```nvcc -g -G [program.cu] -o [program]```

**Link with external library**

```nvcc [program.cu] -o [program] -l[cublas]```

**Show compilation stages**

```nvcc --dryrun [program.cu]```

# SYNOPSIS

**nvcc** [_-arch=arch_] [_-o output_] [_-c_] [_-g_] [_options_] _files_

# PARAMETERS

**-o** _FILE_
> Output file.

**-c**
> Compile only, don't link.

**-arch** _ARCH_
> GPU architecture (sm_50, sm_75, sm_86, etc.).

**-code** _CODE_
> GPU code generation.

**-gencode** _SPEC_
> Architecture/code pair.

**-ptx**
> Generate PTX assembly.

**-g**
> Host debug symbols.

**-G**
> Device debug symbols.

**-O** _LEVEL_
> Optimization level (0-3).

**-I** _DIR_
> Include directory.

**-L** _DIR_
> Library directory.

**-l** _LIB_
> Link library.

**--dryrun**
> Show commands without executing.

**-v**, **--verbose**
> Verbose output.

**--version**
> Show version.

# DESCRIPTION

**nvcc** is NVIDIA's CUDA compiler driver. It compiles CUDA C/C++ code that runs on NVIDIA GPUs along with host code that runs on the CPU.

Compilation separates device code (kernels running on GPU) from host code (CPU). Device code compiles to PTX intermediate representation or directly to SASS (GPU machine code).

Architecture flags (-arch) target specific GPU generations. Older architectures work on newer GPUs. Forward compatibility uses PTX that JIT-compiles at runtime.

The compiler integrates with host compilers (gcc, clang, MSVC) for CPU code. Separate compilation allows mixing CUDA with regular C++ in large projects.

Debug builds (-g -G) enable cuda-gdb debugging. Optimization levels affect both host and device code performance.

CUDA libraries (cuBLAS, cuDNN, cuFFT) link like regular libraries. Header paths and library paths may need specification for non-standard installations.

# CAVEATS

Requires NVIDIA GPU and drivers. Architecture mismatch causes runtime errors. Debug builds much slower. Large register usage limits occupancy.

# HISTORY

**nvcc** was introduced with **CUDA** by **NVIDIA** around **2007**. It enabled general-purpose GPU computing by providing a C-like language for programming NVIDIA GPUs, transforming them from graphics-only to general computation.

# SEE ALSO

[cuda-gdb](/man/cuda-gdb)(1), [nvidia-smi](/man/nvidia-smi)(1), [gcc](/man/gcc)(1), [clang](/man/clang)(1)
