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

**-i** _inventory_, **--inventory** _inventory_
> Inventory file/path or comma-separated host list

**-e** _vars_, **--extra-vars** _vars_
> Extra variables (key=value, YAML/JSON, or @file.yml)

**-t** _tags_, **--tags** _tags_
> Run only plays and tasks tagged with these values

**--skip-tags** _tags_
> Skip plays and tasks whose tags match these values

**-b**, **--become**
> Run with privilege escalation (become)

**-K**, **--ask-become-pass**
> Prompt for privilege escalation password

**-C**, **--check**
> Dry run without making changes

**-D**, **--diff**
> Show differences in changed files (works with --check)

**-l** _hosts_, **--limit** _hosts_
> Further limit selected hosts to an additional pattern

**--list-tasks**
> List all tasks that would be executed

**--list-tags**
> List all available tags

**-f** _forks_, **--forks** _forks_
> Number of parallel processes (default: 5)

**--start-at-task** _task_
> Start the playbook at the task matching this name

**--step**
> Confirm each task before running

**--syntax-check**
> Check the playbook syntax without executing it

**--flush-cache**
> Clear the fact cache for every host in inventory

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

[ansible](/man/ansible)(1), [ansible-vault](/man/ansible-vault)(1), [ansible-lint](/man/ansible-lint)(1), [ansible-galaxy](/man/ansible-galaxy)(1)

# RESOURCES

```[Source code](https://github.com/ansible/ansible)```

```[Documentation](https://docs.ansible.com/ansible/latest/cli/ansible-playbook.html)```

<!-- verified: 2026-06-11 -->
