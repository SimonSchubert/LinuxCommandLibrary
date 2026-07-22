# TAGLINE

Manage Ansible roles and collections from Galaxy

# TLDR

**Install** a role from Galaxy

```ansible-galaxy install [username.role_name]```

Install **collection** from Galaxy

```ansible-galaxy collection install [community.docker]```

Install from **requirements file**

```ansible-galaxy install -r [requirements.yml]```

**List** installed roles

```ansible-galaxy list```

**Initialize** a new role

```ansible-galaxy init [role_name]```

**Search** for roles

```ansible-galaxy search [nginx]```

# SYNOPSIS

**ansible-galaxy** [_role_|_collection_] _command_ [_options_]

# DESCRIPTION

**ansible-galaxy** manages Ansible roles and collections from Ansible Galaxy and other sources. Galaxy is a public repository of community-contributed content, providing reusable automation components.

The tool can install, create, and manage roles (traditional content) and collections (bundled content including modules, plugins, and roles). Subcommands are grouped by content type as **ansible-galaxy role** _command_ and **ansible-galaxy collection** _command_; if the type is omitted, role is assumed (for example, "ansible-galaxy install" is equivalent to "ansible-galaxy role install").

# PARAMETERS

**install** _name_
> Install a role (or use "collection install" for a collection)

**init** _name_
> Create a new role or collection scaffold

**list**
> List installed roles or collections

**search** _query_
> Search Galaxy for roles

**info** _name_
> Show detailed information about a role or collection

**remove** _name_
> Remove an installed role or collection

**build**
> Build a collection artifact (collection only)

**publish** _tarball_
> Publish a collection to a Galaxy server (collection only)

**-r** _file_, **--role-file** _file_, **--requirements-file** _file_
> Install items listed in a YAML requirements file

**-p** _path_, **--roles-path** _path_
> Installation path for roles (--collections-path for collections)

**--force**
> Force overwrite of an existing role or collection

**-s** _server_, **--server** _server_
> Galaxy API server URL

**--offline**
> Work offline (init/install/verify, using installed content only)

# CONFIGURATION

**/etc/ansible/ansible.cfg**
> System-wide Ansible configuration, including Galaxy server URL and roles path.

**~/.ansible.cfg**
> Per-user Ansible configuration overriding system defaults.

**ansible.cfg**
> Project-level configuration in the current directory, highest priority.

# CAVEATS

Galaxy content is community-maintained; review before use in production. Collection names are namespaced (namespace.collection). Roles and collections have different installation paths.

# HISTORY

**ansible-galaxy** was introduced with Ansible Galaxy in **2013** to share and distribute roles. Collections support was added in Ansible 2.9 (**2019**) as a new content distribution format.

# INSTALL

```dnf: sudo dnf install ansible-core```

```pacman: sudo pacman -S ansible-core```

```apk: sudo apk add ansible-core```

```zypper: sudo zypper install ansible-core```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[ansible](/man/ansible)(1), [ansible-playbook](/man/ansible-playbook)(1), [ansible-doc](/man/ansible-doc)(1)

# RESOURCES

```[Source code](https://github.com/ansible/ansible)```

```[Documentation](https://docs.ansible.com/ansible/latest/cli/ansible-galaxy.html)```

<!-- verified: 2026-06-11 -->
