# TAGLINE

command-line tool for building Linux operating system images

# TLDR

**Build image from description**

```sudo kiwi-ng system build --description [path] --target-dir [output]```

Build a **specific profile and image type**

```sudo kiwi-ng --profile [name] --type [iso] system build --description [path] --target-dir [output]```

Build with a **replacement repository**

```sudo kiwi-ng system build --description [path] --set-repo [repo-url] --target-dir [output]```

Build with an **extra repository and package**

```sudo kiwi-ng system build --description [path] --add-repo [repo-url],rpm-md --add-package [package] --target-dir [output]```

**Prepare image root** only

```sudo kiwi-ng system prepare --description [path] --root [rootdir]```

**Create the image** from a prepared root

```sudo kiwi-ng system create --root [rootdir] --target-dir [output]```

**List profiles** defined in a description

```kiwi-ng image info --description [path] --list-profiles```

**List build results** of the last build

```kiwi-ng result list --target-dir [output]```

# SYNOPSIS

**kiwi-ng** [_global options_] **image**|**result**|**system** _command_ [_args_...]

# PARAMETERS

**system build**
> Prepare the root tree and create the image in one step.

**system prepare**
> Prepare the image root filesystem from the description.

**system create**
> Create the output image from a prepared root tree.

**system update**
> Update a previously prepared root tree.

**image info**
> Show information about an image description, such as profiles or the resolved package list.

**image resize**
> Resize a built disk image to a new size.

**result list**
> List the files produced by the last build.

**result bundle**
> Copy build results into a bundle directory with versioned file names.

**--description** _path_
> Directory containing the kiwi XML description.

**--target-dir** _path_
> Output directory for images.

**--root** _path_
> Root tree directory for prepare and create.

**--set-repo** _source[,type,alias,priority,...]_
> Replace the first repository of the description.

**--add-repo** _source[,type,alias,priority,...]_
> Add a repository (repeatable).

**--add-package** _name_, **--delete-package** _name_
> Add or remove a package from the image (repeatable).

**--ignore-repos**
> Ignore all repositories from the description.

**--clear-cache**
> Delete the repository cache before installing packages.

**--allow-existing-root**
> Reuse an existing root directory from a previous build.

**--profile** _name_
> Global option: select a profile from the description (repeatable).

**--type** _type_
> Global option: select the image build type (e.g. iso, oem, kis).

**--target-arch** _arch_
> Global option: build for a different architecture than the host.

**--debug**, **--logfile** _file_
> Global options: print debug output, or write the log to a file (**stdout** for standard output).

# DESCRIPTION

**kiwi-ng** is a command-line tool for building Linux operating system images. Supports various output formats including ISOs, virtual machine images, containers, and cloud images. Uses XML-based descriptions to define image configuration.

A build runs in two steps: **prepare** installs packages into a new root tree, and **create** turns that tree into the output image. **system build** combines both. Runtime settings are read from **/etc/kiwi.yml** and **~/.config/kiwi/config.yml**.

# CAVEATS

Global options such as **--profile** and **--type** must appear before the **system**, **image** or **result** command. Building usually requires root privileges and the package manager of the target distribution on the build host (or use **system boxbuild** to build inside a virtual machine).

# HISTORY

KIWI was created at **SUSE** and is the image builder behind openSUSE and SUSE Linux Enterprise images. The original Perl implementation was rewritten in **Python** as "KIWI Next Generation", which is why the command is named **kiwi-ng**. It is developed by the OSInside project.

# SEE ALSO

[mkosi](/man/mkosi)(1), [debootstrap](/man/debootstrap)(8), [mkisofs](/man/mkisofs)(1), [docker](/man/docker)(1)

# RESOURCES

```[Source code](https://github.com/OSInside/kiwi)```

```[Documentation](https://osinside.github.io/kiwi/)```

<!-- verified: 2026-09-29 -->
