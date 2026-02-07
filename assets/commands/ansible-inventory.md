# TAGLINE

Inspect and display inventory data

# TLDR

**List** all hosts in inventory

```ansible-inventory --list```

Show **graph** of inventory

```ansible-inventory --graph```

Show **host details**

```ansible-inventory --host [hostname]```

Use **specific inventory**

```ansible-inventory -i [inventory.ini] --list```

Output in **YAML** format

```ansible-inventory --list --yaml```

List hosts matching **pattern**

```ansible-inventory --graph [webservers]```

# SYNOPSIS

**ansible-inventory** [_-i inventory_] [_--list_|_--graph_|_--host host_]

# DESCRIPTION

**ansible-inventory** inspects and displays Ansible inventory data. It shows how Ansible interprets your inventory, including dynamic inventories, group memberships, and host variables.

This tool is useful for debugging inventory configurations and understanding the effective inventory structure that Ansible will use.

# PARAMETERS

**--list**
> Output all hosts in JSON format

**--graph**
> Output inventory as tree graph

**--host** _hostname_
> Output variables for specific host

**-i** _inventory_
> Inventory source

**--yaml**
> Output in YAML format

**--vars**
> Include host/group variables in output

**--export**
> Output compatible with inventory plugins

**-y**
> YAML output (shorthand for --yaml)

**--playbook-dir** _path_
> Set playbook directory for relative paths

# CONFIGURATION

**/etc/ansible/hosts**
> Default inventory file listing managed hosts and groups.

**/etc/ansible/ansible.cfg**
> System-wide Ansible configuration, including default inventory path.

**~/.ansible.cfg**
> Per-user Ansible configuration overriding system defaults.

**ansible.cfg**
> Project-level configuration in the current directory, highest priority.

# CAVEATS

Dynamic inventories are evaluated when this command runs. Large inventories may produce extensive output. Variables shown are pre-evaluation (no Jinja2 templating).

# HISTORY

**ansible-inventory** was introduced in Ansible 2.4 (**2017**) to provide better inventory inspection capabilities, replacing ad-hoc methods of debugging inventory issues.

# SEE ALSO

[ansible](/man/ansible)(1), [ansible-playbook](/man/ansible-playbook)(1)
