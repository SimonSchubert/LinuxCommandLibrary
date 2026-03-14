# TAGLINE

Generate index for static library archives

# TLDR

**Generate index for archive**

```ranlib [libfoo.a]```

**Generate index using actual timestamps** (non-deterministic mode)

```ranlib -U [libfoo.a]```

**Generate index in deterministic mode** (reproducible builds)

```ranlib -D [libfoo.a]```

**Process multiple archives**

```ranlib [*.a]```

# SYNOPSIS

**ranlib** [_options_] _archive_...

# DESCRIPTION

**ranlib** generates or updates the symbol table index in a static library archive (.a file), enabling the linker to quickly locate symbols without scanning every object file in the archive. Without this index, the linker must process object files in order and may fail to resolve symbols that appear in a later object file than the one referencing them.

While modern versions of **ar** automatically create this index when building archives (equivalent to **ar -s**), ranlib remains useful for regenerating indexes on archives that have been modified or transferred between systems.

# PARAMETERS

**-c**
> Don't warn when the library has to be created (for compatibility).

**-D**
> Operate in deterministic mode. Use zero for UIDs, GIDs, and timestamps. Enabled by default on some systems.

**-U**
> Do not operate in deterministic mode; use actual UIDs, GIDs, timestamps, and file modes.

**-t**
> Update the timestamp of the symbol map of an archive.

**-v**
> Verbose output.

**-V**
> Print version information.

# CAVEATS

Mostly redundant with modern ar. Index may need updating after modifications. Some systems use ar -s instead.

# HISTORY

**ranlib** dates back to early Unix, when archive indexes were not automatically maintained. Part of **GNU Binutils**, it remains for compatibility though ar now typically handles indexing automatically.

# SEE ALSO

[ar](/man/ar)(1), [nm](/man/nm)(1), [ld](/man/ld)(1), [objdump](/man/objdump)(1)
