# TLDR

**Experiment** with default provision

```tmt try```

Run test in **current** directory

```cd [path/to/test_directory] && tmt try```

Use specific **operating system**

```tmt try [rhel-9]```

Select **image** and provision method

```tmt try [fedora@container]```

**Filter** tests

```tmt try -t [feature]```

Provision and **wait** for instructions

```tmt try -a```

Directly **login** to guest

```tmt try -l```

# SYNOPSIS

**tmt try** [_OPTIONS_] [_IMAGE_]

# PARAMETERS

**-t, --test** _PATTERN_
> Select tests matching pattern

**-a, --ask**
> Provision guest and wait for instructions

**-l, --login**
> Directly log into the guest without asking

**--help**
> Display help information

# DESCRIPTION

**tmt try** provides quick experimentation with tests and environments. It simplifies the process of provisioning test environments and running tests interactively.

The command can detect tests in the current directory and run them in specified environments. It supports various operating system images and provisioning methods including containers and virtual machines.

# CAVEATS

Requires tmt project structure. Image availability depends on provisioning backend. Interactive mode requires terminal access. Some images may require authentication or special configuration.

# SEE ALSO

[tmt](/man/tmt)(1), [tmt-run](/man/tmt-run)(1), [podman](/man/podman)(1)
