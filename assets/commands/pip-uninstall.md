# TAGLINE

Remove installed Python packages

# TLDR

**Uninstall a package**

```pip uninstall [package]```

**Uninstall without confirmation prompt**

```pip uninstall -y [package]```

**Uninstall multiple packages** at once

```pip uninstall [package1] [package2]```

**Uninstall every package** listed in a requirements file

```pip uninstall -r [requirements.txt]```

**Uninstall and auto-confirm** from a requirements file

```pip uninstall -y -r [requirements.txt]```

# SYNOPSIS

**pip** **uninstall** [_options_] _package_...

**pip** **uninstall** [_options_] **-r** _requirements-file_...

# PARAMETERS

**-r** _FILE_, **--requirement** _FILE_
> Uninstall all packages listed in the given requirements file. May be used multiple times.

**-y**, **--yes**
> Don't ask for confirmation of uninstall deletions.

**--root-user-action** _ACTION_
> Action when pip is run as root (warn, ignore).

**--no-input**
> Disable prompting for input.

**-v**, **--verbose**
> Give more output. Repeatable.

**-q**, **--quiet**
> Give less output.

# DESCRIPTION

**pip uninstall** removes installed Python packages. It prompts for confirmation before removing each package unless `-y` is used.

Pip removes the package files, entry-point scripts, and metadata, but does **not** automatically remove dependencies that were installed alongside the package. Packages installed in "editable" mode (`pip install -e`) and those installed directly from VCS URLs can also be removed by name.

Packages installed by the system package manager (e.g., `apt`, `dnf`) or those installed without using pip's metadata cannot be uninstalled by pip.

# CAVEATS

Running `pip uninstall` as root on system Python can break the operating system; prefer a virtual environment or `--user` installs. Dependencies are never auto-removed, so orphan packages may remain after uninstalling a top-level package. Use `pip list` or `pip-autoremove` to find orphans.

# SEE ALSO

[pip](/man/pip)(1), [pip-install](/man/pip-install)(1), [pip3](/man/pip3)(1), [pipx](/man/pipx)(1)

