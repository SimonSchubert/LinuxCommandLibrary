# TLDR

**Check security properties of a binary**

```checksec --file=[path/to/binary]```

**Check security properties with JSON output**

```checksec --file=[path/to/binary] --output=json```

**Check the running kernel's security features**

```checksec --kernel```

**Check security properties of a running process**

```checksec --proc [pid]```

**Scan all binaries in a directory**

```checksec --dir [path/to/directory]```

**Check all running processes**

```checksec --proc-all```

# SYNOPSIS

**checksec** [**--file** _binary_] [**--dir** _directory_] [**--proc** _pid_] [**--kernel**] [**--output** _format_]

# DESCRIPTION

**checksec** audits security features enabled in compiled Linux executables (ELF files), the kernel, or running processes. It helps security researchers and administrators assess the exploitability posture of binaries by checking for common mitigations.

**Security properties checked:**

**RELRO** (Relocation Read-Only) - Protects GOT/PLT from being overwritten. Full RELRO marks these as read-only after dynamic linking.

**Stack Canary** - Random value placed before return addresses to detect buffer overflows.

**NX** (No eXecute) - Marks memory regions as non-executable, preventing code execution from stack/heap.

**PIE** (Position Independent Executable) - Enables ASLR by allowing random base address loading.

**FORTIFY** - Compile-time buffer overflow checks for common functions.

# PARAMETERS

**--file** _binary_
> Check security properties of specified binary

**--dir** _directory_
> Scan all binaries in directory

**--proc** _pid_
> Check running process by PID

**--proc-all**
> Check all running processes

**--kernel**
> Check kernel security features

**--output** _format_
> Output format: cli, csv, json, xml

**--fortify-file** _binary_
> Detailed fortify analysis

# CAVEATS

Color-coded output indicates security status: green for enabled protections, red for missing. Red doesn't always indicate a vulnerability—distribution vendors may make intentional tradeoffs when compiling binaries.

# HISTORY

Originally written by **Tobias Klein** at trapkit.de. The tool has been actively maintained and expanded, moving from Bash to Golang, with the current version maintained at github.com/slimm609/checksec.

# SEE ALSO

[readelf](/man/readelf)(1), [objdump](/man/objdump)(1), [file](/man/file)(1)
