# TAGLINE

Execute programs in a freshly created init namespace

# TLDR

**Run** a script in init context

```sudo run_init path/to/script```

Run script with **arguments**

```sudo run_init path/to/script start```

Specify **context type** explicitly

```sudo run_init -t context_type path/to/script```

**Dry run** to display context without executing

```sudo run_init -n path/to/script```

# SYNOPSIS

**run_init** [_options_] _script_ [_args_...]

# PARAMETERS

**-t**, **--type** _context_
> Specify SELinux context type explicitly

**-n**, **--dry-run**
> Display context without running script

# DESCRIPTION

**run_init** runs init scripts in the proper SELinux context. It ensures system service scripts execute with correct SELinux domains for security policy compliance.

This is typically used when manually running service scripts that would normally be started by the init system.

# CAVEATS

Requires SELinux to be enabled. User must have permission to transition to the init context.

# HISTORY

Part of **policycoreutils**, providing SELinux management tools for proper context handling.

# SEE ALSO

[runcon](/man/runcon)(1), [semanage](/man/semanage)(8), [systemctl](/man/systemctl)(1)
