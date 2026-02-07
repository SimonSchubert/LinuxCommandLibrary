# TAGLINE

Agentless IT automation and configuration management

# TLDR

**Ping** all hosts in inventory

```ansible all -m ping```

Execute a **command** on hosts

```ansible [webservers] -a "uptime"```

Execute with **sudo**

```ansible [webservers] -a "apt update" --become```

Run an **ad-hoc module**

```ansible [hosts] -m [apt] -a "name=nginx state=present" --become```

Use **specific inventory**

```ansible -i [inventory.ini] all -m ping```

# SYNOPSIS

**ansible** _pattern_ [_-m module_] [_-a args_] [_-i inventory_] [_options_]

# DESCRIPTION

**ansible** is an agentless IT automation tool that executes tasks on remote systems over SSH. It uses a push-based model, requiring no software installation on managed nodes beyond Python and SSH access.

For ad-hoc commands, ansible executes modules against hosts matching a pattern. For complex automation, use ansible-playbook with YAML playbooks.

# PARAMETERS

**-m** _module_
> Module to execute (default: command)

**-a** _args_
> Module arguments

**-i** _inventory_
> Inventory file or path

**--become**
> Run operations with privilege escalation

**-K**, **--ask-become-pass**
> Prompt for privilege escalation password

**-u** _user_
> Connect as this user

**-k**, **--ask-pass**
> Prompt for SSH password

**-f** _forks_
> Number of parallel processes

**-v**, **-vvv**
> Increase verbosity

**--check**
> Dry run (don't make changes)

**--list-hosts**
> List hosts matching pattern

# CONFIGURATION

**/etc/ansible/ansible.cfg**
> System-wide Ansible configuration, including default module path, connection settings, and privilege escalation.

**~/.ansible.cfg**
> Per-user Ansible configuration overriding system defaults.

**ansible.cfg**
> Project-level configuration in the current directory, highest priority.

**/etc/ansible/hosts**
> Default inventory file listing managed hosts and groups.

# CAVEATS

Requires Python on managed nodes. SSH key-based authentication is recommended. Windows hosts require WinRM instead of SSH. Large inventories benefit from using ansible-playbook.

# HISTORY

**Ansible** was created by Michael DeHaan and released in **2012**. Red Hat acquired Ansible Inc. in **2015**. It has become one of the most popular configuration management and automation tools.

# SEE ALSO

[ansible-playbook](/man/ansible-playbook)(1), [ansible-inventory](/man/ansible-inventory)(1), [ansible-vault](/man/ansible-vault)(1)
