# TAGLINE

Python SSH automation and deployment tool

# TLDR

**Run a shell command on a remote host**

```fab -H [host] -- [command]```

**Run a task defined in fabfile.py**

```fab [taskname]```

**Run a task on a specific host**

```fab -H [user@host] [taskname]```

**List all available tasks**

```fab --list```

**Run a task using a specific SSH key**

```fab -i [~/.ssh/key] -H [host] [taskname]```

**Show detailed help for a specific task**

```fab -d [taskname]```

# SYNOPSIS

**fab** [_options_] [_task_[:_arg_,...]]...

# PARAMETERS

**-H**, **--hosts** _hosts_
> Comma-separated host list.

**-i** _key_
> SSH identity file.

**-u**, **--user** _user_
> SSH username.

**-l**, **--list**
> List available tasks.

**-p**, **--password**
> Prompt for SSH password.

**-d** _task_
> Show task docstring.

**--** _command_
> Run shell command directly.

**-c**, **--config** _file_
> Config file path.

**-r**, **--roles** _roles_
> Roles to operate on.

# DESCRIPTION

**Fabric** is a Python library and command-line tool for executing shell commands on remote servers over SSH. It simplifies deployment, system administration, and automation tasks.

Tasks are defined in a **fabfile.py** using Python. Fabric 2.x provides a cleaner API than version 1.x, with Connection objects and a simpler task decorator.

# FABFILE EXAMPLE

```python
from fabric import task

@task
def deploy(c):
    c.run("git pull")
    c.run("pip install -r requirements.txt")
    c.run("systemctl restart myapp")

@task
def uptime(c):
    c.run("uptime")
```

# CAVEATS

Version 2.x is significantly different from 1.x. Requires SSH access. Python 3 required for Fabric 2+. Complex deployments may benefit from Ansible or similar tools.

# HISTORY

Fabric was created by **Jeff Forcier** in **2009** as a simpler alternative to Capistrano for Python deployments. Version 2.0, released in **2018**, was a complete rewrite with a modernized API.

# SEE ALSO

[ansible](/man/ansible)(1), [ssh](/man/ssh)(1)
