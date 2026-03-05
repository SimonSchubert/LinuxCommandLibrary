# TAGLINE

Binary patcher and editor with TUI and disassembler

# TLDR

**Open a binary file** for editing

```hexpatch [path/to/binary]```

**Open a remote file via SSH**

```hexpatch ssh://[user]@[host]:[path/to/file]```

# SYNOPSIS

**hexpatch** [_options_] _file_

# DESCRIPTION

**hexpatch** (HexPatch) is a binary patcher and editor with a terminal user interface, capable of **disassembling** instructions and **assembling** patches. It supports a variety of architectures and file formats, making it useful for security researchers, reverse engineers, and low-level programmers.

Key features include hex and ASCII editing, virtual address jumping, text and symbol search, a text view mode, and support for **Lua plugins** for extensibility. Files can be edited locally or remotely via **SSH**.

# CAVEATS

Modifying executable binaries can break them or introduce security vulnerabilities. Always work on copies of important files. Disassembly support varies by architecture.

# HISTORY

**hexpatch** was created by **Etto48** and is written in **Rust**. It was designed to provide an all-in-one terminal tool for binary analysis and patching, combining hex editing with disassembly capabilities.

# SEE ALSO

[hexyl](/man/hexyl)(1), [xxd](/man/xxd)(1), [objdump](/man/objdump)(1), [radare2](/man/radare2)(1)
