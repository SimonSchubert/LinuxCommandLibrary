# TLDR

**Suspend VM**

```vagrant suspend```

**Suspend specific VM**

```vagrant suspend [name]```

# SYNOPSIS

**vagrant** **suspend** [_options_] [_name_]

# DESCRIPTION

**vagrant suspend** saves VM state and stops it. Preserves RAM contents for quick resume. Uses disk space to store state. Faster than shutdown but uses more storage.

# SEE ALSO

[vagrant](/man/vagrant)(1), [vagrant-resume](/man/vagrant-resume)(1), [vagrant-halt](/man/vagrant-halt)(1)

