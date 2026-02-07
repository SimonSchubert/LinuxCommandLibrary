# TAGLINE

Execute Ansible playbooks

# TLDR

**Run** a playbook

```ansible-playbook [playbook.yml]```

Run with **inventory file**

```ansible-playbook -i [inventory.ini] [playbook.yml]```

Run with **sudo**

```ansible-playbook [playbook.yml] --become --ask-become-pass```

**Check** mode (dry run)

```ansible-playbook [playbook.yml] --check```

Run specific **tags**

```ansible-playbook [playbook.yml] --tags "[deploy,config]"```

Pass **extra variables**

```ansible-playbook [playbook.yml] -e "env=production version=1.2.3"```

# SYNOPSIS

**ansible-playbook** [_-i inventory_] [_-e vars_] [_--tags tags_] [_options_] _playbook.yml_

# DESCRIPTION

**ansible-playbook** executes Ansible playbooks, which are YAML files defining automation tasks. Playbooks can provision servers, deploy applications, configure services, and orchestrate complex multi-tier deployments.

Unlike ad-hoc ansible commands, playbooks define complete automation workflows with variables, conditionals, loops, and handlers.

# PARAMETERS

**-i** _inventory_
> Inventory file or path

**-e** _vars_, **--extra-vars** _vars_
> Extra variables (key=value or @file.yml)

**--tags** _tags_
> Run only tasks with these tags

**--skip-tags** _tags_
> Skip tasks with these tags

**--become**
> Run with privilege escalation

**-K**, **--ask-become-pass**
> Prompt for become password

**--check**
> Dry run without making changes

**--diff**
> Show differences in changed files

**-l** _hosts_, **--limit** _hosts_
> Limit to specific hosts

**--list-tasks**
> List tasks without executing

**--list-tags**
> List available tags

**-f** _forks_, **--forks** _forks_
> Parallel processes

**--start-at-task** _task_
> Start at specific task

**--step**
> Prompt before each task

# CONFIGURATION

**/etc/ansible/ansible.cfg**
> System-wide Ansible configuration, including default inventory, forks, and connection settings.

**~/.ansible.cfg**
> Per-user Ansible configuration overriding system defaults.

**ansible.cfg**
> Project-level configuration in the current directory, highest priority.

**/etc/ansible/hosts**
> Default inventory file used when no inventory is specified.

# CAVEATS

Playbook syntax errors fail fast; use --syntax-check first. Check mode may not work perfectly with all modules. Always test in non-production first.

# HISTORY

**ansible-playbook** has been the primary execution method for Ansible automation since the project's creation in **2012**, enabling infrastructure as code and declarative automation.

# SEE ALSO

[ansible](/man/ansible)(1), [ansible-vault](/man/ansible-vault)(1), [ansible-lint](/man/ansible-lint)(1)
