# TAGLINE

Set default file creation permission mask

# TLDR

**Show current mask**

```umask```

**Show symbolic**

```umask -S```

**Set mask**

```umask [022]```

**Restrictive mask**

```umask [077]```

**Permissive mask**

```umask [000]```

# SYNOPSIS

**umask** [_-S_] [_mode_]

# PARAMETERS

**-S**
> Symbolic output.

_mode_
> Octal mask value.

# DESCRIPTION

**umask** is a shell builtin that sets or displays the file creation mask, which controls the default permissions assigned to newly created files and directories. The mask specifies which permission bits to remove from the maximum default permissions (666 for files, 777 for directories).

For example, a umask of 022 removes write permission for group and others, resulting in files created with 644 and directories with 755. A more restrictive umask of 077 removes all permissions for group and others.

The umask can be specified in octal notation (e.g., 022) or symbolic notation (e.g., u=rwx,g=rx,o=rx). Changes apply only to the current shell session unless set in shell profile files like ~/.bashrc.

# COMMON VALUES

- **022** - Standard (files 644, dirs 755)
- **077** - Private (files 600, dirs 700)
- **002** - Group writable

# CAVEATS

Shell builtin. Not persistent across sessions. Inverted logic.

# HISTORY

**umask** is a standard Unix command for setting the file mode creation mask, present since early Unix.

# SEE ALSO

[chmod](/man/chmod)(1), [chown](/man/chown)(1), [stat](/man/stat)(1)
