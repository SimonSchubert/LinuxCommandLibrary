# TAGLINE

Run DEP-8 tests for Debian packages

# TLDR

Build the package and **run all tests** directly on the system

```autopkgtest -- null```

Run a **specific test** for the package

```autopkgtest --test-name=[test_name] -- null```

Download a **specific package** and run all tests

```autopkgtest [package] -- null```

Test using a **new root directory** (chroot)

```autopkgtest -- chroot [path/to/new_root]```

Test the package **without rebuilding** it

```autopkgtest -B -- null```

# SYNOPSIS

**autopkgtest** [_options_] _source_ **--** _virtualization_

# DESCRIPTION

**autopkgtest** runs tests defined in Debian source packages according to the DEP-8 (autopkgtest) specification. It supports various virtualization backends for isolated testing environments.

The tool separates the test specification from the execution environment using a **--** separator. The virtualization backend (null, chroot, schroot, lxc, qemu, etc.) determines how tests are isolated.

# PARAMETERS

**--test-name=**_name_
> Run only the named test.

**--skip-test=**_name_
> Skip the named test.

**-B, --no-built-binaries**
> Do not build the package before testing; use the provided binaries.

**--setup-commands=**_commands_
> Run the given shell commands in the testbed before the tests.

**-U, --apt-upgrade**
> Run apt-get update and dist-upgrade in the testbed before testing.

**-s, --shell-fail**
> Open a shell in the testbed if a test fails, for debugging.

**--shell**
> Open a shell in the testbed after every test.

**-o** _directory_, **--output-dir=**_directory_
> Write test artifacts and logs to the specified directory.

# VIRTUALIZATION BACKENDS

**null**
> Run tests directly on the current system (no isolation)

**chroot** _path_
> Use a chroot environment

**schroot** _name_
> Use a schroot environment

**lxc** _container_
> Use an LXC container

**qemu** _image_
> Use a QEMU virtual machine

# CAVEATS

The **null** backend modifies the system directly and may leave changes behind. Chroot and other backends provide better isolation. Test definitions must follow the DEP-8 specification in **debian/tests/control**.

# INSTALL

```aur: yay -S autopkgtest```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[dpkg-buildpackage](/man/dpkg-buildpackage)(1), [lxc](/man/lxc)(1), [schroot](/man/schroot)(1)

# RESOURCES

```[Source code](https://salsa.debian.org/ci-team/autopkgtest)```

```[Documentation](https://wiki.debian.org/ContinuousIntegration/autopkgtest)```

<!-- verified: 2026-06-17 -->
