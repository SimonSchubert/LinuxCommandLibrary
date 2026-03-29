# TAGLINE

Reverse engineering and binary analysis framework

# TLDR

**Open binary for analysis**

```r2 [binary]```

**Open and run full analysis** on load

```r2 -A [binary]```

**Open in write mode**

```r2 -w [binary]```

**Seek to a specific address** on open

```r2 -s [0x1000] [binary]```

**Debug a binary**

```r2 -d [binary]```

**Attach to a running process** by PID

```r2 -d [pid]```

**Open without any analysis** (raw file)

```r2 -n [binary]```

**Run a command and quit**

```r2 -qc "[pdf]" [binary]```

**Set architecture and bit size**

```r2 -a [x86] -b [64] [binary]```

# SYNOPSIS

**r2** [_-a arch_] [_-b bits_] [_-B baddr_] [_-c cmd_] [_-e k=v_] [_-i file_] [_-I prefile_] [_-k kernel_] [_-m addr_] [_-p project_] [_-P patch_] [_-r rarun2_] [_-R rr2rule_] [_-s addr_] [_-0AdfDjLMnNqStTuVwxX_] _file_

# PARAMETERS

**-A**
> Run 'aaa' command to analyze all referenced code before prompt.

**-a** _arch_
> Force asm.arch (x86, ppc, arm, mips, bf, java, ...).

**-b** _bits_
> Force asm.bits (16, 32, 64).

**-B** _baddr_
> Specify the base address for loading a new binary.

**-c** _cmd_
> Execute the given command before giving prompt.

**-d**
> Start in debugger mode.

**-D** _backend_
> Enable debug mode with a specific debug backend.

**-e** _k=v_
> Set configuration eval variable key=value.

**-f**
> Set blocksize to file size.

**-i** _file_
> Run script file after the file is loaded.

**-I** _file_
> Run script file before the file is loaded.

**-k** _kernel_
> Select kernel (asm.os) for syscall resolution.

**-l** _plugfile_
> Load a given plugin file.

**-L**
> List loaded IO plugins.

**-m** _addr_
> Map file at given address.

**-M**
> Disable demangling.

**-n**
> Do not perform any analysis. Just load the raw file.

**-nn**
> Only load the rbin structures (elf, mach0, ...).

**-N**
> Do not load user settings or projects from ~/.radare2rc.

**-p** _project_
> Set project file.

**-P** _file_
> Apply rapatch file and quit.

**-q**
> Quiet mode. Exit after running -c commands.

**-r** _rarun2_
> Specify dbg.profile rarun2 profile for spawning programs.

**-R** _directive_
> Specify custom rarun2 directives without creating a profile.

**-s** _addr_
> Start seeking at this address.

**-S**
> Enable sandboxed mode.

**-T**
> Avoid computing file hashes.

**-v**
> Show version information and exit.

**-w**
> Open in write mode.

# COMMANDS

**pdf**
> Disassemble function.

**afl**
> List functions.

**aaa**
> Analyze all (functions, references, strings, etc.).

**s** _addr_
> Seek to address.

**V**
> Enter visual mode.

**VV**
> Enter graph mode.

**px** _N_
> Print N bytes as hex.

**iz**
> List strings in data sections.

**ii**
> List imports.

**ie**
> List entrypoints.

**db** _addr_
> Set breakpoint.

**dc**
> Continue execution.

**ds**
> Step one instruction.

**dr**
> Show registers.

**?**
> Show help. Append ? to any command prefix for subcommand help.

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
> Startup configuration file executed on launch, containing default settings and commands to run automatically. Use -N to skip loading.

**-e key=value**
> Runtime configuration variables controlling analysis depth, display format, and tool behavior. Use `e??` inside r2 to list all options.

**~/.local/share/radare2/projects/**
> Project files saving analysis state including function names, comments, and flags for resuming work on a binary.

# CAVEATS

Steep learning curve - command syntax takes time to master. Documentation can be sparse. Analysis may miss obfuscated code. Some features are platform-specific. Memory usage grows with analysis depth.

# HISTORY

**radare2** was created by **pancake** (Sergi Alvarez) around **2006**, evolving from the original radare. It grew from a hex editor to a full reverse engineering platform. The project emphasizes freedom, portability, and Unix philosophy. Despite its complexity, it has a dedicated community and is used in CTF competitions and security research.

# SEE ALSO

[objdump](/man/objdump)(1), [gdb](/man/gdb)(1), [ltrace](/man/ltrace)(1), [strace](/man/strace)(1), [readelf](/man/readelf)(1), [strings](/man/strings)(1), [xxd](/man/xxd)(1)
