# TAGLINE

Convenience wrappers for virtualenv

# TLDR

**Create virtual environment**

```mkvirtualenv [envname]```

**Create with specific Python version**

```mkvirtualenv -p [python3.11] [envname]```

**Create with packages installed**

```mkvirtualenv -i [package] [envname]```

**Create from requirements file**

```mkvirtualenv -r [requirements.txt] [envname]```

**Activate environment**

```workon [envname]```

**List environments**

```workon```

**Deactivate**

```deactivate```

**Remove environment**

```rmvirtualenv [envname]```

**Copy an environment**

```cpvirtualenv [source] [dest]```

**Change directory to project**

```cdproject```

**Run command in all environments**

```allvirtualenv [command]```

# SYNOPSIS

**mkvirtualenv** _envname_

**workon** [_envname_]

**rmvirtualenv** _envname_

# COMMANDS

**mkvirtualenv** [_-a project_path_] [_-i package_] [_-r requirements_file_] _envname_
> Create environment. Options -a, -i, -r are handled by virtualenvwrapper; all other options are passed to virtualenv.

**workon** [_envname_]
> Activate environment, or list all if no name given.

**deactivate**
> Exit current environment.

**rmvirtualenv** _envname_
> Delete environment.

**cpvirtualenv** _source_ _dest_
> Duplicate an existing environment.

**cdproject**
> Change to associated project directory.

**setvirtualenvproject** [_virtualenv_path_ _project_path_]
> Associate project directory with environment.

**allvirtualenv** _command_
> Run a command across all environments.

**lsvirtualenv** [_-b_] [_-l_]
> List all environments (-b brief, -l long).

# DESCRIPTION

**virtualenvwrapper** is a set of shell extensions that enhance the standard virtualenv tool for managing Python virtual environments. It provides convenient wrapper commands for creating, activating, switching between, and deleting environments, all from a centralized location rather than scattered across project directories.

The core workflow revolves around the `workon` command for listing and switching environments, `mkvirtualenv` for creation, and `rmvirtualenv` for deletion. All environments are stored in a single configurable directory (typically `~/.virtualenvs`), making them easy to find and manage regardless of where project code resides.

The tool also supports project directory association, allowing automatic directory changes when activating an environment, and provides hook scripts that run at key lifecycle events such as environment creation, activation, and deactivation for custom automation.

# CAVEATS

Requires shell configuration: source the virtualenvwrapper.sh script in your shell profile. All environments are stored in a single directory (default: ~/.virtualenvs), configured by the WORKON_HOME environment variable.

# HISTORY

**virtualenvwrapper** was created by **Doug Hellmann** to make managing Python virtual environments easier.

# SEE ALSO

[virtualenv](/man/virtualenv)(1), [venv](/man/venv)(1), [pip](/man/pip)(1)
