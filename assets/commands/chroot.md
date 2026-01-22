# TLDR

**Run a command with a different root directory**

```sudo chroot [path/to/new_root] [command]```

**Run an interactive shell in the new root**

```sudo chroot [path/to/new_root]```

**Specify a custom shell to run**

```sudo chroot [path/to/new_root] /bin/bash```

**Specify user and group for the command**

```sudo chroot --userspec=[user:group] [path/to/new_root] [command]```

**Change to a specific directory after chrooting**

```sudo chroot [path/to/new_root] /bin/sh -c "cd /home && ls"```

# SYNOPSIS

**chroot** [_OPTION_] _NEWROOT_ [_COMMAND_ [_ARG_]...]

# DESCRIPTION

**chroot** changes the root directory of the calling process to the specified path and runs a command within that environment. All pathname lookups starting with **/** will be relative to the new root.

If no command is specified, chroot runs the shell from the **SHELL** environment variable or defaults to **/bin/sh**.

The new root directory must contain all necessary files, libraries, and device nodes required by the command being executed.

# PARAMETERS

**NEWROOT**
> The directory to use as the new root filesystem

**COMMAND**
> Command to run in the chroot environment

**ARG**
> Arguments to pass to the command

**--userspec=**_USER:GROUP_
> Specify user and group (name or ID) to run as

**--groups=**_GROUPS_
> Specify supplementary groups

**--skip-chdir**
> Do not change working directory to /

# CAVEATS

Requires root privileges or **CAP_SYS_CHROOT** capability. Not designed for security sandboxing—privileged users can escape by creating directories and using relative paths. Open file descriptors may provide access outside the chroot.

The new root must contain essential files: **/bin/sh** or the specified command, required shared libraries (check with **ldd**), and device nodes like **/dev/null** if needed.

# HISTORY

The **chroot** system call originated in **Version 7 Unix** (1979) at Bell Labs. It was initially used for building and testing new system versions. The GNU coreutils version provides the standard command-line interface on Linux systems.

# SEE ALSO

[arch-chroot](/man/arch-chroot)(1), [pivot_root](/man/pivot_root)(8), [unshare](/man/unshare)(1)
