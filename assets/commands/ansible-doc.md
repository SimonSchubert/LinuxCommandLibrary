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

**-l**, **--list**
> List available modules or plugins

**-s**, **--snippet**
> Show playbook snippet for module

**-t** _type_, **--type** _type_
> Plugin type: module, callback, connection, lookup, etc.

**-F**, **--list_files**
> Show module source files

**-j**, **--json**
> Output in JSON format

**-M** _path_, **--module-path** _path_
> Additional module search path

# CONFIGURATION

**ansible.cfg**
> Main Ansible configuration file, searched in current directory, ~/.ansible.cfg, or /etc/ansible/ansible.cfg.

**ANSIBLE_CONFIG**
> Environment variable to specify an alternate configuration file path.

# CAVEATS

Documentation quality varies between core and community modules. Some modules may have outdated documentation. Collection modules use fully qualified names.

# HISTORY

**ansible-doc** has been part of Ansible since early versions, providing offline access to module documentation. Collections support was added with Ansible 2.9 in **2019**.

# SEE ALSO

[ansible](/man/ansible)(1), [ansible-galaxy](/man/ansible-galaxy)(1), [ansible-playbook](/man/ansible-playbook)(1)
