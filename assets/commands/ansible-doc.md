# TAGLINE

Display documentation for Ansible modules and plugins

# TLDR

**Show** documentation for a module

```ansible-doc [apt]```

**List** all available modules

```ansible-doc -l```

List modules matching **pattern**

```ansible-doc -l | grep [docker]```

Show **snippet** for module usage

```ansible-doc -s [yum]```

Show documentation for **collection** module

```ansible-doc [community.docker.docker_container]```

List **plugins** of a type

```ansible-doc -t [callback] -l```

# SYNOPSIS

**ansible-doc** [_-l_] [_-s_] [_-t type_] [_module_]

# DESCRIPTION

**ansible-doc** displays documentation for Ansible modules, plugins, and collections. It shows module parameters, return values, examples, and notes, serving as a quick reference without needing to access online documentation.

The tool can list all available modules and filter by plugin type, making it useful for discovering available automation options.

# PARAMETERS

**-l** [_filter_], **--list** [_filter_]
> List available plugins; optional filter can be a namespace or collection name

**-s**, **--snippet**
> Show a playbook snippet (for inventory, lookup, and module plugin types)

**-t** _type_, **--type** _type_
> Plugin type to look up (default: module). Choices include module, become, cache, callback, cliconf, connection, httpapi, inventory, lookup, netconf, shell, vars, strategy, test, filter, role, keyword

**-F**, **--list_files**
> Show plugin names and their source files (implies --list)

**-e** _entry_point_, **--entry-point** _entry_point_
> Select the entry point for a role (with -t role)

**-j**, **--json**
> Change output into JSON format

**-M** _path_, **--module-path** _path_
> Prepend colon-separated path(s) to the module library

# CONFIGURATION

**ansible.cfg**
> Main Ansible configuration file, searched in current directory, ~/.ansible.cfg, or /etc/ansible/ansible.cfg.

**ANSIBLE_CONFIG**
> Environment variable to specify an alternate configuration file path.

# CAVEATS

Documentation quality varies between core and community modules. Some modules may have outdated documentation. Collection modules use fully qualified names.

# HISTORY

**ansible-doc** has been part of Ansible since early versions, providing offline access to module documentation. Collections support was added with Ansible 2.9 in **2019**.

# INSTALL

```dnf: sudo dnf install ansible-core```

```pacman: sudo pacman -S ansible-core```

```apk: sudo apk add ansible-core```

```zypper: sudo zypper install ansible-core```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[ansible](/man/ansible)(1), [ansible-galaxy](/man/ansible-galaxy)(1), [ansible-playbook](/man/ansible-playbook)(1)

# RESOURCES

```[Source code](https://github.com/ansible/ansible)```

```[Documentation](https://docs.ansible.com/ansible/latest/cli/ansible-doc.html)```

<!-- verified: 2026-06-11 -->
