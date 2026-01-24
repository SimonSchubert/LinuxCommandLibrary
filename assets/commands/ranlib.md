# TLDR

**Generate index for archive**

```ranlib [libfoo.a]```

**Update index if needed**

```ranlib -U [libfoo.a]```

**Don't warn about old archives**

```ranlib -c [libfoo.a]```

**Process multiple archives**

```ranlib [*.a]```

# SYNOPSIS

**ranlib** [_options_] _archive_...

# DESCRIPTION

**ranlib** generates an index to the contents of a static library archive (.a file). This index speeds up linking by allowing the linker to quickly find symbols.

Modern ar typically includes ranlib functionality, but ranlib remains useful for updating indexes on existing archives.

# PARAMETERS

**-c**
> Don't warn for old archives.

**-D**
> Deterministic mode.

**-U**
> Update only if needed.

**-t**
> Update timestamps.

**-v**
> Verbose output.

**-V**
> Print version.

# CAVEATS

Mostly redundant with modern ar. Index may need updating after modifications. Some systems use ar -s instead.

# HISTORY

**ranlib** dates back to early Unix, when archive indexes were not automatically maintained. Part of **GNU Binutils**, it remains for compatibility though ar now typically handles indexing automatically.

# SEE ALSO

[ar](/man/ar)(1), [nm](/man/nm)(1), [ld](/man/ld)(1), [objdump](/man/objdump)(1)
