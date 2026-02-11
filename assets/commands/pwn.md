# TAGLINE

Exploit development and CTF utilities

# TLDR

Convert assembly code to **bytes**

```pwn asm "xor edi, edi"```

Create a **cyclic pattern** of specific length

```pwn cyclic 100```

**Encode** data into hexadecimal

```pwn hex deadbeef```

**Decode** data from hexadecimal

```pwn unhex 6c4f7645```

Print x64 Linux **shellcode** for running a shell

```pwn shellcraft amd64.linux.sh```

Check **binary security** settings for an ELF file

```pwn checksec path/to/file```

Check for **updates**

```pwn update```

Display **version**

```pwn version```

# SYNOPSIS

**pwn** _command_ [_arguments_...]

# PARAMETERS

**asm** _code_
> Convert assembly code to bytes

**cyclic** _length_
> Create a cyclic pattern

**hex** _data_
> Encode data to hexadecimal

**unhex** _hex_
> Decode hexadecimal data

**shellcraft** _arch.os.shellcode_
> Generate shellcode

**checksec** _file_
> Check binary security settings

**update**
> Check for updates

**version**
> Display version

# DESCRIPTION

**pwn** is the command-line interface for Pwntools, an exploit development library designed for rapid prototyping and CTF challenges. It provides utilities for assembly, shellcode generation, binary analysis, and data encoding.

The tool supports multiple architectures and operating systems for security research and penetration testing.

# CAVEATS

Intended for authorized security testing and educational purposes only. Generated shellcode and exploits should only be used in controlled environments.

# HISTORY

Part of **Pwntools**, a Python library developed for CTF players and security researchers. Provides convenient command-line access to common exploit development tasks.

# SEE ALSO

[gdb](/man/gdb)(1), [objdump](/man/objdump)(1), [readelf](/man/readelf)(1)
