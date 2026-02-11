# TAGLINE

Reverse engineering and binary analysis framework

# TLDR

**Open binary for analysis**

```r2 [binary]```

**Open in write mode**

```r2 -w [binary]```

**Open at specific address**

```r2 -s [0x1000] [binary]```

**Debug binary**

```r2 -d [binary]```

**Analyze on open**

```r2 -A [binary]```

**Open without any analysis**

```r2 -n [binary]```

**Attach to running process**

```r2 -d [pid]```

**Run command and quit**

```r2 -qc "[pdf]" [binary]```

# SYNOPSIS

**r2** [_-Adnw_] [_-s addr_] [_-c cmd_] [_options_] _file_

# PARAMETERS

**-A**
> Analyze all referenced code.

**-a** _ARCH_
> Set architecture.

**-b** _BITS_
> Set bit size (16, 32, 64).

**-c** _CMD_
> Execute command.

**-d**
> Debug mode.

**-n**
> No analysis on load.

**-w**
> Open in write mode.

**-s** _ADDR_
> Seek to address.

**-q**
> Quiet mode, exit after -c commands.

**-i** _FILE_
> Run script file.

**-p** _PROJECT_
> Use project file.

**-e** _KEY=VALUE_
> Set configuration option.

# COMMANDS

**pdf**
> Disassemble function.

**afl**
> List functions.

**aaa**
> Analyze all.

**s** _addr_
> Seek to address.

**V**
> Enter visual mode.

**VV**
> Enter graph mode.

**px** _N_
> Print N bytes as hex.

**db** _addr_
> Set breakpoint.

**dc**
> Continue execution.

**dr**
> Show registers.

**?**
> Show help.

**q**
> Quit.

# DESCRIPTION

**radare2** (r2) is an open-source reverse engineering framework for binary analysis, debugging, and exploitation. It disassembles, analyzes, and patches binaries across many architectures and formats.

The tool operates through a command-line interface with hundreds of commands. Commands are typically short mnemonics: 'p' for print, 'a' for analyze, 's' for seek. Help is available by appending '?' to any command prefix.

Analysis identifies functions, strings, cross-references, and control flow. The 'aaa' command performs comprehensive analysis. Results populate databases queryable through commands.

Visual modes provide cursor-based navigation and graph views. Function graphs show control flow with block connections. Hex editing mode enables direct binary modification.

Debugging integrates natively, attaching to processes or launching programs. Breakpoints, stepping, register manipulation, and memory inspection work across supported platforms.

Scripting uses r2pipe for external automation (Python, JavaScript, etc.) or internal radare2 scripts. Extensive plugin API enables custom analysis.

# CONFIGURATION

**~/.radare2rc**
> Startup configuration file executed on launch, containing default settings and commands to run automatically.

**-e key=value**
> Runtime configuration variables controlling analysis depth, display format, and tool behavior. Use `e??` inside r2 to list all options.

**~/.local/share/radare2/projects/**
> Project files saving analysis state including function names, comments, and flags for resuming work on a binary.

# CAVEATS

Steep learning curve - command syntax takes time to master. Documentation can be sparse. Analysis may miss obfuscated code. Some features platform-specific. Memory usage grows with analysis depth. Competing with Ghidra/IDA on features.

# HISTORY

**radare2** was created by **pancake** (Sergi Alvarez) around **2006**, evolving from the original radare. It grew from a hex editor to a full reverse engineering platform. The project emphasizes freedom, portability, and Unix philosophy. Despite its complexity, it has a dedicated community and is used in CTF competitions and security research.

# SEE ALSO

[objdump](/man/objdump)(1), [gdb](/man/gdb)(1), [ltrace](/man/ltrace)(1), [strace](/man/strace)(1)
