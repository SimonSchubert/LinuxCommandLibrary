# TAGLINE

Interactive tmt test experimentation

# TLDR

**Experiment** with default provision

```tmt try```

Run test in **current** directory

```cd [path/to/test_directory] && tmt try```

Try against a specific **image**

```tmt try [fedora]```

Select image and **provision method**

```tmt try [fedora@container]```

Run only tests matching a **regexp**

```tmt try -t [feature]```

Just provision and **ask** what to do next

```tmt try -a```

**Log in** to the guest without running tests

```tmt try -l```

Connect to a **running guest** by IP or FQDN

```tmt try [192.168.12.23@connect]```

# SYNOPSIS

**tmt try** [_OPTIONS_] [_IMAGE_[@_HOW_]]...

# PARAMETERS

**-t**, **--test** _REGEXP_
> Run tests matching the given regular expression. By default all tests under the current working directory are executed. Can be given multiple times.

**-p**, **--plan** _REGEXP_
> Use the matching plan. By default a `/user/plan*` plan from the user config is used, otherwise a default plan.

**-l**, **--login**
> Log into the guest only, do not run any tests.

**-a**, **--ask**
> Just provision the guest and ask what to do next.

**--epel**
> Enable the EPEL repository on the guest.

**--fips**
> Enable FIPS mode on the guest.

**--install** _PACKAGE_
> Install the given package on the guest. Can be given multiple times.

**--arch** _ARCH_
> Specify the guest CPU architecture.

**--help**
> Display help information.

# DESCRIPTION

**tmt try** provides an interactive session to run tests or experiment with guests. It provisions a guest, runs the tests found in the current working directory, and then presents a menu of what to do next. If no tests are detected, it logs into the guest so you can start experimenting.

Specify the guest with an image name, for example `tmt try fedora`. Append `@HOW` to choose the provision method per guest, such as `fedora@container` or `centos-stream-9@virtual`. Use `@connect` with an FQDN or IP address to attach to an already running guest, for example `192.168.12.23@connect`.

# CAVEATS

If no tests are found in the current directory, **tmt try** simply logs into the guest. Image availability depends on the provisioning backend. Interactive mode requires terminal access, and some images may require authentication or special configuration.

# SEE ALSO

[tmt](/man/tmt)(1), [tmt-run](/man/tmt-run)(1), [podman](/man/podman)(1)
