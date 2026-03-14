# TAGLINE

LLVM debugger

# TLDR

**Debug executable**

```lldb [program]```

**Debug with arguments**

```lldb -- [program] [arg1] [arg2]```

**Attach to process**

```lldb -p [pid]```

**Attach by name**

```lldb -n [process_name]```

**Run commands on start**

```lldb -o "[breakpoint set -n main]" [program]```

**Load core dump**

```lldb -c [core] [program]```

# SYNOPSIS

**lldb** [_options_] [_program_] [-- _args_]

# PARAMETERS

_PROGRAM_
> Executable to debug.

**-p** _PID_
> Attach to process by PID.

**-n** _NAME_
> Attach to process by name.

**-c** _CORE_
> Load core dump file.

**-o** _CMD_
> Execute command on start.

**-s** _FILE_
> Source commands from file after loading.

**-O** _CMD_
> Execute command before loading the file.

**-f** _FILE_
> Specify executable to debug.

**-a** _ARCH_
> Specify architecture to use when launching the program.

**-w**
> Wait for a process to launch with the name given by -n.

**-x**
> Don't automatically parse .lldbinit files.

**-h**, **--help**
> Display help information.

**-v**, **--version**
> Display version information.

# DESCRIPTION

**lldb** is the LLVM debugger. It debugs C, C++, Objective-C, and Swift programs.

The tool provides breakpoints, watchpoints, stepping, and memory inspection. It's the default debugger on macOS and is part of the Xcode developer tools.

# CAVEATS

Requires debug symbols (-g flag at compile time). Commands differ from gdb; see `lldb` `help` or the GDB-to-LLDB command map. Part of the LLVM toolchain.

# HISTORY

LLDB was developed by **Apple** as part of LLVM, providing a modern debugger with modular architecture.

# SEE ALSO

[gdb](/man/gdb)(1), [clang](/man/clang)(1)

